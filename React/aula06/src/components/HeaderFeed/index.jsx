import { Link } from 'react-router-dom'
import * as styles from "./HeaderFeed.module.css";

export default function HeaderFeed() {
  return (
    <header>
      <div className={styles.container}>
        <div className={styles.logo}>
          <h1>Posts Crud</h1>
        </div>
        <div className={styles.btnNewPost}>
          <Link to={"/posts"}>
            <button>Novo Post</button>
          </Link>
        </div>
      </div>
    </header>
  );
}
