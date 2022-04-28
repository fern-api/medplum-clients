export type markdown = string & {
    __markdown: void,
};

export const markdown = {
    of: (value: string): markdown => value as markdown
};
