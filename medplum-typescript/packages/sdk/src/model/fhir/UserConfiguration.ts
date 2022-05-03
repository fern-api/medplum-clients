import { code } from "./code";
import { id } from "./id";
import { Meta } from "./Meta";
import { uri } from "./uri";
import { UserConfiguration_Menu } from "./UserConfiguration_Menu";
import { UserConfiguration_Option } from "./UserConfiguration_Option";
import { UserConfiguration_Search } from "./UserConfiguration_Search";

export interface UserConfiguration {
    resourceType: string | null | undefined;
    id: id | null | undefined;
    meta: Meta | null | undefined;
    implicitRules: uri | null | undefined;
    language: code | null | undefined;
    name: string | null | undefined;
    menu: UserConfiguration_Menu[] | null | undefined;
    search: UserConfiguration_Search[] | null | undefined;
    option: UserConfiguration_Option[] | null | undefined;
}
