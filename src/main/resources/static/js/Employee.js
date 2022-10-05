// Call the dataTables jQuery plugin
$(document).ready(function() {
  loadEmployee();
  $('#employee').DataTable();
});

async function loadEmployee(){

    const request = await fetch('employee', {
      method: 'GET',
      headers: {
        'Accept': 'application/json',
        'Content-Type': 'application/json'
      },
    });
    const employee = await request.json();
    let listHYML= '';
    for (let employee of employee){
       let employeeHTML = '<tr><td>1</td><td>'+employe.name+'</td><td>'+employe.email+'</td><td>'+employee.role+'</td><td>'+employee.enterprise+'</td><td><a href="#" class="btn btn-danger btclassNamecle btn-sm"></td></tr>';
        listHYML += employeeHTML;

    }

    console.log(employee);
    document.querySelector('#employee tbody').outerHTML = listHTML;



}