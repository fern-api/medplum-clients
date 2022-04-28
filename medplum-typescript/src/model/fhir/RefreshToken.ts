export type RefreshToken = string & {
    __RefreshToken: void,
};

export const RefreshToken = {
    of: (value: string): RefreshToken => value as RefreshToken
};
