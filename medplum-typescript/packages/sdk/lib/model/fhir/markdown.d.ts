export declare type markdown = string & {
    __markdown: void;
};
export declare const markdown: {
    of: (value: string) => markdown;
};
