export type uri = string & {
    __uri: void,
};

export const uri = {
    of: (value: string): uri => value as uri
};
