export type instant = string & {
    __instant: void;
};

export const instant = {
    of: (value: string): instant => value as instant,
};
