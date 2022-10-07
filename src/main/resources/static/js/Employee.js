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
    let listHTML= '';
    //let employee1 = employee;
    for (let employee of employee){
       let employeeHTML = '<tr><td>'+employee.id+'</td><td>'+employee.name+'</td><td>'+employee.email+'</td><td>'+employee.role+'</td><td>'+employee.enterprise+'</td><td><a href="#" class="btn btn-danger btn-circle btn-sm"><i class="fas fa-trash"></i></a></td></tr>';
        listHTML += employeeHTML;

    }

    console.log(employee);
    document.querySelector('#employee tbody').outerHTML = listHTML;



}