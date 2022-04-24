//-no-import-rewrite
package com.fhir;

import java.lang.Object;
import java.lang.String;
import java.lang.Float;
import java.lang.Double;

/**
 * Immutable implementation of {@link ValueSet_Include}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableValueSet_Include.builder()}.
 */
@org.immutables.value.Generated(from = "ValueSet_Include", generator = "Immutables")
@SuppressWarnings({"all"})
@edu.umd.cs.findbugs.annotations.SuppressFBWarnings
@javax.annotation.ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@javax.annotation.concurrent.Immutable
@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableValueSet_Include implements com.fhir.ValueSet_Include {
  private final @javax.annotation.Nullable java.lang.String id;
  private final @javax.annotation.Nullable com.fhir.uri system;
  private final @javax.annotation.Nullable java.lang.String version;
  private final @javax.annotation.Nullable java.util.List<com.fhir.ValueSet_Concept> concept;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension;
  private final @javax.annotation.Nullable java.util.List<com.fhir.ValueSet_Filter> filter;
  private final @javax.annotation.Nullable java.util.List<com.fhir.canonical> valueSet;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension;

  private ImmutableValueSet_Include(
      @javax.annotation.Nullable java.lang.String id,
      @javax.annotation.Nullable com.fhir.uri system,
      @javax.annotation.Nullable java.lang.String version,
      @javax.annotation.Nullable java.util.List<com.fhir.ValueSet_Concept> concept,
      @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension,
      @javax.annotation.Nullable java.util.List<com.fhir.ValueSet_Filter> filter,
      @javax.annotation.Nullable java.util.List<com.fhir.canonical> valueSet,
      @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension) {
    this.id = id;
    this.system = system;
    this.version = version;
    this.concept = concept;
    this.extension = extension;
    this.filter = filter;
    this.valueSet = valueSet;
    this.modifierExtension = modifierExtension;
  }

  /**
   * @return The value of the {@code id} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("id")
  @Override
  public java.util.Optional<java.lang.String> id() {
    return java.util.Optional.ofNullable(id);
  }

  /**
   * @return The value of the {@code system} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("system")
  @Override
  public java.util.Optional<com.fhir.uri> system() {
    return java.util.Optional.ofNullable(system);
  }

  /**
   * @return The value of the {@code version} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("version")
  @Override
  public java.util.Optional<java.lang.String> version() {
    return java.util.Optional.ofNullable(version);
  }

  /**
   * @return The value of the {@code concept} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("concept")
  @Override
  public java.util.Optional<java.util.List<com.fhir.ValueSet_Concept>> concept() {
    return java.util.Optional.ofNullable(concept);
  }

  /**
   * @return The value of the {@code extension} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("extension")
  @Override
  public java.util.Optional<java.util.List<com.fhir.Extension>> extension() {
    return java.util.Optional.ofNullable(extension);
  }

  /**
   * @return The value of the {@code filter} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("filter")
  @Override
  public java.util.Optional<java.util.List<com.fhir.ValueSet_Filter>> filter() {
    return java.util.Optional.ofNullable(filter);
  }

  /**
   * @return The value of the {@code valueSet} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("valueSet")
  @Override
  public java.util.Optional<java.util.List<com.fhir.canonical>> valueSet() {
    return java.util.Optional.ofNullable(valueSet);
  }

  /**
   * @return The value of the {@code modifierExtension} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("modifierExtension")
  @Override
  public java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension() {
    return java.util.Optional.ofNullable(modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ValueSet_Include#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableValueSet_Include withId(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "id");
    if (java.util.Objects.equals(this.id, newValue)) return this;
    return new ImmutableValueSet_Include(
        newValue,
        this.system,
        this.version,
        this.concept,
        this.extension,
        this.filter,
        this.valueSet,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ValueSet_Include#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableValueSet_Include withId(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.id, value)) return this;
    return new ImmutableValueSet_Include(
        value,
        this.system,
        this.version,
        this.concept,
        this.extension,
        this.filter,
        this.valueSet,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ValueSet_Include#system() system} attribute.
   * @param value The value for system
   * @return A modified copy of {@code this} object
   */
  public final ImmutableValueSet_Include withSystem(com.fhir.uri value) {
    @javax.annotation.Nullable com.fhir.uri newValue = java.util.Objects.requireNonNull(value, "system");
    if (this.system == newValue) return this;
    return new ImmutableValueSet_Include(
        this.id,
        newValue,
        this.version,
        this.concept,
        this.extension,
        this.filter,
        this.valueSet,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ValueSet_Include#system() system} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for system
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableValueSet_Include withSystem(java.util.Optional<? extends com.fhir.uri> optional) {
    @javax.annotation.Nullable com.fhir.uri value = optional.orElse(null);
    if (this.system == value) return this;
    return new ImmutableValueSet_Include(
        this.id,
        value,
        this.version,
        this.concept,
        this.extension,
        this.filter,
        this.valueSet,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ValueSet_Include#version() version} attribute.
   * @param value The value for version
   * @return A modified copy of {@code this} object
   */
  public final ImmutableValueSet_Include withVersion(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "version");
    if (java.util.Objects.equals(this.version, newValue)) return this;
    return new ImmutableValueSet_Include(
        this.id,
        this.system,
        newValue,
        this.concept,
        this.extension,
        this.filter,
        this.valueSet,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ValueSet_Include#version() version} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for version
   * @return A modified copy of {@code this} object
   */
  public final ImmutableValueSet_Include withVersion(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.version, value)) return this;
    return new ImmutableValueSet_Include(
        this.id,
        this.system,
        value,
        this.concept,
        this.extension,
        this.filter,
        this.valueSet,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ValueSet_Include#concept() concept} attribute.
   * @param value The value for concept
   * @return A modified copy of {@code this} object
   */
  public final ImmutableValueSet_Include withConcept(java.util.List<com.fhir.ValueSet_Concept> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.ValueSet_Concept> newValue = java.util.Objects.requireNonNull(value, "concept");
    if (this.concept == newValue) return this;
    return new ImmutableValueSet_Include(
        this.id,
        this.system,
        this.version,
        newValue,
        this.extension,
        this.filter,
        this.valueSet,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ValueSet_Include#concept() concept} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for concept
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableValueSet_Include withConcept(java.util.Optional<? extends java.util.List<com.fhir.ValueSet_Concept>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.ValueSet_Concept> value = optional.orElse(null);
    if (this.concept == value) return this;
    return new ImmutableValueSet_Include(
        this.id,
        this.system,
        this.version,
        value,
        this.extension,
        this.filter,
        this.valueSet,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ValueSet_Include#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableValueSet_Include withExtension(java.util.List<com.fhir.Extension> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> newValue = java.util.Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableValueSet_Include(
        this.id,
        this.system,
        this.version,
        this.concept,
        newValue,
        this.filter,
        this.valueSet,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ValueSet_Include#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableValueSet_Include withExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableValueSet_Include(
        this.id,
        this.system,
        this.version,
        this.concept,
        value,
        this.filter,
        this.valueSet,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ValueSet_Include#filter() filter} attribute.
   * @param value The value for filter
   * @return A modified copy of {@code this} object
   */
  public final ImmutableValueSet_Include withFilter(java.util.List<com.fhir.ValueSet_Filter> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.ValueSet_Filter> newValue = java.util.Objects.requireNonNull(value, "filter");
    if (this.filter == newValue) return this;
    return new ImmutableValueSet_Include(
        this.id,
        this.system,
        this.version,
        this.concept,
        this.extension,
        newValue,
        this.valueSet,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ValueSet_Include#filter() filter} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for filter
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableValueSet_Include withFilter(java.util.Optional<? extends java.util.List<com.fhir.ValueSet_Filter>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.ValueSet_Filter> value = optional.orElse(null);
    if (this.filter == value) return this;
    return new ImmutableValueSet_Include(
        this.id,
        this.system,
        this.version,
        this.concept,
        this.extension,
        value,
        this.valueSet,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ValueSet_Include#valueSet() valueSet} attribute.
   * @param value The value for valueSet
   * @return A modified copy of {@code this} object
   */
  public final ImmutableValueSet_Include withValueSet(java.util.List<com.fhir.canonical> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.canonical> newValue = java.util.Objects.requireNonNull(value, "valueSet");
    if (this.valueSet == newValue) return this;
    return new ImmutableValueSet_Include(
        this.id,
        this.system,
        this.version,
        this.concept,
        this.extension,
        this.filter,
        newValue,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ValueSet_Include#valueSet() valueSet} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for valueSet
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableValueSet_Include withValueSet(java.util.Optional<? extends java.util.List<com.fhir.canonical>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.canonical> value = optional.orElse(null);
    if (this.valueSet == value) return this;
    return new ImmutableValueSet_Include(
        this.id,
        this.system,
        this.version,
        this.concept,
        this.extension,
        this.filter,
        value,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ValueSet_Include#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableValueSet_Include withModifierExtension(java.util.List<com.fhir.Extension> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> newValue = java.util.Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableValueSet_Include(
        this.id,
        this.system,
        this.version,
        this.concept,
        this.extension,
        this.filter,
        this.valueSet,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ValueSet_Include#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableValueSet_Include withModifierExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableValueSet_Include(
        this.id,
        this.system,
        this.version,
        this.concept,
        this.extension,
        this.filter,
        this.valueSet,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableValueSet_Include} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@javax.annotation.Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableValueSet_Include
        && equalTo((ImmutableValueSet_Include) another);
  }

  private boolean equalTo(ImmutableValueSet_Include another) {
    return java.util.Objects.equals(id, another.id)
        && java.util.Objects.equals(system, another.system)
        && java.util.Objects.equals(version, another.version)
        && java.util.Objects.equals(concept, another.concept)
        && java.util.Objects.equals(extension, another.extension)
        && java.util.Objects.equals(filter, another.filter)
        && java.util.Objects.equals(valueSet, another.valueSet)
        && java.util.Objects.equals(modifierExtension, another.modifierExtension);
  }

  /**
   * Computes a hash code from attributes: {@code id}, {@code system}, {@code version}, {@code concept}, {@code extension}, {@code filter}, {@code valueSet}, {@code modifierExtension}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + java.util.Objects.hashCode(id);
    h += (h << 5) + java.util.Objects.hashCode(system);
    h += (h << 5) + java.util.Objects.hashCode(version);
    h += (h << 5) + java.util.Objects.hashCode(concept);
    h += (h << 5) + java.util.Objects.hashCode(extension);
    h += (h << 5) + java.util.Objects.hashCode(filter);
    h += (h << 5) + java.util.Objects.hashCode(valueSet);
    h += (h << 5) + java.util.Objects.hashCode(modifierExtension);
    return h;
  }

  /**
   * Prints the immutable value {@code ValueSet_Include} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    java.lang.StringBuilder builder = new java.lang.StringBuilder("ValueSet_Include{");
    if (id != null) {
      builder.append("id=").append(id);
    }
    if (system != null) {
      if (builder.length() > 17) builder.append(", ");
      builder.append("system=").append(system);
    }
    if (version != null) {
      if (builder.length() > 17) builder.append(", ");
      builder.append("version=").append(version);
    }
    if (concept != null) {
      if (builder.length() > 17) builder.append(", ");
      builder.append("concept=").append(concept);
    }
    if (extension != null) {
      if (builder.length() > 17) builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (filter != null) {
      if (builder.length() > 17) builder.append(", ");
      builder.append("filter=").append(filter);
    }
    if (valueSet != null) {
      if (builder.length() > 17) builder.append(", ");
      builder.append("valueSet=").append(valueSet);
    }
    if (modifierExtension != null) {
      if (builder.length() > 17) builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @org.immutables.value.Generated(from = "ValueSet_Include", generator = "Immutables")
  @Deprecated
  @com.fasterxml.jackson.databind.annotation.JsonDeserialize
  @com.fasterxml.jackson.annotation.JsonAutoDetect(fieldVisibility = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.NONE)
  static final class Json implements com.fhir.ValueSet_Include {
    @javax.annotation.Nullable java.util.Optional<java.lang.String> id = java.util.Optional.empty();
    boolean idIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.uri> system = java.util.Optional.empty();
    boolean systemIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.String> version = java.util.Optional.empty();
    boolean versionIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.ValueSet_Concept>> concept = java.util.Optional.empty();
    boolean conceptIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Extension>> extension = java.util.Optional.empty();
    boolean extensionIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.ValueSet_Filter>> filter = java.util.Optional.empty();
    boolean filterIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.canonical>> valueSet = java.util.Optional.empty();
    boolean valueSetIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension = java.util.Optional.empty();
    boolean modifierExtensionIsSet;
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    public void setId(java.util.Optional<java.lang.String> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("system")
    public void setSystem(java.util.Optional<com.fhir.uri> system) {
      this.system = system;
      this.systemIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("version")
    public void setVersion(java.util.Optional<java.lang.String> version) {
      this.version = version;
      this.versionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("concept")
    public void setConcept(java.util.Optional<java.util.List<com.fhir.ValueSet_Concept>> concept) {
      this.concept = concept;
      this.conceptIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("extension")
    public void setExtension(java.util.Optional<java.util.List<com.fhir.Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("filter")
    public void setFilter(java.util.Optional<java.util.List<com.fhir.ValueSet_Filter>> filter) {
      this.filter = filter;
      this.filterIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("valueSet")
    public void setValueSet(java.util.Optional<java.util.List<com.fhir.canonical>> valueSet) {
      this.valueSet = valueSet;
      this.valueSetIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("modifierExtension")
    public void setModifierExtension(java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @Override
    public java.util.Optional<java.lang.String> id() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.uri> system() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.String> version() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.ValueSet_Concept>> concept() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.ValueSet_Filter>> filter() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.canonical>> valueSet() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @com.fasterxml.jackson.annotation.JsonCreator(mode = com.fasterxml.jackson.annotation.JsonCreator.Mode.DELEGATING)
  static ImmutableValueSet_Include fromJson(Json json) {
    ImmutableValueSet_Include.Builder builder = ImmutableValueSet_Include.builder();
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.systemIsSet) {
      builder.system(json.system);
    }
    if (json.versionIsSet) {
      builder.version(json.version);
    }
    if (json.conceptIsSet) {
      builder.concept(json.concept);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.filterIsSet) {
      builder.filter(json.filter);
    }
    if (json.valueSetIsSet) {
      builder.valueSet(json.valueSet);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    return (ImmutableValueSet_Include) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link ValueSet_Include} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable ValueSet_Include instance
   */
  public static ValueSet_Include copyOf(ValueSet_Include instance) {
    if (instance instanceof ImmutableValueSet_Include) {
      return (ImmutableValueSet_Include) instance;
    }
    return ImmutableValueSet_Include.builder()
        .id(instance.id())
        .system(instance.system())
        .version(instance.version())
        .concept(instance.concept())
        .extension(instance.extension())
        .filter(instance.filter())
        .valueSet(instance.valueSet())
        .modifierExtension(instance.modifierExtension())
        .build();
  }

  /**
   * Creates a builder for {@link ValueSet_Include ValueSet_Include}.
   * <pre>
   * ImmutableValueSet_Include.builder()
   *    .id(String) // optional {@link ValueSet_Include#id() id}
   *    .system(com.fhir.uri) // optional {@link ValueSet_Include#system() system}
   *    .version(String) // optional {@link ValueSet_Include#version() version}
   *    .concept(List&amp;lt;com.fhir.ValueSet_Concept&amp;gt;) // optional {@link ValueSet_Include#concept() concept}
   *    .extension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link ValueSet_Include#extension() extension}
   *    .filter(List&amp;lt;com.fhir.ValueSet_Filter&amp;gt;) // optional {@link ValueSet_Include#filter() filter}
   *    .valueSet(List&amp;lt;com.fhir.canonical&amp;gt;) // optional {@link ValueSet_Include#valueSet() valueSet}
   *    .modifierExtension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link ValueSet_Include#modifierExtension() modifierExtension}
   *    .build();
   * </pre>
   * @return A new ValueSet_Include builder
   */
  public static ImmutableValueSet_Include.Builder builder() {
    return new ImmutableValueSet_Include.Builder();
  }

  /**
   * Builds instances of type {@link ValueSet_Include ValueSet_Include}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @org.immutables.value.Generated(from = "ValueSet_Include", generator = "Immutables")
  @javax.annotation.concurrent.NotThreadSafe
  public static final class Builder {
    private static final long OPT_BIT_ID = 0x1L;
    private static final long OPT_BIT_SYSTEM = 0x2L;
    private static final long OPT_BIT_VERSION = 0x4L;
    private static final long OPT_BIT_CONCEPT = 0x8L;
    private static final long OPT_BIT_EXTENSION = 0x10L;
    private static final long OPT_BIT_FILTER = 0x20L;
    private static final long OPT_BIT_VALUE_SET = 0x40L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x80L;
    private long optBits;

    private @javax.annotation.Nullable java.lang.String id;
    private @javax.annotation.Nullable com.fhir.uri system;
    private @javax.annotation.Nullable java.lang.String version;
    private @javax.annotation.Nullable java.util.List<com.fhir.ValueSet_Concept> concept;
    private @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension;
    private @javax.annotation.Nullable java.util.List<com.fhir.ValueSet_Filter> filter;
    private @javax.annotation.Nullable java.util.List<com.fhir.canonical> valueSet;
    private @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link ValueSet_Include#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    public final Builder id(java.lang.String id) {
      checkNotIsSet(idIsSet(), "id");
      this.id = java.util.Objects.requireNonNull(id, "id");
      optBits |= OPT_BIT_ID;
      return this;
    }

    /**
     * Initializes the optional value {@link ValueSet_Include#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    public final Builder id(java.util.Optional<java.lang.String> id) {
      checkNotIsSet(idIsSet(), "id");
      this.id = id.orElse(null);
      optBits |= OPT_BIT_ID;
      return this;
    }

    /**
     * Initializes the optional value {@link ValueSet_Include#system() system} to system.
     * @param system The value for system
     * @return {@code this} builder for chained invocation
     */
    public final Builder system(com.fhir.uri system) {
      checkNotIsSet(systemIsSet(), "system");
      this.system = java.util.Objects.requireNonNull(system, "system");
      optBits |= OPT_BIT_SYSTEM;
      return this;
    }

    /**
     * Initializes the optional value {@link ValueSet_Include#system() system} to system.
     * @param system The value for system
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("system")
    public final Builder system(java.util.Optional<? extends com.fhir.uri> system) {
      checkNotIsSet(systemIsSet(), "system");
      this.system = system.orElse(null);
      optBits |= OPT_BIT_SYSTEM;
      return this;
    }

    /**
     * Initializes the optional value {@link ValueSet_Include#version() version} to version.
     * @param version The value for version
     * @return {@code this} builder for chained invocation
     */
    public final Builder version(java.lang.String version) {
      checkNotIsSet(versionIsSet(), "version");
      this.version = java.util.Objects.requireNonNull(version, "version");
      optBits |= OPT_BIT_VERSION;
      return this;
    }

    /**
     * Initializes the optional value {@link ValueSet_Include#version() version} to version.
     * @param version The value for version
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("version")
    public final Builder version(java.util.Optional<java.lang.String> version) {
      checkNotIsSet(versionIsSet(), "version");
      this.version = version.orElse(null);
      optBits |= OPT_BIT_VERSION;
      return this;
    }

    /**
     * Initializes the optional value {@link ValueSet_Include#concept() concept} to concept.
     * @param concept The value for concept
     * @return {@code this} builder for chained invocation
     */
    public final Builder concept(java.util.List<com.fhir.ValueSet_Concept> concept) {
      checkNotIsSet(conceptIsSet(), "concept");
      this.concept = java.util.Objects.requireNonNull(concept, "concept");
      optBits |= OPT_BIT_CONCEPT;
      return this;
    }

    /**
     * Initializes the optional value {@link ValueSet_Include#concept() concept} to concept.
     * @param concept The value for concept
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("concept")
    public final Builder concept(java.util.Optional<? extends java.util.List<com.fhir.ValueSet_Concept>> concept) {
      checkNotIsSet(conceptIsSet(), "concept");
      this.concept = concept.orElse(null);
      optBits |= OPT_BIT_CONCEPT;
      return this;
    }

    /**
     * Initializes the optional value {@link ValueSet_Include#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for chained invocation
     */
    public final Builder extension(java.util.List<com.fhir.Extension> extension) {
      checkNotIsSet(extensionIsSet(), "extension");
      this.extension = java.util.Objects.requireNonNull(extension, "extension");
      optBits |= OPT_BIT_EXTENSION;
      return this;
    }

    /**
     * Initializes the optional value {@link ValueSet_Include#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("extension")
    public final Builder extension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> extension) {
      checkNotIsSet(extensionIsSet(), "extension");
      this.extension = extension.orElse(null);
      optBits |= OPT_BIT_EXTENSION;
      return this;
    }

    /**
     * Initializes the optional value {@link ValueSet_Include#filter() filter} to filter.
     * @param filter The value for filter
     * @return {@code this} builder for chained invocation
     */
    public final Builder filter(java.util.List<com.fhir.ValueSet_Filter> filter) {
      checkNotIsSet(filterIsSet(), "filter");
      this.filter = java.util.Objects.requireNonNull(filter, "filter");
      optBits |= OPT_BIT_FILTER;
      return this;
    }

    /**
     * Initializes the optional value {@link ValueSet_Include#filter() filter} to filter.
     * @param filter The value for filter
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("filter")
    public final Builder filter(java.util.Optional<? extends java.util.List<com.fhir.ValueSet_Filter>> filter) {
      checkNotIsSet(filterIsSet(), "filter");
      this.filter = filter.orElse(null);
      optBits |= OPT_BIT_FILTER;
      return this;
    }

    /**
     * Initializes the optional value {@link ValueSet_Include#valueSet() valueSet} to valueSet.
     * @param valueSet The value for valueSet
     * @return {@code this} builder for chained invocation
     */
    public final Builder valueSet(java.util.List<com.fhir.canonical> valueSet) {
      checkNotIsSet(valueSetIsSet(), "valueSet");
      this.valueSet = java.util.Objects.requireNonNull(valueSet, "valueSet");
      optBits |= OPT_BIT_VALUE_SET;
      return this;
    }

    /**
     * Initializes the optional value {@link ValueSet_Include#valueSet() valueSet} to valueSet.
     * @param valueSet The value for valueSet
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("valueSet")
    public final Builder valueSet(java.util.Optional<? extends java.util.List<com.fhir.canonical>> valueSet) {
      checkNotIsSet(valueSetIsSet(), "valueSet");
      this.valueSet = valueSet.orElse(null);
      optBits |= OPT_BIT_VALUE_SET;
      return this;
    }

    /**
     * Initializes the optional value {@link ValueSet_Include#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for chained invocation
     */
    public final Builder modifierExtension(java.util.List<com.fhir.Extension> modifierExtension) {
      checkNotIsSet(modifierExtensionIsSet(), "modifierExtension");
      this.modifierExtension = java.util.Objects.requireNonNull(modifierExtension, "modifierExtension");
      optBits |= OPT_BIT_MODIFIER_EXTENSION;
      return this;
    }

    /**
     * Initializes the optional value {@link ValueSet_Include#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("modifierExtension")
    public final Builder modifierExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> modifierExtension) {
      checkNotIsSet(modifierExtensionIsSet(), "modifierExtension");
      this.modifierExtension = modifierExtension.orElse(null);
      optBits |= OPT_BIT_MODIFIER_EXTENSION;
      return this;
    }

    /**
     * Builds a new {@link ValueSet_Include ValueSet_Include}.
     * @return An immutable instance of ValueSet_Include
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public com.fhir.ValueSet_Include build() {
      return new ImmutableValueSet_Include(id, system, version, concept, extension, filter, valueSet, modifierExtension);
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean systemIsSet() {
      return (optBits & OPT_BIT_SYSTEM) != 0;
    }

    private boolean versionIsSet() {
      return (optBits & OPT_BIT_VERSION) != 0;
    }

    private boolean conceptIsSet() {
      return (optBits & OPT_BIT_CONCEPT) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean filterIsSet() {
      return (optBits & OPT_BIT_FILTER) != 0;
    }

    private boolean valueSetIsSet() {
      return (optBits & OPT_BIT_VALUE_SET) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new java.lang.IllegalStateException("Builder of ValueSet_Include is strict, attribute is already set: ".concat(name));
    }
  }
}
