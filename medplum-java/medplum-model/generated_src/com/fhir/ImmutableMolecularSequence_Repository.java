//-no-import-rewrite
package com.fhir;

import java.lang.Object;
import java.lang.String;
import java.lang.Float;
import java.lang.Double;

/**
 * Immutable implementation of {@link MolecularSequence_Repository}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableMolecularSequence_Repository.builder()}.
 */
@org.immutables.value.Generated(from = "MolecularSequence_Repository", generator = "Immutables")
@SuppressWarnings({"all"})
@edu.umd.cs.findbugs.annotations.SuppressFBWarnings
@javax.annotation.ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@javax.annotation.concurrent.Immutable
@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableMolecularSequence_Repository implements com.fhir.MolecularSequence_Repository {
  private final @javax.annotation.Nullable java.lang.String id;
  private final @javax.annotation.Nullable java.lang.String name;
  private final @javax.annotation.Nullable com.fhir.Molecularsequence_repositoryType type;
  private final @javax.annotation.Nullable java.lang.String variantsetId;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension;
  private final @javax.annotation.Nullable java.lang.String datasetId;
  private final @javax.annotation.Nullable java.lang.String readsetId;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension;
  private final @javax.annotation.Nullable com.fhir.uri url;

  private ImmutableMolecularSequence_Repository(
      @javax.annotation.Nullable java.lang.String id,
      @javax.annotation.Nullable java.lang.String name,
      @javax.annotation.Nullable com.fhir.Molecularsequence_repositoryType type,
      @javax.annotation.Nullable java.lang.String variantsetId,
      @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension,
      @javax.annotation.Nullable java.lang.String datasetId,
      @javax.annotation.Nullable java.lang.String readsetId,
      @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension,
      @javax.annotation.Nullable com.fhir.uri url) {
    this.id = id;
    this.name = name;
    this.type = type;
    this.variantsetId = variantsetId;
    this.modifierExtension = modifierExtension;
    this.datasetId = datasetId;
    this.readsetId = readsetId;
    this.extension = extension;
    this.url = url;
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
   * @return The value of the {@code name} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("name")
  @Override
  public java.util.Optional<java.lang.String> name() {
    return java.util.Optional.ofNullable(name);
  }

  /**
   * @return The value of the {@code type} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("type")
  @Override
  public java.util.Optional<com.fhir.Molecularsequence_repositoryType> type() {
    return java.util.Optional.ofNullable(type);
  }

  /**
   * @return The value of the {@code variantsetId} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("variantsetId")
  @Override
  public java.util.Optional<java.lang.String> variantsetId() {
    return java.util.Optional.ofNullable(variantsetId);
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
   * @return The value of the {@code datasetId} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("datasetId")
  @Override
  public java.util.Optional<java.lang.String> datasetId() {
    return java.util.Optional.ofNullable(datasetId);
  }

  /**
   * @return The value of the {@code readsetId} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("readsetId")
  @Override
  public java.util.Optional<java.lang.String> readsetId() {
    return java.util.Optional.ofNullable(readsetId);
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
   * @return The value of the {@code url} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("url")
  @Override
  public java.util.Optional<com.fhir.uri> url() {
    return java.util.Optional.ofNullable(url);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MolecularSequence_Repository#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMolecularSequence_Repository withId(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "id");
    if (java.util.Objects.equals(this.id, newValue)) return this;
    return new ImmutableMolecularSequence_Repository(
        newValue,
        this.name,
        this.type,
        this.variantsetId,
        this.modifierExtension,
        this.datasetId,
        this.readsetId,
        this.extension,
        this.url);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MolecularSequence_Repository#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMolecularSequence_Repository withId(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.id, value)) return this;
    return new ImmutableMolecularSequence_Repository(
        value,
        this.name,
        this.type,
        this.variantsetId,
        this.modifierExtension,
        this.datasetId,
        this.readsetId,
        this.extension,
        this.url);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MolecularSequence_Repository#name() name} attribute.
   * @param value The value for name
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMolecularSequence_Repository withName(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "name");
    if (java.util.Objects.equals(this.name, newValue)) return this;
    return new ImmutableMolecularSequence_Repository(
        this.id,
        newValue,
        this.type,
        this.variantsetId,
        this.modifierExtension,
        this.datasetId,
        this.readsetId,
        this.extension,
        this.url);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MolecularSequence_Repository#name() name} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for name
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMolecularSequence_Repository withName(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.name, value)) return this;
    return new ImmutableMolecularSequence_Repository(
        this.id,
        value,
        this.type,
        this.variantsetId,
        this.modifierExtension,
        this.datasetId,
        this.readsetId,
        this.extension,
        this.url);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MolecularSequence_Repository#type() type} attribute.
   * @param value The value for type
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMolecularSequence_Repository withType(com.fhir.Molecularsequence_repositoryType value) {
    @javax.annotation.Nullable com.fhir.Molecularsequence_repositoryType newValue = java.util.Objects.requireNonNull(value, "type");
    if (this.type == newValue) return this;
    return new ImmutableMolecularSequence_Repository(
        this.id,
        this.name,
        newValue,
        this.variantsetId,
        this.modifierExtension,
        this.datasetId,
        this.readsetId,
        this.extension,
        this.url);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MolecularSequence_Repository#type() type} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for type
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMolecularSequence_Repository withType(java.util.Optional<? extends com.fhir.Molecularsequence_repositoryType> optional) {
    @javax.annotation.Nullable com.fhir.Molecularsequence_repositoryType value = optional.orElse(null);
    if (this.type == value) return this;
    return new ImmutableMolecularSequence_Repository(
        this.id,
        this.name,
        value,
        this.variantsetId,
        this.modifierExtension,
        this.datasetId,
        this.readsetId,
        this.extension,
        this.url);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MolecularSequence_Repository#variantsetId() variantsetId} attribute.
   * @param value The value for variantsetId
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMolecularSequence_Repository withVariantsetId(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "variantsetId");
    if (java.util.Objects.equals(this.variantsetId, newValue)) return this;
    return new ImmutableMolecularSequence_Repository(
        this.id,
        this.name,
        this.type,
        newValue,
        this.modifierExtension,
        this.datasetId,
        this.readsetId,
        this.extension,
        this.url);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MolecularSequence_Repository#variantsetId() variantsetId} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for variantsetId
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMolecularSequence_Repository withVariantsetId(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.variantsetId, value)) return this;
    return new ImmutableMolecularSequence_Repository(
        this.id,
        this.name,
        this.type,
        value,
        this.modifierExtension,
        this.datasetId,
        this.readsetId,
        this.extension,
        this.url);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MolecularSequence_Repository#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMolecularSequence_Repository withModifierExtension(java.util.List<com.fhir.Extension> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> newValue = java.util.Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableMolecularSequence_Repository(
        this.id,
        this.name,
        this.type,
        this.variantsetId,
        newValue,
        this.datasetId,
        this.readsetId,
        this.extension,
        this.url);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MolecularSequence_Repository#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMolecularSequence_Repository withModifierExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableMolecularSequence_Repository(
        this.id,
        this.name,
        this.type,
        this.variantsetId,
        value,
        this.datasetId,
        this.readsetId,
        this.extension,
        this.url);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MolecularSequence_Repository#datasetId() datasetId} attribute.
   * @param value The value for datasetId
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMolecularSequence_Repository withDatasetId(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "datasetId");
    if (java.util.Objects.equals(this.datasetId, newValue)) return this;
    return new ImmutableMolecularSequence_Repository(
        this.id,
        this.name,
        this.type,
        this.variantsetId,
        this.modifierExtension,
        newValue,
        this.readsetId,
        this.extension,
        this.url);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MolecularSequence_Repository#datasetId() datasetId} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for datasetId
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMolecularSequence_Repository withDatasetId(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.datasetId, value)) return this;
    return new ImmutableMolecularSequence_Repository(
        this.id,
        this.name,
        this.type,
        this.variantsetId,
        this.modifierExtension,
        value,
        this.readsetId,
        this.extension,
        this.url);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MolecularSequence_Repository#readsetId() readsetId} attribute.
   * @param value The value for readsetId
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMolecularSequence_Repository withReadsetId(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "readsetId");
    if (java.util.Objects.equals(this.readsetId, newValue)) return this;
    return new ImmutableMolecularSequence_Repository(
        this.id,
        this.name,
        this.type,
        this.variantsetId,
        this.modifierExtension,
        this.datasetId,
        newValue,
        this.extension,
        this.url);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MolecularSequence_Repository#readsetId() readsetId} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for readsetId
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMolecularSequence_Repository withReadsetId(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.readsetId, value)) return this;
    return new ImmutableMolecularSequence_Repository(
        this.id,
        this.name,
        this.type,
        this.variantsetId,
        this.modifierExtension,
        this.datasetId,
        value,
        this.extension,
        this.url);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MolecularSequence_Repository#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMolecularSequence_Repository withExtension(java.util.List<com.fhir.Extension> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> newValue = java.util.Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableMolecularSequence_Repository(
        this.id,
        this.name,
        this.type,
        this.variantsetId,
        this.modifierExtension,
        this.datasetId,
        this.readsetId,
        newValue,
        this.url);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MolecularSequence_Repository#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMolecularSequence_Repository withExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableMolecularSequence_Repository(
        this.id,
        this.name,
        this.type,
        this.variantsetId,
        this.modifierExtension,
        this.datasetId,
        this.readsetId,
        value,
        this.url);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MolecularSequence_Repository#url() url} attribute.
   * @param value The value for url
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMolecularSequence_Repository withUrl(com.fhir.uri value) {
    @javax.annotation.Nullable com.fhir.uri newValue = java.util.Objects.requireNonNull(value, "url");
    if (this.url == newValue) return this;
    return new ImmutableMolecularSequence_Repository(
        this.id,
        this.name,
        this.type,
        this.variantsetId,
        this.modifierExtension,
        this.datasetId,
        this.readsetId,
        this.extension,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MolecularSequence_Repository#url() url} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for url
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMolecularSequence_Repository withUrl(java.util.Optional<? extends com.fhir.uri> optional) {
    @javax.annotation.Nullable com.fhir.uri value = optional.orElse(null);
    if (this.url == value) return this;
    return new ImmutableMolecularSequence_Repository(
        this.id,
        this.name,
        this.type,
        this.variantsetId,
        this.modifierExtension,
        this.datasetId,
        this.readsetId,
        this.extension,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableMolecularSequence_Repository} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@javax.annotation.Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableMolecularSequence_Repository
        && equalTo((ImmutableMolecularSequence_Repository) another);
  }

  private boolean equalTo(ImmutableMolecularSequence_Repository another) {
    return java.util.Objects.equals(id, another.id)
        && java.util.Objects.equals(name, another.name)
        && java.util.Objects.equals(type, another.type)
        && java.util.Objects.equals(variantsetId, another.variantsetId)
        && java.util.Objects.equals(modifierExtension, another.modifierExtension)
        && java.util.Objects.equals(datasetId, another.datasetId)
        && java.util.Objects.equals(readsetId, another.readsetId)
        && java.util.Objects.equals(extension, another.extension)
        && java.util.Objects.equals(url, another.url);
  }

  /**
   * Computes a hash code from attributes: {@code id}, {@code name}, {@code type}, {@code variantsetId}, {@code modifierExtension}, {@code datasetId}, {@code readsetId}, {@code extension}, {@code url}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + java.util.Objects.hashCode(id);
    h += (h << 5) + java.util.Objects.hashCode(name);
    h += (h << 5) + java.util.Objects.hashCode(type);
    h += (h << 5) + java.util.Objects.hashCode(variantsetId);
    h += (h << 5) + java.util.Objects.hashCode(modifierExtension);
    h += (h << 5) + java.util.Objects.hashCode(datasetId);
    h += (h << 5) + java.util.Objects.hashCode(readsetId);
    h += (h << 5) + java.util.Objects.hashCode(extension);
    h += (h << 5) + java.util.Objects.hashCode(url);
    return h;
  }

  /**
   * Prints the immutable value {@code MolecularSequence_Repository} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    java.lang.StringBuilder builder = new java.lang.StringBuilder("MolecularSequence_Repository{");
    if (id != null) {
      builder.append("id=").append(id);
    }
    if (name != null) {
      if (builder.length() > 29) builder.append(", ");
      builder.append("name=").append(name);
    }
    if (type != null) {
      if (builder.length() > 29) builder.append(", ");
      builder.append("type=").append(type);
    }
    if (variantsetId != null) {
      if (builder.length() > 29) builder.append(", ");
      builder.append("variantsetId=").append(variantsetId);
    }
    if (modifierExtension != null) {
      if (builder.length() > 29) builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (datasetId != null) {
      if (builder.length() > 29) builder.append(", ");
      builder.append("datasetId=").append(datasetId);
    }
    if (readsetId != null) {
      if (builder.length() > 29) builder.append(", ");
      builder.append("readsetId=").append(readsetId);
    }
    if (extension != null) {
      if (builder.length() > 29) builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (url != null) {
      if (builder.length() > 29) builder.append(", ");
      builder.append("url=").append(url);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @org.immutables.value.Generated(from = "MolecularSequence_Repository", generator = "Immutables")
  @Deprecated
  @com.fasterxml.jackson.databind.annotation.JsonDeserialize
  @com.fasterxml.jackson.annotation.JsonAutoDetect(fieldVisibility = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.NONE)
  static final class Json implements com.fhir.MolecularSequence_Repository {
    @javax.annotation.Nullable java.util.Optional<java.lang.String> id = java.util.Optional.empty();
    boolean idIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.String> name = java.util.Optional.empty();
    boolean nameIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Molecularsequence_repositoryType> type = java.util.Optional.empty();
    boolean typeIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.String> variantsetId = java.util.Optional.empty();
    boolean variantsetIdIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension = java.util.Optional.empty();
    boolean modifierExtensionIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.String> datasetId = java.util.Optional.empty();
    boolean datasetIdIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.String> readsetId = java.util.Optional.empty();
    boolean readsetIdIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Extension>> extension = java.util.Optional.empty();
    boolean extensionIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.uri> url = java.util.Optional.empty();
    boolean urlIsSet;
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    public void setId(java.util.Optional<java.lang.String> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    public void setName(java.util.Optional<java.lang.String> name) {
      this.name = name;
      this.nameIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("type")
    public void setType(java.util.Optional<com.fhir.Molecularsequence_repositoryType> type) {
      this.type = type;
      this.typeIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("variantsetId")
    public void setVariantsetId(java.util.Optional<java.lang.String> variantsetId) {
      this.variantsetId = variantsetId;
      this.variantsetIdIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("modifierExtension")
    public void setModifierExtension(java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("datasetId")
    public void setDatasetId(java.util.Optional<java.lang.String> datasetId) {
      this.datasetId = datasetId;
      this.datasetIdIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("readsetId")
    public void setReadsetId(java.util.Optional<java.lang.String> readsetId) {
      this.readsetId = readsetId;
      this.readsetIdIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("extension")
    public void setExtension(java.util.Optional<java.util.List<com.fhir.Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("url")
    public void setUrl(java.util.Optional<com.fhir.uri> url) {
      this.url = url;
      this.urlIsSet = true;
    }
    @Override
    public java.util.Optional<java.lang.String> id() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.String> name() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Molecularsequence_repositoryType> type() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.String> variantsetId() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.String> datasetId() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.String> readsetId() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.uri> url() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @com.fasterxml.jackson.annotation.JsonCreator(mode = com.fasterxml.jackson.annotation.JsonCreator.Mode.DELEGATING)
  static ImmutableMolecularSequence_Repository fromJson(Json json) {
    ImmutableMolecularSequence_Repository.Builder builder = ImmutableMolecularSequence_Repository.builder();
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.nameIsSet) {
      builder.name(json.name);
    }
    if (json.typeIsSet) {
      builder.type(json.type);
    }
    if (json.variantsetIdIsSet) {
      builder.variantsetId(json.variantsetId);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.datasetIdIsSet) {
      builder.datasetId(json.datasetId);
    }
    if (json.readsetIdIsSet) {
      builder.readsetId(json.readsetId);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.urlIsSet) {
      builder.url(json.url);
    }
    return (ImmutableMolecularSequence_Repository) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link MolecularSequence_Repository} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable MolecularSequence_Repository instance
   */
  public static MolecularSequence_Repository copyOf(MolecularSequence_Repository instance) {
    if (instance instanceof ImmutableMolecularSequence_Repository) {
      return (ImmutableMolecularSequence_Repository) instance;
    }
    return ImmutableMolecularSequence_Repository.builder()
        .id(instance.id())
        .name(instance.name())
        .type(instance.type())
        .variantsetId(instance.variantsetId())
        .modifierExtension(instance.modifierExtension())
        .datasetId(instance.datasetId())
        .readsetId(instance.readsetId())
        .extension(instance.extension())
        .url(instance.url())
        .build();
  }

  /**
   * Creates a builder for {@link MolecularSequence_Repository MolecularSequence_Repository}.
   * <pre>
   * ImmutableMolecularSequence_Repository.builder()
   *    .id(String) // optional {@link MolecularSequence_Repository#id() id}
   *    .name(String) // optional {@link MolecularSequence_Repository#name() name}
   *    .type(com.fhir.Molecularsequence_repositoryType) // optional {@link MolecularSequence_Repository#type() type}
   *    .variantsetId(String) // optional {@link MolecularSequence_Repository#variantsetId() variantsetId}
   *    .modifierExtension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link MolecularSequence_Repository#modifierExtension() modifierExtension}
   *    .datasetId(String) // optional {@link MolecularSequence_Repository#datasetId() datasetId}
   *    .readsetId(String) // optional {@link MolecularSequence_Repository#readsetId() readsetId}
   *    .extension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link MolecularSequence_Repository#extension() extension}
   *    .url(com.fhir.uri) // optional {@link MolecularSequence_Repository#url() url}
   *    .build();
   * </pre>
   * @return A new MolecularSequence_Repository builder
   */
  public static ImmutableMolecularSequence_Repository.Builder builder() {
    return new ImmutableMolecularSequence_Repository.Builder();
  }

  /**
   * Builds instances of type {@link MolecularSequence_Repository MolecularSequence_Repository}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @org.immutables.value.Generated(from = "MolecularSequence_Repository", generator = "Immutables")
  @javax.annotation.concurrent.NotThreadSafe
  public static final class Builder {
    private static final long OPT_BIT_ID = 0x1L;
    private static final long OPT_BIT_NAME = 0x2L;
    private static final long OPT_BIT_TYPE = 0x4L;
    private static final long OPT_BIT_VARIANTSET_ID = 0x8L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x10L;
    private static final long OPT_BIT_DATASET_ID = 0x20L;
    private static final long OPT_BIT_READSET_ID = 0x40L;
    private static final long OPT_BIT_EXTENSION = 0x80L;
    private static final long OPT_BIT_URL = 0x100L;
    private long optBits;

    private @javax.annotation.Nullable java.lang.String id;
    private @javax.annotation.Nullable java.lang.String name;
    private @javax.annotation.Nullable com.fhir.Molecularsequence_repositoryType type;
    private @javax.annotation.Nullable java.lang.String variantsetId;
    private @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension;
    private @javax.annotation.Nullable java.lang.String datasetId;
    private @javax.annotation.Nullable java.lang.String readsetId;
    private @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension;
    private @javax.annotation.Nullable com.fhir.uri url;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link MolecularSequence_Repository#id() id} to id.
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
     * Initializes the optional value {@link MolecularSequence_Repository#id() id} to id.
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
     * Initializes the optional value {@link MolecularSequence_Repository#name() name} to name.
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
     * Initializes the optional value {@link MolecularSequence_Repository#name() name} to name.
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
     * Initializes the optional value {@link MolecularSequence_Repository#type() type} to type.
     * @param type The value for type
     * @return {@code this} builder for chained invocation
     */
    public final Builder type(com.fhir.Molecularsequence_repositoryType type) {
      checkNotIsSet(typeIsSet(), "type");
      this.type = java.util.Objects.requireNonNull(type, "type");
      optBits |= OPT_BIT_TYPE;
      return this;
    }

    /**
     * Initializes the optional value {@link MolecularSequence_Repository#type() type} to type.
     * @param type The value for type
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("type")
    public final Builder type(java.util.Optional<? extends com.fhir.Molecularsequence_repositoryType> type) {
      checkNotIsSet(typeIsSet(), "type");
      this.type = type.orElse(null);
      optBits |= OPT_BIT_TYPE;
      return this;
    }

    /**
     * Initializes the optional value {@link MolecularSequence_Repository#variantsetId() variantsetId} to variantsetId.
     * @param variantsetId The value for variantsetId
     * @return {@code this} builder for chained invocation
     */
    public final Builder variantsetId(java.lang.String variantsetId) {
      checkNotIsSet(variantsetIdIsSet(), "variantsetId");
      this.variantsetId = java.util.Objects.requireNonNull(variantsetId, "variantsetId");
      optBits |= OPT_BIT_VARIANTSET_ID;
      return this;
    }

    /**
     * Initializes the optional value {@link MolecularSequence_Repository#variantsetId() variantsetId} to variantsetId.
     * @param variantsetId The value for variantsetId
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("variantsetId")
    public final Builder variantsetId(java.util.Optional<java.lang.String> variantsetId) {
      checkNotIsSet(variantsetIdIsSet(), "variantsetId");
      this.variantsetId = variantsetId.orElse(null);
      optBits |= OPT_BIT_VARIANTSET_ID;
      return this;
    }

    /**
     * Initializes the optional value {@link MolecularSequence_Repository#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link MolecularSequence_Repository#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link MolecularSequence_Repository#datasetId() datasetId} to datasetId.
     * @param datasetId The value for datasetId
     * @return {@code this} builder for chained invocation
     */
    public final Builder datasetId(java.lang.String datasetId) {
      checkNotIsSet(datasetIdIsSet(), "datasetId");
      this.datasetId = java.util.Objects.requireNonNull(datasetId, "datasetId");
      optBits |= OPT_BIT_DATASET_ID;
      return this;
    }

    /**
     * Initializes the optional value {@link MolecularSequence_Repository#datasetId() datasetId} to datasetId.
     * @param datasetId The value for datasetId
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("datasetId")
    public final Builder datasetId(java.util.Optional<java.lang.String> datasetId) {
      checkNotIsSet(datasetIdIsSet(), "datasetId");
      this.datasetId = datasetId.orElse(null);
      optBits |= OPT_BIT_DATASET_ID;
      return this;
    }

    /**
     * Initializes the optional value {@link MolecularSequence_Repository#readsetId() readsetId} to readsetId.
     * @param readsetId The value for readsetId
     * @return {@code this} builder for chained invocation
     */
    public final Builder readsetId(java.lang.String readsetId) {
      checkNotIsSet(readsetIdIsSet(), "readsetId");
      this.readsetId = java.util.Objects.requireNonNull(readsetId, "readsetId");
      optBits |= OPT_BIT_READSET_ID;
      return this;
    }

    /**
     * Initializes the optional value {@link MolecularSequence_Repository#readsetId() readsetId} to readsetId.
     * @param readsetId The value for readsetId
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("readsetId")
    public final Builder readsetId(java.util.Optional<java.lang.String> readsetId) {
      checkNotIsSet(readsetIdIsSet(), "readsetId");
      this.readsetId = readsetId.orElse(null);
      optBits |= OPT_BIT_READSET_ID;
      return this;
    }

    /**
     * Initializes the optional value {@link MolecularSequence_Repository#extension() extension} to extension.
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
     * Initializes the optional value {@link MolecularSequence_Repository#extension() extension} to extension.
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
     * Initializes the optional value {@link MolecularSequence_Repository#url() url} to url.
     * @param url The value for url
     * @return {@code this} builder for chained invocation
     */
    public final Builder url(com.fhir.uri url) {
      checkNotIsSet(urlIsSet(), "url");
      this.url = java.util.Objects.requireNonNull(url, "url");
      optBits |= OPT_BIT_URL;
      return this;
    }

    /**
     * Initializes the optional value {@link MolecularSequence_Repository#url() url} to url.
     * @param url The value for url
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("url")
    public final Builder url(java.util.Optional<? extends com.fhir.uri> url) {
      checkNotIsSet(urlIsSet(), "url");
      this.url = url.orElse(null);
      optBits |= OPT_BIT_URL;
      return this;
    }

    /**
     * Builds a new {@link MolecularSequence_Repository MolecularSequence_Repository}.
     * @return An immutable instance of MolecularSequence_Repository
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public com.fhir.MolecularSequence_Repository build() {
      return new ImmutableMolecularSequence_Repository(id, name, type, variantsetId, modifierExtension, datasetId, readsetId, extension, url);
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean nameIsSet() {
      return (optBits & OPT_BIT_NAME) != 0;
    }

    private boolean typeIsSet() {
      return (optBits & OPT_BIT_TYPE) != 0;
    }

    private boolean variantsetIdIsSet() {
      return (optBits & OPT_BIT_VARIANTSET_ID) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean datasetIdIsSet() {
      return (optBits & OPT_BIT_DATASET_ID) != 0;
    }

    private boolean readsetIdIsSet() {
      return (optBits & OPT_BIT_READSET_ID) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean urlIsSet() {
      return (optBits & OPT_BIT_URL) != 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new java.lang.IllegalStateException("Builder of MolecularSequence_Repository is strict, attribute is already set: ".concat(name));
    }
  }
}
