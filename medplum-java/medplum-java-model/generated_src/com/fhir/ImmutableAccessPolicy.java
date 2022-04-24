//-no-import-rewrite
package com.fhir;

import java.lang.Object;
import java.lang.String;
import java.lang.Float;
import java.lang.Double;

/**
 * Immutable implementation of {@link AccessPolicy}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableAccessPolicy.builder()}.
 */
@org.immutables.value.Generated(from = "AccessPolicy", generator = "Immutables")
@SuppressWarnings({"all"})
@edu.umd.cs.findbugs.annotations.SuppressFBWarnings
@javax.annotation.ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@javax.annotation.concurrent.Immutable
@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableAccessPolicy implements com.fhir.AccessPolicy {
  private final @javax.annotation.Nullable com.fhir.code language;
  private final @javax.annotation.Nullable java.lang.String resourceType;
  private final @javax.annotation.Nullable com.fhir.Reference compartment;
  private final @javax.annotation.Nullable java.lang.String name;
  private final @javax.annotation.Nullable com.fhir.Meta meta;
  private final @javax.annotation.Nullable com.fhir.uri implicitRules;
  private final @javax.annotation.Nullable com.fhir.id id;
  private final @javax.annotation.Nullable java.util.List<com.fhir.AccessPolicy_Resource> resource;

  private ImmutableAccessPolicy(
      @javax.annotation.Nullable com.fhir.code language,
      @javax.annotation.Nullable java.lang.String resourceType,
      @javax.annotation.Nullable com.fhir.Reference compartment,
      @javax.annotation.Nullable java.lang.String name,
      @javax.annotation.Nullable com.fhir.Meta meta,
      @javax.annotation.Nullable com.fhir.uri implicitRules,
      @javax.annotation.Nullable com.fhir.id id,
      @javax.annotation.Nullable java.util.List<com.fhir.AccessPolicy_Resource> resource) {
    this.language = language;
    this.resourceType = resourceType;
    this.compartment = compartment;
    this.name = name;
    this.meta = meta;
    this.implicitRules = implicitRules;
    this.id = id;
    this.resource = resource;
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
   * @return The value of the {@code resourceType} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("resourceType")
  @Override
  public java.util.Optional<java.lang.String> resourceType() {
    return java.util.Optional.ofNullable(resourceType);
  }

  /**
   * @return The value of the {@code compartment} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("compartment")
  @Override
  public java.util.Optional<com.fhir.Reference> compartment() {
    return java.util.Optional.ofNullable(compartment);
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
   * @return The value of the {@code meta} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("meta")
  @Override
  public java.util.Optional<com.fhir.Meta> meta() {
    return java.util.Optional.ofNullable(meta);
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
   * @return The value of the {@code resource} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("resource")
  @Override
  public java.util.Optional<java.util.List<com.fhir.AccessPolicy_Resource>> resource() {
    return java.util.Optional.ofNullable(resource);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link AccessPolicy#language() language} attribute.
   * @param value The value for language
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAccessPolicy withLanguage(com.fhir.code value) {
    @javax.annotation.Nullable com.fhir.code newValue = java.util.Objects.requireNonNull(value, "language");
    if (this.language == newValue) return this;
    return new ImmutableAccessPolicy(
        newValue,
        this.resourceType,
        this.compartment,
        this.name,
        this.meta,
        this.implicitRules,
        this.id,
        this.resource);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link AccessPolicy#language() language} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for language
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableAccessPolicy withLanguage(java.util.Optional<? extends com.fhir.code> optional) {
    @javax.annotation.Nullable com.fhir.code value = optional.orElse(null);
    if (this.language == value) return this;
    return new ImmutableAccessPolicy(
        value,
        this.resourceType,
        this.compartment,
        this.name,
        this.meta,
        this.implicitRules,
        this.id,
        this.resource);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link AccessPolicy#resourceType() resourceType} attribute.
   * @param value The value for resourceType
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAccessPolicy withResourceType(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "resourceType");
    if (java.util.Objects.equals(this.resourceType, newValue)) return this;
    return new ImmutableAccessPolicy(
        this.language,
        newValue,
        this.compartment,
        this.name,
        this.meta,
        this.implicitRules,
        this.id,
        this.resource);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link AccessPolicy#resourceType() resourceType} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for resourceType
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAccessPolicy withResourceType(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.resourceType, value)) return this;
    return new ImmutableAccessPolicy(
        this.language,
        value,
        this.compartment,
        this.name,
        this.meta,
        this.implicitRules,
        this.id,
        this.resource);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link AccessPolicy#compartment() compartment} attribute.
   * @param value The value for compartment
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAccessPolicy withCompartment(com.fhir.Reference value) {
    @javax.annotation.Nullable com.fhir.Reference newValue = java.util.Objects.requireNonNull(value, "compartment");
    if (this.compartment == newValue) return this;
    return new ImmutableAccessPolicy(
        this.language,
        this.resourceType,
        newValue,
        this.name,
        this.meta,
        this.implicitRules,
        this.id,
        this.resource);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link AccessPolicy#compartment() compartment} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for compartment
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableAccessPolicy withCompartment(java.util.Optional<? extends com.fhir.Reference> optional) {
    @javax.annotation.Nullable com.fhir.Reference value = optional.orElse(null);
    if (this.compartment == value) return this;
    return new ImmutableAccessPolicy(
        this.language,
        this.resourceType,
        value,
        this.name,
        this.meta,
        this.implicitRules,
        this.id,
        this.resource);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link AccessPolicy#name() name} attribute.
   * @param value The value for name
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAccessPolicy withName(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "name");
    if (java.util.Objects.equals(this.name, newValue)) return this;
    return new ImmutableAccessPolicy(
        this.language,
        this.resourceType,
        this.compartment,
        newValue,
        this.meta,
        this.implicitRules,
        this.id,
        this.resource);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link AccessPolicy#name() name} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for name
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAccessPolicy withName(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.name, value)) return this;
    return new ImmutableAccessPolicy(
        this.language,
        this.resourceType,
        this.compartment,
        value,
        this.meta,
        this.implicitRules,
        this.id,
        this.resource);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link AccessPolicy#meta() meta} attribute.
   * @param value The value for meta
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAccessPolicy withMeta(com.fhir.Meta value) {
    @javax.annotation.Nullable com.fhir.Meta newValue = java.util.Objects.requireNonNull(value, "meta");
    if (this.meta == newValue) return this;
    return new ImmutableAccessPolicy(
        this.language,
        this.resourceType,
        this.compartment,
        this.name,
        newValue,
        this.implicitRules,
        this.id,
        this.resource);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link AccessPolicy#meta() meta} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for meta
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableAccessPolicy withMeta(java.util.Optional<? extends com.fhir.Meta> optional) {
    @javax.annotation.Nullable com.fhir.Meta value = optional.orElse(null);
    if (this.meta == value) return this;
    return new ImmutableAccessPolicy(
        this.language,
        this.resourceType,
        this.compartment,
        this.name,
        value,
        this.implicitRules,
        this.id,
        this.resource);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link AccessPolicy#implicitRules() implicitRules} attribute.
   * @param value The value for implicitRules
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAccessPolicy withImplicitRules(com.fhir.uri value) {
    @javax.annotation.Nullable com.fhir.uri newValue = java.util.Objects.requireNonNull(value, "implicitRules");
    if (this.implicitRules == newValue) return this;
    return new ImmutableAccessPolicy(
        this.language,
        this.resourceType,
        this.compartment,
        this.name,
        this.meta,
        newValue,
        this.id,
        this.resource);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link AccessPolicy#implicitRules() implicitRules} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for implicitRules
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableAccessPolicy withImplicitRules(java.util.Optional<? extends com.fhir.uri> optional) {
    @javax.annotation.Nullable com.fhir.uri value = optional.orElse(null);
    if (this.implicitRules == value) return this;
    return new ImmutableAccessPolicy(
        this.language,
        this.resourceType,
        this.compartment,
        this.name,
        this.meta,
        value,
        this.id,
        this.resource);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link AccessPolicy#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAccessPolicy withId(com.fhir.id value) {
    @javax.annotation.Nullable com.fhir.id newValue = java.util.Objects.requireNonNull(value, "id");
    if (this.id == newValue) return this;
    return new ImmutableAccessPolicy(
        this.language,
        this.resourceType,
        this.compartment,
        this.name,
        this.meta,
        this.implicitRules,
        newValue,
        this.resource);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link AccessPolicy#id() id} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableAccessPolicy withId(java.util.Optional<? extends com.fhir.id> optional) {
    @javax.annotation.Nullable com.fhir.id value = optional.orElse(null);
    if (this.id == value) return this;
    return new ImmutableAccessPolicy(
        this.language,
        this.resourceType,
        this.compartment,
        this.name,
        this.meta,
        this.implicitRules,
        value,
        this.resource);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link AccessPolicy#resource() resource} attribute.
   * @param value The value for resource
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAccessPolicy withResource(java.util.List<com.fhir.AccessPolicy_Resource> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.AccessPolicy_Resource> newValue = java.util.Objects.requireNonNull(value, "resource");
    if (this.resource == newValue) return this;
    return new ImmutableAccessPolicy(
        this.language,
        this.resourceType,
        this.compartment,
        this.name,
        this.meta,
        this.implicitRules,
        this.id,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link AccessPolicy#resource() resource} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for resource
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableAccessPolicy withResource(java.util.Optional<? extends java.util.List<com.fhir.AccessPolicy_Resource>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.AccessPolicy_Resource> value = optional.orElse(null);
    if (this.resource == value) return this;
    return new ImmutableAccessPolicy(
        this.language,
        this.resourceType,
        this.compartment,
        this.name,
        this.meta,
        this.implicitRules,
        this.id,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableAccessPolicy} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@javax.annotation.Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableAccessPolicy
        && equalTo((ImmutableAccessPolicy) another);
  }

  private boolean equalTo(ImmutableAccessPolicy another) {
    return java.util.Objects.equals(language, another.language)
        && java.util.Objects.equals(resourceType, another.resourceType)
        && java.util.Objects.equals(compartment, another.compartment)
        && java.util.Objects.equals(name, another.name)
        && java.util.Objects.equals(meta, another.meta)
        && java.util.Objects.equals(implicitRules, another.implicitRules)
        && java.util.Objects.equals(id, another.id)
        && java.util.Objects.equals(resource, another.resource);
  }

  /**
   * Computes a hash code from attributes: {@code language}, {@code resourceType}, {@code compartment}, {@code name}, {@code meta}, {@code implicitRules}, {@code id}, {@code resource}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + java.util.Objects.hashCode(language);
    h += (h << 5) + java.util.Objects.hashCode(resourceType);
    h += (h << 5) + java.util.Objects.hashCode(compartment);
    h += (h << 5) + java.util.Objects.hashCode(name);
    h += (h << 5) + java.util.Objects.hashCode(meta);
    h += (h << 5) + java.util.Objects.hashCode(implicitRules);
    h += (h << 5) + java.util.Objects.hashCode(id);
    h += (h << 5) + java.util.Objects.hashCode(resource);
    return h;
  }

  /**
   * Prints the immutable value {@code AccessPolicy} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    java.lang.StringBuilder builder = new java.lang.StringBuilder("AccessPolicy{");
    if (language != null) {
      builder.append("language=").append(language);
    }
    if (resourceType != null) {
      if (builder.length() > 13) builder.append(", ");
      builder.append("resourceType=").append(resourceType);
    }
    if (compartment != null) {
      if (builder.length() > 13) builder.append(", ");
      builder.append("compartment=").append(compartment);
    }
    if (name != null) {
      if (builder.length() > 13) builder.append(", ");
      builder.append("name=").append(name);
    }
    if (meta != null) {
      if (builder.length() > 13) builder.append(", ");
      builder.append("meta=").append(meta);
    }
    if (implicitRules != null) {
      if (builder.length() > 13) builder.append(", ");
      builder.append("implicitRules=").append(implicitRules);
    }
    if (id != null) {
      if (builder.length() > 13) builder.append(", ");
      builder.append("id=").append(id);
    }
    if (resource != null) {
      if (builder.length() > 13) builder.append(", ");
      builder.append("resource=").append(resource);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @org.immutables.value.Generated(from = "AccessPolicy", generator = "Immutables")
  @Deprecated
  @com.fasterxml.jackson.databind.annotation.JsonDeserialize
  @com.fasterxml.jackson.annotation.JsonAutoDetect(fieldVisibility = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.NONE)
  static final class Json implements com.fhir.AccessPolicy {
    @javax.annotation.Nullable java.util.Optional<com.fhir.code> language = java.util.Optional.empty();
    boolean languageIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.String> resourceType = java.util.Optional.empty();
    boolean resourceTypeIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Reference> compartment = java.util.Optional.empty();
    boolean compartmentIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.String> name = java.util.Optional.empty();
    boolean nameIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Meta> meta = java.util.Optional.empty();
    boolean metaIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.uri> implicitRules = java.util.Optional.empty();
    boolean implicitRulesIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.id> id = java.util.Optional.empty();
    boolean idIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.AccessPolicy_Resource>> resource = java.util.Optional.empty();
    boolean resourceIsSet;
    @com.fasterxml.jackson.annotation.JsonProperty("language")
    public void setLanguage(java.util.Optional<com.fhir.code> language) {
      this.language = language;
      this.languageIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("resourceType")
    public void setResourceType(java.util.Optional<java.lang.String> resourceType) {
      this.resourceType = resourceType;
      this.resourceTypeIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("compartment")
    public void setCompartment(java.util.Optional<com.fhir.Reference> compartment) {
      this.compartment = compartment;
      this.compartmentIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    public void setName(java.util.Optional<java.lang.String> name) {
      this.name = name;
      this.nameIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("meta")
    public void setMeta(java.util.Optional<com.fhir.Meta> meta) {
      this.meta = meta;
      this.metaIsSet = true;
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
    @com.fasterxml.jackson.annotation.JsonProperty("resource")
    public void setResource(java.util.Optional<java.util.List<com.fhir.AccessPolicy_Resource>> resource) {
      this.resource = resource;
      this.resourceIsSet = true;
    }
    @Override
    public java.util.Optional<com.fhir.code> language() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.String> resourceType() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Reference> compartment() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.String> name() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Meta> meta() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.uri> implicitRules() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.id> id() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.AccessPolicy_Resource>> resource() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @com.fasterxml.jackson.annotation.JsonCreator(mode = com.fasterxml.jackson.annotation.JsonCreator.Mode.DELEGATING)
  static ImmutableAccessPolicy fromJson(Json json) {
    ImmutableAccessPolicy.Builder builder = ImmutableAccessPolicy.builder();
    if (json.languageIsSet) {
      builder.language(json.language);
    }
    if (json.resourceTypeIsSet) {
      builder.resourceType(json.resourceType);
    }
    if (json.compartmentIsSet) {
      builder.compartment(json.compartment);
    }
    if (json.nameIsSet) {
      builder.name(json.name);
    }
    if (json.metaIsSet) {
      builder.meta(json.meta);
    }
    if (json.implicitRulesIsSet) {
      builder.implicitRules(json.implicitRules);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.resourceIsSet) {
      builder.resource(json.resource);
    }
    return (ImmutableAccessPolicy) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link AccessPolicy} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable AccessPolicy instance
   */
  public static AccessPolicy copyOf(AccessPolicy instance) {
    if (instance instanceof ImmutableAccessPolicy) {
      return (ImmutableAccessPolicy) instance;
    }
    return ImmutableAccessPolicy.builder()
        .language(instance.language())
        .resourceType(instance.resourceType())
        .compartment(instance.compartment())
        .name(instance.name())
        .meta(instance.meta())
        .implicitRules(instance.implicitRules())
        .id(instance.id())
        .resource(instance.resource())
        .build();
  }

  /**
   * Creates a builder for {@link AccessPolicy AccessPolicy}.
   * <pre>
   * ImmutableAccessPolicy.builder()
   *    .language(com.fhir.code) // optional {@link AccessPolicy#language() language}
   *    .resourceType(String) // optional {@link AccessPolicy#resourceType() resourceType}
   *    .compartment(com.fhir.Reference) // optional {@link AccessPolicy#compartment() compartment}
   *    .name(String) // optional {@link AccessPolicy#name() name}
   *    .meta(com.fhir.Meta) // optional {@link AccessPolicy#meta() meta}
   *    .implicitRules(com.fhir.uri) // optional {@link AccessPolicy#implicitRules() implicitRules}
   *    .id(com.fhir.id) // optional {@link AccessPolicy#id() id}
   *    .resource(List&amp;lt;com.fhir.AccessPolicy_Resource&amp;gt;) // optional {@link AccessPolicy#resource() resource}
   *    .build();
   * </pre>
   * @return A new AccessPolicy builder
   */
  public static ImmutableAccessPolicy.Builder builder() {
    return new ImmutableAccessPolicy.Builder();
  }

  /**
   * Builds instances of type {@link AccessPolicy AccessPolicy}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @org.immutables.value.Generated(from = "AccessPolicy", generator = "Immutables")
  @javax.annotation.concurrent.NotThreadSafe
  public static final class Builder {
    private static final long OPT_BIT_LANGUAGE = 0x1L;
    private static final long OPT_BIT_RESOURCE_TYPE = 0x2L;
    private static final long OPT_BIT_COMPARTMENT = 0x4L;
    private static final long OPT_BIT_NAME = 0x8L;
    private static final long OPT_BIT_META = 0x10L;
    private static final long OPT_BIT_IMPLICIT_RULES = 0x20L;
    private static final long OPT_BIT_ID = 0x40L;
    private static final long OPT_BIT_RESOURCE = 0x80L;
    private long optBits;

    private @javax.annotation.Nullable com.fhir.code language;
    private @javax.annotation.Nullable java.lang.String resourceType;
    private @javax.annotation.Nullable com.fhir.Reference compartment;
    private @javax.annotation.Nullable java.lang.String name;
    private @javax.annotation.Nullable com.fhir.Meta meta;
    private @javax.annotation.Nullable com.fhir.uri implicitRules;
    private @javax.annotation.Nullable com.fhir.id id;
    private @javax.annotation.Nullable java.util.List<com.fhir.AccessPolicy_Resource> resource;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link AccessPolicy#language() language} to language.
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
     * Initializes the optional value {@link AccessPolicy#language() language} to language.
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
     * Initializes the optional value {@link AccessPolicy#resourceType() resourceType} to resourceType.
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
     * Initializes the optional value {@link AccessPolicy#resourceType() resourceType} to resourceType.
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
     * Initializes the optional value {@link AccessPolicy#compartment() compartment} to compartment.
     * @param compartment The value for compartment
     * @return {@code this} builder for chained invocation
     */
    public final Builder compartment(com.fhir.Reference compartment) {
      checkNotIsSet(compartmentIsSet(), "compartment");
      this.compartment = java.util.Objects.requireNonNull(compartment, "compartment");
      optBits |= OPT_BIT_COMPARTMENT;
      return this;
    }

    /**
     * Initializes the optional value {@link AccessPolicy#compartment() compartment} to compartment.
     * @param compartment The value for compartment
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("compartment")
    public final Builder compartment(java.util.Optional<? extends com.fhir.Reference> compartment) {
      checkNotIsSet(compartmentIsSet(), "compartment");
      this.compartment = compartment.orElse(null);
      optBits |= OPT_BIT_COMPARTMENT;
      return this;
    }

    /**
     * Initializes the optional value {@link AccessPolicy#name() name} to name.
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
     * Initializes the optional value {@link AccessPolicy#name() name} to name.
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
     * Initializes the optional value {@link AccessPolicy#meta() meta} to meta.
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
     * Initializes the optional value {@link AccessPolicy#meta() meta} to meta.
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
     * Initializes the optional value {@link AccessPolicy#implicitRules() implicitRules} to implicitRules.
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
     * Initializes the optional value {@link AccessPolicy#implicitRules() implicitRules} to implicitRules.
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
     * Initializes the optional value {@link AccessPolicy#id() id} to id.
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
     * Initializes the optional value {@link AccessPolicy#id() id} to id.
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
     * Initializes the optional value {@link AccessPolicy#resource() resource} to resource.
     * @param resource The value for resource
     * @return {@code this} builder for chained invocation
     */
    public final Builder resource(java.util.List<com.fhir.AccessPolicy_Resource> resource) {
      checkNotIsSet(resourceIsSet(), "resource");
      this.resource = java.util.Objects.requireNonNull(resource, "resource");
      optBits |= OPT_BIT_RESOURCE;
      return this;
    }

    /**
     * Initializes the optional value {@link AccessPolicy#resource() resource} to resource.
     * @param resource The value for resource
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("resource")
    public final Builder resource(java.util.Optional<? extends java.util.List<com.fhir.AccessPolicy_Resource>> resource) {
      checkNotIsSet(resourceIsSet(), "resource");
      this.resource = resource.orElse(null);
      optBits |= OPT_BIT_RESOURCE;
      return this;
    }

    /**
     * Builds a new {@link AccessPolicy AccessPolicy}.
     * @return An immutable instance of AccessPolicy
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public com.fhir.AccessPolicy build() {
      return new ImmutableAccessPolicy(language, resourceType, compartment, name, meta, implicitRules, id, resource);
    }

    private boolean languageIsSet() {
      return (optBits & OPT_BIT_LANGUAGE) != 0;
    }

    private boolean resourceTypeIsSet() {
      return (optBits & OPT_BIT_RESOURCE_TYPE) != 0;
    }

    private boolean compartmentIsSet() {
      return (optBits & OPT_BIT_COMPARTMENT) != 0;
    }

    private boolean nameIsSet() {
      return (optBits & OPT_BIT_NAME) != 0;
    }

    private boolean metaIsSet() {
      return (optBits & OPT_BIT_META) != 0;
    }

    private boolean implicitRulesIsSet() {
      return (optBits & OPT_BIT_IMPLICIT_RULES) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean resourceIsSet() {
      return (optBits & OPT_BIT_RESOURCE) != 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new java.lang.IllegalStateException("Builder of AccessPolicy is strict, attribute is already set: ".concat(name));
    }
  }
}
