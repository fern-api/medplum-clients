//-no-import-rewrite
package com.fhir;

import java.lang.Object;
import java.lang.String;
import java.lang.Float;
import java.lang.Double;

/**
 * Immutable implementation of {@link ProjectMembership}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableProjectMembership.builder()}.
 */
@org.immutables.value.Generated(from = "ProjectMembership", generator = "Immutables")
@SuppressWarnings({"all"})
@edu.umd.cs.findbugs.annotations.SuppressFBWarnings
@javax.annotation.ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@javax.annotation.concurrent.Immutable
@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableProjectMembership implements com.fhir.ProjectMembership {
  private final @javax.annotation.Nullable java.lang.String resourceType;
  private final @javax.annotation.Nullable com.fhir.Meta meta;
  private final @javax.annotation.Nullable com.fhir.code language;
  private final com.fhir.Reference user;
  private final com.fhir.Reference profile;
  private final @javax.annotation.Nullable java.lang.Boolean admin;
  private final @javax.annotation.Nullable com.fhir.uri implicitRules;
  private final @javax.annotation.Nullable com.fhir.id id;
  private final @javax.annotation.Nullable com.fhir.Reference userConfiguration;
  private final com.fhir.Reference project;
  private final @javax.annotation.Nullable com.fhir.Reference accessPolicy;

  private ImmutableProjectMembership(
      @javax.annotation.Nullable java.lang.String resourceType,
      @javax.annotation.Nullable com.fhir.Meta meta,
      @javax.annotation.Nullable com.fhir.code language,
      com.fhir.Reference user,
      com.fhir.Reference profile,
      @javax.annotation.Nullable java.lang.Boolean admin,
      @javax.annotation.Nullable com.fhir.uri implicitRules,
      @javax.annotation.Nullable com.fhir.id id,
      @javax.annotation.Nullable com.fhir.Reference userConfiguration,
      com.fhir.Reference project,
      @javax.annotation.Nullable com.fhir.Reference accessPolicy) {
    this.resourceType = resourceType;
    this.meta = meta;
    this.language = language;
    this.user = user;
    this.profile = profile;
    this.admin = admin;
    this.implicitRules = implicitRules;
    this.id = id;
    this.userConfiguration = userConfiguration;
    this.project = project;
    this.accessPolicy = accessPolicy;
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
   * @return The value of the {@code user} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("user")
  @Override
  public com.fhir.Reference user() {
    return user;
  }

  /**
   * @return The value of the {@code profile} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("profile")
  @Override
  public com.fhir.Reference profile() {
    return profile;
  }

  /**
   * @return The value of the {@code admin} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("admin")
  @Override
  public java.util.Optional<java.lang.Boolean> admin() {
    return java.util.Optional.ofNullable(admin);
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
   * @return The value of the {@code id} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("id")
  @Override
  public java.util.Optional<com.fhir.id> id() {
    return java.util.Optional.ofNullable(id);
  }

  /**
   * @return The value of the {@code userConfiguration} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("userConfiguration")
  @Override
  public java.util.Optional<com.fhir.Reference> userConfiguration() {
    return java.util.Optional.ofNullable(userConfiguration);
  }

  /**
   * @return The value of the {@code project} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("project")
  @Override
  public com.fhir.Reference project() {
    return project;
  }

  /**
   * @return The value of the {@code accessPolicy} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("accessPolicy")
  @Override
  public java.util.Optional<com.fhir.Reference> accessPolicy() {
    return java.util.Optional.ofNullable(accessPolicy);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ProjectMembership#resourceType() resourceType} attribute.
   * @param value The value for resourceType
   * @return A modified copy of {@code this} object
   */
  public final ImmutableProjectMembership withResourceType(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "resourceType");
    if (java.util.Objects.equals(this.resourceType, newValue)) return this;
    return new ImmutableProjectMembership(
        newValue,
        this.meta,
        this.language,
        this.user,
        this.profile,
        this.admin,
        this.implicitRules,
        this.id,
        this.userConfiguration,
        this.project,
        this.accessPolicy);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ProjectMembership#resourceType() resourceType} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for resourceType
   * @return A modified copy of {@code this} object
   */
  public final ImmutableProjectMembership withResourceType(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.resourceType, value)) return this;
    return new ImmutableProjectMembership(
        value,
        this.meta,
        this.language,
        this.user,
        this.profile,
        this.admin,
        this.implicitRules,
        this.id,
        this.userConfiguration,
        this.project,
        this.accessPolicy);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ProjectMembership#meta() meta} attribute.
   * @param value The value for meta
   * @return A modified copy of {@code this} object
   */
  public final ImmutableProjectMembership withMeta(com.fhir.Meta value) {
    @javax.annotation.Nullable com.fhir.Meta newValue = java.util.Objects.requireNonNull(value, "meta");
    if (this.meta == newValue) return this;
    return new ImmutableProjectMembership(
        this.resourceType,
        newValue,
        this.language,
        this.user,
        this.profile,
        this.admin,
        this.implicitRules,
        this.id,
        this.userConfiguration,
        this.project,
        this.accessPolicy);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ProjectMembership#meta() meta} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for meta
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableProjectMembership withMeta(java.util.Optional<? extends com.fhir.Meta> optional) {
    @javax.annotation.Nullable com.fhir.Meta value = optional.orElse(null);
    if (this.meta == value) return this;
    return new ImmutableProjectMembership(
        this.resourceType,
        value,
        this.language,
        this.user,
        this.profile,
        this.admin,
        this.implicitRules,
        this.id,
        this.userConfiguration,
        this.project,
        this.accessPolicy);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ProjectMembership#language() language} attribute.
   * @param value The value for language
   * @return A modified copy of {@code this} object
   */
  public final ImmutableProjectMembership withLanguage(com.fhir.code value) {
    @javax.annotation.Nullable com.fhir.code newValue = java.util.Objects.requireNonNull(value, "language");
    if (this.language == newValue) return this;
    return new ImmutableProjectMembership(
        this.resourceType,
        this.meta,
        newValue,
        this.user,
        this.profile,
        this.admin,
        this.implicitRules,
        this.id,
        this.userConfiguration,
        this.project,
        this.accessPolicy);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ProjectMembership#language() language} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for language
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableProjectMembership withLanguage(java.util.Optional<? extends com.fhir.code> optional) {
    @javax.annotation.Nullable com.fhir.code value = optional.orElse(null);
    if (this.language == value) return this;
    return new ImmutableProjectMembership(
        this.resourceType,
        this.meta,
        value,
        this.user,
        this.profile,
        this.admin,
        this.implicitRules,
        this.id,
        this.userConfiguration,
        this.project,
        this.accessPolicy);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link ProjectMembership#user() user} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for user
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableProjectMembership withUser(com.fhir.Reference value) {
    if (this.user == value) return this;
    com.fhir.Reference newValue = java.util.Objects.requireNonNull(value, "user");
    return new ImmutableProjectMembership(
        this.resourceType,
        this.meta,
        this.language,
        newValue,
        this.profile,
        this.admin,
        this.implicitRules,
        this.id,
        this.userConfiguration,
        this.project,
        this.accessPolicy);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link ProjectMembership#profile() profile} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for profile
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableProjectMembership withProfile(com.fhir.Reference value) {
    if (this.profile == value) return this;
    com.fhir.Reference newValue = java.util.Objects.requireNonNull(value, "profile");
    return new ImmutableProjectMembership(
        this.resourceType,
        this.meta,
        this.language,
        this.user,
        newValue,
        this.admin,
        this.implicitRules,
        this.id,
        this.userConfiguration,
        this.project,
        this.accessPolicy);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ProjectMembership#admin() admin} attribute.
   * @param value The value for admin
   * @return A modified copy of {@code this} object
   */
  public final ImmutableProjectMembership withAdmin(boolean value) {
    @javax.annotation.Nullable java.lang.Boolean newValue = value;
    if (java.util.Objects.equals(this.admin, newValue)) return this;
    return new ImmutableProjectMembership(
        this.resourceType,
        this.meta,
        this.language,
        this.user,
        this.profile,
        newValue,
        this.implicitRules,
        this.id,
        this.userConfiguration,
        this.project,
        this.accessPolicy);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ProjectMembership#admin() admin} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for admin
   * @return A modified copy of {@code this} object
   */
  public final ImmutableProjectMembership withAdmin(java.util.Optional<java.lang.Boolean> optional) {
    @javax.annotation.Nullable java.lang.Boolean value = optional.orElse(null);
    if (java.util.Objects.equals(this.admin, value)) return this;
    return new ImmutableProjectMembership(
        this.resourceType,
        this.meta,
        this.language,
        this.user,
        this.profile,
        value,
        this.implicitRules,
        this.id,
        this.userConfiguration,
        this.project,
        this.accessPolicy);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ProjectMembership#implicitRules() implicitRules} attribute.
   * @param value The value for implicitRules
   * @return A modified copy of {@code this} object
   */
  public final ImmutableProjectMembership withImplicitRules(com.fhir.uri value) {
    @javax.annotation.Nullable com.fhir.uri newValue = java.util.Objects.requireNonNull(value, "implicitRules");
    if (this.implicitRules == newValue) return this;
    return new ImmutableProjectMembership(
        this.resourceType,
        this.meta,
        this.language,
        this.user,
        this.profile,
        this.admin,
        newValue,
        this.id,
        this.userConfiguration,
        this.project,
        this.accessPolicy);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ProjectMembership#implicitRules() implicitRules} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for implicitRules
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableProjectMembership withImplicitRules(java.util.Optional<? extends com.fhir.uri> optional) {
    @javax.annotation.Nullable com.fhir.uri value = optional.orElse(null);
    if (this.implicitRules == value) return this;
    return new ImmutableProjectMembership(
        this.resourceType,
        this.meta,
        this.language,
        this.user,
        this.profile,
        this.admin,
        value,
        this.id,
        this.userConfiguration,
        this.project,
        this.accessPolicy);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ProjectMembership#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableProjectMembership withId(com.fhir.id value) {
    @javax.annotation.Nullable com.fhir.id newValue = java.util.Objects.requireNonNull(value, "id");
    if (this.id == newValue) return this;
    return new ImmutableProjectMembership(
        this.resourceType,
        this.meta,
        this.language,
        this.user,
        this.profile,
        this.admin,
        this.implicitRules,
        newValue,
        this.userConfiguration,
        this.project,
        this.accessPolicy);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ProjectMembership#id() id} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableProjectMembership withId(java.util.Optional<? extends com.fhir.id> optional) {
    @javax.annotation.Nullable com.fhir.id value = optional.orElse(null);
    if (this.id == value) return this;
    return new ImmutableProjectMembership(
        this.resourceType,
        this.meta,
        this.language,
        this.user,
        this.profile,
        this.admin,
        this.implicitRules,
        value,
        this.userConfiguration,
        this.project,
        this.accessPolicy);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ProjectMembership#userConfiguration() userConfiguration} attribute.
   * @param value The value for userConfiguration
   * @return A modified copy of {@code this} object
   */
  public final ImmutableProjectMembership withUserConfiguration(com.fhir.Reference value) {
    @javax.annotation.Nullable com.fhir.Reference newValue = java.util.Objects.requireNonNull(value, "userConfiguration");
    if (this.userConfiguration == newValue) return this;
    return new ImmutableProjectMembership(
        this.resourceType,
        this.meta,
        this.language,
        this.user,
        this.profile,
        this.admin,
        this.implicitRules,
        this.id,
        newValue,
        this.project,
        this.accessPolicy);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ProjectMembership#userConfiguration() userConfiguration} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for userConfiguration
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableProjectMembership withUserConfiguration(java.util.Optional<? extends com.fhir.Reference> optional) {
    @javax.annotation.Nullable com.fhir.Reference value = optional.orElse(null);
    if (this.userConfiguration == value) return this;
    return new ImmutableProjectMembership(
        this.resourceType,
        this.meta,
        this.language,
        this.user,
        this.profile,
        this.admin,
        this.implicitRules,
        this.id,
        value,
        this.project,
        this.accessPolicy);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link ProjectMembership#project() project} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for project
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableProjectMembership withProject(com.fhir.Reference value) {
    if (this.project == value) return this;
    com.fhir.Reference newValue = java.util.Objects.requireNonNull(value, "project");
    return new ImmutableProjectMembership(
        this.resourceType,
        this.meta,
        this.language,
        this.user,
        this.profile,
        this.admin,
        this.implicitRules,
        this.id,
        this.userConfiguration,
        newValue,
        this.accessPolicy);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ProjectMembership#accessPolicy() accessPolicy} attribute.
   * @param value The value for accessPolicy
   * @return A modified copy of {@code this} object
   */
  public final ImmutableProjectMembership withAccessPolicy(com.fhir.Reference value) {
    @javax.annotation.Nullable com.fhir.Reference newValue = java.util.Objects.requireNonNull(value, "accessPolicy");
    if (this.accessPolicy == newValue) return this;
    return new ImmutableProjectMembership(
        this.resourceType,
        this.meta,
        this.language,
        this.user,
        this.profile,
        this.admin,
        this.implicitRules,
        this.id,
        this.userConfiguration,
        this.project,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ProjectMembership#accessPolicy() accessPolicy} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for accessPolicy
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableProjectMembership withAccessPolicy(java.util.Optional<? extends com.fhir.Reference> optional) {
    @javax.annotation.Nullable com.fhir.Reference value = optional.orElse(null);
    if (this.accessPolicy == value) return this;
    return new ImmutableProjectMembership(
        this.resourceType,
        this.meta,
        this.language,
        this.user,
        this.profile,
        this.admin,
        this.implicitRules,
        this.id,
        this.userConfiguration,
        this.project,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableProjectMembership} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@javax.annotation.Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableProjectMembership
        && equalTo((ImmutableProjectMembership) another);
  }

  private boolean equalTo(ImmutableProjectMembership another) {
    return java.util.Objects.equals(resourceType, another.resourceType)
        && java.util.Objects.equals(meta, another.meta)
        && java.util.Objects.equals(language, another.language)
        && user.equals(another.user)
        && profile.equals(another.profile)
        && java.util.Objects.equals(admin, another.admin)
        && java.util.Objects.equals(implicitRules, another.implicitRules)
        && java.util.Objects.equals(id, another.id)
        && java.util.Objects.equals(userConfiguration, another.userConfiguration)
        && project.equals(another.project)
        && java.util.Objects.equals(accessPolicy, another.accessPolicy);
  }

  /**
   * Computes a hash code from attributes: {@code resourceType}, {@code meta}, {@code language}, {@code user}, {@code profile}, {@code admin}, {@code implicitRules}, {@code id}, {@code userConfiguration}, {@code project}, {@code accessPolicy}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + java.util.Objects.hashCode(resourceType);
    h += (h << 5) + java.util.Objects.hashCode(meta);
    h += (h << 5) + java.util.Objects.hashCode(language);
    h += (h << 5) + user.hashCode();
    h += (h << 5) + profile.hashCode();
    h += (h << 5) + java.util.Objects.hashCode(admin);
    h += (h << 5) + java.util.Objects.hashCode(implicitRules);
    h += (h << 5) + java.util.Objects.hashCode(id);
    h += (h << 5) + java.util.Objects.hashCode(userConfiguration);
    h += (h << 5) + project.hashCode();
    h += (h << 5) + java.util.Objects.hashCode(accessPolicy);
    return h;
  }

  /**
   * Prints the immutable value {@code ProjectMembership} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    java.lang.StringBuilder builder = new java.lang.StringBuilder("ProjectMembership{");
    if (resourceType != null) {
      builder.append("resourceType=").append(resourceType);
    }
    if (meta != null) {
      if (builder.length() > 18) builder.append(", ");
      builder.append("meta=").append(meta);
    }
    if (language != null) {
      if (builder.length() > 18) builder.append(", ");
      builder.append("language=").append(language);
    }
    if (builder.length() > 18) builder.append(", ");
    builder.append("user=").append(user);
    builder.append(", ");
    builder.append("profile=").append(profile);
    if (admin != null) {
      builder.append(", ");
      builder.append("admin=").append(admin);
    }
    if (implicitRules != null) {
      builder.append(", ");
      builder.append("implicitRules=").append(implicitRules);
    }
    if (id != null) {
      builder.append(", ");
      builder.append("id=").append(id);
    }
    if (userConfiguration != null) {
      builder.append(", ");
      builder.append("userConfiguration=").append(userConfiguration);
    }
    builder.append(", ");
    builder.append("project=").append(project);
    if (accessPolicy != null) {
      builder.append(", ");
      builder.append("accessPolicy=").append(accessPolicy);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @org.immutables.value.Generated(from = "ProjectMembership", generator = "Immutables")
  @Deprecated
  @com.fasterxml.jackson.databind.annotation.JsonDeserialize
  @com.fasterxml.jackson.annotation.JsonAutoDetect(fieldVisibility = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.NONE)
  static final class Json implements com.fhir.ProjectMembership {
    @javax.annotation.Nullable java.util.Optional<java.lang.String> resourceType = java.util.Optional.empty();
    boolean resourceTypeIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Meta> meta = java.util.Optional.empty();
    boolean metaIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.code> language = java.util.Optional.empty();
    boolean languageIsSet;
    @javax.annotation.Nullable com.fhir.Reference user;
    @javax.annotation.Nullable com.fhir.Reference profile;
    @javax.annotation.Nullable java.util.Optional<java.lang.Boolean> admin = java.util.Optional.empty();
    boolean adminIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.uri> implicitRules = java.util.Optional.empty();
    boolean implicitRulesIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.id> id = java.util.Optional.empty();
    boolean idIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Reference> userConfiguration = java.util.Optional.empty();
    boolean userConfigurationIsSet;
    @javax.annotation.Nullable com.fhir.Reference project;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Reference> accessPolicy = java.util.Optional.empty();
    boolean accessPolicyIsSet;
    @com.fasterxml.jackson.annotation.JsonProperty("resourceType")
    public void setResourceType(java.util.Optional<java.lang.String> resourceType) {
      this.resourceType = resourceType;
      this.resourceTypeIsSet = true;
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
    @com.fasterxml.jackson.annotation.JsonProperty("user")
    public void setUser(com.fhir.Reference user) {
      this.user = user;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("profile")
    public void setProfile(com.fhir.Reference profile) {
      this.profile = profile;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("admin")
    public void setAdmin(java.util.Optional<java.lang.Boolean> admin) {
      this.admin = admin;
      this.adminIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("implicitRules")
    public void setImplicitRules(java.util.Optional<com.fhir.uri> implicitRules) {
      this.implicitRules = implicitRules;
      this.implicitRulesIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    public void setId(java.util.Optional<com.fhir.id> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("userConfiguration")
    public void setUserConfiguration(java.util.Optional<com.fhir.Reference> userConfiguration) {
      this.userConfiguration = userConfiguration;
      this.userConfigurationIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("project")
    public void setProject(com.fhir.Reference project) {
      this.project = project;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("accessPolicy")
    public void setAccessPolicy(java.util.Optional<com.fhir.Reference> accessPolicy) {
      this.accessPolicy = accessPolicy;
      this.accessPolicyIsSet = true;
    }
    @Override
    public java.util.Optional<java.lang.String> resourceType() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Meta> meta() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.code> language() { throw new UnsupportedOperationException(); }
    @Override
    public com.fhir.Reference user() { throw new UnsupportedOperationException(); }
    @Override
    public com.fhir.Reference profile() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.Boolean> admin() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.uri> implicitRules() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.id> id() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Reference> userConfiguration() { throw new UnsupportedOperationException(); }
    @Override
    public com.fhir.Reference project() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Reference> accessPolicy() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @com.fasterxml.jackson.annotation.JsonCreator(mode = com.fasterxml.jackson.annotation.JsonCreator.Mode.DELEGATING)
  static ImmutableProjectMembership fromJson(Json json) {
    ImmutableProjectMembership.Builder builder = ((ImmutableProjectMembership.Builder) ImmutableProjectMembership.builder());
    if (json.resourceTypeIsSet) {
      builder.resourceType(json.resourceType);
    }
    if (json.metaIsSet) {
      builder.meta(json.meta);
    }
    if (json.languageIsSet) {
      builder.language(json.language);
    }
    if (json.user != null) {
      builder.user(json.user);
    }
    if (json.profile != null) {
      builder.profile(json.profile);
    }
    if (json.adminIsSet) {
      builder.admin(json.admin);
    }
    if (json.implicitRulesIsSet) {
      builder.implicitRules(json.implicitRules);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.userConfigurationIsSet) {
      builder.userConfiguration(json.userConfiguration);
    }
    if (json.project != null) {
      builder.project(json.project);
    }
    if (json.accessPolicyIsSet) {
      builder.accessPolicy(json.accessPolicy);
    }
    return (ImmutableProjectMembership) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link ProjectMembership} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable ProjectMembership instance
   */
  public static ProjectMembership copyOf(ProjectMembership instance) {
    if (instance instanceof ImmutableProjectMembership) {
      return (ImmutableProjectMembership) instance;
    }
    return ((ImmutableProjectMembership.Builder) ImmutableProjectMembership.builder())
        .resourceType(instance.resourceType())
        .meta(instance.meta())
        .language(instance.language())
        .user(instance.user())
        .profile(instance.profile())
        .admin(instance.admin())
        .implicitRules(instance.implicitRules())
        .id(instance.id())
        .userConfiguration(instance.userConfiguration())
        .project(instance.project())
        .accessPolicy(instance.accessPolicy())
        .build();
  }

  /**
   * Creates a builder for {@link ProjectMembership ProjectMembership}.
   * <pre>
   * ImmutableProjectMembership.builder()
   *    .resourceType(String) // optional {@link ProjectMembership#resourceType() resourceType}
   *    .meta(com.fhir.Meta) // optional {@link ProjectMembership#meta() meta}
   *    .language(com.fhir.code) // optional {@link ProjectMembership#language() language}
   *    .user(com.fhir.Reference) // required {@link ProjectMembership#user() user}
   *    .profile(com.fhir.Reference) // required {@link ProjectMembership#profile() profile}
   *    .admin(Boolean) // optional {@link ProjectMembership#admin() admin}
   *    .implicitRules(com.fhir.uri) // optional {@link ProjectMembership#implicitRules() implicitRules}
   *    .id(com.fhir.id) // optional {@link ProjectMembership#id() id}
   *    .userConfiguration(com.fhir.Reference) // optional {@link ProjectMembership#userConfiguration() userConfiguration}
   *    .project(com.fhir.Reference) // required {@link ProjectMembership#project() project}
   *    .accessPolicy(com.fhir.Reference) // optional {@link ProjectMembership#accessPolicy() accessPolicy}
   *    .build();
   * </pre>
   * @return A new ProjectMembership builder
   */
  public static UserBuildStage builder() {
    return new ImmutableProjectMembership.Builder();
  }

  /**
   * Builds instances of type {@link ProjectMembership ProjectMembership}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @org.immutables.value.Generated(from = "ProjectMembership", generator = "Immutables")
  @javax.annotation.concurrent.NotThreadSafe
  public static final class Builder implements UserBuildStage, ProfileBuildStage, ProjectBuildStage, BuildFinal {
    private static final long INIT_BIT_USER = 0x1L;
    private static final long INIT_BIT_PROFILE = 0x2L;
    private static final long INIT_BIT_PROJECT = 0x4L;
    private static final long OPT_BIT_RESOURCE_TYPE = 0x1L;
    private static final long OPT_BIT_META = 0x2L;
    private static final long OPT_BIT_LANGUAGE = 0x4L;
    private static final long OPT_BIT_ADMIN = 0x8L;
    private static final long OPT_BIT_IMPLICIT_RULES = 0x10L;
    private static final long OPT_BIT_ID = 0x20L;
    private static final long OPT_BIT_USER_CONFIGURATION = 0x40L;
    private static final long OPT_BIT_ACCESS_POLICY = 0x80L;
    private long initBits = 0x7L;
    private long optBits;

    private @javax.annotation.Nullable java.lang.String resourceType;
    private @javax.annotation.Nullable com.fhir.Meta meta;
    private @javax.annotation.Nullable com.fhir.code language;
    private @javax.annotation.Nullable com.fhir.Reference user;
    private @javax.annotation.Nullable com.fhir.Reference profile;
    private @javax.annotation.Nullable java.lang.Boolean admin;
    private @javax.annotation.Nullable com.fhir.uri implicitRules;
    private @javax.annotation.Nullable com.fhir.id id;
    private @javax.annotation.Nullable com.fhir.Reference userConfiguration;
    private @javax.annotation.Nullable com.fhir.Reference project;
    private @javax.annotation.Nullable com.fhir.Reference accessPolicy;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link ProjectMembership#resourceType() resourceType} to resourceType.
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
     * Initializes the optional value {@link ProjectMembership#resourceType() resourceType} to resourceType.
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
     * Initializes the optional value {@link ProjectMembership#meta() meta} to meta.
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
     * Initializes the optional value {@link ProjectMembership#meta() meta} to meta.
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
     * Initializes the optional value {@link ProjectMembership#language() language} to language.
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
     * Initializes the optional value {@link ProjectMembership#language() language} to language.
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
     * Initializes the value for the {@link ProjectMembership#user() user} attribute.
     * @param user The value for user 
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("user")
    public final Builder user(com.fhir.Reference user) {
      checkNotIsSet(userIsSet(), "user");
      this.user = java.util.Objects.requireNonNull(user, "user");
      initBits &= ~INIT_BIT_USER;
      return this;
    }

    /**
     * Initializes the value for the {@link ProjectMembership#profile() profile} attribute.
     * @param profile The value for profile 
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("profile")
    public final Builder profile(com.fhir.Reference profile) {
      checkNotIsSet(profileIsSet(), "profile");
      this.profile = java.util.Objects.requireNonNull(profile, "profile");
      initBits &= ~INIT_BIT_PROFILE;
      return this;
    }

    /**
     * Initializes the optional value {@link ProjectMembership#admin() admin} to admin.
     * @param admin The value for admin
     * @return {@code this} builder for chained invocation
     */
    public final Builder admin(boolean admin) {
      checkNotIsSet(adminIsSet(), "admin");
      this.admin = admin;
      optBits |= OPT_BIT_ADMIN;
      return this;
    }

    /**
     * Initializes the optional value {@link ProjectMembership#admin() admin} to admin.
     * @param admin The value for admin
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("admin")
    public final Builder admin(java.util.Optional<java.lang.Boolean> admin) {
      checkNotIsSet(adminIsSet(), "admin");
      this.admin = admin.orElse(null);
      optBits |= OPT_BIT_ADMIN;
      return this;
    }

    /**
     * Initializes the optional value {@link ProjectMembership#implicitRules() implicitRules} to implicitRules.
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
     * Initializes the optional value {@link ProjectMembership#implicitRules() implicitRules} to implicitRules.
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
     * Initializes the optional value {@link ProjectMembership#id() id} to id.
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
     * Initializes the optional value {@link ProjectMembership#id() id} to id.
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
     * Initializes the optional value {@link ProjectMembership#userConfiguration() userConfiguration} to userConfiguration.
     * @param userConfiguration The value for userConfiguration
     * @return {@code this} builder for chained invocation
     */
    public final Builder userConfiguration(com.fhir.Reference userConfiguration) {
      checkNotIsSet(userConfigurationIsSet(), "userConfiguration");
      this.userConfiguration = java.util.Objects.requireNonNull(userConfiguration, "userConfiguration");
      optBits |= OPT_BIT_USER_CONFIGURATION;
      return this;
    }

    /**
     * Initializes the optional value {@link ProjectMembership#userConfiguration() userConfiguration} to userConfiguration.
     * @param userConfiguration The value for userConfiguration
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("userConfiguration")
    public final Builder userConfiguration(java.util.Optional<? extends com.fhir.Reference> userConfiguration) {
      checkNotIsSet(userConfigurationIsSet(), "userConfiguration");
      this.userConfiguration = userConfiguration.orElse(null);
      optBits |= OPT_BIT_USER_CONFIGURATION;
      return this;
    }

    /**
     * Initializes the value for the {@link ProjectMembership#project() project} attribute.
     * @param project The value for project 
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("project")
    public final Builder project(com.fhir.Reference project) {
      checkNotIsSet(projectIsSet(), "project");
      this.project = java.util.Objects.requireNonNull(project, "project");
      initBits &= ~INIT_BIT_PROJECT;
      return this;
    }

    /**
     * Initializes the optional value {@link ProjectMembership#accessPolicy() accessPolicy} to accessPolicy.
     * @param accessPolicy The value for accessPolicy
     * @return {@code this} builder for chained invocation
     */
    public final Builder accessPolicy(com.fhir.Reference accessPolicy) {
      checkNotIsSet(accessPolicyIsSet(), "accessPolicy");
      this.accessPolicy = java.util.Objects.requireNonNull(accessPolicy, "accessPolicy");
      optBits |= OPT_BIT_ACCESS_POLICY;
      return this;
    }

    /**
     * Initializes the optional value {@link ProjectMembership#accessPolicy() accessPolicy} to accessPolicy.
     * @param accessPolicy The value for accessPolicy
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("accessPolicy")
    public final Builder accessPolicy(java.util.Optional<? extends com.fhir.Reference> accessPolicy) {
      checkNotIsSet(accessPolicyIsSet(), "accessPolicy");
      this.accessPolicy = accessPolicy.orElse(null);
      optBits |= OPT_BIT_ACCESS_POLICY;
      return this;
    }

    /**
     * Builds a new {@link ProjectMembership ProjectMembership}.
     * @return An immutable instance of ProjectMembership
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public com.fhir.ProjectMembership build() {
      checkRequiredAttributes();
      return new ImmutableProjectMembership(
          resourceType,
          meta,
          language,
          user,
          profile,
          admin,
          implicitRules,
          id,
          userConfiguration,
          project,
          accessPolicy);
    }

    private boolean resourceTypeIsSet() {
      return (optBits & OPT_BIT_RESOURCE_TYPE) != 0;
    }

    private boolean metaIsSet() {
      return (optBits & OPT_BIT_META) != 0;
    }

    private boolean languageIsSet() {
      return (optBits & OPT_BIT_LANGUAGE) != 0;
    }

    private boolean adminIsSet() {
      return (optBits & OPT_BIT_ADMIN) != 0;
    }

    private boolean implicitRulesIsSet() {
      return (optBits & OPT_BIT_IMPLICIT_RULES) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean userConfigurationIsSet() {
      return (optBits & OPT_BIT_USER_CONFIGURATION) != 0;
    }

    private boolean accessPolicyIsSet() {
      return (optBits & OPT_BIT_ACCESS_POLICY) != 0;
    }

    private boolean userIsSet() {
      return (initBits & INIT_BIT_USER) == 0;
    }

    private boolean profileIsSet() {
      return (initBits & INIT_BIT_PROFILE) == 0;
    }

    private boolean projectIsSet() {
      return (initBits & INIT_BIT_PROJECT) == 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new java.lang.IllegalStateException("Builder of ProjectMembership is strict, attribute is already set: ".concat(name));
    }

    private void checkRequiredAttributes() {
      if (initBits != 0) {
        throw new java.lang.IllegalStateException(formatRequiredAttributesMessage());
      }
    }

    private String formatRequiredAttributesMessage() {
      java.util.List<String> attributes = new java.util.ArrayList<>();
      if (!userIsSet()) attributes.add("user");
      if (!profileIsSet()) attributes.add("profile");
      if (!projectIsSet()) attributes.add("project");
      return "Cannot build ProjectMembership, some of required attributes are not set " + attributes;
    }
  }

  @org.immutables.value.Generated(from = "ProjectMembership", generator = "Immutables")
  public interface UserBuildStage {
    /**
     * Initializes the value for the {@link ProjectMembership#user() user} attribute.
     * @param user The value for user 
     * @return {@code this} builder for use in a chained invocation
     */
    ProfileBuildStage user(com.fhir.Reference user);
  }

  @org.immutables.value.Generated(from = "ProjectMembership", generator = "Immutables")
  public interface ProfileBuildStage {
    /**
     * Initializes the value for the {@link ProjectMembership#profile() profile} attribute.
     * @param profile The value for profile 
     * @return {@code this} builder for use in a chained invocation
     */
    ProjectBuildStage profile(com.fhir.Reference profile);
  }

  @org.immutables.value.Generated(from = "ProjectMembership", generator = "Immutables")
  public interface ProjectBuildStage {
    /**
     * Initializes the value for the {@link ProjectMembership#project() project} attribute.
     * @param project The value for project 
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal project(com.fhir.Reference project);
  }

  @org.immutables.value.Generated(from = "ProjectMembership", generator = "Immutables")
  public interface BuildFinal {

    /**
     * Initializes the optional value {@link ProjectMembership#resourceType() resourceType} to resourceType.
     * @param resourceType The value for resourceType
     * @return {@code this} builder for chained invocation
     */
    BuildFinal resourceType(java.lang.String resourceType);

    /**
     * Initializes the optional value {@link ProjectMembership#resourceType() resourceType} to resourceType.
     * @param resourceType The value for resourceType
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal resourceType(java.util.Optional<java.lang.String> resourceType);

    /**
     * Initializes the optional value {@link ProjectMembership#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for chained invocation
     */
    BuildFinal meta(com.fhir.Meta meta);

    /**
     * Initializes the optional value {@link ProjectMembership#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal meta(java.util.Optional<? extends com.fhir.Meta> meta);

    /**
     * Initializes the optional value {@link ProjectMembership#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for chained invocation
     */
    BuildFinal language(com.fhir.code language);

    /**
     * Initializes the optional value {@link ProjectMembership#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal language(java.util.Optional<? extends com.fhir.code> language);

    /**
     * Initializes the optional value {@link ProjectMembership#admin() admin} to admin.
     * @param admin The value for admin
     * @return {@code this} builder for chained invocation
     */
    BuildFinal admin(boolean admin);

    /**
     * Initializes the optional value {@link ProjectMembership#admin() admin} to admin.
     * @param admin The value for admin
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal admin(java.util.Optional<java.lang.Boolean> admin);

    /**
     * Initializes the optional value {@link ProjectMembership#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for chained invocation
     */
    BuildFinal implicitRules(com.fhir.uri implicitRules);

    /**
     * Initializes the optional value {@link ProjectMembership#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal implicitRules(java.util.Optional<? extends com.fhir.uri> implicitRules);

    /**
     * Initializes the optional value {@link ProjectMembership#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    BuildFinal id(com.fhir.id id);

    /**
     * Initializes the optional value {@link ProjectMembership#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal id(java.util.Optional<? extends com.fhir.id> id);

    /**
     * Initializes the optional value {@link ProjectMembership#userConfiguration() userConfiguration} to userConfiguration.
     * @param userConfiguration The value for userConfiguration
     * @return {@code this} builder for chained invocation
     */
    BuildFinal userConfiguration(com.fhir.Reference userConfiguration);

    /**
     * Initializes the optional value {@link ProjectMembership#userConfiguration() userConfiguration} to userConfiguration.
     * @param userConfiguration The value for userConfiguration
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal userConfiguration(java.util.Optional<? extends com.fhir.Reference> userConfiguration);

    /**
     * Initializes the optional value {@link ProjectMembership#accessPolicy() accessPolicy} to accessPolicy.
     * @param accessPolicy The value for accessPolicy
     * @return {@code this} builder for chained invocation
     */
    BuildFinal accessPolicy(com.fhir.Reference accessPolicy);

    /**
     * Initializes the optional value {@link ProjectMembership#accessPolicy() accessPolicy} to accessPolicy.
     * @param accessPolicy The value for accessPolicy
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal accessPolicy(java.util.Optional<? extends com.fhir.Reference> accessPolicy);

    /**
     * Builds a new {@link ProjectMembership ProjectMembership}.
     * @return An immutable instance of ProjectMembership
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    ProjectMembership build();
  }
}
