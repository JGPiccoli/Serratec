import{createContext, useState} from 'react';

export const UserContext = createContext({});

function UserProvider({children}){
    const [nomeAluno, setNomeAluno] = useState("Carlos");
    return(
    <UserContext.Provider value={{nomeAluno, setNomeAluno}}>
        {children}
    </UserContext.Provider>
    )
}

export default UserProvider;