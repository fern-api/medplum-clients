package com.fhir.types.fhir;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;
import javax.annotation.ParametersAreNonnullByDefault;
import javax.annotation.concurrent.Immutable;
import javax.annotation.concurrent.NotThreadSafe;
import org.immutables.value.Generated;

/**
 * Immutable implementation of {@link UserConfiguration}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableUserConfiguration.builder()}.
 */
@Generated(from = "UserConfiguration", generator = "Immutables")
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableUserConfiguration implements UserConfiguration {
  private final @Nullable String resourceType;
  private final @Nullable List<UserConfiguration_Menu> menu;
  private final @Nullable Code language;
  private final @Nullable List<UserConfiguration_Search> search;
  private final @Nullable Meta meta;
  private final @Nullable Id id;
  private final @Nullable List<UserConfiguration_Option> option;
  private final @Nullable String name;
  private final @Nullable Uri implicitRules;

  private ImmutableUserConfiguration(
      @Nullable String resourceType,
      @Nullable List<UserConfiguration_Menu> menu,
      @Nullable Code language,
      @Nullable List<UserConfiguration_Search> search,
      @Nullable Meta meta,
      @Nullable Id id,
      @Nullable List<UserConfiguration_Option> option,
      @Nullable String name,
      @Nullable Uri implicitRules) {
    this.resourceType = resourceType;
    this.menu = menu;
    this.language = language;
    this.search = search;
    this.meta = meta;
    this.id = id;
    this.option = option;
    this.name = name;
    this.implicitRules = implicitRules;
  }

  /**
   * @return The value of the {@code resourceType} attribute
   */
  @JsonProperty("resourceType")
  @Override
  public Optional<String> resourceType() {
    return Optional.ofNullable(resourceType);
  }

  /**
   * @return The value of the {@code menu} attribute
   */
  @JsonProperty("menu")
  @Override
  public Optional<List<UserConfiguration_Menu>> menu() {
    return Optional.ofNullable(menu);
  }

  /**
   * @return The value of the {@code language} attribute
   */
  @JsonProperty("language")
  @Override
  public Optional<Code> language() {
    return Optional.ofNullable(language);
  }

  /**
   * @return The value of the {@code search} attribute
   */
  @JsonProperty("search")
  @Override
  public Optional<List<UserConfiguration_Search>> search() {
    return Optional.ofNullable(search);
  }

  /**
   * @return The value of the {@code meta} attribute
   */
  @JsonProperty("meta")
  @Override
  public Optional<Meta> meta() {
    return Optional.ofNullable(meta);
  }

  /**
   * @return The value of the {@code id} attribute
   */
  @JsonProperty("id")
  @Override
  public Optional<Id> id() {
    return Optional.ofNullable(id);
  }

  /**
   * @return The value of the {@code option} attribute
   */
  @JsonProperty("option")
  @Override
  public Optional<List<UserConfiguration_Option>> option() {
    return Optional.ofNullable(option);
  }

  /**
   * @return The value of the {@code name} attribute
   */
  @JsonProperty("name")
  @Override
  public Optional<String> name() {
    return Optional.ofNullable(name);
  }

  /**
   * @return The value of the {@code implicitRules} attribute
   */
  @JsonProperty("implicitRules")
  @Override
  public Optional<Uri> implicitRules() {
    return Optional.ofNullable(implicitRules);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link UserConfiguration#resourceType() resourceType} attribute.
   * @param value The value for resourceType
   * @return A modified copy of {@code this} object
   */
  public final ImmutableUserConfiguration withResourceType(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "resourceType");
    if (Objects.equals(this.resourceType, newValue)) return this;
    return new ImmutableUserConfiguration(
        newValue,
        this.menu,
        this.language,
        this.search,
        this.meta,
        this.id,
        this.option,
        this.name,
        this.implicitRules);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link UserConfiguration#resourceType() resourceType} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for resourceType
   * @return A modified copy of {@code this} object
   */
  public final ImmutableUserConfiguration withResourceType(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.resourceType, value)) return this;
    return new ImmutableUserConfiguration(
        value,
        this.menu,
        this.language,
        this.search,
        this.meta,
        this.id,
        this.option,
        this.name,
        this.implicitRules);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link UserConfiguration#menu() menu} attribute.
   * @param value The value for menu
   * @return A modified copy of {@code this} object
   */
  public final ImmutableUserConfiguration withMenu(List<UserConfiguration_Menu> value) {
    @Nullable List<UserConfiguration_Menu> newValue = Objects.requireNonNull(value, "menu");
    if (this.menu == newValue) return this;
    return new ImmutableUserConfiguration(
        this.resourceType,
        newValue,
        this.language,
        this.search,
        this.meta,
        this.id,
        this.option,
        this.name,
        this.implicitRules);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link UserConfiguration#menu() menu} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for menu
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableUserConfiguration withMenu(Optional<? extends List<UserConfiguration_Menu>> optional) {
    @Nullable List<UserConfiguration_Menu> value = optional.orElse(null);
    if (this.menu == value) return this;
    return new ImmutableUserConfiguration(
        this.resourceType,
        value,
        this.language,
        this.search,
        this.meta,
        this.id,
        this.option,
        this.name,
        this.implicitRules);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link UserConfiguration#language() language} attribute.
   * @param value The value for language
   * @return A modified copy of {@code this} object
   */
  public final ImmutableUserConfiguration withLanguage(Code value) {
    @Nullable Code newValue = Objects.requireNonNull(value, "language");
    if (this.language == newValue) return this;
    return new ImmutableUserConfiguration(
        this.resourceType,
        this.menu,
        newValue,
        this.search,
        this.meta,
        this.id,
        this.option,
        this.name,
        this.implicitRules);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link UserConfiguration#language() language} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for language
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableUserConfiguration withLanguage(Optional<? extends Code> optional) {
    @Nullable Code value = optional.orElse(null);
    if (this.language == value) return this;
    return new ImmutableUserConfiguration(
        this.resourceType,
        this.menu,
        value,
        this.search,
        this.meta,
        this.id,
        this.option,
        this.name,
        this.implicitRules);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link UserConfiguration#search() search} attribute.
   * @param value The value for search
   * @return A modified copy of {@code this} object
   */
  public final ImmutableUserConfiguration withSearch(List<UserConfiguration_Search> value) {
    @Nullable List<UserConfiguration_Search> newValue = Objects.requireNonNull(value, "search");
    if (this.search == newValue) return this;
    return new ImmutableUserConfiguration(
        this.resourceType,
        this.menu,
        this.language,
        newValue,
        this.meta,
        this.id,
        this.option,
        this.name,
        this.implicitRules);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link UserConfiguration#search() search} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for search
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableUserConfiguration withSearch(Optional<? extends List<UserConfiguration_Search>> optional) {
    @Nullable List<UserConfiguration_Search> value = optional.orElse(null);
    if (this.search == value) return this;
    return new ImmutableUserConfiguration(
        this.resourceType,
        this.menu,
        this.language,
        value,
        this.meta,
        this.id,
        this.option,
        this.name,
        this.implicitRules);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link UserConfiguration#meta() meta} attribute.
   * @param value The value for meta
   * @return A modified copy of {@code this} object
   */
  public final ImmutableUserConfiguration withMeta(Meta value) {
    @Nullable Meta newValue = Objects.requireNonNull(value, "meta");
    if (this.meta == newValue) return this;
    return new ImmutableUserConfiguration(
        this.resourceType,
        this.menu,
        this.language,
        this.search,
        newValue,
        this.id,
        this.option,
        this.name,
        this.implicitRules);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link UserConfiguration#meta() meta} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for meta
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableUserConfiguration withMeta(Optional<? extends Meta> optional) {
    @Nullable Meta value = optional.orElse(null);
    if (this.meta == value) return this;
    return new ImmutableUserConfiguration(
        this.resourceType,
        this.menu,
        this.language,
        this.search,
        value,
        this.id,
        this.option,
        this.name,
        this.implicitRules);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link UserConfiguration#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableUserConfiguration withId(Id value) {
    @Nullable Id newValue = Objects.requireNonNull(value, "id");
    if (this.id == newValue) return this;
    return new ImmutableUserConfiguration(
        this.resourceType,
        this.menu,
        this.language,
        this.search,
        this.meta,
        newValue,
        this.option,
        this.name,
        this.implicitRules);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link UserConfiguration#id() id} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableUserConfiguration withId(Optional<? extends Id> optional) {
    @Nullable Id value = optional.orElse(null);
    if (this.id == value) return this;
    return new ImmutableUserConfiguration(
        this.resourceType,
        this.menu,
        this.language,
        this.search,
        this.meta,
        value,
        this.option,
        this.name,
        this.implicitRules);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link UserConfiguration#option() option} attribute.
   * @param value The value for option
   * @return A modified copy of {@code this} object
   */
  public final ImmutableUserConfiguration withOption(List<UserConfiguration_Option> value) {
    @Nullable List<UserConfiguration_Option> newValue = Objects.requireNonNull(value, "option");
    if (this.option == newValue) return this;
    return new ImmutableUserConfiguration(
        this.resourceType,
        this.menu,
        this.language,
        this.search,
        this.meta,
        this.id,
        newValue,
        this.name,
        this.implicitRules);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link UserConfiguration#option() option} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for option
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableUserConfiguration withOption(Optional<? extends List<UserConfiguration_Option>> optional) {
    @Nullable List<UserConfiguration_Option> value = optional.orElse(null);
    if (this.option == value) return this;
    return new ImmutableUserConfiguration(
        this.resourceType,
        this.menu,
        this.language,
        this.search,
        this.meta,
        this.id,
        value,
        this.name,
        this.implicitRules);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link UserConfiguration#name() name} attribute.
   * @param value The value for name
   * @return A modified copy of {@code this} object
   */
  public final ImmutableUserConfiguration withName(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "name");
    if (Objects.equals(this.name, newValue)) return this;
    return new ImmutableUserConfiguration(
        this.resourceType,
        this.menu,
        this.language,
        this.search,
        this.meta,
        this.id,
        this.option,
        newValue,
        this.implicitRules);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link UserConfiguration#name() name} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for name
   * @return A modified copy of {@code this} object
   */
  public final ImmutableUserConfiguration withName(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.name, value)) return this;
    return new ImmutableUserConfiguration(
        this.resourceType,
        this.menu,
        this.language,
        this.search,
        this.meta,
        this.id,
        this.option,
        value,
        this.implicitRules);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link UserConfiguration#implicitRules() implicitRules} attribute.
   * @param value The value for implicitRules
   * @return A modified copy of {@code this} object
   */
  public final ImmutableUserConfiguration withImplicitRules(Uri value) {
    @Nullable Uri newValue = Objects.requireNonNull(value, "implicitRules");
    if (this.implicitRules == newValue) return this;
    return new ImmutableUserConfiguration(
        this.resourceType,
        this.menu,
        this.language,
        this.search,
        this.meta,
        this.id,
        this.option,
        this.name,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link UserConfiguration#implicitRules() implicitRules} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for implicitRules
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableUserConfiguration withImplicitRules(Optional<? extends Uri> optional) {
    @Nullable Uri value = optional.orElse(null);
    if (this.implicitRules == value) return this;
    return new ImmutableUserConfiguration(
        this.resourceType,
        this.menu,
        this.language,
        this.search,
        this.meta,
        this.id,
        this.option,
        this.name,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableUserConfiguration} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableUserConfiguration
        && equalTo((ImmutableUserConfiguration) another);
  }

  private boolean equalTo(ImmutableUserConfiguration another) {
    return Objects.equals(resourceType, another.resourceType)
        && Objects.equals(menu, another.menu)
        && Objects.equals(language, another.language)
        && Objects.equals(search, another.search)
        && Objects.equals(meta, another.meta)
        && Objects.equals(id, another.id)
        && Objects.equals(option, another.option)
        && Objects.equals(name, another.name)
        && Objects.equals(implicitRules, another.implicitRules);
  }

  /**
   * Computes a hash code from attributes: {@code resourceType}, {@code menu}, {@code language}, {@code search}, {@code meta}, {@code id}, {@code option}, {@code name}, {@code implicitRules}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(resourceType);
    h += (h << 5) + Objects.hashCode(menu);
    h += (h << 5) + Objects.hashCode(language);
    h += (h << 5) + Objects.hashCode(search);
    h += (h << 5) + Objects.hashCode(meta);
    h += (h << 5) + Objects.hashCode(id);
    h += (h << 5) + Objects.hashCode(option);
    h += (h << 5) + Objects.hashCode(name);
    h += (h << 5) + Objects.hashCode(implicitRules);
    return h;
  }

  /**
   * Prints the immutable value {@code UserConfiguration} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("UserConfiguration{");
    if (resourceType != null) {
      builder.append("resourceType=").append(resourceType);
    }
    if (menu != null) {
      if (builder.length() > 18) builder.append(", ");
      builder.append("menu=").append(menu);
    }
    if (language != null) {
      if (builder.length() > 18) builder.append(", ");
      builder.append("language=").append(language);
    }
    if (search != null) {
      if (builder.length() > 18) builder.append(", ");
      builder.append("search=").append(search);
    }
    if (meta != null) {
      if (builder.length() > 18) builder.append(", ");
      builder.append("meta=").append(meta);
    }
    if (id != null) {
      if (builder.length() > 18) builder.append(", ");
      builder.append("id=").append(id);
    }
    if (option != null) {
      if (builder.length() > 18) builder.append(", ");
      builder.append("option=").append(option);
    }
    if (name != null) {
      if (builder.length() > 18) builder.append(", ");
      builder.append("name=").append(name);
    }
    if (implicitRules != null) {
      if (builder.length() > 18) builder.append(", ");
      builder.append("implicitRules=").append(implicitRules);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Generated(from = "UserConfiguration", generator = "Immutables")
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements UserConfiguration {
    @Nullable Optional<String> resourceType = Optional.empty();
    boolean resourceTypeIsSet;
    @Nullable Optional<List<UserConfiguration_Menu>> menu = Optional.empty();
    boolean menuIsSet;
    @Nullable Optional<Code> language = Optional.empty();
    boolean languageIsSet;
    @Nullable Optional<List<UserConfiguration_Search>> search = Optional.empty();
    boolean searchIsSet;
    @Nullable Optional<Meta> meta = Optional.empty();
    boolean metaIsSet;
    @Nullable Optional<Id> id = Optional.empty();
    boolean idIsSet;
    @Nullable Optional<List<UserConfiguration_Option>> option = Optional.empty();
    boolean optionIsSet;
    @Nullable Optional<String> name = Optional.empty();
    boolean nameIsSet;
    @Nullable Optional<Uri> implicitRules = Optional.empty();
    boolean implicitRulesIsSet;
    @JsonProperty("resourceType")
    public void setResourceType(Optional<String> resourceType) {
      this.resourceType = resourceType;
      this.resourceTypeIsSet = true;
    }
    @JsonProperty("menu")
    public void setMenu(Optional<List<UserConfiguration_Menu>> menu) {
      this.menu = menu;
      this.menuIsSet = true;
    }
    @JsonProperty("language")
    public void setLanguage(Optional<Code> language) {
      this.language = language;
      this.languageIsSet = true;
    }
    @JsonProperty("search")
    public void setSearch(Optional<List<UserConfiguration_Search>> search) {
      this.search = search;
      this.searchIsSet = true;
    }
    @JsonProperty("meta")
    public void setMeta(Optional<Meta> meta) {
      this.meta = meta;
      this.metaIsSet = true;
    }
    @JsonProperty("id")
    public void setId(Optional<Id> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @JsonProperty("option")
    public void setOption(Optional<List<UserConfiguration_Option>> option) {
      this.option = option;
      this.optionIsSet = true;
    }
    @JsonProperty("name")
    public void setName(Optional<String> name) {
      this.name = name;
      this.nameIsSet = true;
    }
    @JsonProperty("implicitRules")
    public void setImplicitRules(Optional<Uri> implicitRules) {
      this.implicitRules = implicitRules;
      this.implicitRulesIsSet = true;
    }
    @Override
    public Optional<String> resourceType() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<UserConfiguration_Menu>> menu() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Code> language() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<UserConfiguration_Search>> search() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Meta> meta() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Id> id() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<UserConfiguration_Option>> option() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> name() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Uri> implicitRules() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableUserConfiguration fromJson(Json json) {
    ImmutableUserConfiguration.Builder builder = ImmutableUserConfiguration.builder();
    if (json.resourceTypeIsSet) {
      builder.resourceType(json.resourceType);
    }
    if (json.menuIsSet) {
      builder.menu(json.menu);
    }
    if (json.languageIsSet) {
      builder.language(json.language);
    }
    if (json.searchIsSet) {
      builder.search(json.search);
    }
    if (json.metaIsSet) {
      builder.meta(json.meta);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.optionIsSet) {
      builder.option(json.option);
    }
    if (json.nameIsSet) {
      builder.name(json.name);
    }
    if (json.implicitRulesIsSet) {
      builder.implicitRules(json.implicitRules);
    }
    return (ImmutableUserConfiguration) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link UserConfiguration} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable UserConfiguration instance
   */
  public static UserConfiguration copyOf(UserConfiguration instance) {
    if (instance instanceof ImmutableUserConfiguration) {
      return (ImmutableUserConfiguration) instance;
    }
    return ImmutableUserConfiguration.builder()
        .resourceType(instance.resourceType())
        .menu(instance.menu())
        .language(instance.language())
        .search(instance.search())
        .meta(instance.meta())
        .id(instance.id())
        .option(instance.option())
        .name(instance.name())
        .implicitRules(instance.implicitRules())
        .build();
  }

  /**
   * Creates a builder for {@link UserConfiguration UserConfiguration}.
   * <pre>
   * ImmutableUserConfiguration.builder()
   *    .resourceType(String) // optional {@link UserConfiguration#resourceType() resourceType}
   *    .menu(List&amp;lt;com.fhir.types.fhir.UserConfiguration_Menu&amp;gt;) // optional {@link UserConfiguration#menu() menu}
   *    .language(com.fhir.types.fhir.Code) // optional {@link UserConfiguration#language() language}
   *    .search(List&amp;lt;com.fhir.types.fhir.UserConfiguration_Search&amp;gt;) // optional {@link UserConfiguration#search() search}
   *    .meta(com.fhir.types.fhir.Meta) // optional {@link UserConfiguration#meta() meta}
   *    .id(com.fhir.types.fhir.Id) // optional {@link UserConfiguration#id() id}
   *    .option(List&amp;lt;com.fhir.types.fhir.UserConfiguration_Option&amp;gt;) // optional {@link UserConfiguration#option() option}
   *    .name(String) // optional {@link UserConfiguration#name() name}
   *    .implicitRules(com.fhir.types.fhir.Uri) // optional {@link UserConfiguration#implicitRules() implicitRules}
   *    .build();
   * </pre>
   * @return A new UserConfiguration builder
   */
  public static ImmutableUserConfiguration.Builder builder() {
    return new ImmutableUserConfiguration.Builder();
  }

  /**
   * Builds instances of type {@link UserConfiguration UserConfiguration}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "UserConfiguration", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder {
    private static final long OPT_BIT_RESOURCE_TYPE = 0x1L;
    private static final long OPT_BIT_MENU = 0x2L;
    private static final long OPT_BIT_LANGUAGE = 0x4L;
    private static final long OPT_BIT_SEARCH = 0x8L;
    private static final long OPT_BIT_META = 0x10L;
    private static final long OPT_BIT_ID = 0x20L;
    private static final long OPT_BIT_OPTION = 0x40L;
    private static final long OPT_BIT_NAME = 0x80L;
    private static final long OPT_BIT_IMPLICIT_RULES = 0x100L;
    private long optBits;

    private @Nullable String resourceType;
    private @Nullable List<UserConfiguration_Menu> menu;
    private @Nullable Code language;
    private @Nullable List<UserConfiguration_Search> search;
    private @Nullable Meta meta;
    private @Nullable Id id;
    private @Nullable List<UserConfiguration_Option> option;
    private @Nullable String name;
    private @Nullable Uri implicitRules;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link UserConfiguration#resourceType() resourceType} to resourceType.
     * @param resourceType The value for resourceType
     * @return {@code this} builder for chained invocation
     */
    public final Builder resourceType(String resourceType) {
      checkNotIsSet(resourceTypeIsSet(), "resourceType");
      this.resourceType = Objects.requireNonNull(resourceType, "resourceType");
      optBits |= OPT_BIT_RESOURCE_TYPE;
      return this;
    }

    /**
     * Initializes the optional value {@link UserConfiguration#resourceType() resourceType} to resourceType.
     * @param resourceType The value for resourceType
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("resourceType")
    public final Builder resourceType(Optional<String> resourceType) {
      checkNotIsSet(resourceTypeIsSet(), "resourceType");
      this.resourceType = resourceType.orElse(null);
      optBits |= OPT_BIT_RESOURCE_TYPE;
      return this;
    }

    /**
     * Initializes the optional value {@link UserConfiguration#menu() menu} to menu.
     * @param menu The value for menu
     * @return {@code this} builder for chained invocation
     */
    public final Builder menu(List<UserConfiguration_Menu> menu) {
      checkNotIsSet(menuIsSet(), "menu");
      this.menu = Objects.requireNonNull(menu, "menu");
      optBits |= OPT_BIT_MENU;
      return this;
    }

    /**
     * Initializes the optional value {@link UserConfiguration#menu() menu} to menu.
     * @param menu The value for menu
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("menu")
    public final Builder menu(Optional<? extends List<UserConfiguration_Menu>> menu) {
      checkNotIsSet(menuIsSet(), "menu");
      this.menu = menu.orElse(null);
      optBits |= OPT_BIT_MENU;
      return this;
    }

    /**
     * Initializes the optional value {@link UserConfiguration#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for chained invocation
     */
    public final Builder language(Code language) {
      checkNotIsSet(languageIsSet(), "language");
      this.language = Objects.requireNonNull(language, "language");
      optBits |= OPT_BIT_LANGUAGE;
      return this;
    }

    /**
     * Initializes the optional value {@link UserConfiguration#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("language")
    public final Builder language(Optional<? extends Code> language) {
      checkNotIsSet(languageIsSet(), "language");
      this.language = language.orElse(null);
      optBits |= OPT_BIT_LANGUAGE;
      return this;
    }

    /**
     * Initializes the optional value {@link UserConfiguration#search() search} to search.
     * @param search The value for search
     * @return {@code this} builder for chained invocation
     */
    public final Builder search(List<UserConfiguration_Search> search) {
      checkNotIsSet(searchIsSet(), "search");
      this.search = Objects.requireNonNull(search, "search");
      optBits |= OPT_BIT_SEARCH;
      return this;
    }

    /**
     * Initializes the optional value {@link UserConfiguration#search() search} to search.
     * @param search The value for search
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("search")
    public final Builder search(Optional<? extends List<UserConfiguration_Search>> search) {
      checkNotIsSet(searchIsSet(), "search");
      this.search = search.orElse(null);
      optBits |= OPT_BIT_SEARCH;
      return this;
    }

    /**
     * Initializes the optional value {@link UserConfiguration#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for chained invocation
     */
    public final Builder meta(Meta meta) {
      checkNotIsSet(metaIsSet(), "meta");
      this.meta = Objects.requireNonNull(meta, "meta");
      optBits |= OPT_BIT_META;
      return this;
    }

    /**
     * Initializes the optional value {@link UserConfiguration#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("meta")
    public final Builder meta(Optional<? extends Meta> meta) {
      checkNotIsSet(metaIsSet(), "meta");
      this.meta = meta.orElse(null);
      optBits |= OPT_BIT_META;
      return this;
    }

    /**
     * Initializes the optional value {@link UserConfiguration#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    public final Builder id(Id id) {
      checkNotIsSet(idIsSet(), "id");
      this.id = Objects.requireNonNull(id, "id");
      optBits |= OPT_BIT_ID;
      return this;
    }

    /**
     * Initializes the optional value {@link UserConfiguration#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("id")
    public final Builder id(Optional<? extends Id> id) {
      checkNotIsSet(idIsSet(), "id");
      this.id = id.orElse(null);
      optBits |= OPT_BIT_ID;
      return this;
    }

    /**
     * Initializes the optional value {@link UserConfiguration#option() option} to option.
     * @param option The value for option
     * @return {@code this} builder for chained invocation
     */
    public final Builder option(List<UserConfiguration_Option> option) {
      checkNotIsSet(optionIsSet(), "option");
      this.option = Objects.requireNonNull(option, "option");
      optBits |= OPT_BIT_OPTION;
      return this;
    }

    /**
     * Initializes the optional value {@link UserConfiguration#option() option} to option.
     * @param option The value for option
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("option")
    public final Builder option(Optional<? extends List<UserConfiguration_Option>> option) {
      checkNotIsSet(optionIsSet(), "option");
      this.option = option.orElse(null);
      optBits |= OPT_BIT_OPTION;
      return this;
    }

    /**
     * Initializes the optional value {@link UserConfiguration#name() name} to name.
     * @param name The value for name
     * @return {@code this} builder for chained invocation
     */
    public final Builder name(String name) {
      checkNotIsSet(nameIsSet(), "name");
      this.name = Objects.requireNonNull(name, "name");
      optBits |= OPT_BIT_NAME;
      return this;
    }

    /**
     * Initializes the optional value {@link UserConfiguration#name() name} to name.
     * @param name The value for name
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("name")
    public final Builder name(Optional<String> name) {
      checkNotIsSet(nameIsSet(), "name");
      this.name = name.orElse(null);
      optBits |= OPT_BIT_NAME;
      return this;
    }

    /**
     * Initializes the optional value {@link UserConfiguration#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for chained invocation
     */
    public final Builder implicitRules(Uri implicitRules) {
      checkNotIsSet(implicitRulesIsSet(), "implicitRules");
      this.implicitRules = Objects.requireNonNull(implicitRules, "implicitRules");
      optBits |= OPT_BIT_IMPLICIT_RULES;
      return this;
    }

    /**
     * Initializes the optional value {@link UserConfiguration#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("implicitRules")
    public final Builder implicitRules(Optional<? extends Uri> implicitRules) {
      checkNotIsSet(implicitRulesIsSet(), "implicitRules");
      this.implicitRules = implicitRules.orElse(null);
      optBits |= OPT_BIT_IMPLICIT_RULES;
      return this;
    }

    /**
     * Builds a new {@link UserConfiguration UserConfiguration}.
     * @return An immutable instance of UserConfiguration
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public UserConfiguration build() {
      return new ImmutableUserConfiguration(resourceType, menu, language, search, meta, id, option, name, implicitRules);
    }

    private boolean resourceTypeIsSet() {
      return (optBits & OPT_BIT_RESOURCE_TYPE) != 0;
    }

    private boolean menuIsSet() {
      return (optBits & OPT_BIT_MENU) != 0;
    }

    private boolean languageIsSet() {
      return (optBits & OPT_BIT_LANGUAGE) != 0;
    }

    private boolean searchIsSet() {
      return (optBits & OPT_BIT_SEARCH) != 0;
    }

    private boolean metaIsSet() {
      return (optBits & OPT_BIT_META) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean optionIsSet() {
      return (optBits & OPT_BIT_OPTION) != 0;
    }

    private boolean nameIsSet() {
      return (optBits & OPT_BIT_NAME) != 0;
    }

    private boolean implicitRulesIsSet() {
      return (optBits & OPT_BIT_IMPLICIT_RULES) != 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of UserConfiguration is strict, attribute is already set: ".concat(name));
    }
  }
}
