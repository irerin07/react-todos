import React, { useState, useCallback } from 'react';

const TodoInsert = ({ onInsert }) => {
    const [value, setValue] = useState('');

    const onChange = useCallback(e => {
        setValue(e.target.value);
    }, []);

    const onSubmit = useCallback(
        e => {
            console.log(value);
            if (value === '' || value === null || value.length <= 0) {
                alert('no message inserted');
                e.preventDefault();
            } else {
                onInsert(value);
                setValue('');
                e.preventDefault();
            }
        },
        [onInsert, value],
    );
    return (
        <form className="TodoInsert" onSubmit={onSubmit}>
            <input
                placeholder="할 일을 입력하세요"
                value={value}
                onChange={onChange}
            />
            <button type="submit">추가
            </button>
        </form>
    );
};

export default TodoInsert;