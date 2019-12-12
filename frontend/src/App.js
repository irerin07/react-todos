import React, {useRef, useCallback, useState} from 'react';
import './App.css';
import TodoInsert from './component/TodoInsert.js';
import TodoList from './component/TodoList.js';
import TodoTemplate from "./component/TodoTemplate";

const App = () => {
    const [todos, setTodos] = useState([
        {
            id: 1,
            text: 'Basic React',
            checked: true,
        },
        {
            id: 2,
            text: 'Basic React2',
            checked: true,
        },
        {
            id: 13,
            text: 'Basic React3',
            checked: false,
        },
    ]);

    const nextId = useRef(4);

    const onToggle = useCallback(
        id => {
            setTodos(
                todos.map(todo =>
                    todo.id === id ? {...todo, checked: !todo.checked} : todo,)
            )
        }, [todos]
    )
    const onRemove = useCallback(
        id => {
            setTodos(todos.filter(todo => todo.id !== id));
        },
        [todos],
    );

    const onInsert = useCallback(
        text => {
            const todo = {
                id: nextId.current,
                text,
                checked: false,
            };
            setTodos(todos.concat(todo));
            nextId.current += 1;
        },
        [todos],
    );
    return (
        <TodoTemplate>
            <TodoInsert onInsert={onInsert}/>
            <TodoList todos={todos} onRemove={onRemove} onToggle={onToggle}/>
        </TodoTemplate>
    );
};

export default App;
//
// // function createBulkTodos() {
// //     const array = [];
// //     for (let i = 0; i <= 2500; i++) {
// //         array.push({
// //             id: i,
// //             text: `To do ${i}`,
// //             checked: false,
// //         });
// //     }
// //     return array;
// // }
//
// function todoReducer(todos, action) {
//     switch (action.type) {
//         case 'INSERT':
//             return todos.concat(action.todo);
//         case 'REMOVE':
//             return todos.filter(todo => todo.id !== action.id);
//         case 'TOGGLE':
//             return todos.map(todo =>
//                 todo.id === action.id ? { ...todo, checked: !todo.checked } : todo,
//             );
//         default:
//             return todos;
//     }
// }
//
// const App = () => {
//     // const [todos, setTodos] = useState([]);
//     // const [todos, setTodos] = useState(createBulkTodos);
//     const [todos, dispatch] = useState();
//
//     const nextId = useRef(1);
//
//     const onInsert = useCallback(text => {
//         const todo = {
//             id: nextId.current,
//             text,
//             checked: false,
//         };
//         dispatch({ type: 'INSERT', todo });
//         nextId.current += 1;
//     }, []);
//
//     const onRemove = useCallback(id => {
//         dispatch({ type: 'REMOVE', id });
//     }, []);
//
//     const onToggle = useCallback(id => {
//         dispatch({ type: 'TOGGLE', id });
//     }, []);
//
//     return (
//         <TodoTemplate>
//             <TodoInsert onInsert={onInsert} />
//             <TodoList todos={todos} onRemove={onRemove} onToggle={onToggle} />
//         </TodoTemplate>
//     );
// };