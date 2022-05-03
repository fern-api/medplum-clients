export declare type date = string & {
    __date: void;
};
export declare const date: {
    of: (value: string) => date;
};
