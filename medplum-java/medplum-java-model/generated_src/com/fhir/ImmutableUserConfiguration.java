//-no-import-rewrite
package com.fhir;

import java.lang.Object;
import java.lang.String;
import java.lang.Float;
import java.lang.Double;

/**
 * Immutable implementation of {@link UserConfiguration}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableUserConfiguration.builder()}.
 */
@org.immutables.value.Generated(from = "UserConfiguration", generator = "Immutables")
@SuppressWarnings({"all"})
@edu.umd.cs.findbugs.annotations.SuppressFBWarnings
@javax.annotation.ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@javax.annotation.concurrent.Immutable
@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableUserConfiguration implements com.fhir.UserConfiguration {
  private final @javax.annotation.Nullable java.lang.String resourceType;
  private final @javax.annotation.Nullable com.fhir.id id;
  private final @javax.annotation.Nullable java.lang.String name;
  private final @javax.annotation.Nullable java.util.List<com.fhir.UserConfiguration_Search> search;
  private final @javax.annotation.Nullable com.fhir.Meta meta;
  private final @javax.annotation.Nullable com.fhir.code language;
  private final @javax.annotation.Nullable com.fhir.uri implicitRules;
  private final @javax.annotation.Nullable java.util.List<com.fhir.UserConfiguration_Menu> menu;
  private final @javax.annotation.Nullable java.util.List<com.fhir.UserConfiguration_Option> option;

  private ImmutableUserConfiguration(
      @javax.annotation.Nullable java.lang.String resourceType,
      @javax.annotation.Nullable com.fhir.id id,
      @javax.annotation.Nullable java.lang.String name,
      @javax.annotation.Nullable java.util.List<com.fhir.UserConfiguration_Search> search,
      @javax.annotation.Nullable com.fhir.Meta meta,
      @javax.annotation.Nullable com.fhir.code language,
      @javax.annotation.Nullable com.fhir.uri implicitRules,
      @javax.annotation.Nullable java.util.List<com.fhir.UserConfiguration_Menu> menu,
      @javax.annotation.Nullable java.util.List<com.fhir.UserConfiguration_Option> option) {
    this.resourceType = resourceType;
    this.id = id;
    this.name = name;
    this.search = search;
    this.meta = meta;
    this.language = language;
    this.implicitRules = implicitRules;
    this.menu = menu;
    this.option = option;
  }

  /**
   * @return The value of the {@code resourceType} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("resourceType")
  @Override
  public java.util.Optional<java.lang.String> resourceType() {
    return java.util.Optional.ofNullable(resourceType);
  }

  /**
   * @return The value of the {@code id} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("id")
  @Override
  public java.util.Optional<com.fhir.id> id() {
    return java.util.Optional.ofNullable(id);
  }

  /**
   * @return The value of the {@code name} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("name")
  @Override
  public java.util.Optional<java.lang.String> name() {
    return java.util.Optional.ofNullable(name);
  }

  /**
   * @return The value of the {@code search} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("search")
  @Override
  public java.util.Optional<java.util.List<com.fhir.UserConfiguration_Search>> search() {
    return java.util.Optional.ofNullable(search);
  }

  /**
   * @return The value of the {@code meta} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("meta")
  @Override
  public java.util.Optional<com.fhir.Meta> meta() {
    return java.util.Optional.ofNullable(meta);
  }

  /**
   * @return The value of the {@code language} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("language")
  @Override
  public java.util.Optional<com.fhir.code> language() {
    return java.util.Optional.ofNullable(language);
  }

  /**
   * @return The value of the {@code implicitRules} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("implicitRules")
  @Override
  public java.util.Optional<com.fhir.uri> implicitRules() {
    return java.util.Optional.ofNullable(implicitRules);
  }

  /**
   * @return The value of the {@code menu} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("menu")
  @Override
  public java.util.Optional<java.util.List<com.fhir.UserConfiguration_Menu>> menu() {
    return java.util.Optional.ofNullable(menu);
  }

  /**
   * @return The value of the {@code option} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("option")
  @Override
  public java.util.Optional<java.util.List<com.fhir.UserConfiguration_Option>> option() {
    return java.util.Optional.ofNullable(option);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link UserConfiguration#resourceType() resourceType} attribute.
   * @param value The value for resourceType
   * @return A modified copy of {@code this} object
   */
  public final ImmutableUserConfiguration withResourceType(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "resourceType");
    if (java.util.Objects.equals(this.resourceType, newValue)) return this;
    return new ImmutableUserConfiguration(
        newValue,
        this.id,
        this.name,
        this.search,
        this.meta,
        this.language,
        this.implicitRules,
        this.menu,
        this.option);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link UserConfiguration#resourceType() resourceType} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for resourceType
   * @return A modified copy of {@code this} object
   */
  public final ImmutableUserConfiguration withResourceType(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.resourceType, value)) return this;
    return new ImmutableUserConfiguration(
        value,
        this.id,
        this.name,
        this.search,
        this.meta,
        this.language,
        this.implicitRules,
        this.menu,
        this.option);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link UserConfiguration#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableUserConfiguration withId(com.fhir.id value) {
    @javax.annotation.Nullable com.fhir.id newValue = java.util.Objects.requireNonNull(value, "id");
    if (this.id == newValue) return this;
    return new ImmutableUserConfiguration(
        this.resourceType,
        newValue,
        this.name,
        this.search,
        this.meta,
        this.language,
        this.implicitRules,
        this.menu,
        this.option);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link UserConfiguration#id() id} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableUserConfiguration withId(java.util.Optional<? extends com.fhir.id> optional) {
    @javax.annotation.Nullable com.fhir.id value = optional.orElse(null);
    if (this.id == value) return this;
    return new ImmutableUserConfiguration(
        this.resourceType,
        value,
        this.name,
        this.search,
        this.meta,
        this.language,
        this.implicitRules,
        this.menu,
        this.option);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link UserConfiguration#name() name} attribute.
   * @param value The value for name
   * @return A modified copy of {@code this} object
   */
  public final ImmutableUserConfiguration withName(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "name");
    if (java.util.Objects.equals(this.name, newValue)) return this;
    return new ImmutableUserConfiguration(
        this.resourceType,
        this.id,
        newValue,
        this.search,
        this.meta,
        this.language,
        this.implicitRules,
        this.menu,
        this.option);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link UserConfiguration#name() name} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for name
   * @return A modified copy of {@code this} object
   */
  public final ImmutableUserConfiguration withName(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.name, value)) return this;
    return new ImmutableUserConfiguration(
        this.resourceType,
        this.id,
        value,
        this.search,
        this.meta,
        this.language,
        this.implicitRules,
        this.menu,
        this.option);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link UserConfiguration#search() search} attribute.
   * @param value The value for search
   * @return A modified copy of {@code this} object
   */
  public final ImmutableUserConfiguration withSearch(java.util.List<com.fhir.UserConfiguration_Search> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.UserConfiguration_Search> newValue = java.util.Objects.requireNonNull(value, "search");
    if (this.search == newValue) return this;
    return new ImmutableUserConfiguration(
        this.resourceType,
        this.id,
        this.name,
        newValue,
        this.meta,
        this.language,
        this.implicitRules,
        this.menu,
        this.option);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link UserConfiguration#search() search} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for search
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableUserConfiguration withSearch(java.util.Optional<? extends java.util.List<com.fhir.UserConfiguration_Search>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.UserConfiguration_Search> value = optional.orElse(null);
    if (this.search == value) return this;
    return new ImmutableUserConfiguration(
        this.resourceType,
        this.id,
        this.name,
        value,
        this.meta,
        this.language,
        this.implicitRules,
        this.menu,
        this.option);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link UserConfiguration#meta() meta} attribute.
   * @param value The value for meta
   * @return A modified copy of {@code this} object
   */
  public final ImmutableUserConfiguration withMeta(com.fhir.Meta value) {
    @javax.annotation.Nullable com.fhir.Meta newValue = java.util.Objects.requireNonNull(value, "meta");
    if (this.meta == newValue) return this;
    return new ImmutableUserConfiguration(
        this.resourceType,
        this.id,
        this.name,
        this.search,
        newValue,
        this.language,
        this.implicitRules,
        this.menu,
        this.option);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link UserConfiguration#meta() meta} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for meta
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableUserConfiguration withMeta(java.util.Optional<? extends com.fhir.Meta> optional) {
    @javax.annotation.Nullable com.fhir.Meta value = optional.orElse(null);
    if (this.meta == value) return this;
    return new ImmutableUserConfiguration(
        this.resourceType,
        this.id,
        this.name,
        this.search,
        value,
        this.language,
        this.implicitRules,
        this.menu,
        this.option);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link UserConfiguration#language() language} attribute.
   * @param value The value for language
   * @return A modified copy of {@code this} object
   */
  public final ImmutableUserConfiguration withLanguage(com.fhir.code value) {
    @javax.annotation.Nullable com.fhir.code newValue = java.util.Objects.requireNonNull(value, "language");
    if (this.language == newValue) return this;
    return new ImmutableUserConfiguration(
        this.resourceType,
        this.id,
        this.name,
        this.search,
        this.meta,
        newValue,
        this.implicitRules,
        this.menu,
        this.option);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link UserConfiguration#language() language} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for language
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableUserConfiguration withLanguage(java.util.Optional<? extends com.fhir.code> optional) {
    @javax.annotation.Nullable com.fhir.code value = optional.orElse(null);
    if (this.language == value) return this;
    return new ImmutableUserConfiguration(
        this.resourceType,
        this.id,
        this.name,
        this.search,
        this.meta,
        value,
        this.implicitRules,
        this.menu,
        this.option);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link UserConfiguration#implicitRules() implicitRules} attribute.
   * @param value The value for implicitRules
   * @return A modified copy of {@code this} object
   */
  public final ImmutableUserConfiguration withImplicitRules(com.fhir.uri value) {
    @javax.annotation.Nullable com.fhir.uri newValue = java.util.Objects.requireNonNull(value, "implicitRules");
    if (this.implicitRules == newValue) return this;
    return new ImmutableUserConfiguration(
        this.resourceType,
        this.id,
        this.name,
        this.search,
        this.meta,
        this.language,
        newValue,
        this.menu,
        this.option);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link UserConfiguration#implicitRules() implicitRules} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for implicitRules
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableUserConfiguration withImplicitRules(java.util.Optional<? extends com.fhir.uri> optional) {
    @javax.annotation.Nullable com.fhir.uri value = optional.orElse(null);
    if (this.implicitRules == value) return this;
    return new ImmutableUserConfiguration(
        this.resourceType,
        this.id,
        this.name,
        this.search,
        this.meta,
        this.language,
        value,
        this.menu,
        this.option);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link UserConfiguration#menu() menu} attribute.
   * @param value The value for menu
   * @return A modified copy of {@code this} object
   */
  public final ImmutableUserConfiguration withMenu(java.util.List<com.fhir.UserConfiguration_Menu> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.UserConfiguration_Menu> newValue = java.util.Objects.requireNonNull(value, "menu");
    if (this.menu == newValue) return this;
    return new ImmutableUserConfiguration(
        this.resourceType,
        this.id,
        this.name,
        this.search,
        this.meta,
        this.language,
        this.implicitRules,
        newValue,
        this.option);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link UserConfiguration#menu() menu} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for menu
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableUserConfiguration withMenu(java.util.Optional<? extends java.util.List<com.fhir.UserConfiguration_Menu>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.UserConfiguration_Menu> value = optional.orElse(null);
    if (this.menu == value) return this;
    return new ImmutableUserConfiguration(
        this.resourceType,
        this.id,
        this.name,
        this.search,
        this.meta,
        this.language,
        this.implicitRules,
        value,
        this.option);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link UserConfiguration#option() option} attribute.
   * @param value The value for option
   * @return A modified copy of {@code this} object
   */
  public final ImmutableUserConfiguration withOption(java.util.List<com.fhir.UserConfiguration_Option> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.UserConfiguration_Option> newValue = java.util.Objects.requireNonNull(value, "option");
    if (this.option == newValue) return this;
    return new ImmutableUserConfiguration(
        this.resourceType,
        this.id,
        this.name,
        this.search,
        this.meta,
        this.language,
        this.implicitRules,
        this.menu,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link UserConfiguration#option() option} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for option
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableUserConfiguration withOption(java.util.Optional<? extends java.util.List<com.fhir.UserConfiguration_Option>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.UserConfiguration_Option> value = optional.orElse(null);
    if (this.option == value) return this;
    return new ImmutableUserConfiguration(
        this.resourceType,
        this.id,
        this.name,
        this.search,
        this.meta,
        this.language,
        this.implicitRules,
        this.menu,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableUserConfiguration} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@javax.annotation.Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableUserConfiguration
        && equalTo((ImmutableUserConfiguration) another);
  }

  private boolean equalTo(ImmutableUserConfiguration another) {
    return java.util.Objects.equals(resourceType, another.resourceType)
        && java.util.Objects.equals(id, another.id)
        && java.util.Objects.equals(name, another.name)
        && java.util.Objects.equals(search, another.search)
        && java.util.Objects.equals(meta, another.meta)
        && java.util.Objects.equals(language, another.language)
        && java.util.Objects.equals(implicitRules, another.implicitRules)
        && java.util.Objects.equals(menu, another.menu)
        && java.util.Objects.equals(option, another.option);
  }

  /**
   * Computes a hash code from attributes: {@code resourceType}, {@code id}, {@code name}, {@code search}, {@code meta}, {@code language}, {@code implicitRules}, {@code menu}, {@code option}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + java.util.Objects.hashCode(resourceType);
    h += (h << 5) + java.util.Objects.hashCode(id);
    h += (h << 5) + java.util.Objects.hashCode(name);
    h += (h << 5) + java.util.Objects.hashCode(search);
    h += (h << 5) + java.util.Objects.hashCode(meta);
    h += (h << 5) + java.util.Objects.hashCode(language);
    h += (h << 5) + java.util.Objects.hashCode(implicitRules);
    h += (h << 5) + java.util.Objects.hashCode(menu);
    h += (h << 5) + java.util.Objects.hashCode(option);
    return h;
  }

  /**
   * Prints the immutable value {@code UserConfiguration} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    java.lang.StringBuilder builder = new java.lang.StringBuilder("UserConfiguration{");
    if (resourceType != null) {
      builder.append("resourceType=").append(resourceType);
    }
    if (id != null) {
      if (builder.length() > 18) builder.append(", ");
      builder.append("id=").append(id);
    }
    if (name != null) {
      if (builder.length() > 18) builder.append(", ");
      builder.append("name=").append(name);
    }
    if (search != null) {
      if (builder.length() > 18) builder.append(", ");
      builder.append("search=").append(search);
    }
    if (meta != null) {
      if (builder.length() > 18) builder.append(", ");
      builder.append("meta=").append(meta);
    }
    if (language != null) {
      if (builder.length() > 18) builder.append(", ");
      builder.append("language=").append(language);
    }
    if (implicitRules != null) {
      if (builder.length() > 18) builder.append(", ");
      builder.append("implicitRules=").append(implicitRules);
    }
    if (menu != null) {
      if (builder.length() > 18) builder.append(", ");
      builder.append("menu=").append(menu);
    }
    if (option != null) {
      if (builder.length() > 18) builder.append(", ");
      builder.append("option=").append(option);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @org.immutables.value.Generated(from = "UserConfiguration", generator = "Immutables")
  @Deprecated
  @com.fasterxml.jackson.databind.annotation.JsonDeserialize
  @com.fasterxml.jackson.annotation.JsonAutoDetect(fieldVisibility = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.NONE)
  static final class Json implements com.fhir.UserConfiguration {
    @javax.annotation.Nullable java.util.Optional<java.lang.String> resourceType = java.util.Optional.empty();
    boolean resourceTypeIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.id> id = java.util.Optional.empty();
    boolean idIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.String> name = java.util.Optional.empty();
    boolean nameIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.UserConfiguration_Search>> search = java.util.Optional.empty();
    boolean searchIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Meta> meta = java.util.Optional.empty();
    boolean metaIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.code> language = java.util.Optional.empty();
    boolean languageIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.uri> implicitRules = java.util.Optional.empty();
    boolean implicitRulesIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.UserConfiguration_Menu>> menu = java.util.Optional.empty();
    boolean menuIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.UserConfiguration_Option>> option = java.util.Optional.empty();
    boolean optionIsSet;
    @com.fasterxml.jackson.annotation.JsonProperty("resourceType")
    public void setResourceType(java.util.Optional<java.lang.String> resourceType) {
      this.resourceType = resourceType;
      this.resourceTypeIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    public void setId(java.util.Optional<com.fhir.id> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    public void setName(java.util.Optional<java.lang.String> name) {
      this.name = name;
      this.nameIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("search")
    public void setSearch(java.util.Optional<java.util.List<com.fhir.UserConfiguration_Search>> search) {
      this.search = search;
      this.searchIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("meta")
    public void setMeta(java.util.Optional<com.fhir.Meta> meta) {
      this.meta = meta;
      this.metaIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("language")
    public void setLanguage(java.util.Optional<com.fhir.code> language) {
      this.language = language;
      this.languageIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("implicitRules")
    public void setImplicitRules(java.util.Optional<com.fhir.uri> implicitRules) {
      this.implicitRules = implicitRules;
      this.implicitRulesIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("menu")
    public void setMenu(java.util.Optional<java.util.List<com.fhir.UserConfiguration_Menu>> menu) {
      this.menu = menu;
      this.menuIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("option")
    public void setOption(java.util.Optional<java.util.List<com.fhir.UserConfiguration_Option>> option) {
      this.option = option;
      this.optionIsSet = true;
    }
    @Override
    public java.util.Optional<java.lang.String> resourceType() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.id> id() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.String> name() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.UserConfiguration_Search>> search() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Meta> meta() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.code> language() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.uri> implicitRules() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.UserConfiguration_Menu>> menu() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.UserConfiguration_Option>> option() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @com.fasterxml.jackson.annotation.JsonCreator(mode = com.fasterxml.jackson.annotation.JsonCreator.Mode.DELEGATING)
  static ImmutableUserConfiguration fromJson(Json json) {
    ImmutableUserConfiguration.Builder builder = ImmutableUserConfiguration.builder();
    if (json.resourceTypeIsSet) {
      builder.resourceType(json.resourceType);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.nameIsSet) {
      builder.name(json.name);
    }
    if (json.searchIsSet) {
      builder.search(json.search);
    }
    if (json.metaIsSet) {
      builder.meta(json.meta);
    }
    if (json.languageIsSet) {
      builder.language(json.language);
    }
    if (json.implicitRulesIsSet) {
      builder.implicitRules(json.implicitRules);
    }
    if (json.menuIsSet) {
      builder.menu(json.menu);
    }
    if (json.optionIsSet) {
      builder.option(json.option);
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
        .id(instance.id())
        .name(instance.name())
        .search(instance.search())
        .meta(instance.meta())
        .language(instance.language())
        .implicitRules(instance.implicitRules())
        .menu(instance.menu())
        .option(instance.option())
        .build();
  }

  /**
   * Creates a builder for {@link UserConfiguration UserConfiguration}.
   * <pre>
   * ImmutableUserConfiguration.builder()
   *    .resourceType(String) // optional {@link UserConfiguration#resourceType() resourceType}
   *    .id(com.fhir.id) // optional {@link UserConfiguration#id() id}
   *    .name(String) // optional {@link UserConfiguration#name() name}
   *    .search(List&amp;lt;com.fhir.UserConfiguration_Search&amp;gt;) // optional {@link UserConfiguration#search() search}
   *    .meta(com.fhir.Meta) // optional {@link UserConfiguration#meta() meta}
   *    .language(com.fhir.code) // optional {@link UserConfiguration#language() language}
   *    .implicitRules(com.fhir.uri) // optional {@link UserConfiguration#implicitRules() implicitRules}
   *    .menu(List&amp;lt;com.fhir.UserConfiguration_Menu&amp;gt;) // optional {@link UserConfiguration#menu() menu}
   *    .option(List&amp;lt;com.fhir.UserConfiguration_Option&amp;gt;) // optional {@link UserConfiguration#option() option}
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
  @org.immutables.value.Generated(from = "UserConfiguration", generator = "Immutables")
  @javax.annotation.concurrent.NotThreadSafe
  public static final class Builder {
    private static final long OPT_BIT_RESOURCE_TYPE = 0x1L;
    private static final long OPT_BIT_ID = 0x2L;
    private static final long OPT_BIT_NAME = 0x4L;
    private static final long OPT_BIT_SEARCH = 0x8L;
    private static final long OPT_BIT_META = 0x10L;
    private static final long OPT_BIT_LANGUAGE = 0x20L;
    private static final long OPT_BIT_IMPLICIT_RULES = 0x40L;
    private static final long OPT_BIT_MENU = 0x80L;
    private static final long OPT_BIT_OPTION = 0x100L;
    private long optBits;

    private @javax.annotation.Nullable java.lang.String resourceType;
    private @javax.annotation.Nullable com.fhir.id id;
    private @javax.annotation.Nullable java.lang.String name;
    private @javax.annotation.Nullable java.util.List<com.fhir.UserConfiguration_Search> search;
    private @javax.annotation.Nullable com.fhir.Meta meta;
    private @javax.annotation.Nullable com.fhir.code language;
    private @javax.annotation.Nullable com.fhir.uri implicitRules;
    private @javax.annotation.Nullable java.util.List<com.fhir.UserConfiguration_Menu> menu;
    private @javax.annotation.Nullable java.util.List<com.fhir.UserConfiguration_Option> option;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link UserConfiguration#resourceType() resourceType} to resourceType.
     * @param resourceType The value for resourceType
     * @return {@code this} builder for chained invocation
     */
    public final Builder resourceType(java.lang.String resourceType) {
      checkNotIsSet(resourceTypeIsSet(), "resourceType");
      this.resourceType = java.util.Objects.requireNonNull(resourceType, "resourceType");
      optBits |= OPT_BIT_RESOURCE_TYPE;
      return this;
    }

    /**
     * Initializes the optional value {@link UserConfiguration#resourceType() resourceType} to resourceType.
     * @param resourceType The value for resourceType
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("resourceType")
    public final Builder resourceType(java.util.Optional<java.lang.String> resourceType) {
      checkNotIsSet(resourceTypeIsSet(), "resourceType");
      this.resourceType = resourceType.orElse(null);
      optBits |= OPT_BIT_RESOURCE_TYPE;
      return this;
    }

    /**
     * Initializes the optional value {@link UserConfiguration#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    public final Builder id(com.fhir.id id) {
      checkNotIsSet(idIsSet(), "id");
      this.id = java.util.Objects.requireNonNull(id, "id");
      optBits |= OPT_BIT_ID;
      return this;
    }

    /**
     * Initializes the optional value {@link UserConfiguration#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    public final Builder id(java.util.Optional<? extends com.fhir.id> id) {
      checkNotIsSet(idIsSet(), "id");
      this.id = id.orElse(null);
      optBits |= OPT_BIT_ID;
      return this;
    }

    /**
     * Initializes the optional value {@link UserConfiguration#name() name} to name.
     * @param name The value for name
     * @return {@code this} builder for chained invocation
     */
    public final Builder name(java.lang.String name) {
      checkNotIsSet(nameIsSet(), "name");
      this.name = java.util.Objects.requireNonNull(name, "name");
      optBits |= OPT_BIT_NAME;
      return this;
    }

    /**
     * Initializes the optional value {@link UserConfiguration#name() name} to name.
     * @param name The value for name
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    public final Builder name(java.util.Optional<java.lang.String> name) {
      checkNotIsSet(nameIsSet(), "name");
      this.name = name.orElse(null);
      optBits |= OPT_BIT_NAME;
      return this;
    }

    /**
     * Initializes the optional value {@link UserConfiguration#search() search} to search.
     * @param search The value for search
     * @return {@code this} builder for chained invocation
     */
    public final Builder search(java.util.List<com.fhir.UserConfiguration_Search> search) {
      checkNotIsSet(searchIsSet(), "search");
      this.search = java.util.Objects.requireNonNull(search, "search");
      optBits |= OPT_BIT_SEARCH;
      return this;
    }

    /**
     * Initializes the optional value {@link UserConfiguration#search() search} to search.
     * @param search The value for search
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("search")
    public final Builder search(java.util.Optional<? extends java.util.List<com.fhir.UserConfiguration_Search>> search) {
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
    public final Builder meta(com.fhir.Meta meta) {
      checkNotIsSet(metaIsSet(), "meta");
      this.meta = java.util.Objects.requireNonNull(meta, "meta");
      optBits |= OPT_BIT_META;
      return this;
    }

    /**
     * Initializes the optional value {@link UserConfiguration#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("meta")
    public final Builder meta(java.util.Optional<? extends com.fhir.Meta> meta) {
      checkNotIsSet(metaIsSet(), "meta");
      this.meta = meta.orElse(null);
      optBits |= OPT_BIT_META;
      return this;
    }

    /**
     * Initializes the optional value {@link UserConfiguration#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for chained invocation
     */
    public final Builder language(com.fhir.code language) {
      checkNotIsSet(languageIsSet(), "language");
      this.language = java.util.Objects.requireNonNull(language, "language");
      optBits |= OPT_BIT_LANGUAGE;
      return this;
    }

    /**
     * Initializes the optional value {@link UserConfiguration#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("language")
    public final Builder language(java.util.Optional<? extends com.fhir.code> language) {
      checkNotIsSet(languageIsSet(), "language");
      this.language = language.orElse(null);
      optBits |= OPT_BIT_LANGUAGE;
      return this;
    }

    /**
     * Initializes the optional value {@link UserConfiguration#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for chained invocation
     */
    public final Builder implicitRules(com.fhir.uri implicitRules) {
      checkNotIsSet(implicitRulesIsSet(), "implicitRules");
      this.implicitRules = java.util.Objects.requireNonNull(implicitRules, "implicitRules");
      optBits |= OPT_BIT_IMPLICIT_RULES;
      return this;
    }

    /**
     * Initializes the optional value {@link UserConfiguration#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("implicitRules")
    public final Builder implicitRules(java.util.Optional<? extends com.fhir.uri> implicitRules) {
      checkNotIsSet(implicitRulesIsSet(), "implicitRules");
      this.implicitRules = implicitRules.orElse(null);
      optBits |= OPT_BIT_IMPLICIT_RULES;
      return this;
    }

    /**
     * Initializes the optional value {@link UserConfiguration#menu() menu} to menu.
     * @param menu The value for menu
     * @return {@code this} builder for chained invocation
     */
    public final Builder menu(java.util.List<com.fhir.UserConfiguration_Menu> menu) {
      checkNotIsSet(menuIsSet(), "menu");
      this.menu = java.util.Objects.requireNonNull(menu, "menu");
      optBits |= OPT_BIT_MENU;
      return this;
    }

    /**
     * Initializes the optional value {@link UserConfiguration#menu() menu} to menu.
     * @param menu The value for menu
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("menu")
    public final Builder menu(java.util.Optional<? extends java.util.List<com.fhir.UserConfiguration_Menu>> menu) {
      checkNotIsSet(menuIsSet(), "menu");
      this.menu = menu.orElse(null);
      optBits |= OPT_BIT_MENU;
      return this;
    }

    /**
     * Initializes the optional value {@link UserConfiguration#option() option} to option.
     * @param option The value for option
     * @return {@code this} builder for chained invocation
     */
    public final Builder option(java.util.List<com.fhir.UserConfiguration_Option> option) {
      checkNotIsSet(optionIsSet(), "option");
      this.option = java.util.Objects.requireNonNull(option, "option");
      optBits |= OPT_BIT_OPTION;
      return this;
    }

    /**
     * Initializes the optional value {@link UserConfiguration#option() option} to option.
     * @param option The value for option
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("option")
    public final Builder option(java.util.Optional<? extends java.util.List<com.fhir.UserConfiguration_Option>> option) {
      checkNotIsSet(optionIsSet(), "option");
      this.option = option.orElse(null);
      optBits |= OPT_BIT_OPTION;
      return this;
    }

    /**
     * Builds a new {@link UserConfiguration UserConfiguration}.
     * @return An immutable instance of UserConfiguration
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public com.fhir.UserConfiguration build() {
      return new ImmutableUserConfiguration(resourceType, id, name, search, meta, language, implicitRules, menu, option);
    }

    private boolean resourceTypeIsSet() {
      return (optBits & OPT_BIT_RESOURCE_TYPE) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean nameIsSet() {
      return (optBits & OPT_BIT_NAME) != 0;
    }

    private boolean searchIsSet() {
      return (optBits & OPT_BIT_SEARCH) != 0;
    }

    private boolean metaIsSet() {
      return (optBits & OPT_BIT_META) != 0;
    }

    private boolean languageIsSet() {
      return (optBits & OPT_BIT_LANGUAGE) != 0;
    }

    private boolean implicitRulesIsSet() {
      return (optBits & OPT_BIT_IMPLICIT_RULES) != 0;
    }

    private boolean menuIsSet() {
      return (optBits & OPT_BIT_MENU) != 0;
    }

    private boolean optionIsSet() {
      return (optBits & OPT_BIT_OPTION) != 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new java.lang.IllegalStateException("Builder of UserConfiguration is strict, attribute is already set: ".concat(name));
    }
  }
}
