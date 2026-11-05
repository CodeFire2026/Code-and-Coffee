
function createTaskManager() {

    let tasks = [];

    return {

        addTask: function(task) {
            let nuevaTarea = {
                id: tasks.length + 1,
                nombre: task,
                completada: false
            };

            tasks.push(nuevaTarea);
        },

        completeTask: function(taskId) {
            for (let i = 0; i < tasks.length; i++) {

                if (tasks[i].id === taskId) {
                    tasks[i].completada = true;
                }

            }
        },

        listTasks: function() {
            for (let i = 0; i < tasks.length; i++) {

                console.log(
                    tasks[i].id + " - " +
                    tasks[i].nombre + " - " +
                    (tasks[i].completada ? "TERMINADA" : "PENDIENTE")
                );

            }
        }

    };
}

// Uso:

const myTasks = createTaskManager();

myTasks.addTask("Aprender JavaScript");
myTasks.addTask("Hacer ejercicio");

myTasks.listTasks();

myTasks.completeTask(1);

console.log("Después de terminar una tarea:");

myTasks.listTasks();
