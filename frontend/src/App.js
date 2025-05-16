import './App.css';
import { useEffect, useState } from 'react';

function App() {
  const [message, setMessage] = useState("");

  useEffect(() => {
    fetch("http://localhost:8080/hello")
      .then((res) => res.text())
      .then((data) => setMessage(data));
  }, []);

  return (
    <div>
      <h1>🌱 React 연결 테스트</h1>
      <p>{message}</p>
    </div>
  );
}

export default App;
