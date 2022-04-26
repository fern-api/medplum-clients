package com.medplum.types.fhir;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;
import javax.annotation.ParametersAreNonnullByDefault;
import javax.annotation.concurrent.Immutable;
import javax.annotation.concurrent.NotThreadSafe;
import org.immutables.value.Generated;

/**
 * Immutable implementation of {@link ProjectMembership}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableProjectMembership.builder()}.
 */
@Generated(from = "ProjectMembership", generator = "Immutables")
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableProjectMembership implements ProjectMembership {
  private final @Nullable Id id;
  private final @Nullable Reference accessPolicy;
  private final @Nullable String resourceType;
  private final @Nullable Meta meta;
  private final @Nullable Code language;
  private final Reference project;
  private final @Nullable Reference userConfiguration;
  private final Reference user;
  private final @Nullable Boolean admin;
  private final @Nullable Uri implicitRules;
  private final Reference profile;

  private ImmutableProjectMembership(
      @Nullable Id id,
      @Nullable Reference accessPolicy,
      @Nullable String resourceType,
      @Nullable Meta meta,
      @Nullable Code language,
      Reference project,
      @Nullable Reference userConfiguration,
      Reference user,
      @Nullable Boolean admin,
      @Nullable Uri implicitRules,
      Reference profile) {
    this.id = id;
    this.accessPolicy = accessPolicy;
    this.resourceType = resourceType;
    this.meta = meta;
    this.language = language;
    this.project = project;
    this.userConfiguration = userConfiguration;
    this.user = user;
    this.admin = admin;
    this.implicitRules = implicitRules;
    this.profile = profile;
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
   * @return The value of the {@code accessPolicy} attribute
   */
  @JsonProperty("accessPolicy")
  @Override
  public Optional<Reference> accessPolicy() {
    return Optional.ofNullable(accessPolicy);
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
   * @return The value of the {@code meta} attribute
   */
  @JsonProperty("meta")
  @Override
  public Optional<Meta> meta() {
    return Optional.ofNullable(meta);
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
   * @return The value of the {@code project} attribute
   */
  @JsonProperty("project")
  @Override
  public Reference project() {
    return project;
  }

  /**
   * @return The value of the {@code userConfiguration} attribute
   */
  @JsonProperty("userConfiguration")
  @Override
  public Optional<Reference> userConfiguration() {
    return Optional.ofNullable(userConfiguration);
  }

  /**
   * @return The value of the {@code user} attribute
   */
  @JsonProperty("user")
  @Override
  public Reference user() {
    return user;
  }

  /**
   * @return The value of the {@code admin} attribute
   */
  @JsonProperty("admin")
  @Override
  public Optional<Boolean> admin() {
    return Optional.ofNullable(admin);
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
   * @return The value of the {@code profile} attribute
   */
  @JsonProperty("profile")
  @Override
  public Reference profile() {
    return profile;
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ProjectMembership#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableProjectMembership withId(Id value) {
    @Nullable Id newValue = Objects.requireNonNull(value, "id");
    if (this.id == newValue) return this;
    return new ImmutableProjectMembership(
        newValue,
        this.accessPolicy,
        this.resourceType,
        this.meta,
        this.language,
        this.project,
        this.userConfiguration,
        this.user,
        this.admin,
        this.implicitRules,
        this.profile);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ProjectMembership#id() id} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableProjectMembership withId(Optional<? extends Id> optional) {
    @Nullable Id value = optional.orElse(null);
    if (this.id == value) return this;
    return new ImmutableProjectMembership(
        value,
        this.accessPolicy,
        this.resourceType,
        this.meta,
        this.language,
        this.project,
        this.userConfiguration,
        this.user,
        this.admin,
        this.implicitRules,
        this.profile);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ProjectMembership#accessPolicy() accessPolicy} attribute.
   * @param value The value for accessPolicy
   * @return A modified copy of {@code this} object
   */
  public final ImmutableProjectMembership withAccessPolicy(Reference value) {
    @Nullable Reference newValue = Objects.requireNonNull(value, "accessPolicy");
    if (this.accessPolicy == newValue) return this;
    return new ImmutableProjectMembership(
        this.id,
        newValue,
        this.resourceType,
        this.meta,
        this.language,
        this.project,
        this.userConfiguration,
        this.user,
        this.admin,
        this.implicitRules,
        this.profile);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ProjectMembership#accessPolicy() accessPolicy} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for accessPolicy
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableProjectMembership withAccessPolicy(Optional<? extends Reference> optional) {
    @Nullable Reference value = optional.orElse(null);
    if (this.accessPolicy == value) return this;
    return new ImmutableProjectMembership(
        this.id,
        value,
        this.resourceType,
        this.meta,
        this.language,
        this.project,
        this.userConfiguration,
        this.user,
        this.admin,
        this.implicitRules,
        this.profile);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ProjectMembership#resourceType() resourceType} attribute.
   * @param value The value for resourceType
   * @return A modified copy of {@code this} object
   */
  public final ImmutableProjectMembership withResourceType(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "resourceType");
    if (Objects.equals(this.resourceType, newValue)) return this;
    return new ImmutableProjectMembership(
        this.id,
        this.accessPolicy,
        newValue,
        this.meta,
        this.language,
        this.project,
        this.userConfiguration,
        this.user,
        this.admin,
        this.implicitRules,
        this.profile);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ProjectMembership#resourceType() resourceType} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for resourceType
   * @return A modified copy of {@code this} object
   */
  public final ImmutableProjectMembership withResourceType(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.resourceType, value)) return this;
    return new ImmutableProjectMembership(
        this.id,
        this.accessPolicy,
        value,
        this.meta,
        this.language,
        this.project,
        this.userConfiguration,
        this.user,
        this.admin,
        this.implicitRules,
        this.profile);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ProjectMembership#meta() meta} attribute.
   * @param value The value for meta
   * @return A modified copy of {@code this} object
   */
  public final ImmutableProjectMembership withMeta(Meta value) {
    @Nullable Meta newValue = Objects.requireNonNull(value, "meta");
    if (this.meta == newValue) return this;
    return new ImmutableProjectMembership(
        this.id,
        this.accessPolicy,
        this.resourceType,
        newValue,
        this.language,
        this.project,
        this.userConfiguration,
        this.user,
        this.admin,
        this.implicitRules,
        this.profile);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ProjectMembership#meta() meta} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for meta
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableProjectMembership withMeta(Optional<? extends Meta> optional) {
    @Nullable Meta value = optional.orElse(null);
    if (this.meta == value) return this;
    return new ImmutableProjectMembership(
        this.id,
        this.accessPolicy,
        this.resourceType,
        value,
        this.language,
        this.project,
        this.userConfiguration,
        this.user,
        this.admin,
        this.implicitRules,
        this.profile);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ProjectMembership#language() language} attribute.
   * @param value The value for language
   * @return A modified copy of {@code this} object
   */
  public final ImmutableProjectMembership withLanguage(Code value) {
    @Nullable Code newValue = Objects.requireNonNull(value, "language");
    if (this.language == newValue) return this;
    return new ImmutableProjectMembership(
        this.id,
        this.accessPolicy,
        this.resourceType,
        this.meta,
        newValue,
        this.project,
        this.userConfiguration,
        this.user,
        this.admin,
        this.implicitRules,
        this.profile);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ProjectMembership#language() language} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for language
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableProjectMembership withLanguage(Optional<? extends Code> optional) {
    @Nullable Code value = optional.orElse(null);
    if (this.language == value) return this;
    return new ImmutableProjectMembership(
        this.id,
        this.accessPolicy,
        this.resourceType,
        this.meta,
        value,
        this.project,
        this.userConfiguration,
        this.user,
        this.admin,
        this.implicitRules,
        this.profile);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link ProjectMembership#project() project} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for project
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableProjectMembership withProject(Reference value) {
    if (this.project == value) return this;
    Reference newValue = Objects.requireNonNull(value, "project");
    return new ImmutableProjectMembership(
        this.id,
        this.accessPolicy,
        this.resourceType,
        this.meta,
        this.language,
        newValue,
        this.userConfiguration,
        this.user,
        this.admin,
        this.implicitRules,
        this.profile);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ProjectMembership#userConfiguration() userConfiguration} attribute.
   * @param value The value for userConfiguration
   * @return A modified copy of {@code this} object
   */
  public final ImmutableProjectMembership withUserConfiguration(Reference value) {
    @Nullable Reference newValue = Objects.requireNonNull(value, "userConfiguration");
    if (this.userConfiguration == newValue) return this;
    return new ImmutableProjectMembership(
        this.id,
        this.accessPolicy,
        this.resourceType,
        this.meta,
        this.language,
        this.project,
        newValue,
        this.user,
        this.admin,
        this.implicitRules,
        this.profile);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ProjectMembership#userConfiguration() userConfiguration} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for userConfiguration
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableProjectMembership withUserConfiguration(Optional<? extends Reference> optional) {
    @Nullable Reference value = optional.orElse(null);
    if (this.userConfiguration == value) return this;
    return new ImmutableProjectMembership(
        this.id,
        this.accessPolicy,
        this.resourceType,
        this.meta,
        this.language,
        this.project,
        value,
        this.user,
        this.admin,
        this.implicitRules,
        this.profile);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link ProjectMembership#user() user} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for user
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableProjectMembership withUser(Reference value) {
    if (this.user == value) return this;
    Reference newValue = Objects.requireNonNull(value, "user");
    return new ImmutableProjectMembership(
        this.id,
        this.accessPolicy,
        this.resourceType,
        this.meta,
        this.language,
        this.project,
        this.userConfiguration,
        newValue,
        this.admin,
        this.implicitRules,
        this.profile);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ProjectMembership#admin() admin} attribute.
   * @param value The value for admin
   * @return A modified copy of {@code this} object
   */
  public final ImmutableProjectMembership withAdmin(boolean value) {
    @Nullable Boolean newValue = value;
    if (Objects.equals(this.admin, newValue)) return this;
    return new ImmutableProjectMembership(
        this.id,
        this.accessPolicy,
        this.resourceType,
        this.meta,
        this.language,
        this.project,
        this.userConfiguration,
        this.user,
        newValue,
        this.implicitRules,
        this.profile);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ProjectMembership#admin() admin} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for admin
   * @return A modified copy of {@code this} object
   */
  public final ImmutableProjectMembership withAdmin(Optional<Boolean> optional) {
    @Nullable Boolean value = optional.orElse(null);
    if (Objects.equals(this.admin, value)) return this;
    return new ImmutableProjectMembership(
        this.id,
        this.accessPolicy,
        this.resourceType,
        this.meta,
        this.language,
        this.project,
        this.userConfiguration,
        this.user,
        value,
        this.implicitRules,
        this.profile);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ProjectMembership#implicitRules() implicitRules} attribute.
   * @param value The value for implicitRules
   * @return A modified copy of {@code this} object
   */
  public final ImmutableProjectMembership withImplicitRules(Uri value) {
    @Nullable Uri newValue = Objects.requireNonNull(value, "implicitRules");
    if (this.implicitRules == newValue) return this;
    return new ImmutableProjectMembership(
        this.id,
        this.accessPolicy,
        this.resourceType,
        this.meta,
        this.language,
        this.project,
        this.userConfiguration,
        this.user,
        this.admin,
        newValue,
        this.profile);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ProjectMembership#implicitRules() implicitRules} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for implicitRules
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableProjectMembership withImplicitRules(Optional<? extends Uri> optional) {
    @Nullable Uri value = optional.orElse(null);
    if (this.implicitRules == value) return this;
    return new ImmutableProjectMembership(
        this.id,
        this.accessPolicy,
        this.resourceType,
        this.meta,
        this.language,
        this.project,
        this.userConfiguration,
        this.user,
        this.admin,
        value,
        this.profile);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link ProjectMembership#profile() profile} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for profile
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableProjectMembership withProfile(Reference value) {
    if (this.profile == value) return this;
    Reference newValue = Objects.requireNonNull(value, "profile");
    return new ImmutableProjectMembership(
        this.id,
        this.accessPolicy,
        this.resourceType,
        this.meta,
        this.language,
        this.project,
        this.userConfiguration,
        this.user,
        this.admin,
        this.implicitRules,
        newValue);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableProjectMembership} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableProjectMembership
        && equalTo((ImmutableProjectMembership) another);
  }

  private boolean equalTo(ImmutableProjectMembership another) {
    return Objects.equals(id, another.id)
        && Objects.equals(accessPolicy, another.accessPolicy)
        && Objects.equals(resourceType, another.resourceType)
        && Objects.equals(meta, another.meta)
        && Objects.equals(language, another.language)
        && project.equals(another.project)
        && Objects.equals(userConfiguration, another.userConfiguration)
        && user.equals(another.user)
        && Objects.equals(admin, another.admin)
        && Objects.equals(implicitRules, another.implicitRules)
        && profile.equals(another.profile);
  }

  /**
   * Computes a hash code from attributes: {@code id}, {@code accessPolicy}, {@code resourceType}, {@code meta}, {@code language}, {@code project}, {@code userConfiguration}, {@code user}, {@code admin}, {@code implicitRules}, {@code profile}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(id);
    h += (h << 5) + Objects.hashCode(accessPolicy);
    h += (h << 5) + Objects.hashCode(resourceType);
    h += (h << 5) + Objects.hashCode(meta);
    h += (h << 5) + Objects.hashCode(language);
    h += (h << 5) + project.hashCode();
    h += (h << 5) + Objects.hashCode(userConfiguration);
    h += (h << 5) + user.hashCode();
    h += (h << 5) + Objects.hashCode(admin);
    h += (h << 5) + Objects.hashCode(implicitRules);
    h += (h << 5) + profile.hashCode();
    return h;
  }

  /**
   * Prints the immutable value {@code ProjectMembership} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("ProjectMembership{");
    if (id != null) {
      builder.append("id=").append(id);
    }
    if (accessPolicy != null) {
      if (builder.length() > 18) builder.append(", ");
      builder.append("accessPolicy=").append(accessPolicy);
    }
    if (resourceType != null) {
      if (builder.length() > 18) builder.append(", ");
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
    builder.append("project=").append(project);
    if (userConfiguration != null) {
      builder.append(", ");
      builder.append("userConfiguration=").append(userConfiguration);
    }
    builder.append(", ");
    builder.append("user=").append(user);
    if (admin != null) {
      builder.append(", ");
      builder.append("admin=").append(admin);
    }
    if (implicitRules != null) {
      builder.append(", ");
      builder.append("implicitRules=").append(implicitRules);
    }
    builder.append(", ");
    builder.append("profile=").append(profile);
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Generated(from = "ProjectMembership", generator = "Immutables")
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements ProjectMembership {
    @Nullable Optional<Id> id = Optional.empty();
    boolean idIsSet;
    @Nullable Optional<Reference> accessPolicy = Optional.empty();
    boolean accessPolicyIsSet;
    @Nullable Optional<String> resourceType = Optional.empty();
    boolean resourceTypeIsSet;
    @Nullable Optional<Meta> meta = Optional.empty();
    boolean metaIsSet;
    @Nullable Optional<Code> language = Optional.empty();
    boolean languageIsSet;
    @Nullable Reference project;
    @Nullable Optional<Reference> userConfiguration = Optional.empty();
    boolean userConfigurationIsSet;
    @Nullable Reference user;
    @Nullable Optional<Boolean> admin = Optional.empty();
    boolean adminIsSet;
    @Nullable Optional<Uri> implicitRules = Optional.empty();
    boolean implicitRulesIsSet;
    @Nullable Reference profile;
    @JsonProperty("id")
    public void setId(Optional<Id> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @JsonProperty("accessPolicy")
    public void setAccessPolicy(Optional<Reference> accessPolicy) {
      this.accessPolicy = accessPolicy;
      this.accessPolicyIsSet = true;
    }
    @JsonProperty("resourceType")
    public void setResourceType(Optional<String> resourceType) {
      this.resourceType = resourceType;
      this.resourceTypeIsSet = true;
    }
    @JsonProperty("meta")
    public void setMeta(Optional<Meta> meta) {
      this.meta = meta;
      this.metaIsSet = true;
    }
    @JsonProperty("language")
    public void setLanguage(Optional<Code> language) {
      this.language = language;
      this.languageIsSet = true;
    }
    @JsonProperty("project")
    public void setProject(Reference project) {
      this.project = project;
    }
    @JsonProperty("userConfiguration")
    public void setUserConfiguration(Optional<Reference> userConfiguration) {
      this.userConfiguration = userConfiguration;
      this.userConfigurationIsSet = true;
    }
    @JsonProperty("user")
    public void setUser(Reference user) {
      this.user = user;
    }
    @JsonProperty("admin")
    public void setAdmin(Optional<Boolean> admin) {
      this.admin = admin;
      this.adminIsSet = true;
    }
    @JsonProperty("implicitRules")
    public void setImplicitRules(Optional<Uri> implicitRules) {
      this.implicitRules = implicitRules;
      this.implicitRulesIsSet = true;
    }
    @JsonProperty("profile")
    public void setProfile(Reference profile) {
      this.profile = profile;
    }
    @Override
    public Optional<Id> id() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Reference> accessPolicy() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> resourceType() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Meta> meta() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Code> language() { throw new UnsupportedOperationException(); }
    @Override
    public Reference project() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Reference> userConfiguration() { throw new UnsupportedOperationException(); }
    @Override
    public Reference user() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Boolean> admin() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Uri> implicitRules() { throw new UnsupportedOperationException(); }
    @Override
    public Reference profile() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableProjectMembership fromJson(Json json) {
    ImmutableProjectMembership.Builder builder = ((ImmutableProjectMembership.Builder) ImmutableProjectMembership.builder());
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.accessPolicyIsSet) {
      builder.accessPolicy(json.accessPolicy);
    }
    if (json.resourceTypeIsSet) {
      builder.resourceType(json.resourceType);
    }
    if (json.metaIsSet) {
      builder.meta(json.meta);
    }
    if (json.languageIsSet) {
      builder.language(json.language);
    }
    if (json.project != null) {
      builder.project(json.project);
    }
    if (json.userConfigurationIsSet) {
      builder.userConfiguration(json.userConfiguration);
    }
    if (json.user != null) {
      builder.user(json.user);
    }
    if (json.adminIsSet) {
      builder.admin(json.admin);
    }
    if (json.implicitRulesIsSet) {
      builder.implicitRules(json.implicitRules);
    }
    if (json.profile != null) {
      builder.profile(json.profile);
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
        .id(instance.id())
        .accessPolicy(instance.accessPolicy())
        .resourceType(instance.resourceType())
        .meta(instance.meta())
        .language(instance.language())
        .project(instance.project())
        .userConfiguration(instance.userConfiguration())
        .user(instance.user())
        .admin(instance.admin())
        .implicitRules(instance.implicitRules())
        .profile(instance.profile())
        .build();
  }

  /**
   * Creates a builder for {@link ProjectMembership ProjectMembership}.
   * <pre>
   * ImmutableProjectMembership.builder()
   *    .id(com.medplum.types.fhir.Id) // optional {@link ProjectMembership#id() id}
   *    .accessPolicy(com.medplum.types.fhir.Reference) // optional {@link ProjectMembership#accessPolicy() accessPolicy}
   *    .resourceType(String) // optional {@link ProjectMembership#resourceType() resourceType}
   *    .meta(com.medplum.types.fhir.Meta) // optional {@link ProjectMembership#meta() meta}
   *    .language(com.medplum.types.fhir.Code) // optional {@link ProjectMembership#language() language}
   *    .project(com.medplum.types.fhir.Reference) // required {@link ProjectMembership#project() project}
   *    .userConfiguration(com.medplum.types.fhir.Reference) // optional {@link ProjectMembership#userConfiguration() userConfiguration}
   *    .user(com.medplum.types.fhir.Reference) // required {@link ProjectMembership#user() user}
   *    .admin(Boolean) // optional {@link ProjectMembership#admin() admin}
   *    .implicitRules(com.medplum.types.fhir.Uri) // optional {@link ProjectMembership#implicitRules() implicitRules}
   *    .profile(com.medplum.types.fhir.Reference) // required {@link ProjectMembership#profile() profile}
   *    .build();
   * </pre>
   * @return A new ProjectMembership builder
   */
  public static ProjectBuildStage builder() {
    return new ImmutableProjectMembership.Builder();
  }

  /**
   * Builds instances of type {@link ProjectMembership ProjectMembership}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "ProjectMembership", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder implements ProjectBuildStage, UserBuildStage, ProfileBuildStage, BuildFinal {
    private static final long INIT_BIT_PROJECT = 0x1L;
    private static final long INIT_BIT_USER = 0x2L;
    private static final long INIT_BIT_PROFILE = 0x4L;
    private static final long OPT_BIT_ID = 0x1L;
    private static final long OPT_BIT_ACCESS_POLICY = 0x2L;
    private static final long OPT_BIT_RESOURCE_TYPE = 0x4L;
    private static final long OPT_BIT_META = 0x8L;
    private static final long OPT_BIT_LANGUAGE = 0x10L;
    private static final long OPT_BIT_USER_CONFIGURATION = 0x20L;
    private static final long OPT_BIT_ADMIN = 0x40L;
    private static final long OPT_BIT_IMPLICIT_RULES = 0x80L;
    private long initBits = 0x7L;
    private long optBits;

    private @Nullable Id id;
    private @Nullable Reference accessPolicy;
    private @Nullable String resourceType;
    private @Nullable Meta meta;
    private @Nullable Code language;
    private @Nullable Reference project;
    private @Nullable Reference userConfiguration;
    private @Nullable Reference user;
    private @Nullable Boolean admin;
    private @Nullable Uri implicitRules;
    private @Nullable Reference profile;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link ProjectMembership#id() id} to id.
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
     * Initializes the optional value {@link ProjectMembership#id() id} to id.
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
     * Initializes the optional value {@link ProjectMembership#accessPolicy() accessPolicy} to accessPolicy.
     * @param accessPolicy The value for accessPolicy
     * @return {@code this} builder for chained invocation
     */
    public final Builder accessPolicy(Reference accessPolicy) {
      checkNotIsSet(accessPolicyIsSet(), "accessPolicy");
      this.accessPolicy = Objects.requireNonNull(accessPolicy, "accessPolicy");
      optBits |= OPT_BIT_ACCESS_POLICY;
      return this;
    }

    /**
     * Initializes the optional value {@link ProjectMembership#accessPolicy() accessPolicy} to accessPolicy.
     * @param accessPolicy The value for accessPolicy
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("accessPolicy")
    public final Builder accessPolicy(Optional<? extends Reference> accessPolicy) {
      checkNotIsSet(accessPolicyIsSet(), "accessPolicy");
      this.accessPolicy = accessPolicy.orElse(null);
      optBits |= OPT_BIT_ACCESS_POLICY;
      return this;
    }

    /**
     * Initializes the optional value {@link ProjectMembership#resourceType() resourceType} to resourceType.
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
     * Initializes the optional value {@link ProjectMembership#resourceType() resourceType} to resourceType.
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
     * Initializes the optional value {@link ProjectMembership#meta() meta} to meta.
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
     * Initializes the optional value {@link ProjectMembership#meta() meta} to meta.
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
     * Initializes the optional value {@link ProjectMembership#language() language} to language.
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
     * Initializes the optional value {@link ProjectMembership#language() language} to language.
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
     * Initializes the value for the {@link ProjectMembership#project() project} attribute.
     * @param project The value for project 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("project")
    public final Builder project(Reference project) {
      checkNotIsSet(projectIsSet(), "project");
      this.project = Objects.requireNonNull(project, "project");
      initBits &= ~INIT_BIT_PROJECT;
      return this;
    }

    /**
     * Initializes the optional value {@link ProjectMembership#userConfiguration() userConfiguration} to userConfiguration.
     * @param userConfiguration The value for userConfiguration
     * @return {@code this} builder for chained invocation
     */
    public final Builder userConfiguration(Reference userConfiguration) {
      checkNotIsSet(userConfigurationIsSet(), "userConfiguration");
      this.userConfiguration = Objects.requireNonNull(userConfiguration, "userConfiguration");
      optBits |= OPT_BIT_USER_CONFIGURATION;
      return this;
    }

    /**
     * Initializes the optional value {@link ProjectMembership#userConfiguration() userConfiguration} to userConfiguration.
     * @param userConfiguration The value for userConfiguration
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("userConfiguration")
    public final Builder userConfiguration(Optional<? extends Reference> userConfiguration) {
      checkNotIsSet(userConfigurationIsSet(), "userConfiguration");
      this.userConfiguration = userConfiguration.orElse(null);
      optBits |= OPT_BIT_USER_CONFIGURATION;
      return this;
    }

    /**
     * Initializes the value for the {@link ProjectMembership#user() user} attribute.
     * @param user The value for user 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("user")
    public final Builder user(Reference user) {
      checkNotIsSet(userIsSet(), "user");
      this.user = Objects.requireNonNull(user, "user");
      initBits &= ~INIT_BIT_USER;
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
    @JsonProperty("admin")
    public final Builder admin(Optional<Boolean> admin) {
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
    public final Builder implicitRules(Uri implicitRules) {
      checkNotIsSet(implicitRulesIsSet(), "implicitRules");
      this.implicitRules = Objects.requireNonNull(implicitRules, "implicitRules");
      optBits |= OPT_BIT_IMPLICIT_RULES;
      return this;
    }

    /**
     * Initializes the optional value {@link ProjectMembership#implicitRules() implicitRules} to implicitRules.
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
     * Initializes the value for the {@link ProjectMembership#profile() profile} attribute.
     * @param profile The value for profile 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("profile")
    public final Builder profile(Reference profile) {
      checkNotIsSet(profileIsSet(), "profile");
      this.profile = Objects.requireNonNull(profile, "profile");
      initBits &= ~INIT_BIT_PROFILE;
      return this;
    }

    /**
     * Builds a new {@link ProjectMembership ProjectMembership}.
     * @return An immutable instance of ProjectMembership
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ProjectMembership build() {
      checkRequiredAttributes();
      return new ImmutableProjectMembership(
          id,
          accessPolicy,
          resourceType,
          meta,
          language,
          project,
          userConfiguration,
          user,
          admin,
          implicitRules,
          profile);
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean accessPolicyIsSet() {
      return (optBits & OPT_BIT_ACCESS_POLICY) != 0;
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

    private boolean userConfigurationIsSet() {
      return (optBits & OPT_BIT_USER_CONFIGURATION) != 0;
    }

    private boolean adminIsSet() {
      return (optBits & OPT_BIT_ADMIN) != 0;
    }

    private boolean implicitRulesIsSet() {
      return (optBits & OPT_BIT_IMPLICIT_RULES) != 0;
    }

    private boolean projectIsSet() {
      return (initBits & INIT_BIT_PROJECT) == 0;
    }

    private boolean userIsSet() {
      return (initBits & INIT_BIT_USER) == 0;
    }

    private boolean profileIsSet() {
      return (initBits & INIT_BIT_PROFILE) == 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of ProjectMembership is strict, attribute is already set: ".concat(name));
    }

    private void checkRequiredAttributes() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<>();
      if (!projectIsSet()) attributes.add("project");
      if (!userIsSet()) attributes.add("user");
      if (!profileIsSet()) attributes.add("profile");
      return "Cannot build ProjectMembership, some of required attributes are not set " + attributes;
    }
  }

  @Generated(from = "ProjectMembership", generator = "Immutables")
  public interface ProjectBuildStage {
    /**
     * Initializes the value for the {@link ProjectMembership#project() project} attribute.
     * @param project The value for project 
     * @return {@code this} builder for use in a chained invocation
     */
    UserBuildStage project(Reference project);
  }

  @Generated(from = "ProjectMembership", generator = "Immutables")
  public interface UserBuildStage {
    /**
     * Initializes the value for the {@link ProjectMembership#user() user} attribute.
     * @param user The value for user 
     * @return {@code this} builder for use in a chained invocation
     */
    ProfileBuildStage user(Reference user);
  }

  @Generated(from = "ProjectMembership", generator = "Immutables")
  public interface ProfileBuildStage {
    /**
     * Initializes the value for the {@link ProjectMembership#profile() profile} attribute.
     * @param profile The value for profile 
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal profile(Reference profile);
  }

  @Generated(from = "ProjectMembership", generator = "Immutables")
  public interface BuildFinal {

    /**
     * Initializes the optional value {@link ProjectMembership#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    BuildFinal id(Id id);

    /**
     * Initializes the optional value {@link ProjectMembership#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal id(Optional<? extends Id> id);

    /**
     * Initializes the optional value {@link ProjectMembership#accessPolicy() accessPolicy} to accessPolicy.
     * @param accessPolicy The value for accessPolicy
     * @return {@code this} builder for chained invocation
     */
    BuildFinal accessPolicy(Reference accessPolicy);

    /**
     * Initializes the optional value {@link ProjectMembership#accessPolicy() accessPolicy} to accessPolicy.
     * @param accessPolicy The value for accessPolicy
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal accessPolicy(Optional<? extends Reference> accessPolicy);

    /**
     * Initializes the optional value {@link ProjectMembership#resourceType() resourceType} to resourceType.
     * @param resourceType The value for resourceType
     * @return {@code this} builder for chained invocation
     */
    BuildFinal resourceType(String resourceType);

    /**
     * Initializes the optional value {@link ProjectMembership#resourceType() resourceType} to resourceType.
     * @param resourceType The value for resourceType
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal resourceType(Optional<String> resourceType);

    /**
     * Initializes the optional value {@link ProjectMembership#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for chained invocation
     */
    BuildFinal meta(Meta meta);

    /**
     * Initializes the optional value {@link ProjectMembership#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal meta(Optional<? extends Meta> meta);

    /**
     * Initializes the optional value {@link ProjectMembership#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for chained invocation
     */
    BuildFinal language(Code language);

    /**
     * Initializes the optional value {@link ProjectMembership#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal language(Optional<? extends Code> language);

    /**
     * Initializes the optional value {@link ProjectMembership#userConfiguration() userConfiguration} to userConfiguration.
     * @param userConfiguration The value for userConfiguration
     * @return {@code this} builder for chained invocation
     */
    BuildFinal userConfiguration(Reference userConfiguration);

    /**
     * Initializes the optional value {@link ProjectMembership#userConfiguration() userConfiguration} to userConfiguration.
     * @param userConfiguration The value for userConfiguration
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal userConfiguration(Optional<? extends Reference> userConfiguration);

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
    BuildFinal admin(Optional<Boolean> admin);

    /**
     * Initializes the optional value {@link ProjectMembership#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for chained invocation
     */
    BuildFinal implicitRules(Uri implicitRules);

    /**
     * Initializes the optional value {@link ProjectMembership#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal implicitRules(Optional<? extends Uri> implicitRules);

    /**
     * Builds a new {@link ProjectMembership ProjectMembership}.
     * @return An immutable instance of ProjectMembership
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    ProjectMembership build();
  }
}
