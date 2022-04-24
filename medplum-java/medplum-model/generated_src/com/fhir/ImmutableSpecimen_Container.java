package com.fhir;

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
  private final @Nullable List<Identifier> identifier;
  private final @Nullable Reference additiveReference;
  private final @Nullable CodeableConcept additiveCodeableConcept;
  private final @Nullable List<Extension> modifierExtension;
  private final @Nullable List<Extension> extension;
  private final @Nullable String id;
  private final @Nullable Quantity capacity;
  private final @Nullable String description;
  private final @Nullable Quantity specimenQuantity;

  private ImmutableSpecimen_Container(
      @Nullable CodeableConcept type,
      @Nullable List<Identifier> identifier,
      @Nullable Reference additiveReference,
      @Nullable CodeableConcept additiveCodeableConcept,
      @Nullable List<Extension> modifierExtension,
      @Nullable List<Extension> extension,
      @Nullable String id,
      @Nullable Quantity capacity,
      @Nullable String description,
      @Nullable Quantity specimenQuantity) {
    this.type = type;
    this.identifier = identifier;
    this.additiveReference = additiveReference;
    this.additiveCodeableConcept = additiveCodeableConcept;
    this.modifierExtension = modifierExtension;
    this.extension = extension;
    this.id = id;
    this.capacity = capacity;
    this.description = description;
    this.specimenQuantity = specimenQuantity;
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
   * @return The value of the {@code identifier} attribute
   */
  @JsonProperty("identifier")
  @Override
  public Optional<List<Identifier>> identifier() {
    return Optional.ofNullable(identifier);
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
   * @return The value of the {@code additiveCodeableConcept} attribute
   */
  @JsonProperty("additiveCodeableConcept")
  @Override
  public Optional<CodeableConcept> additiveCodeableConcept() {
    return Optional.ofNullable(additiveCodeableConcept);
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
   * @return The value of the {@code extension} attribute
   */
  @JsonProperty("extension")
  @Override
  public Optional<List<Extension>> extension() {
    return Optional.ofNullable(extension);
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
   * @return The value of the {@code capacity} attribute
   */
  @JsonProperty("capacity")
  @Override
  public Optional<Quantity> capacity() {
    return Optional.ofNullable(capacity);
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
   * @return The value of the {@code specimenQuantity} attribute
   */
  @JsonProperty("specimenQuantity")
  @Override
  public Optional<Quantity> specimenQuantity() {
    return Optional.ofNullable(specimenQuantity);
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
        this.identifier,
        this.additiveReference,
        this.additiveCodeableConcept,
        this.modifierExtension,
        this.extension,
        this.id,
        this.capacity,
        this.description,
        this.specimenQuantity);
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
        this.identifier,
        this.additiveReference,
        this.additiveCodeableConcept,
        this.modifierExtension,
        this.extension,
        this.id,
        this.capacity,
        this.description,
        this.specimenQuantity);
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
        newValue,
        this.additiveReference,
        this.additiveCodeableConcept,
        this.modifierExtension,
        this.extension,
        this.id,
        this.capacity,
        this.description,
        this.specimenQuantity);
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
        value,
        this.additiveReference,
        this.additiveCodeableConcept,
        this.modifierExtension,
        this.extension,
        this.id,
        this.capacity,
        this.description,
        this.specimenQuantity);
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
        this.identifier,
        newValue,
        this.additiveCodeableConcept,
        this.modifierExtension,
        this.extension,
        this.id,
        this.capacity,
        this.description,
        this.specimenQuantity);
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
        this.identifier,
        value,
        this.additiveCodeableConcept,
        this.modifierExtension,
        this.extension,
        this.id,
        this.capacity,
        this.description,
        this.specimenQuantity);
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
        this.identifier,
        this.additiveReference,
        newValue,
        this.modifierExtension,
        this.extension,
        this.id,
        this.capacity,
        this.description,
        this.specimenQuantity);
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
        this.identifier,
        this.additiveReference,
        value,
        this.modifierExtension,
        this.extension,
        this.id,
        this.capacity,
        this.description,
        this.specimenQuantity);
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
        this.identifier,
        this.additiveReference,
        this.additiveCodeableConcept,
        newValue,
        this.extension,
        this.id,
        this.capacity,
        this.description,
        this.specimenQuantity);
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
        this.identifier,
        this.additiveReference,
        this.additiveCodeableConcept,
        value,
        this.extension,
        this.id,
        this.capacity,
        this.description,
        this.specimenQuantity);
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
        this.identifier,
        this.additiveReference,
        this.additiveCodeableConcept,
        this.modifierExtension,
        newValue,
        this.id,
        this.capacity,
        this.description,
        this.specimenQuantity);
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
        this.identifier,
        this.additiveReference,
        this.additiveCodeableConcept,
        this.modifierExtension,
        value,
        this.id,
        this.capacity,
        this.description,
        this.specimenQuantity);
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
        this.identifier,
        this.additiveReference,
        this.additiveCodeableConcept,
        this.modifierExtension,
        this.extension,
        newValue,
        this.capacity,
        this.description,
        this.specimenQuantity);
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
        this.identifier,
        this.additiveReference,
        this.additiveCodeableConcept,
        this.modifierExtension,
        this.extension,
        value,
        this.capacity,
        this.description,
        this.specimenQuantity);
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
        this.identifier,
        this.additiveReference,
        this.additiveCodeableConcept,
        this.modifierExtension,
        this.extension,
        this.id,
        newValue,
        this.description,
        this.specimenQuantity);
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
        this.identifier,
        this.additiveReference,
        this.additiveCodeableConcept,
        this.modifierExtension,
        this.extension,
        this.id,
        value,
        this.description,
        this.specimenQuantity);
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
        this.identifier,
        this.additiveReference,
        this.additiveCodeableConcept,
        this.modifierExtension,
        this.extension,
        this.id,
        this.capacity,
        newValue,
        this.specimenQuantity);
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
        this.identifier,
        this.additiveReference,
        this.additiveCodeableConcept,
        this.modifierExtension,
        this.extension,
        this.id,
        this.capacity,
        value,
        this.specimenQuantity);
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
        this.identifier,
        this.additiveReference,
        this.additiveCodeableConcept,
        this.modifierExtension,
        this.extension,
        this.id,
        this.capacity,
        this.description,
        newValue);
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
        this.identifier,
        this.additiveReference,
        this.additiveCodeableConcept,
        this.modifierExtension,
        this.extension,
        this.id,
        this.capacity,
        this.description,
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
        && Objects.equals(identifier, another.identifier)
        && Objects.equals(additiveReference, another.additiveReference)
        && Objects.equals(additiveCodeableConcept, another.additiveCodeableConcept)
        && Objects.equals(modifierExtension, another.modifierExtension)
        && Objects.equals(extension, another.extension)
        && Objects.equals(id, another.id)
        && Objects.equals(capacity, another.capacity)
        && Objects.equals(description, another.description)
        && Objects.equals(specimenQuantity, another.specimenQuantity);
  }

  /**
   * Computes a hash code from attributes: {@code type}, {@code identifier}, {@code additiveReference}, {@code additiveCodeableConcept}, {@code modifierExtension}, {@code extension}, {@code id}, {@code capacity}, {@code description}, {@code specimenQuantity}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(type);
    h += (h << 5) + Objects.hashCode(identifier);
    h += (h << 5) + Objects.hashCode(additiveReference);
    h += (h << 5) + Objects.hashCode(additiveCodeableConcept);
    h += (h << 5) + Objects.hashCode(modifierExtension);
    h += (h << 5) + Objects.hashCode(extension);
    h += (h << 5) + Objects.hashCode(id);
    h += (h << 5) + Objects.hashCode(capacity);
    h += (h << 5) + Objects.hashCode(description);
    h += (h << 5) + Objects.hashCode(specimenQuantity);
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
    if (identifier != null) {
      if (builder.length() > 19) builder.append(", ");
      builder.append("identifier=").append(identifier);
    }
    if (additiveReference != null) {
      if (builder.length() > 19) builder.append(", ");
      builder.append("additiveReference=").append(additiveReference);
    }
    if (additiveCodeableConcept != null) {
      if (builder.length() > 19) builder.append(", ");
      builder.append("additiveCodeableConcept=").append(additiveCodeableConcept);
    }
    if (modifierExtension != null) {
      if (builder.length() > 19) builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (extension != null) {
      if (builder.length() > 19) builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (id != null) {
      if (builder.length() > 19) builder.append(", ");
      builder.append("id=").append(id);
    }
    if (capacity != null) {
      if (builder.length() > 19) builder.append(", ");
      builder.append("capacity=").append(capacity);
    }
    if (description != null) {
      if (builder.length() > 19) builder.append(", ");
      builder.append("description=").append(description);
    }
    if (specimenQuantity != null) {
      if (builder.length() > 19) builder.append(", ");
      builder.append("specimenQuantity=").append(specimenQuantity);
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
    @Nullable Optional<List<Identifier>> identifier = Optional.empty();
    boolean identifierIsSet;
    @Nullable Optional<Reference> additiveReference = Optional.empty();
    boolean additiveReferenceIsSet;
    @Nullable Optional<CodeableConcept> additiveCodeableConcept = Optional.empty();
    boolean additiveCodeableConceptIsSet;
    @Nullable Optional<List<Extension>> modifierExtension = Optional.empty();
    boolean modifierExtensionIsSet;
    @Nullable Optional<List<Extension>> extension = Optional.empty();
    boolean extensionIsSet;
    @Nullable Optional<String> id = Optional.empty();
    boolean idIsSet;
    @Nullable Optional<Quantity> capacity = Optional.empty();
    boolean capacityIsSet;
    @Nullable Optional<String> description = Optional.empty();
    boolean descriptionIsSet;
    @Nullable Optional<Quantity> specimenQuantity = Optional.empty();
    boolean specimenQuantityIsSet;
    @JsonProperty("type")
    public void setType(Optional<CodeableConcept> type) {
      this.type = type;
      this.typeIsSet = true;
    }
    @JsonProperty("identifier")
    public void setIdentifier(Optional<List<Identifier>> identifier) {
      this.identifier = identifier;
      this.identifierIsSet = true;
    }
    @JsonProperty("additiveReference")
    public void setAdditiveReference(Optional<Reference> additiveReference) {
      this.additiveReference = additiveReference;
      this.additiveReferenceIsSet = true;
    }
    @JsonProperty("additiveCodeableConcept")
    public void setAdditiveCodeableConcept(Optional<CodeableConcept> additiveCodeableConcept) {
      this.additiveCodeableConcept = additiveCodeableConcept;
      this.additiveCodeableConceptIsSet = true;
    }
    @JsonProperty("modifierExtension")
    public void setModifierExtension(Optional<List<Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @JsonProperty("extension")
    public void setExtension(Optional<List<Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @JsonProperty("id")
    public void setId(Optional<String> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @JsonProperty("capacity")
    public void setCapacity(Optional<Quantity> capacity) {
      this.capacity = capacity;
      this.capacityIsSet = true;
    }
    @JsonProperty("description")
    public void setDescription(Optional<String> description) {
      this.description = description;
      this.descriptionIsSet = true;
    }
    @JsonProperty("specimenQuantity")
    public void setSpecimenQuantity(Optional<Quantity> specimenQuantity) {
      this.specimenQuantity = specimenQuantity;
      this.specimenQuantityIsSet = true;
    }
    @Override
    public Optional<CodeableConcept> type() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Identifier>> identifier() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Reference> additiveReference() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<CodeableConcept> additiveCodeableConcept() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> id() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Quantity> capacity() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> description() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Quantity> specimenQuantity() { throw new UnsupportedOperationException(); }
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
    if (json.identifierIsSet) {
      builder.identifier(json.identifier);
    }
    if (json.additiveReferenceIsSet) {
      builder.additiveReference(json.additiveReference);
    }
    if (json.additiveCodeableConceptIsSet) {
      builder.additiveCodeableConcept(json.additiveCodeableConcept);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.capacityIsSet) {
      builder.capacity(json.capacity);
    }
    if (json.descriptionIsSet) {
      builder.description(json.description);
    }
    if (json.specimenQuantityIsSet) {
      builder.specimenQuantity(json.specimenQuantity);
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
        .identifier(instance.identifier())
        .additiveReference(instance.additiveReference())
        .additiveCodeableConcept(instance.additiveCodeableConcept())
        .modifierExtension(instance.modifierExtension())
        .extension(instance.extension())
        .id(instance.id())
        .capacity(instance.capacity())
        .description(instance.description())
        .specimenQuantity(instance.specimenQuantity())
        .build();
  }

  /**
   * Creates a builder for {@link Specimen_Container Specimen_Container}.
   * <pre>
   * ImmutableSpecimen_Container.builder()
   *    .type(com.fhir.CodeableConcept) // optional {@link Specimen_Container#type() type}
   *    .identifier(List&amp;lt;com.fhir.Identifier&amp;gt;) // optional {@link Specimen_Container#identifier() identifier}
   *    .additiveReference(com.fhir.Reference) // optional {@link Specimen_Container#additiveReference() additiveReference}
   *    .additiveCodeableConcept(com.fhir.CodeableConcept) // optional {@link Specimen_Container#additiveCodeableConcept() additiveCodeableConcept}
   *    .modifierExtension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link Specimen_Container#modifierExtension() modifierExtension}
   *    .extension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link Specimen_Container#extension() extension}
   *    .id(String) // optional {@link Specimen_Container#id() id}
   *    .capacity(com.fhir.Quantity) // optional {@link Specimen_Container#capacity() capacity}
   *    .description(String) // optional {@link Specimen_Container#description() description}
   *    .specimenQuantity(com.fhir.Quantity) // optional {@link Specimen_Container#specimenQuantity() specimenQuantity}
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
    private static final long OPT_BIT_IDENTIFIER = 0x2L;
    private static final long OPT_BIT_ADDITIVE_REFERENCE = 0x4L;
    private static final long OPT_BIT_ADDITIVE_CODEABLE_CONCEPT = 0x8L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x10L;
    private static final long OPT_BIT_EXTENSION = 0x20L;
    private static final long OPT_BIT_ID = 0x40L;
    private static final long OPT_BIT_CAPACITY = 0x80L;
    private static final long OPT_BIT_DESCRIPTION = 0x100L;
    private static final long OPT_BIT_SPECIMEN_QUANTITY = 0x200L;
    private long optBits;

    private @Nullable CodeableConcept type;
    private @Nullable List<Identifier> identifier;
    private @Nullable Reference additiveReference;
    private @Nullable CodeableConcept additiveCodeableConcept;
    private @Nullable List<Extension> modifierExtension;
    private @Nullable List<Extension> extension;
    private @Nullable String id;
    private @Nullable Quantity capacity;
    private @Nullable String description;
    private @Nullable Quantity specimenQuantity;

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
     * Builds a new {@link Specimen_Container Specimen_Container}.
     * @return An immutable instance of Specimen_Container
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public Specimen_Container build() {
      return new ImmutableSpecimen_Container(
          type,
          identifier,
          additiveReference,
          additiveCodeableConcept,
          modifierExtension,
          extension,
          id,
          capacity,
          description,
          specimenQuantity);
    }

    private boolean typeIsSet() {
      return (optBits & OPT_BIT_TYPE) != 0;
    }

    private boolean identifierIsSet() {
      return (optBits & OPT_BIT_IDENTIFIER) != 0;
    }

    private boolean additiveReferenceIsSet() {
      return (optBits & OPT_BIT_ADDITIVE_REFERENCE) != 0;
    }

    private boolean additiveCodeableConceptIsSet() {
      return (optBits & OPT_BIT_ADDITIVE_CODEABLE_CONCEPT) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean capacityIsSet() {
      return (optBits & OPT_BIT_CAPACITY) != 0;
    }

    private boolean descriptionIsSet() {
      return (optBits & OPT_BIT_DESCRIPTION) != 0;
    }

    private boolean specimenQuantityIsSet() {
      return (optBits & OPT_BIT_SPECIMEN_QUANTITY) != 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of Specimen_Container is strict, attribute is already set: ".concat(name));
    }
  }
}
