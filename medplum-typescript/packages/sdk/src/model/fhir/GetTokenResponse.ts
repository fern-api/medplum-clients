import { ProfileReference } from "./ProfileReference";
import { ProjectReference } from "./ProjectReference";

export interface GetTokenResponse {
    token_type: string;
    access_token: string;
    expires_in: number;
    project: ProjectReference;
    profile: ProfileReference;
}
