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
 * Immutable implementation of {@link Specimen_Container}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableSpecimen_Container.builder()}.
 */
@Generated(from = "Specimen_Container", generator = "Immutables")
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableSpecimen_Container implements Specimen_Container {
  private final @Nullable CodeableConcept type;
  private final @Nullable List<Extension> extension;
  private final @Nullable List<Extension> modifierExtension;
  private final @Nullable CodeableConcept additiveCodeableConcept;
  private final @Nullable Quantity capacity;
  private final @Nullable String id;
  private final @Nullable String description;
  private final @Nullable Reference additiveReference;
  private final @Nullable Quantity specimenQuantity;
  private final @Nullable List<Identifier> identifier;

  private ImmutableSpecimen_Container(
      @Nullable CodeableConcept type,
      @Nullable List<Extension> extension,
      @Nullable List<Extension> modifierExtension,
      @Nullable CodeableConcept additiveCodeableConcept,
      @Nullable Quantity capacity,
      @Nullable String id,
      @Nullable String description,
      @Nullable Reference additiveReference,
      @Nullable Quantity specimenQuantity,
      @Nullable List<Identifier> identifier) {
    this.type = type;
    this.extension = extension;
    this.modifierExtension = modifierExtension;
    this.additiveCodeableConcept = additiveCodeableConcept;
    this.capacity = capacity;
    this.id = id;
    this.description = description;
    this.additiveReference = additiveReference;
    this.specimenQuantity = specimenQuantity;
    this.identifier = identifier;
  }

  /**
   * @return The value of the {@code type} attribute
   */
  @JsonProperty("type")
  @Override
  public Optional<CodeableConcept> type() {
    return Optional.ofNullable(type);
  }

  /**
   * @return The value of the {@code extension} attribute
   */
  @JsonProperty("extension")
  @Override
  public Optional<List<Extension>> extension() {
    return Optional.ofNullable(extension);
  }

  /**
   * @return The value of the {@code modifierExtension} attribute
   */
  @JsonProperty("modifierExtension")
  @Override
  public Optional<List<Extension>> modifierExtension() {
    return Optional.ofNullable(modifierExtension);
  }

  /**
   * @return The value of the {@code additiveCodeableConcept} attribute
   */
  @JsonProperty("additiveCodeableConcept")
  @Override
  public Optional<CodeableConcept> additiveCodeableConcept() {
    return Optional.ofNullable(additiveCodeableConcept);
  }

  /**
   * @return The value of the {@code capacity} attribute
   */
  @JsonProperty("capacity")
  @Override
  public Optional<Quantity> capacity() {
    return Optional.ofNullable(capacity);
  }

  /**
   * @return The value of the {@code id} attribute
   */
  @JsonProperty("id")
  @Override
  public Optional<String> id() {
    return Optional.ofNullable(id);
  }

  /**
   * @return The value of the {@code description} attribute
   */
  @JsonProperty("description")
  @Override
  public Optional<String> description() {
    return Optional.ofNullable(description);
  }

  /**
   * @return The value of the {@code additiveReference} attribute
   */
  @JsonProperty("additiveReference")
  @Override
  public Optional<Reference> additiveReference() {
    return Optional.ofNullable(additiveReference);
  }

  /**
   * @return The value of the {@code specimenQuantity} attribute
   */
  @JsonProperty("specimenQuantity")
  @Override
  public Optional<Quantity> specimenQuantity() {
    return Optional.ofNullable(specimenQuantity);
  }

  /**
   * @return The value of the {@code identifier} attribute
   */
  @JsonProperty("identifier")
  @Override
  public Optional<List<Identifier>> identifier() {
    return Optional.ofNullable(identifier);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Specimen_Container#type() type} attribute.
   * @param value The value for type
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSpecimen_Container withType(CodeableConcept value) {
    @Nullable CodeableConcept newValue = Objects.requireNonNull(value, "type");
    if (this.type == newValue) return this;
    return new ImmutableSpecimen_Container(
        newValue,
        this.extension,
        this.modifierExtension,
        this.additiveCodeableConcept,
        this.capacity,
        this.id,
        this.description,
        this.additiveReference,
        this.specimenQuantity,
        this.identifier);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Specimen_Container#type() type} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for type
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSpecimen_Container withType(Optional<? extends CodeableConcept> optional) {
    @Nullable CodeableConcept value = optional.orElse(null);
    if (this.type == value) return this;
    return new ImmutableSpecimen_Container(
        value,
        this.extension,
        this.modifierExtension,
        this.additiveCodeableConcept,
        this.capacity,
        this.id,
        this.description,
        this.additiveReference,
        this.specimenQuantity,
        this.identifier);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Specimen_Container#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSpecimen_Container withExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableSpecimen_Container(
        this.type,
        newValue,
        this.modifierExtension,
        this.additiveCodeableConcept,
        this.capacity,
        this.id,
        this.description,
        this.additiveReference,
        this.specimenQuantity,
        this.identifier);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Specimen_Container#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSpecimen_Container withExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableSpecimen_Container(
        this.type,
        value,
        this.modifierExtension,
        this.additiveCodeableConcept,
        this.capacity,
        this.id,
        this.description,
        this.additiveReference,
        this.specimenQuantity,
        this.identifier);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Specimen_Container#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSpecimen_Container withModifierExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableSpecimen_Container(
        this.type,
        this.extension,
        newValue,
        this.additiveCodeableConcept,
        this.capacity,
        this.id,
        this.description,
        this.additiveReference,
        this.specimenQuantity,
        this.identifier);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Specimen_Container#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSpecimen_Container withModifierExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableSpecimen_Container(
        this.type,
        this.extension,
        value,
        this.additiveCodeableConcept,
        this.capacity,
        this.id,
        this.description,
        this.additiveReference,
        this.specimenQuantity,
        this.identifier);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Specimen_Container#additiveCodeableConcept() additiveCodeableConcept} attribute.
   * @param value The value for additiveCodeableConcept
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSpecimen_Container withAdditiveCodeableConcept(CodeableConcept value) {
    @Nullable CodeableConcept newValue = Objects.requireNonNull(value, "additiveCodeableConcept");
    if (this.additiveCodeableConcept == newValue) return this;
    return new ImmutableSpecimen_Container(
        this.type,
        this.extension,
        this.modifierExtension,
        newValue,
        this.capacity,
        this.id,
        this.description,
        this.additiveReference,
        this.specimenQuantity,
        this.identifier);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Specimen_Container#additiveCodeableConcept() additiveCodeableConcept} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for additiveCodeableConcept
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSpecimen_Container withAdditiveCodeableConcept(Optional<? extends CodeableConcept> optional) {
    @Nullable CodeableConcept value = optional.orElse(null);
    if (this.additiveCodeableConcept == value) return this;
    return new ImmutableSpecimen_Container(
        this.type,
        this.extension,
        this.modifierExtension,
        value,
        this.capacity,
        this.id,
        this.description,
        this.additiveReference,
        this.specimenQuantity,
        this.identifier);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Specimen_Container#capacity() capacity} attribute.
   * @param value The value for capacity
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSpecimen_Container withCapacity(Quantity value) {
    @Nullable Quantity newValue = Objects.requireNonNull(value, "capacity");
    if (this.capacity == newValue) return this;
    return new ImmutableSpecimen_Container(
        this.type,
        this.extension,
        this.modifierExtension,
        this.additiveCodeableConcept,
        newValue,
        this.id,
        this.description,
        this.additiveReference,
        this.specimenQuantity,
        this.identifier);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Specimen_Container#capacity() capacity} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for capacity
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSpecimen_Container withCapacity(Optional<? extends Quantity> optional) {
    @Nullable Quantity value = optional.orElse(null);
    if (this.capacity == value) return this;
    return new ImmutableSpecimen_Container(
        this.type,
        this.extension,
        this.modifierExtension,
        this.additiveCodeableConcept,
        value,
        this.id,
        this.description,
        this.additiveReference,
        this.specimenQuantity,
        this.identifier);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Specimen_Container#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSpecimen_Container withId(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "id");
    if (Objects.equals(this.id, newValue)) return this;
    return new ImmutableSpecimen_Container(
        this.type,
        this.extension,
        this.modifierExtension,
        this.additiveCodeableConcept,
        this.capacity,
        newValue,
        this.description,
        this.additiveReference,
        this.specimenQuantity,
        this.identifier);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Specimen_Container#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSpecimen_Container withId(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.id, value)) return this;
    return new ImmutableSpecimen_Container(
        this.type,
        this.extension,
        this.modifierExtension,
        this.additiveCodeableConcept,
        this.capacity,
        value,
        this.description,
        this.additiveReference,
        this.specimenQuantity,
        this.identifier);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Specimen_Container#description() description} attribute.
   * @param value The value for description
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSpecimen_Container withDescription(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "description");
    if (Objects.equals(this.description, newValue)) return this;
    return new ImmutableSpecimen_Container(
        this.type,
        this.extension,
        this.modifierExtension,
        this.additiveCodeableConcept,
        this.capacity,
        this.id,
        newValue,
        this.additiveReference,
        this.specimenQuantity,
        this.identifier);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Specimen_Container#description() description} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for description
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSpecimen_Container withDescription(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.description, value)) return this;
    return new ImmutableSpecimen_Container(
        this.type,
        this.extension,
        this.modifierExtension,
        this.additiveCodeableConcept,
        this.capacity,
        this.id,
        value,
        this.additiveReference,
        this.specimenQuantity,
        this.identifier);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Specimen_Container#additiveReference() additiveReference} attribute.
   * @param value The value for additiveReference
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSpecimen_Container withAdditiveReference(Reference value) {
    @Nullable Reference newValue = Objects.requireNonNull(value, "additiveReference");
    if (this.additiveReference == newValue) return this;
    return new ImmutableSpecimen_Container(
        this.type,
        this.extension,
        this.modifierExtension,
        this.additiveCodeableConcept,
        this.capacity,
        this.id,
        this.description,
        newValue,
        this.specimenQuantity,
        this.identifier);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Specimen_Container#additiveReference() additiveReference} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for additiveReference
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSpecimen_Container withAdditiveReference(Optional<? extends Reference> optional) {
    @Nullable Reference value = optional.orElse(null);
    if (this.additiveReference == value) return this;
    return new ImmutableSpecimen_Container(
        this.type,
        this.extension,
        this.modifierExtension,
        this.additiveCodeableConcept,
        this.capacity,
        this.id,
        this.description,
        value,
        this.specimenQuantity,
        this.identifier);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Specimen_Container#specimenQuantity() specimenQuantity} attribute.
   * @param value The value for specimenQuantity
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSpecimen_Container withSpecimenQuantity(Quantity value) {
    @Nullable Quantity newValue = Objects.requireNonNull(value, "specimenQuantity");
    if (this.specimenQuantity == newValue) return this;
    return new ImmutableSpecimen_Container(
        this.type,
        this.extension,
        this.modifierExtension,
        this.additiveCodeableConcept,
        this.capacity,
        this.id,
        this.description,
        this.additiveReference,
        newValue,
        this.identifier);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Specimen_Container#specimenQuantity() specimenQuantity} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for specimenQuantity
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSpecimen_Container withSpecimenQuantity(Optional<? extends Quantity> optional) {
    @Nullable Quantity value = optional.orElse(null);
    if (this.specimenQuantity == value) return this;
    return new ImmutableSpecimen_Container(
        this.type,
        this.extension,
        this.modifierExtension,
        this.additiveCodeableConcept,
        this.capacity,
        this.id,
        this.description,
        this.additiveReference,
        value,
        this.identifier);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Specimen_Container#identifier() identifier} attribute.
   * @param value The value for identifier
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSpecimen_Container withIdentifier(List<Identifier> value) {
    @Nullable List<Identifier> newValue = Objects.requireNonNull(value, "identifier");
    if (this.identifier == newValue) return this;
    return new ImmutableSpecimen_Container(
        this.type,
        this.extension,
        this.modifierExtension,
        this.additiveCodeableConcept,
        this.capacity,
        this.id,
        this.description,
        this.additiveReference,
        this.specimenQuantity,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Specimen_Container#identifier() identifier} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for identifier
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSpecimen_Container withIdentifier(Optional<? extends List<Identifier>> optional) {
    @Nullable List<Identifier> value = optional.orElse(null);
    if (this.identifier == value) return this;
    return new ImmutableSpecimen_Container(
        this.type,
        this.extension,
        this.modifierExtension,
        this.additiveCodeableConcept,
        this.capacity,
        this.id,
        this.description,
        this.additiveReference,
        this.specimenQuantity,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableSpecimen_Container} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableSpecimen_Container
        && equalTo((ImmutableSpecimen_Container) another);
  }

  private boolean equalTo(ImmutableSpecimen_Container another) {
    return Objects.equals(type, another.type)
        && Objects.equals(extension, another.extension)
        && Objects.equals(modifierExtension, another.modifierExtension)
        && Objects.equals(additiveCodeableConcept, another.additiveCodeableConcept)
        && Objects.equals(capacity, another.capacity)
        && Objects.equals(id, another.id)
        && Objects.equals(description, another.description)
        && Objects.equals(additiveReference, another.additiveReference)
        && Objects.equals(specimenQuantity, another.specimenQuantity)
        && Objects.equals(identifier, another.identifier);
  }

  /**
   * Computes a hash code from attributes: {@code type}, {@code extension}, {@code modifierExtension}, {@code additiveCodeableConcept}, {@code capacity}, {@code id}, {@code description}, {@code additiveReference}, {@code specimenQuantity}, {@code identifier}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(type);
    h += (h << 5) + Objects.hashCode(extension);
    h += (h << 5) + Objects.hashCode(modifierExtension);
    h += (h << 5) + Objects.hashCode(additiveCodeableConcept);
    h += (h << 5) + Objects.hashCode(capacity);
    h += (h << 5) + Objects.hashCode(id);
    h += (h << 5) + Objects.hashCode(description);
    h += (h << 5) + Objects.hashCode(additiveReference);
    h += (h << 5) + Objects.hashCode(specimenQuantity);
    h += (h << 5) + Objects.hashCode(identifier);
    return h;
  }

  /**
   * Prints the immutable value {@code Specimen_Container} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("Specimen_Container{");
    if (type != null) {
      builder.append("type=").append(type);
    }
    if (extension != null) {
      if (builder.length() > 19) builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (modifierExtension != null) {
      if (builder.length() > 19) builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (additiveCodeableConcept != null) {
      if (builder.length() > 19) builder.append(", ");
      builder.append("additiveCodeableConcept=").append(additiveCodeableConcept);
    }
    if (capacity != null) {
      if (builder.length() > 19) builder.append(", ");
      builder.append("capacity=").append(capacity);
    }
    if (id != null) {
      if (builder.length() > 19) builder.append(", ");
      builder.append("id=").append(id);
    }
    if (description != null) {
      if (builder.length() > 19) builder.append(", ");
      builder.append("description=").append(description);
    }
    if (additiveReference != null) {
      if (builder.length() > 19) builder.append(", ");
      builder.append("additiveReference=").append(additiveReference);
    }
    if (specimenQuantity != null) {
      if (builder.length() > 19) builder.append(", ");
      builder.append("specimenQuantity=").append(specimenQuantity);
    }
    if (identifier != null) {
      if (builder.length() > 19) builder.append(", ");
      builder.append("identifier=").append(identifier);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Generated(from = "Specimen_Container", generator = "Immutables")
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements Specimen_Container {
    @Nullable Optional<CodeableConcept> type = Optional.empty();
    boolean typeIsSet;
    @Nullable Optional<List<Extension>> extension = Optional.empty();
    boolean extensionIsSet;
    @Nullable Optional<List<Extension>> modifierExtension = Optional.empty();
    boolean modifierExtensionIsSet;
    @Nullable Optional<CodeableConcept> additiveCodeableConcept = Optional.empty();
    boolean additiveCodeableConceptIsSet;
    @Nullable Optional<Quantity> capacity = Optional.empty();
    boolean capacityIsSet;
    @Nullable Optional<String> id = Optional.empty();
    boolean idIsSet;
    @Nullable Optional<String> description = Optional.empty();
    boolean descriptionIsSet;
    @Nullable Optional<Reference> additiveReference = Optional.empty();
    boolean additiveReferenceIsSet;
    @Nullable Optional<Quantity> specimenQuantity = Optional.empty();
    boolean specimenQuantityIsSet;
    @Nullable Optional<List<Identifier>> identifier = Optional.empty();
    boolean identifierIsSet;
    @JsonProperty("type")
    public void setType(Optional<CodeableConcept> type) {
      this.type = type;
      this.typeIsSet = true;
    }
    @JsonProperty("extension")
    public void setExtension(Optional<List<Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @JsonProperty("modifierExtension")
    public void setModifierExtension(Optional<List<Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @JsonProperty("additiveCodeableConcept")
    public void setAdditiveCodeableConcept(Optional<CodeableConcept> additiveCodeableConcept) {
      this.additiveCodeableConcept = additiveCodeableConcept;
      this.additiveCodeableConceptIsSet = true;
    }
    @JsonProperty("capacity")
    public void setCapacity(Optional<Quantity> capacity) {
      this.capacity = capacity;
      this.capacityIsSet = true;
    }
    @JsonProperty("id")
    public void setId(Optional<String> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @JsonProperty("description")
    public void setDescription(Optional<String> description) {
      this.description = description;
      this.descriptionIsSet = true;
    }
    @JsonProperty("additiveReference")
    public void setAdditiveReference(Optional<Reference> additiveReference) {
      this.additiveReference = additiveReference;
      this.additiveReferenceIsSet = true;
    }
    @JsonProperty("specimenQuantity")
    public void setSpecimenQuantity(Optional<Quantity> specimenQuantity) {
      this.specimenQuantity = specimenQuantity;
      this.specimenQuantityIsSet = true;
    }
    @JsonProperty("identifier")
    public void setIdentifier(Optional<List<Identifier>> identifier) {
      this.identifier = identifier;
      this.identifierIsSet = true;
    }
    @Override
    public Optional<CodeableConcept> type() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<CodeableConcept> additiveCodeableConcept() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Quantity> capacity() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> id() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> description() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Reference> additiveReference() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Quantity> specimenQuantity() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Identifier>> identifier() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableSpecimen_Container fromJson(Json json) {
    ImmutableSpecimen_Container.Builder builder = ImmutableSpecimen_Container.builder();
    if (json.typeIsSet) {
      builder.type(json.type);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.additiveCodeableConceptIsSet) {
      builder.additiveCodeableConcept(json.additiveCodeableConcept);
    }
    if (json.capacityIsSet) {
      builder.capacity(json.capacity);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.descriptionIsSet) {
      builder.description(json.description);
    }
    if (json.additiveReferenceIsSet) {
      builder.additiveReference(json.additiveReference);
    }
    if (json.specimenQuantityIsSet) {
      builder.specimenQuantity(json.specimenQuantity);
    }
    if (json.identifierIsSet) {
      builder.identifier(json.identifier);
    }
    return (ImmutableSpecimen_Container) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link Specimen_Container} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable Specimen_Container instance
   */
  public static Specimen_Container copyOf(Specimen_Container instance) {
    if (instance instanceof ImmutableSpecimen_Container) {
      return (ImmutableSpecimen_Container) instance;
    }
    return ImmutableSpecimen_Container.builder()
        .type(instance.type())
        .extension(instance.extension())
        .modifierExtension(instance.modifierExtension())
        .additiveCodeableConcept(instance.additiveCodeableConcept())
        .capacity(instance.capacity())
        .id(instance.id())
        .description(instance.description())
        .additiveReference(instance.additiveReference())
        .specimenQuantity(instance.specimenQuantity())
        .identifier(instance.identifier())
        .build();
  }

  /**
   * Creates a builder for {@link Specimen_Container Specimen_Container}.
   * <pre>
   * ImmutableSpecimen_Container.builder()
   *    .type(com.fhir.types.fhir.CodeableConcept) // optional {@link Specimen_Container#type() type}
   *    .extension(List&amp;lt;com.fhir.types.fhir.Extension&amp;gt;) // optional {@link Specimen_Container#extension() extension}
   *    .modifierExtension(List&amp;lt;com.fhir.types.fhir.Extension&amp;gt;) // optional {@link Specimen_Container#modifierExtension() modifierExtension}
   *    .additiveCodeableConcept(com.fhir.types.fhir.CodeableConcept) // optional {@link Specimen_Container#additiveCodeableConcept() additiveCodeableConcept}
   *    .capacity(com.fhir.types.fhir.Quantity) // optional {@link Specimen_Container#capacity() capacity}
   *    .id(String) // optional {@link Specimen_Container#id() id}
   *    .description(String) // optional {@link Specimen_Container#description() description}
   *    .additiveReference(com.fhir.types.fhir.Reference) // optional {@link Specimen_Container#additiveReference() additiveReference}
   *    .specimenQuantity(com.fhir.types.fhir.Quantity) // optional {@link Specimen_Container#specimenQuantity() specimenQuantity}
   *    .identifier(List&amp;lt;com.fhir.types.fhir.Identifier&amp;gt;) // optional {@link Specimen_Container#identifier() identifier}
   *    .build();
   * </pre>
   * @return A new Specimen_Container builder
   */
  public static ImmutableSpecimen_Container.Builder builder() {
    return new ImmutableSpecimen_Container.Builder();
  }

  /**
   * Builds instances of type {@link Specimen_Container Specimen_Container}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "Specimen_Container", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder {
    private static final long OPT_BIT_TYPE = 0x1L;
    private static final long OPT_BIT_EXTENSION = 0x2L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x4L;
    private static final long OPT_BIT_ADDITIVE_CODEABLE_CONCEPT = 0x8L;
    private static final long OPT_BIT_CAPACITY = 0x10L;
    private static final long OPT_BIT_ID = 0x20L;
    private static final long OPT_BIT_DESCRIPTION = 0x40L;
    private static final long OPT_BIT_ADDITIVE_REFERENCE = 0x80L;
    private static final long OPT_BIT_SPECIMEN_QUANTITY = 0x100L;
    private static final long OPT_BIT_IDENTIFIER = 0x200L;
    private long optBits;

    private @Nullable CodeableConcept type;
    private @Nullable List<Extension> extension;
    private @Nullable List<Extension> modifierExtension;
    private @Nullable CodeableConcept additiveCodeableConcept;
    private @Nullable Quantity capacity;
    private @Nullable String id;
    private @Nullable String description;
    private @Nullable Reference additiveReference;
    private @Nullable Quantity specimenQuantity;
    private @Nullable List<Identifier> identifier;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link Specimen_Container#type() type} to type.
     * @param type The value for type
     * @return {@code this} builder for chained invocation
     */
    public final Builder type(CodeableConcept type) {
      checkNotIsSet(typeIsSet(), "type");
      this.type = Objects.requireNonNull(type, "type");
      optBits |= OPT_BIT_TYPE;
      return this;
    }

    /**
     * Initializes the optional value {@link Specimen_Container#type() type} to type.
     * @param type The value for type
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("type")
    public final Builder type(Optional<? extends CodeableConcept> type) {
      checkNotIsSet(typeIsSet(), "type");
      this.type = type.orElse(null);
      optBits |= OPT_BIT_TYPE;
      return this;
    }

    /**
     * Initializes the optional value {@link Specimen_Container#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for chained invocation
     */
    public final Builder extension(List<Extension> extension) {
      checkNotIsSet(extensionIsSet(), "extension");
      this.extension = Objects.requireNonNull(extension, "extension");
      optBits |= OPT_BIT_EXTENSION;
      return this;
    }

    /**
     * Initializes the optional value {@link Specimen_Container#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("extension")
    public final Builder extension(Optional<? extends List<Extension>> extension) {
      checkNotIsSet(extensionIsSet(), "extension");
      this.extension = extension.orElse(null);
      optBits |= OPT_BIT_EXTENSION;
      return this;
    }

    /**
     * Initializes the optional value {@link Specimen_Container#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for chained invocation
     */
    public final Builder modifierExtension(List<Extension> modifierExtension) {
      checkNotIsSet(modifierExtensionIsSet(), "modifierExtension");
      this.modifierExtension = Objects.requireNonNull(modifierExtension, "modifierExtension");
      optBits |= OPT_BIT_MODIFIER_EXTENSION;
      return this;
    }

    /**
     * Initializes the optional value {@link Specimen_Container#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("modifierExtension")
    public final Builder modifierExtension(Optional<? extends List<Extension>> modifierExtension) {
      checkNotIsSet(modifierExtensionIsSet(), "modifierExtension");
      this.modifierExtension = modifierExtension.orElse(null);
      optBits |= OPT_BIT_MODIFIER_EXTENSION;
      return this;
    }

    /**
     * Initializes the optional value {@link Specimen_Container#additiveCodeableConcept() additiveCodeableConcept} to additiveCodeableConcept.
     * @param additiveCodeableConcept The value for additiveCodeableConcept
     * @return {@code this} builder for chained invocation
     */
    public final Builder additiveCodeableConcept(CodeableConcept additiveCodeableConcept) {
      checkNotIsSet(additiveCodeableConceptIsSet(), "additiveCodeableConcept");
      this.additiveCodeableConcept = Objects.requireNonNull(additiveCodeableConcept, "additiveCodeableConcept");
      optBits |= OPT_BIT_ADDITIVE_CODEABLE_CONCEPT;
      return this;
    }

    /**
     * Initializes the optional value {@link Specimen_Container#additiveCodeableConcept() additiveCodeableConcept} to additiveCodeableConcept.
     * @param additiveCodeableConcept The value for additiveCodeableConcept
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("additiveCodeableConcept")
    public final Builder additiveCodeableConcept(Optional<? extends CodeableConcept> additiveCodeableConcept) {
      checkNotIsSet(additiveCodeableConceptIsSet(), "additiveCodeableConcept");
      this.additiveCodeableConcept = additiveCodeableConcept.orElse(null);
      optBits |= OPT_BIT_ADDITIVE_CODEABLE_CONCEPT;
      return this;
    }

    /**
     * Initializes the optional value {@link Specimen_Container#capacity() capacity} to capacity.
     * @param capacity The value for capacity
     * @return {@code this} builder for chained invocation
     */
    public final Builder capacity(Quantity capacity) {
      checkNotIsSet(capacityIsSet(), "capacity");
      this.capacity = Objects.requireNonNull(capacity, "capacity");
      optBits |= OPT_BIT_CAPACITY;
      return this;
    }

    /**
     * Initializes the optional value {@link Specimen_Container#capacity() capacity} to capacity.
     * @param capacity The value for capacity
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("capacity")
    public final Builder capacity(Optional<? extends Quantity> capacity) {
      checkNotIsSet(capacityIsSet(), "capacity");
      this.capacity = capacity.orElse(null);
      optBits |= OPT_BIT_CAPACITY;
      return this;
    }

    /**
     * Initializes the optional value {@link Specimen_Container#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    public final Builder id(String id) {
      checkNotIsSet(idIsSet(), "id");
      this.id = Objects.requireNonNull(id, "id");
      optBits |= OPT_BIT_ID;
      return this;
    }

    /**
     * Initializes the optional value {@link Specimen_Container#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("id")
    public final Builder id(Optional<String> id) {
      checkNotIsSet(idIsSet(), "id");
      this.id = id.orElse(null);
      optBits |= OPT_BIT_ID;
      return this;
    }

    /**
     * Initializes the optional value {@link Specimen_Container#description() description} to description.
     * @param description The value for description
     * @return {@code this} builder for chained invocation
     */
    public final Builder description(String description) {
      checkNotIsSet(descriptionIsSet(), "description");
      this.description = Objects.requireNonNull(description, "description");
      optBits |= OPT_BIT_DESCRIPTION;
      return this;
    }

    /**
     * Initializes the optional value {@link Specimen_Container#description() description} to description.
     * @param description The value for description
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("description")
    public final Builder description(Optional<String> description) {
      checkNotIsSet(descriptionIsSet(), "description");
      this.description = description.orElse(null);
      optBits |= OPT_BIT_DESCRIPTION;
      return this;
    }

    /**
     * Initializes the optional value {@link Specimen_Container#additiveReference() additiveReference} to additiveReference.
     * @param additiveReference The value for additiveReference
     * @return {@code this} builder for chained invocation
     */
    public final Builder additiveReference(Reference additiveReference) {
      checkNotIsSet(additiveReferenceIsSet(), "additiveReference");
      this.additiveReference = Objects.requireNonNull(additiveReference, "additiveReference");
      optBits |= OPT_BIT_ADDITIVE_REFERENCE;
      return this;
    }

    /**
     * Initializes the optional value {@link Specimen_Container#additiveReference() additiveReference} to additiveReference.
     * @param additiveReference The value for additiveReference
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("additiveReference")
    public final Builder additiveReference(Optional<? extends Reference> additiveReference) {
      checkNotIsSet(additiveReferenceIsSet(), "additiveReference");
      this.additiveReference = additiveReference.orElse(null);
      optBits |= OPT_BIT_ADDITIVE_REFERENCE;
      return this;
    }

    /**
     * Initializes the optional value {@link Specimen_Container#specimenQuantity() specimenQuantity} to specimenQuantity.
     * @param specimenQuantity The value for specimenQuantity
     * @return {@code this} builder for chained invocation
     */
    public final Builder specimenQuantity(Quantity specimenQuantity) {
      checkNotIsSet(specimenQuantityIsSet(), "specimenQuantity");
      this.specimenQuantity = Objects.requireNonNull(specimenQuantity, "specimenQuantity");
      optBits |= OPT_BIT_SPECIMEN_QUANTITY;
      return this;
    }

    /**
     * Initializes the optional value {@link Specimen_Container#specimenQuantity() specimenQuantity} to specimenQuantity.
     * @param specimenQuantity The value for specimenQuantity
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("specimenQuantity")
    public final Builder specimenQuantity(Optional<? extends Quantity> specimenQuantity) {
      checkNotIsSet(specimenQuantityIsSet(), "specimenQuantity");
      this.specimenQuantity = specimenQuantity.orElse(null);
      optBits |= OPT_BIT_SPECIMEN_QUANTITY;
      return this;
    }

    /**
     * Initializes the optional value {@link Specimen_Container#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for chained invocation
     */
    public final Builder identifier(List<Identifier> identifier) {
      checkNotIsSet(identifierIsSet(), "identifier");
      this.identifier = Objects.requireNonNull(identifier, "identifier");
      optBits |= OPT_BIT_IDENTIFIER;
      return this;
    }

    /**
     * Initializes the optional value {@link Specimen_Container#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("identifier")
    public final Builder identifier(Optional<? extends List<Identifier>> identifier) {
      checkNotIsSet(identifierIsSet(), "identifier");
      this.identifier = identifier.orElse(null);
      optBits |= OPT_BIT_IDENTIFIER;
      return this;
    }

    /**
     * Builds a new {@link Specimen_Container Specimen_Container}.
     * @return An immutable instance of Specimen_Container
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public Specimen_Container build() {
      return new ImmutableSpecimen_Container(
          type,
          extension,
          modifierExtension,
          additiveCodeableConcept,
          capacity,
          id,
          description,
          additiveReference,
          specimenQuantity,
          identifier);
    }

    private boolean typeIsSet() {
      return (optBits & OPT_BIT_TYPE) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean additiveCodeableConceptIsSet() {
      return (optBits & OPT_BIT_ADDITIVE_CODEABLE_CONCEPT) != 0;
    }

    private boolean capacityIsSet() {
      return (optBits & OPT_BIT_CAPACITY) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean descriptionIsSet() {
      return (optBits & OPT_BIT_DESCRIPTION) != 0;
    }

    private boolean additiveReferenceIsSet() {
      return (optBits & OPT_BIT_ADDITIVE_REFERENCE) != 0;
    }

    private boolean specimenQuantityIsSet() {
      return (optBits & OPT_BIT_SPECIMEN_QUANTITY) != 0;
    }

    private boolean identifierIsSet() {
      return (optBits & OPT_BIT_IDENTIFIER) != 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of Specimen_Container is strict, attribute is already set: ".concat(name));
    }
  }
}
