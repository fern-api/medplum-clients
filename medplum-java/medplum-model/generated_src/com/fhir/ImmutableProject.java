//-no-import-rewrite
package com.fhir;

import java.lang.Object;
import java.lang.String;
import java.lang.Float;
import java.lang.Double;

/**
 * Immutable implementation of {@link Project}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableProject.builder()}.
 */
@org.immutables.value.Generated(from = "Project", generator = "Immutables")
@SuppressWarnings({"all"})
@edu.umd.cs.findbugs.annotations.SuppressFBWarnings
@javax.annotation.ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@javax.annotation.concurrent.Immutable
@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableProject implements com.fhir.Project {
  private final @javax.annotation.Nullable com.fhir.Reference defaultPatientAccessPolicy;
  private final @javax.annotation.Nullable java.lang.String resourceType;
  private final @javax.annotation.Nullable com.fhir.code language;
  private final @javax.annotation.Nullable com.fhir.Meta meta;
  private final com.fhir.Reference owner;
  private final @javax.annotation.Nullable com.fhir.uri implicitRules;
  private final @javax.annotation.Nullable java.lang.String description;
  private final @javax.annotation.Nullable java.util.List<com.fhir.code> features;
  private final @javax.annotation.Nullable com.fhir.id id;
  private final java.lang.String name;

  private ImmutableProject(
      @javax.annotation.Nullable com.fhir.Reference defaultPatientAccessPolicy,
      @javax.annotation.Nullable java.lang.String resourceType,
      @javax.annotation.Nullable com.fhir.code language,
      @javax.annotation.Nullable com.fhir.Meta meta,
      com.fhir.Reference owner,
      @javax.annotation.Nullable com.fhir.uri implicitRules,
      @javax.annotation.Nullable java.lang.String description,
      @javax.annotation.Nullable java.util.List<com.fhir.code> features,
      @javax.annotation.Nullable com.fhir.id id,
      java.lang.String name) {
    this.defaultPatientAccessPolicy = defaultPatientAccessPolicy;
    this.resourceType = resourceType;
    this.language = language;
    this.meta = meta;
    this.owner = owner;
    this.implicitRules = implicitRules;
    this.description = description;
    this.features = features;
    this.id = id;
    this.name = name;
  }

  /**
   * @return The value of the {@code defaultPatientAccessPolicy} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("defaultPatientAccessPolicy")
  @Override
  public java.util.Optional<com.fhir.Reference> defaultPatientAccessPolicy() {
    return java.util.Optional.ofNullable(defaultPatientAccessPolicy);
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
   * @return The value of the {@code language} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("language")
  @Override
  public java.util.Optional<com.fhir.code> language() {
    return java.util.Optional.ofNullable(language);
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
   * @return The value of the {@code owner} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("owner")
  @Override
  public com.fhir.Reference owner() {
    return owner;
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
   * @return The value of the {@code description} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("description")
  @Override
  public java.util.Optional<java.lang.String> description() {
    return java.util.Optional.ofNullable(description);
  }

  /**
   * @return The value of the {@code features} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("features")
  @Override
  public java.util.Optional<java.util.List<com.fhir.code>> features() {
    return java.util.Optional.ofNullable(features);
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
  public java.lang.String name() {
    return name;
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Project#defaultPatientAccessPolicy() defaultPatientAccessPolicy} attribute.
   * @param value The value for defaultPatientAccessPolicy
   * @return A modified copy of {@code this} object
   */
  public final ImmutableProject withDefaultPatientAccessPolicy(com.fhir.Reference value) {
    @javax.annotation.Nullable com.fhir.Reference newValue = java.util.Objects.requireNonNull(value, "defaultPatientAccessPolicy");
    if (this.defaultPatientAccessPolicy == newValue) return this;
    return new ImmutableProject(
        newValue,
        this.resourceType,
        this.language,
        this.meta,
        this.owner,
        this.implicitRules,
        this.description,
        this.features,
        this.id,
        this.name);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Project#defaultPatientAccessPolicy() defaultPatientAccessPolicy} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for defaultPatientAccessPolicy
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableProject withDefaultPatientAccessPolicy(java.util.Optional<? extends com.fhir.Reference> optional) {
    @javax.annotation.Nullable com.fhir.Reference value = optional.orElse(null);
    if (this.defaultPatientAccessPolicy == value) return this;
    return new ImmutableProject(
        value,
        this.resourceType,
        this.language,
        this.meta,
        this.owner,
        this.implicitRules,
        this.description,
        this.features,
        this.id,
        this.name);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Project#resourceType() resourceType} attribute.
   * @param value The value for resourceType
   * @return A modified copy of {@code this} object
   */
  public final ImmutableProject withResourceType(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "resourceType");
    if (java.util.Objects.equals(this.resourceType, newValue)) return this;
    return new ImmutableProject(
        this.defaultPatientAccessPolicy,
        newValue,
        this.language,
        this.meta,
        this.owner,
        this.implicitRules,
        this.description,
        this.features,
        this.id,
        this.name);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Project#resourceType() resourceType} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for resourceType
   * @return A modified copy of {@code this} object
   */
  public final ImmutableProject withResourceType(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.resourceType, value)) return this;
    return new ImmutableProject(
        this.defaultPatientAccessPolicy,
        value,
        this.language,
        this.meta,
        this.owner,
        this.implicitRules,
        this.description,
        this.features,
        this.id,
        this.name);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Project#language() language} attribute.
   * @param value The value for language
   * @return A modified copy of {@code this} object
   */
  public final ImmutableProject withLanguage(com.fhir.code value) {
    @javax.annotation.Nullable com.fhir.code newValue = java.util.Objects.requireNonNull(value, "language");
    if (this.language == newValue) return this;
    return new ImmutableProject(
        this.defaultPatientAccessPolicy,
        this.resourceType,
        newValue,
        this.meta,
        this.owner,
        this.implicitRules,
        this.description,
        this.features,
        this.id,
        this.name);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Project#language() language} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for language
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableProject withLanguage(java.util.Optional<? extends com.fhir.code> optional) {
    @javax.annotation.Nullable com.fhir.code value = optional.orElse(null);
    if (this.language == value) return this;
    return new ImmutableProject(
        this.defaultPatientAccessPolicy,
        this.resourceType,
        value,
        this.meta,
        this.owner,
        this.implicitRules,
        this.description,
        this.features,
        this.id,
        this.name);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Project#meta() meta} attribute.
   * @param value The value for meta
   * @return A modified copy of {@code this} object
   */
  public final ImmutableProject withMeta(com.fhir.Meta value) {
    @javax.annotation.Nullable com.fhir.Meta newValue = java.util.Objects.requireNonNull(value, "meta");
    if (this.meta == newValue) return this;
    return new ImmutableProject(
        this.defaultPatientAccessPolicy,
        this.resourceType,
        this.language,
        newValue,
        this.owner,
        this.implicitRules,
        this.description,
        this.features,
        this.id,
        this.name);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Project#meta() meta} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for meta
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableProject withMeta(java.util.Optional<? extends com.fhir.Meta> optional) {
    @javax.annotation.Nullable com.fhir.Meta value = optional.orElse(null);
    if (this.meta == value) return this;
    return new ImmutableProject(
        this.defaultPatientAccessPolicy,
        this.resourceType,
        this.language,
        value,
        this.owner,
        this.implicitRules,
        this.description,
        this.features,
        this.id,
        this.name);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link Project#owner() owner} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for owner
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableProject withOwner(com.fhir.Reference value) {
    if (this.owner == value) return this;
    com.fhir.Reference newValue = java.util.Objects.requireNonNull(value, "owner");
    return new ImmutableProject(
        this.defaultPatientAccessPolicy,
        this.resourceType,
        this.language,
        this.meta,
        newValue,
        this.implicitRules,
        this.description,
        this.features,
        this.id,
        this.name);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Project#implicitRules() implicitRules} attribute.
   * @param value The value for implicitRules
   * @return A modified copy of {@code this} object
   */
  public final ImmutableProject withImplicitRules(com.fhir.uri value) {
    @javax.annotation.Nullable com.fhir.uri newValue = java.util.Objects.requireNonNull(value, "implicitRules");
    if (this.implicitRules == newValue) return this;
    return new ImmutableProject(
        this.defaultPatientAccessPolicy,
        this.resourceType,
        this.language,
        this.meta,
        this.owner,
        newValue,
        this.description,
        this.features,
        this.id,
        this.name);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Project#implicitRules() implicitRules} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for implicitRules
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableProject withImplicitRules(java.util.Optional<? extends com.fhir.uri> optional) {
    @javax.annotation.Nullable com.fhir.uri value = optional.orElse(null);
    if (this.implicitRules == value) return this;
    return new ImmutableProject(
        this.defaultPatientAccessPolicy,
        this.resourceType,
        this.language,
        this.meta,
        this.owner,
        value,
        this.description,
        this.features,
        this.id,
        this.name);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Project#description() description} attribute.
   * @param value The value for description
   * @return A modified copy of {@code this} object
   */
  public final ImmutableProject withDescription(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "description");
    if (java.util.Objects.equals(this.description, newValue)) return this;
    return new ImmutableProject(
        this.defaultPatientAccessPolicy,
        this.resourceType,
        this.language,
        this.meta,
        this.owner,
        this.implicitRules,
        newValue,
        this.features,
        this.id,
        this.name);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Project#description() description} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for description
   * @return A modified copy of {@code this} object
   */
  public final ImmutableProject withDescription(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.description, value)) return this;
    return new ImmutableProject(
        this.defaultPatientAccessPolicy,
        this.resourceType,
        this.language,
        this.meta,
        this.owner,
        this.implicitRules,
        value,
        this.features,
        this.id,
        this.name);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Project#features() features} attribute.
   * @param value The value for features
   * @return A modified copy of {@code this} object
   */
  public final ImmutableProject withFeatures(java.util.List<com.fhir.code> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.code> newValue = java.util.Objects.requireNonNull(value, "features");
    if (this.features == newValue) return this;
    return new ImmutableProject(
        this.defaultPatientAccessPolicy,
        this.resourceType,
        this.language,
        this.meta,
        this.owner,
        this.implicitRules,
        this.description,
        newValue,
        this.id,
        this.name);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Project#features() features} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for features
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableProject withFeatures(java.util.Optional<? extends java.util.List<com.fhir.code>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.code> value = optional.orElse(null);
    if (this.features == value) return this;
    return new ImmutableProject(
        this.defaultPatientAccessPolicy,
        this.resourceType,
        this.language,
        this.meta,
        this.owner,
        this.implicitRules,
        this.description,
        value,
        this.id,
        this.name);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Project#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableProject withId(com.fhir.id value) {
    @javax.annotation.Nullable com.fhir.id newValue = java.util.Objects.requireNonNull(value, "id");
    if (this.id == newValue) return this;
    return new ImmutableProject(
        this.defaultPatientAccessPolicy,
        this.resourceType,
        this.language,
        this.meta,
        this.owner,
        this.implicitRules,
        this.description,
        this.features,
        newValue,
        this.name);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Project#id() id} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableProject withId(java.util.Optional<? extends com.fhir.id> optional) {
    @javax.annotation.Nullable com.fhir.id value = optional.orElse(null);
    if (this.id == value) return this;
    return new ImmutableProject(
        this.defaultPatientAccessPolicy,
        this.resourceType,
        this.language,
        this.meta,
        this.owner,
        this.implicitRules,
        this.description,
        this.features,
        value,
        this.name);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link Project#name() name} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for name
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableProject withName(java.lang.String value) {
    java.lang.String newValue = java.util.Objects.requireNonNull(value, "name");
    if (this.name.equals(newValue)) return this;
    return new ImmutableProject(
        this.defaultPatientAccessPolicy,
        this.resourceType,
        this.language,
        this.meta,
        this.owner,
        this.implicitRules,
        this.description,
        this.features,
        this.id,
        newValue);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableProject} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@javax.annotation.Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableProject
        && equalTo((ImmutableProject) another);
  }

  private boolean equalTo(ImmutableProject another) {
    return java.util.Objects.equals(defaultPatientAccessPolicy, another.defaultPatientAccessPolicy)
        && java.util.Objects.equals(resourceType, another.resourceType)
        && java.util.Objects.equals(language, another.language)
        && java.util.Objects.equals(meta, another.meta)
        && owner.equals(another.owner)
        && java.util.Objects.equals(implicitRules, another.implicitRules)
        && java.util.Objects.equals(description, another.description)
        && java.util.Objects.equals(features, another.features)
        && java.util.Objects.equals(id, another.id)
        && name.equals(another.name);
  }

  /**
   * Computes a hash code from attributes: {@code defaultPatientAccessPolicy}, {@code resourceType}, {@code language}, {@code meta}, {@code owner}, {@code implicitRules}, {@code description}, {@code features}, {@code id}, {@code name}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + java.util.Objects.hashCode(defaultPatientAccessPolicy);
    h += (h << 5) + java.util.Objects.hashCode(resourceType);
    h += (h << 5) + java.util.Objects.hashCode(language);
    h += (h << 5) + java.util.Objects.hashCode(meta);
    h += (h << 5) + owner.hashCode();
    h += (h << 5) + java.util.Objects.hashCode(implicitRules);
    h += (h << 5) + java.util.Objects.hashCode(description);
    h += (h << 5) + java.util.Objects.hashCode(features);
    h += (h << 5) + java.util.Objects.hashCode(id);
    h += (h << 5) + name.hashCode();
    return h;
  }

  /**
   * Prints the immutable value {@code Project} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    java.lang.StringBuilder builder = new java.lang.StringBuilder("Project{");
    if (defaultPatientAccessPolicy != null) {
      builder.append("defaultPatientAccessPolicy=").append(defaultPatientAccessPolicy);
    }
    if (resourceType != null) {
      if (builder.length() > 8) builder.append(", ");
      builder.append("resourceType=").append(resourceType);
    }
    if (language != null) {
      if (builder.length() > 8) builder.append(", ");
      builder.append("language=").append(language);
    }
    if (meta != null) {
      if (builder.length() > 8) builder.append(", ");
      builder.append("meta=").append(meta);
    }
    if (builder.length() > 8) builder.append(", ");
    builder.append("owner=").append(owner);
    if (implicitRules != null) {
      builder.append(", ");
      builder.append("implicitRules=").append(implicitRules);
    }
    if (description != null) {
      builder.append(", ");
      builder.append("description=").append(description);
    }
    if (features != null) {
      builder.append(", ");
      builder.append("features=").append(features);
    }
    if (id != null) {
      builder.append(", ");
      builder.append("id=").append(id);
    }
    builder.append(", ");
    builder.append("name=").append(name);
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @org.immutables.value.Generated(from = "Project", generator = "Immutables")
  @Deprecated
  @com.fasterxml.jackson.databind.annotation.JsonDeserialize
  @com.fasterxml.jackson.annotation.JsonAutoDetect(fieldVisibility = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.NONE)
  static final class Json implements com.fhir.Project {
    @javax.annotation.Nullable java.util.Optional<com.fhir.Reference> defaultPatientAccessPolicy = java.util.Optional.empty();
    boolean defaultPatientAccessPolicyIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.String> resourceType = java.util.Optional.empty();
    boolean resourceTypeIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.code> language = java.util.Optional.empty();
    boolean languageIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Meta> meta = java.util.Optional.empty();
    boolean metaIsSet;
    @javax.annotation.Nullable com.fhir.Reference owner;
    @javax.annotation.Nullable java.util.Optional<com.fhir.uri> implicitRules = java.util.Optional.empty();
    boolean implicitRulesIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.String> description = java.util.Optional.empty();
    boolean descriptionIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.code>> features = java.util.Optional.empty();
    boolean featuresIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.id> id = java.util.Optional.empty();
    boolean idIsSet;
    @javax.annotation.Nullable java.lang.String name;
    @com.fasterxml.jackson.annotation.JsonProperty("defaultPatientAccessPolicy")
    public void setDefaultPatientAccessPolicy(java.util.Optional<com.fhir.Reference> defaultPatientAccessPolicy) {
      this.defaultPatientAccessPolicy = defaultPatientAccessPolicy;
      this.defaultPatientAccessPolicyIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("resourceType")
    public void setResourceType(java.util.Optional<java.lang.String> resourceType) {
      this.resourceType = resourceType;
      this.resourceTypeIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("language")
    public void setLanguage(java.util.Optional<com.fhir.code> language) {
      this.language = language;
      this.languageIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("meta")
    public void setMeta(java.util.Optional<com.fhir.Meta> meta) {
      this.meta = meta;
      this.metaIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("owner")
    public void setOwner(com.fhir.Reference owner) {
      this.owner = owner;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("implicitRules")
    public void setImplicitRules(java.util.Optional<com.fhir.uri> implicitRules) {
      this.implicitRules = implicitRules;
      this.implicitRulesIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    public void setDescription(java.util.Optional<java.lang.String> description) {
      this.description = description;
      this.descriptionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("features")
    public void setFeatures(java.util.Optional<java.util.List<com.fhir.code>> features) {
      this.features = features;
      this.featuresIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    public void setId(java.util.Optional<com.fhir.id> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    public void setName(java.lang.String name) {
      this.name = name;
    }
    @Override
    public java.util.Optional<com.fhir.Reference> defaultPatientAccessPolicy() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.String> resourceType() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.code> language() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Meta> meta() { throw new UnsupportedOperationException(); }
    @Override
    public com.fhir.Reference owner() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.uri> implicitRules() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.String> description() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.code>> features() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.id> id() { throw new UnsupportedOperationException(); }
    @Override
    public java.lang.String name() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @com.fasterxml.jackson.annotation.JsonCreator(mode = com.fasterxml.jackson.annotation.JsonCreator.Mode.DELEGATING)
  static ImmutableProject fromJson(Json json) {
    ImmutableProject.Builder builder = ((ImmutableProject.Builder) ImmutableProject.builder());
    if (json.defaultPatientAccessPolicyIsSet) {
      builder.defaultPatientAccessPolicy(json.defaultPatientAccessPolicy);
    }
    if (json.resourceTypeIsSet) {
      builder.resourceType(json.resourceType);
    }
    if (json.languageIsSet) {
      builder.language(json.language);
    }
    if (json.metaIsSet) {
      builder.meta(json.meta);
    }
    if (json.owner != null) {
      builder.owner(json.owner);
    }
    if (json.implicitRulesIsSet) {
      builder.implicitRules(json.implicitRules);
    }
    if (json.descriptionIsSet) {
      builder.description(json.description);
    }
    if (json.featuresIsSet) {
      builder.features(json.features);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.name != null) {
      builder.name(json.name);
    }
    return (ImmutableProject) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link Project} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable Project instance
   */
  public static Project copyOf(Project instance) {
    if (instance instanceof ImmutableProject) {
      return (ImmutableProject) instance;
    }
    return ((ImmutableProject.Builder) ImmutableProject.builder())
        .defaultPatientAccessPolicy(instance.defaultPatientAccessPolicy())
        .resourceType(instance.resourceType())
        .language(instance.language())
        .meta(instance.meta())
        .owner(instance.owner())
        .implicitRules(instance.implicitRules())
        .description(instance.description())
        .features(instance.features())
        .id(instance.id())
        .name(instance.name())
        .build();
  }

  /**
   * Creates a builder for {@link Project Project}.
   * <pre>
   * ImmutableProject.builder()
   *    .defaultPatientAccessPolicy(com.fhir.Reference) // optional {@link Project#defaultPatientAccessPolicy() defaultPatientAccessPolicy}
   *    .resourceType(String) // optional {@link Project#resourceType() resourceType}
   *    .language(com.fhir.code) // optional {@link Project#language() language}
   *    .meta(com.fhir.Meta) // optional {@link Project#meta() meta}
   *    .owner(com.fhir.Reference) // required {@link Project#owner() owner}
   *    .implicitRules(com.fhir.uri) // optional {@link Project#implicitRules() implicitRules}
   *    .description(String) // optional {@link Project#description() description}
   *    .features(List&amp;lt;com.fhir.code&amp;gt;) // optional {@link Project#features() features}
   *    .id(com.fhir.id) // optional {@link Project#id() id}
   *    .name(String) // required {@link Project#name() name}
   *    .build();
   * </pre>
   * @return A new Project builder
   */
  public static OwnerBuildStage builder() {
    return new ImmutableProject.Builder();
  }

  /**
   * Builds instances of type {@link Project Project}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @org.immutables.value.Generated(from = "Project", generator = "Immutables")
  @javax.annotation.concurrent.NotThreadSafe
  public static final class Builder implements OwnerBuildStage, NameBuildStage, BuildFinal {
    private static final long INIT_BIT_OWNER = 0x1L;
    private static final long INIT_BIT_NAME = 0x2L;
    private static final long OPT_BIT_DEFAULT_PATIENT_ACCESS_POLICY = 0x1L;
    private static final long OPT_BIT_RESOURCE_TYPE = 0x2L;
    private static final long OPT_BIT_LANGUAGE = 0x4L;
    private static final long OPT_BIT_META = 0x8L;
    private static final long OPT_BIT_IMPLICIT_RULES = 0x10L;
    private static final long OPT_BIT_DESCRIPTION = 0x20L;
    private static final long OPT_BIT_FEATURES = 0x40L;
    private static final long OPT_BIT_ID = 0x80L;
    private long initBits = 0x3L;
    private long optBits;

    private @javax.annotation.Nullable com.fhir.Reference defaultPatientAccessPolicy;
    private @javax.annotation.Nullable java.lang.String resourceType;
    private @javax.annotation.Nullable com.fhir.code language;
    private @javax.annotation.Nullable com.fhir.Meta meta;
    private @javax.annotation.Nullable com.fhir.Reference owner;
    private @javax.annotation.Nullable com.fhir.uri implicitRules;
    private @javax.annotation.Nullable java.lang.String description;
    private @javax.annotation.Nullable java.util.List<com.fhir.code> features;
    private @javax.annotation.Nullable com.fhir.id id;
    private @javax.annotation.Nullable java.lang.String name;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link Project#defaultPatientAccessPolicy() defaultPatientAccessPolicy} to defaultPatientAccessPolicy.
     * @param defaultPatientAccessPolicy The value for defaultPatientAccessPolicy
     * @return {@code this} builder for chained invocation
     */
    public final Builder defaultPatientAccessPolicy(com.fhir.Reference defaultPatientAccessPolicy) {
      checkNotIsSet(defaultPatientAccessPolicyIsSet(), "defaultPatientAccessPolicy");
      this.defaultPatientAccessPolicy = java.util.Objects.requireNonNull(defaultPatientAccessPolicy, "defaultPatientAccessPolicy");
      optBits |= OPT_BIT_DEFAULT_PATIENT_ACCESS_POLICY;
      return this;
    }

    /**
     * Initializes the optional value {@link Project#defaultPatientAccessPolicy() defaultPatientAccessPolicy} to defaultPatientAccessPolicy.
     * @param defaultPatientAccessPolicy The value for defaultPatientAccessPolicy
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("defaultPatientAccessPolicy")
    public final Builder defaultPatientAccessPolicy(java.util.Optional<? extends com.fhir.Reference> defaultPatientAccessPolicy) {
      checkNotIsSet(defaultPatientAccessPolicyIsSet(), "defaultPatientAccessPolicy");
      this.defaultPatientAccessPolicy = defaultPatientAccessPolicy.orElse(null);
      optBits |= OPT_BIT_DEFAULT_PATIENT_ACCESS_POLICY;
      return this;
    }

    /**
     * Initializes the optional value {@link Project#resourceType() resourceType} to resourceType.
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
     * Initializes the optional value {@link Project#resourceType() resourceType} to resourceType.
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
     * Initializes the optional value {@link Project#language() language} to language.
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
     * Initializes the optional value {@link Project#language() language} to language.
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
     * Initializes the optional value {@link Project#meta() meta} to meta.
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
     * Initializes the optional value {@link Project#meta() meta} to meta.
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
     * Initializes the value for the {@link Project#owner() owner} attribute.
     * @param owner The value for owner 
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("owner")
    public final Builder owner(com.fhir.Reference owner) {
      checkNotIsSet(ownerIsSet(), "owner");
      this.owner = java.util.Objects.requireNonNull(owner, "owner");
      initBits &= ~INIT_BIT_OWNER;
      return this;
    }

    /**
     * Initializes the optional value {@link Project#implicitRules() implicitRules} to implicitRules.
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
     * Initializes the optional value {@link Project#implicitRules() implicitRules} to implicitRules.
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
     * Initializes the optional value {@link Project#description() description} to description.
     * @param description The value for description
     * @return {@code this} builder for chained invocation
     */
    public final Builder description(java.lang.String description) {
      checkNotIsSet(descriptionIsSet(), "description");
      this.description = java.util.Objects.requireNonNull(description, "description");
      optBits |= OPT_BIT_DESCRIPTION;
      return this;
    }

    /**
     * Initializes the optional value {@link Project#description() description} to description.
     * @param description The value for description
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    public final Builder description(java.util.Optional<java.lang.String> description) {
      checkNotIsSet(descriptionIsSet(), "description");
      this.description = description.orElse(null);
      optBits |= OPT_BIT_DESCRIPTION;
      return this;
    }

    /**
     * Initializes the optional value {@link Project#features() features} to features.
     * @param features The value for features
     * @return {@code this} builder for chained invocation
     */
    public final Builder features(java.util.List<com.fhir.code> features) {
      checkNotIsSet(featuresIsSet(), "features");
      this.features = java.util.Objects.requireNonNull(features, "features");
      optBits |= OPT_BIT_FEATURES;
      return this;
    }

    /**
     * Initializes the optional value {@link Project#features() features} to features.
     * @param features The value for features
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("features")
    public final Builder features(java.util.Optional<? extends java.util.List<com.fhir.code>> features) {
      checkNotIsSet(featuresIsSet(), "features");
      this.features = features.orElse(null);
      optBits |= OPT_BIT_FEATURES;
      return this;
    }

    /**
     * Initializes the optional value {@link Project#id() id} to id.
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
     * Initializes the optional value {@link Project#id() id} to id.
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
     * Initializes the value for the {@link Project#name() name} attribute.
     * @param name The value for name 
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    public final Builder name(java.lang.String name) {
      checkNotIsSet(nameIsSet(), "name");
      this.name = java.util.Objects.requireNonNull(name, "name");
      initBits &= ~INIT_BIT_NAME;
      return this;
    }

    /**
     * Builds a new {@link Project Project}.
     * @return An immutable instance of Project
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public com.fhir.Project build() {
      checkRequiredAttributes();
      return new ImmutableProject(
          defaultPatientAccessPolicy,
          resourceType,
          language,
          meta,
          owner,
          implicitRules,
          description,
          features,
          id,
          name);
    }

    private boolean defaultPatientAccessPolicyIsSet() {
      return (optBits & OPT_BIT_DEFAULT_PATIENT_ACCESS_POLICY) != 0;
    }

    private boolean resourceTypeIsSet() {
      return (optBits & OPT_BIT_RESOURCE_TYPE) != 0;
    }

    private boolean languageIsSet() {
      return (optBits & OPT_BIT_LANGUAGE) != 0;
    }

    private boolean metaIsSet() {
      return (optBits & OPT_BIT_META) != 0;
    }

    private boolean implicitRulesIsSet() {
      return (optBits & OPT_BIT_IMPLICIT_RULES) != 0;
    }

    private boolean descriptionIsSet() {
      return (optBits & OPT_BIT_DESCRIPTION) != 0;
    }

    private boolean featuresIsSet() {
      return (optBits & OPT_BIT_FEATURES) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean ownerIsSet() {
      return (initBits & INIT_BIT_OWNER) == 0;
    }

    private boolean nameIsSet() {
      return (initBits & INIT_BIT_NAME) == 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new java.lang.IllegalStateException("Builder of Project is strict, attribute is already set: ".concat(name));
    }

    private void checkRequiredAttributes() {
      if (initBits != 0) {
        throw new java.lang.IllegalStateException(formatRequiredAttributesMessage());
      }
    }

    private String formatRequiredAttributesMessage() {
      java.util.List<String> attributes = new java.util.ArrayList<>();
      if (!ownerIsSet()) attributes.add("owner");
      if (!nameIsSet()) attributes.add("name");
      return "Cannot build Project, some of required attributes are not set " + attributes;
    }
  }

  @org.immutables.value.Generated(from = "Project", generator = "Immutables")
  public interface OwnerBuildStage {
    /**
     * Initializes the value for the {@link Project#owner() owner} attribute.
     * @param owner The value for owner 
     * @return {@code this} builder for use in a chained invocation
     */
    NameBuildStage owner(com.fhir.Reference owner);
  }

  @org.immutables.value.Generated(from = "Project", generator = "Immutables")
  public interface NameBuildStage {
    /**
     * Initializes the value for the {@link Project#name() name} attribute.
     * @param name The value for name 
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal name(java.lang.String name);
  }

  @org.immutables.value.Generated(from = "Project", generator = "Immutables")
  public interface BuildFinal {

    /**
     * Initializes the optional value {@link Project#defaultPatientAccessPolicy() defaultPatientAccessPolicy} to defaultPatientAccessPolicy.
     * @param defaultPatientAccessPolicy The value for defaultPatientAccessPolicy
     * @return {@code this} builder for chained invocation
     */
    BuildFinal defaultPatientAccessPolicy(com.fhir.Reference defaultPatientAccessPolicy);

    /**
     * Initializes the optional value {@link Project#defaultPatientAccessPolicy() defaultPatientAccessPolicy} to defaultPatientAccessPolicy.
     * @param defaultPatientAccessPolicy The value for defaultPatientAccessPolicy
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal defaultPatientAccessPolicy(java.util.Optional<? extends com.fhir.Reference> defaultPatientAccessPolicy);

    /**
     * Initializes the optional value {@link Project#resourceType() resourceType} to resourceType.
     * @param resourceType The value for resourceType
     * @return {@code this} builder for chained invocation
     */
    BuildFinal resourceType(java.lang.String resourceType);

    /**
     * Initializes the optional value {@link Project#resourceType() resourceType} to resourceType.
     * @param resourceType The value for resourceType
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal resourceType(java.util.Optional<java.lang.String> resourceType);

    /**
     * Initializes the optional value {@link Project#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for chained invocation
     */
    BuildFinal language(com.fhir.code language);

    /**
     * Initializes the optional value {@link Project#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal language(java.util.Optional<? extends com.fhir.code> language);

    /**
     * Initializes the optional value {@link Project#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for chained invocation
     */
    BuildFinal meta(com.fhir.Meta meta);

    /**
     * Initializes the optional value {@link Project#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal meta(java.util.Optional<? extends com.fhir.Meta> meta);

    /**
     * Initializes the optional value {@link Project#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for chained invocation
     */
    BuildFinal implicitRules(com.fhir.uri implicitRules);

    /**
     * Initializes the optional value {@link Project#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal implicitRules(java.util.Optional<? extends com.fhir.uri> implicitRules);

    /**
     * Initializes the optional value {@link Project#description() description} to description.
     * @param description The value for description
     * @return {@code this} builder for chained invocation
     */
    BuildFinal description(java.lang.String description);

    /**
     * Initializes the optional value {@link Project#description() description} to description.
     * @param description The value for description
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal description(java.util.Optional<java.lang.String> description);

    /**
     * Initializes the optional value {@link Project#features() features} to features.
     * @param features The value for features
     * @return {@code this} builder for chained invocation
     */
    BuildFinal features(java.util.List<com.fhir.code> features);

    /**
     * Initializes the optional value {@link Project#features() features} to features.
     * @param features The value for features
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal features(java.util.Optional<? extends java.util.List<com.fhir.code>> features);

    /**
     * Initializes the optional value {@link Project#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    BuildFinal id(com.fhir.id id);

    /**
     * Initializes the optional value {@link Project#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal id(java.util.Optional<? extends com.fhir.id> id);

    /**
     * Builds a new {@link Project Project}.
     * @return An immutable instance of Project
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    Project build();
  }
}
