//-no-import-rewrite
package com.fhir;

import java.lang.Object;
import java.lang.String;
import java.lang.Float;
import java.lang.Double;

/**
 * Immutable implementation of {@link ExampleScenario_Instance}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableExampleScenario_Instance.builder()}.
 */
@org.immutables.value.Generated(from = "ExampleScenario_Instance", generator = "Immutables")
@SuppressWarnings({"all"})
@edu.umd.cs.findbugs.annotations.SuppressFBWarnings
@javax.annotation.ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@javax.annotation.concurrent.Immutable
@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableExampleScenario_Instance implements com.fhir.ExampleScenario_Instance {
  private final @javax.annotation.Nullable com.fhir.code resourceType;
  private final @javax.annotation.Nullable java.lang.String id;
  private final @javax.annotation.Nullable java.util.List<com.fhir.ExampleScenario_ContainedInstance> containedInstance;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension;
  private final @javax.annotation.Nullable java.util.List<com.fhir.ExampleScenario_Version> version;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension;
  private final @javax.annotation.Nullable com.fhir.markdown description;
  private final @javax.annotation.Nullable java.lang.String resourceId;
  private final @javax.annotation.Nullable java.lang.String name;

  private ImmutableExampleScenario_Instance(
      @javax.annotation.Nullable com.fhir.code resourceType,
      @javax.annotation.Nullable java.lang.String id,
      @javax.annotation.Nullable java.util.List<com.fhir.ExampleScenario_ContainedInstance> containedInstance,
      @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension,
      @javax.annotation.Nullable java.util.List<com.fhir.ExampleScenario_Version> version,
      @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension,
      @javax.annotation.Nullable com.fhir.markdown description,
      @javax.annotation.Nullable java.lang.String resourceId,
      @javax.annotation.Nullable java.lang.String name) {
    this.resourceType = resourceType;
    this.id = id;
    this.containedInstance = containedInstance;
    this.extension = extension;
    this.version = version;
    this.modifierExtension = modifierExtension;
    this.description = description;
    this.resourceId = resourceId;
    this.name = name;
  }

  /**
   * @return The value of the {@code resourceType} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("resourceType")
  @Override
  public java.util.Optional<com.fhir.code> resourceType() {
    return java.util.Optional.ofNullable(resourceType);
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
   * @return The value of the {@code containedInstance} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("containedInstance")
  @Override
  public java.util.Optional<java.util.List<com.fhir.ExampleScenario_ContainedInstance>> containedInstance() {
    return java.util.Optional.ofNullable(containedInstance);
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
   * @return The value of the {@code version} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("version")
  @Override
  public java.util.Optional<java.util.List<com.fhir.ExampleScenario_Version>> version() {
    return java.util.Optional.ofNullable(version);
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
   * @return The value of the {@code description} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("description")
  @Override
  public java.util.Optional<com.fhir.markdown> description() {
    return java.util.Optional.ofNullable(description);
  }

  /**
   * @return The value of the {@code resourceId} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("resourceId")
  @Override
  public java.util.Optional<java.lang.String> resourceId() {
    return java.util.Optional.ofNullable(resourceId);
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
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ExampleScenario_Instance#resourceType() resourceType} attribute.
   * @param value The value for resourceType
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExampleScenario_Instance withResourceType(com.fhir.code value) {
    @javax.annotation.Nullable com.fhir.code newValue = java.util.Objects.requireNonNull(value, "resourceType");
    if (this.resourceType == newValue) return this;
    return new ImmutableExampleScenario_Instance(
        newValue,
        this.id,
        this.containedInstance,
        this.extension,
        this.version,
        this.modifierExtension,
        this.description,
        this.resourceId,
        this.name);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ExampleScenario_Instance#resourceType() resourceType} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for resourceType
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableExampleScenario_Instance withResourceType(java.util.Optional<? extends com.fhir.code> optional) {
    @javax.annotation.Nullable com.fhir.code value = optional.orElse(null);
    if (this.resourceType == value) return this;
    return new ImmutableExampleScenario_Instance(
        value,
        this.id,
        this.containedInstance,
        this.extension,
        this.version,
        this.modifierExtension,
        this.description,
        this.resourceId,
        this.name);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ExampleScenario_Instance#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExampleScenario_Instance withId(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "id");
    if (java.util.Objects.equals(this.id, newValue)) return this;
    return new ImmutableExampleScenario_Instance(
        this.resourceType,
        newValue,
        this.containedInstance,
        this.extension,
        this.version,
        this.modifierExtension,
        this.description,
        this.resourceId,
        this.name);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ExampleScenario_Instance#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExampleScenario_Instance withId(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.id, value)) return this;
    return new ImmutableExampleScenario_Instance(
        this.resourceType,
        value,
        this.containedInstance,
        this.extension,
        this.version,
        this.modifierExtension,
        this.description,
        this.resourceId,
        this.name);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ExampleScenario_Instance#containedInstance() containedInstance} attribute.
   * @param value The value for containedInstance
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExampleScenario_Instance withContainedInstance(java.util.List<com.fhir.ExampleScenario_ContainedInstance> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.ExampleScenario_ContainedInstance> newValue = java.util.Objects.requireNonNull(value, "containedInstance");
    if (this.containedInstance == newValue) return this;
    return new ImmutableExampleScenario_Instance(
        this.resourceType,
        this.id,
        newValue,
        this.extension,
        this.version,
        this.modifierExtension,
        this.description,
        this.resourceId,
        this.name);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ExampleScenario_Instance#containedInstance() containedInstance} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for containedInstance
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableExampleScenario_Instance withContainedInstance(java.util.Optional<? extends java.util.List<com.fhir.ExampleScenario_ContainedInstance>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.ExampleScenario_ContainedInstance> value = optional.orElse(null);
    if (this.containedInstance == value) return this;
    return new ImmutableExampleScenario_Instance(
        this.resourceType,
        this.id,
        value,
        this.extension,
        this.version,
        this.modifierExtension,
        this.description,
        this.resourceId,
        this.name);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ExampleScenario_Instance#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExampleScenario_Instance withExtension(java.util.List<com.fhir.Extension> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> newValue = java.util.Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableExampleScenario_Instance(
        this.resourceType,
        this.id,
        this.containedInstance,
        newValue,
        this.version,
        this.modifierExtension,
        this.description,
        this.resourceId,
        this.name);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ExampleScenario_Instance#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableExampleScenario_Instance withExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableExampleScenario_Instance(
        this.resourceType,
        this.id,
        this.containedInstance,
        value,
        this.version,
        this.modifierExtension,
        this.description,
        this.resourceId,
        this.name);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ExampleScenario_Instance#version() version} attribute.
   * @param value The value for version
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExampleScenario_Instance withVersion(java.util.List<com.fhir.ExampleScenario_Version> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.ExampleScenario_Version> newValue = java.util.Objects.requireNonNull(value, "version");
    if (this.version == newValue) return this;
    return new ImmutableExampleScenario_Instance(
        this.resourceType,
        this.id,
        this.containedInstance,
        this.extension,
        newValue,
        this.modifierExtension,
        this.description,
        this.resourceId,
        this.name);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ExampleScenario_Instance#version() version} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for version
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableExampleScenario_Instance withVersion(java.util.Optional<? extends java.util.List<com.fhir.ExampleScenario_Version>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.ExampleScenario_Version> value = optional.orElse(null);
    if (this.version == value) return this;
    return new ImmutableExampleScenario_Instance(
        this.resourceType,
        this.id,
        this.containedInstance,
        this.extension,
        value,
        this.modifierExtension,
        this.description,
        this.resourceId,
        this.name);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ExampleScenario_Instance#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExampleScenario_Instance withModifierExtension(java.util.List<com.fhir.Extension> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> newValue = java.util.Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableExampleScenario_Instance(
        this.resourceType,
        this.id,
        this.containedInstance,
        this.extension,
        this.version,
        newValue,
        this.description,
        this.resourceId,
        this.name);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ExampleScenario_Instance#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableExampleScenario_Instance withModifierExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableExampleScenario_Instance(
        this.resourceType,
        this.id,
        this.containedInstance,
        this.extension,
        this.version,
        value,
        this.description,
        this.resourceId,
        this.name);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ExampleScenario_Instance#description() description} attribute.
   * @param value The value for description
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExampleScenario_Instance withDescription(com.fhir.markdown value) {
    @javax.annotation.Nullable com.fhir.markdown newValue = java.util.Objects.requireNonNull(value, "description");
    if (this.description == newValue) return this;
    return new ImmutableExampleScenario_Instance(
        this.resourceType,
        this.id,
        this.containedInstance,
        this.extension,
        this.version,
        this.modifierExtension,
        newValue,
        this.resourceId,
        this.name);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ExampleScenario_Instance#description() description} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for description
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableExampleScenario_Instance withDescription(java.util.Optional<? extends com.fhir.markdown> optional) {
    @javax.annotation.Nullable com.fhir.markdown value = optional.orElse(null);
    if (this.description == value) return this;
    return new ImmutableExampleScenario_Instance(
        this.resourceType,
        this.id,
        this.containedInstance,
        this.extension,
        this.version,
        this.modifierExtension,
        value,
        this.resourceId,
        this.name);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ExampleScenario_Instance#resourceId() resourceId} attribute.
   * @param value The value for resourceId
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExampleScenario_Instance withResourceId(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "resourceId");
    if (java.util.Objects.equals(this.resourceId, newValue)) return this;
    return new ImmutableExampleScenario_Instance(
        this.resourceType,
        this.id,
        this.containedInstance,
        this.extension,
        this.version,
        this.modifierExtension,
        this.description,
        newValue,
        this.name);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ExampleScenario_Instance#resourceId() resourceId} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for resourceId
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExampleScenario_Instance withResourceId(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.resourceId, value)) return this;
    return new ImmutableExampleScenario_Instance(
        this.resourceType,
        this.id,
        this.containedInstance,
        this.extension,
        this.version,
        this.modifierExtension,
        this.description,
        value,
        this.name);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ExampleScenario_Instance#name() name} attribute.
   * @param value The value for name
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExampleScenario_Instance withName(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "name");
    if (java.util.Objects.equals(this.name, newValue)) return this;
    return new ImmutableExampleScenario_Instance(
        this.resourceType,
        this.id,
        this.containedInstance,
        this.extension,
        this.version,
        this.modifierExtension,
        this.description,
        this.resourceId,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ExampleScenario_Instance#name() name} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for name
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExampleScenario_Instance withName(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.name, value)) return this;
    return new ImmutableExampleScenario_Instance(
        this.resourceType,
        this.id,
        this.containedInstance,
        this.extension,
        this.version,
        this.modifierExtension,
        this.description,
        this.resourceId,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableExampleScenario_Instance} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@javax.annotation.Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableExampleScenario_Instance
        && equalTo((ImmutableExampleScenario_Instance) another);
  }

  private boolean equalTo(ImmutableExampleScenario_Instance another) {
    return java.util.Objects.equals(resourceType, another.resourceType)
        && java.util.Objects.equals(id, another.id)
        && java.util.Objects.equals(containedInstance, another.containedInstance)
        && java.util.Objects.equals(extension, another.extension)
        && java.util.Objects.equals(version, another.version)
        && java.util.Objects.equals(modifierExtension, another.modifierExtension)
        && java.util.Objects.equals(description, another.description)
        && java.util.Objects.equals(resourceId, another.resourceId)
        && java.util.Objects.equals(name, another.name);
  }

  /**
   * Computes a hash code from attributes: {@code resourceType}, {@code id}, {@code containedInstance}, {@code extension}, {@code version}, {@code modifierExtension}, {@code description}, {@code resourceId}, {@code name}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + java.util.Objects.hashCode(resourceType);
    h += (h << 5) + java.util.Objects.hashCode(id);
    h += (h << 5) + java.util.Objects.hashCode(containedInstance);
    h += (h << 5) + java.util.Objects.hashCode(extension);
    h += (h << 5) + java.util.Objects.hashCode(version);
    h += (h << 5) + java.util.Objects.hashCode(modifierExtension);
    h += (h << 5) + java.util.Objects.hashCode(description);
    h += (h << 5) + java.util.Objects.hashCode(resourceId);
    h += (h << 5) + java.util.Objects.hashCode(name);
    return h;
  }

  /**
   * Prints the immutable value {@code ExampleScenario_Instance} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    java.lang.StringBuilder builder = new java.lang.StringBuilder("ExampleScenario_Instance{");
    if (resourceType != null) {
      builder.append("resourceType=").append(resourceType);
    }
    if (id != null) {
      if (builder.length() > 25) builder.append(", ");
      builder.append("id=").append(id);
    }
    if (containedInstance != null) {
      if (builder.length() > 25) builder.append(", ");
      builder.append("containedInstance=").append(containedInstance);
    }
    if (extension != null) {
      if (builder.length() > 25) builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (version != null) {
      if (builder.length() > 25) builder.append(", ");
      builder.append("version=").append(version);
    }
    if (modifierExtension != null) {
      if (builder.length() > 25) builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (description != null) {
      if (builder.length() > 25) builder.append(", ");
      builder.append("description=").append(description);
    }
    if (resourceId != null) {
      if (builder.length() > 25) builder.append(", ");
      builder.append("resourceId=").append(resourceId);
    }
    if (name != null) {
      if (builder.length() > 25) builder.append(", ");
      builder.append("name=").append(name);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @org.immutables.value.Generated(from = "ExampleScenario_Instance", generator = "Immutables")
  @Deprecated
  @com.fasterxml.jackson.databind.annotation.JsonDeserialize
  @com.fasterxml.jackson.annotation.JsonAutoDetect(fieldVisibility = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.NONE)
  static final class Json implements com.fhir.ExampleScenario_Instance {
    @javax.annotation.Nullable java.util.Optional<com.fhir.code> resourceType = java.util.Optional.empty();
    boolean resourceTypeIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.String> id = java.util.Optional.empty();
    boolean idIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.ExampleScenario_ContainedInstance>> containedInstance = java.util.Optional.empty();
    boolean containedInstanceIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Extension>> extension = java.util.Optional.empty();
    boolean extensionIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.ExampleScenario_Version>> version = java.util.Optional.empty();
    boolean versionIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension = java.util.Optional.empty();
    boolean modifierExtensionIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.markdown> description = java.util.Optional.empty();
    boolean descriptionIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.String> resourceId = java.util.Optional.empty();
    boolean resourceIdIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.String> name = java.util.Optional.empty();
    boolean nameIsSet;
    @com.fasterxml.jackson.annotation.JsonProperty("resourceType")
    public void setResourceType(java.util.Optional<com.fhir.code> resourceType) {
      this.resourceType = resourceType;
      this.resourceTypeIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    public void setId(java.util.Optional<java.lang.String> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("containedInstance")
    public void setContainedInstance(java.util.Optional<java.util.List<com.fhir.ExampleScenario_ContainedInstance>> containedInstance) {
      this.containedInstance = containedInstance;
      this.containedInstanceIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("extension")
    public void setExtension(java.util.Optional<java.util.List<com.fhir.Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("version")
    public void setVersion(java.util.Optional<java.util.List<com.fhir.ExampleScenario_Version>> version) {
      this.version = version;
      this.versionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("modifierExtension")
    public void setModifierExtension(java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    public void setDescription(java.util.Optional<com.fhir.markdown> description) {
      this.description = description;
      this.descriptionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("resourceId")
    public void setResourceId(java.util.Optional<java.lang.String> resourceId) {
      this.resourceId = resourceId;
      this.resourceIdIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    public void setName(java.util.Optional<java.lang.String> name) {
      this.name = name;
      this.nameIsSet = true;
    }
    @Override
    public java.util.Optional<com.fhir.code> resourceType() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.String> id() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.ExampleScenario_ContainedInstance>> containedInstance() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.ExampleScenario_Version>> version() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.markdown> description() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.String> resourceId() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.String> name() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @com.fasterxml.jackson.annotation.JsonCreator(mode = com.fasterxml.jackson.annotation.JsonCreator.Mode.DELEGATING)
  static ImmutableExampleScenario_Instance fromJson(Json json) {
    ImmutableExampleScenario_Instance.Builder builder = ImmutableExampleScenario_Instance.builder();
    if (json.resourceTypeIsSet) {
      builder.resourceType(json.resourceType);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.containedInstanceIsSet) {
      builder.containedInstance(json.containedInstance);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.versionIsSet) {
      builder.version(json.version);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.descriptionIsSet) {
      builder.description(json.description);
    }
    if (json.resourceIdIsSet) {
      builder.resourceId(json.resourceId);
    }
    if (json.nameIsSet) {
      builder.name(json.name);
    }
    return (ImmutableExampleScenario_Instance) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link ExampleScenario_Instance} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable ExampleScenario_Instance instance
   */
  public static ExampleScenario_Instance copyOf(ExampleScenario_Instance instance) {
    if (instance instanceof ImmutableExampleScenario_Instance) {
      return (ImmutableExampleScenario_Instance) instance;
    }
    return ImmutableExampleScenario_Instance.builder()
        .resourceType(instance.resourceType())
        .id(instance.id())
        .containedInstance(instance.containedInstance())
        .extension(instance.extension())
        .version(instance.version())
        .modifierExtension(instance.modifierExtension())
        .description(instance.description())
        .resourceId(instance.resourceId())
        .name(instance.name())
        .build();
  }

  /**
   * Creates a builder for {@link ExampleScenario_Instance ExampleScenario_Instance}.
   * <pre>
   * ImmutableExampleScenario_Instance.builder()
   *    .resourceType(com.fhir.code) // optional {@link ExampleScenario_Instance#resourceType() resourceType}
   *    .id(String) // optional {@link ExampleScenario_Instance#id() id}
   *    .containedInstance(List&amp;lt;com.fhir.ExampleScenario_ContainedInstance&amp;gt;) // optional {@link ExampleScenario_Instance#containedInstance() containedInstance}
   *    .extension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link ExampleScenario_Instance#extension() extension}
   *    .version(List&amp;lt;com.fhir.ExampleScenario_Version&amp;gt;) // optional {@link ExampleScenario_Instance#version() version}
   *    .modifierExtension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link ExampleScenario_Instance#modifierExtension() modifierExtension}
   *    .description(com.fhir.markdown) // optional {@link ExampleScenario_Instance#description() description}
   *    .resourceId(String) // optional {@link ExampleScenario_Instance#resourceId() resourceId}
   *    .name(String) // optional {@link ExampleScenario_Instance#name() name}
   *    .build();
   * </pre>
   * @return A new ExampleScenario_Instance builder
   */
  public static ImmutableExampleScenario_Instance.Builder builder() {
    return new ImmutableExampleScenario_Instance.Builder();
  }

  /**
   * Builds instances of type {@link ExampleScenario_Instance ExampleScenario_Instance}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @org.immutables.value.Generated(from = "ExampleScenario_Instance", generator = "Immutables")
  @javax.annotation.concurrent.NotThreadSafe
  public static final class Builder {
    private static final long OPT_BIT_RESOURCE_TYPE = 0x1L;
    private static final long OPT_BIT_ID = 0x2L;
    private static final long OPT_BIT_CONTAINED_INSTANCE = 0x4L;
    private static final long OPT_BIT_EXTENSION = 0x8L;
    private static final long OPT_BIT_VERSION = 0x10L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x20L;
    private static final long OPT_BIT_DESCRIPTION = 0x40L;
    private static final long OPT_BIT_RESOURCE_ID = 0x80L;
    private static final long OPT_BIT_NAME = 0x100L;
    private long optBits;

    private @javax.annotation.Nullable com.fhir.code resourceType;
    private @javax.annotation.Nullable java.lang.String id;
    private @javax.annotation.Nullable java.util.List<com.fhir.ExampleScenario_ContainedInstance> containedInstance;
    private @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension;
    private @javax.annotation.Nullable java.util.List<com.fhir.ExampleScenario_Version> version;
    private @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension;
    private @javax.annotation.Nullable com.fhir.markdown description;
    private @javax.annotation.Nullable java.lang.String resourceId;
    private @javax.annotation.Nullable java.lang.String name;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link ExampleScenario_Instance#resourceType() resourceType} to resourceType.
     * @param resourceType The value for resourceType
     * @return {@code this} builder for chained invocation
     */
    public final Builder resourceType(com.fhir.code resourceType) {
      checkNotIsSet(resourceTypeIsSet(), "resourceType");
      this.resourceType = java.util.Objects.requireNonNull(resourceType, "resourceType");
      optBits |= OPT_BIT_RESOURCE_TYPE;
      return this;
    }

    /**
     * Initializes the optional value {@link ExampleScenario_Instance#resourceType() resourceType} to resourceType.
     * @param resourceType The value for resourceType
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("resourceType")
    public final Builder resourceType(java.util.Optional<? extends com.fhir.code> resourceType) {
      checkNotIsSet(resourceTypeIsSet(), "resourceType");
      this.resourceType = resourceType.orElse(null);
      optBits |= OPT_BIT_RESOURCE_TYPE;
      return this;
    }

    /**
     * Initializes the optional value {@link ExampleScenario_Instance#id() id} to id.
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
     * Initializes the optional value {@link ExampleScenario_Instance#id() id} to id.
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
     * Initializes the optional value {@link ExampleScenario_Instance#containedInstance() containedInstance} to containedInstance.
     * @param containedInstance The value for containedInstance
     * @return {@code this} builder for chained invocation
     */
    public final Builder containedInstance(java.util.List<com.fhir.ExampleScenario_ContainedInstance> containedInstance) {
      checkNotIsSet(containedInstanceIsSet(), "containedInstance");
      this.containedInstance = java.util.Objects.requireNonNull(containedInstance, "containedInstance");
      optBits |= OPT_BIT_CONTAINED_INSTANCE;
      return this;
    }

    /**
     * Initializes the optional value {@link ExampleScenario_Instance#containedInstance() containedInstance} to containedInstance.
     * @param containedInstance The value for containedInstance
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("containedInstance")
    public final Builder containedInstance(java.util.Optional<? extends java.util.List<com.fhir.ExampleScenario_ContainedInstance>> containedInstance) {
      checkNotIsSet(containedInstanceIsSet(), "containedInstance");
      this.containedInstance = containedInstance.orElse(null);
      optBits |= OPT_BIT_CONTAINED_INSTANCE;
      return this;
    }

    /**
     * Initializes the optional value {@link ExampleScenario_Instance#extension() extension} to extension.
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
     * Initializes the optional value {@link ExampleScenario_Instance#extension() extension} to extension.
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
     * Initializes the optional value {@link ExampleScenario_Instance#version() version} to version.
     * @param version The value for version
     * @return {@code this} builder for chained invocation
     */
    public final Builder version(java.util.List<com.fhir.ExampleScenario_Version> version) {
      checkNotIsSet(versionIsSet(), "version");
      this.version = java.util.Objects.requireNonNull(version, "version");
      optBits |= OPT_BIT_VERSION;
      return this;
    }

    /**
     * Initializes the optional value {@link ExampleScenario_Instance#version() version} to version.
     * @param version The value for version
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("version")
    public final Builder version(java.util.Optional<? extends java.util.List<com.fhir.ExampleScenario_Version>> version) {
      checkNotIsSet(versionIsSet(), "version");
      this.version = version.orElse(null);
      optBits |= OPT_BIT_VERSION;
      return this;
    }

    /**
     * Initializes the optional value {@link ExampleScenario_Instance#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link ExampleScenario_Instance#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link ExampleScenario_Instance#description() description} to description.
     * @param description The value for description
     * @return {@code this} builder for chained invocation
     */
    public final Builder description(com.fhir.markdown description) {
      checkNotIsSet(descriptionIsSet(), "description");
      this.description = java.util.Objects.requireNonNull(description, "description");
      optBits |= OPT_BIT_DESCRIPTION;
      return this;
    }

    /**
     * Initializes the optional value {@link ExampleScenario_Instance#description() description} to description.
     * @param description The value for description
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    public final Builder description(java.util.Optional<? extends com.fhir.markdown> description) {
      checkNotIsSet(descriptionIsSet(), "description");
      this.description = description.orElse(null);
      optBits |= OPT_BIT_DESCRIPTION;
      return this;
    }

    /**
     * Initializes the optional value {@link ExampleScenario_Instance#resourceId() resourceId} to resourceId.
     * @param resourceId The value for resourceId
     * @return {@code this} builder for chained invocation
     */
    public final Builder resourceId(java.lang.String resourceId) {
      checkNotIsSet(resourceIdIsSet(), "resourceId");
      this.resourceId = java.util.Objects.requireNonNull(resourceId, "resourceId");
      optBits |= OPT_BIT_RESOURCE_ID;
      return this;
    }

    /**
     * Initializes the optional value {@link ExampleScenario_Instance#resourceId() resourceId} to resourceId.
     * @param resourceId The value for resourceId
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("resourceId")
    public final Builder resourceId(java.util.Optional<java.lang.String> resourceId) {
      checkNotIsSet(resourceIdIsSet(), "resourceId");
      this.resourceId = resourceId.orElse(null);
      optBits |= OPT_BIT_RESOURCE_ID;
      return this;
    }

    /**
     * Initializes the optional value {@link ExampleScenario_Instance#name() name} to name.
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
     * Initializes the optional value {@link ExampleScenario_Instance#name() name} to name.
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
     * Builds a new {@link ExampleScenario_Instance ExampleScenario_Instance}.
     * @return An immutable instance of ExampleScenario_Instance
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public com.fhir.ExampleScenario_Instance build() {
      return new ImmutableExampleScenario_Instance(
          resourceType,
          id,
          containedInstance,
          extension,
          version,
          modifierExtension,
          description,
          resourceId,
          name);
    }

    private boolean resourceTypeIsSet() {
      return (optBits & OPT_BIT_RESOURCE_TYPE) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean containedInstanceIsSet() {
      return (optBits & OPT_BIT_CONTAINED_INSTANCE) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean versionIsSet() {
      return (optBits & OPT_BIT_VERSION) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean descriptionIsSet() {
      return (optBits & OPT_BIT_DESCRIPTION) != 0;
    }

    private boolean resourceIdIsSet() {
      return (optBits & OPT_BIT_RESOURCE_ID) != 0;
    }

    private boolean nameIsSet() {
      return (optBits & OPT_BIT_NAME) != 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new java.lang.IllegalStateException("Builder of ExampleScenario_Instance is strict, attribute is already set: ".concat(name));
    }
  }
}
