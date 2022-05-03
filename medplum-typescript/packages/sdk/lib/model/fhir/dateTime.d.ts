export declare type dateTime = string & {
    __dateTime: void;
};
export declare const dateTime: {
    of: (value: string) => dateTime;
};
