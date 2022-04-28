export type xhtml = string & {
    __xhtml: void,
};

export const xhtml = {
    of: (value: string): xhtml => value as xhtml
};
