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
 * Immutable implementation of {@link ExplanationOfBenefit_Accident}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableExplanationOfBenefit_Accident.builder()}.
 */
@Generated(from = "ExplanationOfBenefit_Accident", generator = "Immutables")
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableExplanationOfBenefit_Accident
    implements ExplanationOfBenefit_Accident {
  private final @Nullable CodeableConcept type;
  private final @Nullable Reference locationReference;
  private final @Nullable String id;
  private final @Nullable List<Extension> extension;
  private final @Nullable Address locationAddress;
  private final @Nullable List<Extension> modifierExtension;
  private final @Nullable Date date;

  private ImmutableExplanationOfBenefit_Accident(
      @Nullable CodeableConcept type,
      @Nullable Reference locationReference,
      @Nullable String id,
      @Nullable List<Extension> extension,
      @Nullable Address locationAddress,
      @Nullable List<Extension> modifierExtension,
      @Nullable Date date) {
    this.type = type;
    this.locationReference = locationReference;
    this.id = id;
    this.extension = extension;
    this.locationAddress = locationAddress;
    this.modifierExtension = modifierExtension;
    this.date = date;
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
   * @return The value of the {@code locationReference} attribute
   */
  @JsonProperty("locationReference")
  @Override
  public Optional<Reference> locationReference() {
    return Optional.ofNullable(locationReference);
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
   * @return The value of the {@code extension} attribute
   */
  @JsonProperty("extension")
  @Override
  public Optional<List<Extension>> extension() {
    return Optional.ofNullable(extension);
  }

  /**
   * @return The value of the {@code locationAddress} attribute
   */
  @JsonProperty("locationAddress")
  @Override
  public Optional<Address> locationAddress() {
    return Optional.ofNullable(locationAddress);
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
   * @return The value of the {@code date} attribute
   */
  @JsonProperty("date")
  @Override
  public Optional<Date> date() {
    return Optional.ofNullable(date);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ExplanationOfBenefit_Accident#type() type} attribute.
   * @param value The value for type
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExplanationOfBenefit_Accident withType(CodeableConcept value) {
    @Nullable CodeableConcept newValue = Objects.requireNonNull(value, "type");
    if (this.type == newValue) return this;
    return new ImmutableExplanationOfBenefit_Accident(
        newValue,
        this.locationReference,
        this.id,
        this.extension,
        this.locationAddress,
        this.modifierExtension,
        this.date);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ExplanationOfBenefit_Accident#type() type} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for type
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableExplanationOfBenefit_Accident withType(Optional<? extends CodeableConcept> optional) {
    @Nullable CodeableConcept value = optional.orElse(null);
    if (this.type == value) return this;
    return new ImmutableExplanationOfBenefit_Accident(
        value,
        this.locationReference,
        this.id,
        this.extension,
        this.locationAddress,
        this.modifierExtension,
        this.date);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ExplanationOfBenefit_Accident#locationReference() locationReference} attribute.
   * @param value The value for locationReference
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExplanationOfBenefit_Accident withLocationReference(Reference value) {
    @Nullable Reference newValue = Objects.requireNonNull(value, "locationReference");
    if (this.locationReference == newValue) return this;
    return new ImmutableExplanationOfBenefit_Accident(
        this.type,
        newValue,
        this.id,
        this.extension,
        this.locationAddress,
        this.modifierExtension,
        this.date);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ExplanationOfBenefit_Accident#locationReference() locationReference} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for locationReference
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableExplanationOfBenefit_Accident withLocationReference(Optional<? extends Reference> optional) {
    @Nullable Reference value = optional.orElse(null);
    if (this.locationReference == value) return this;
    return new ImmutableExplanationOfBenefit_Accident(
        this.type,
        value,
        this.id,
        this.extension,
        this.locationAddress,
        this.modifierExtension,
        this.date);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ExplanationOfBenefit_Accident#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExplanationOfBenefit_Accident withId(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "id");
    if (Objects.equals(this.id, newValue)) return this;
    return new ImmutableExplanationOfBenefit_Accident(
        this.type,
        this.locationReference,
        newValue,
        this.extension,
        this.locationAddress,
        this.modifierExtension,
        this.date);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ExplanationOfBenefit_Accident#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExplanationOfBenefit_Accident withId(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.id, value)) return this;
    return new ImmutableExplanationOfBenefit_Accident(
        this.type,
        this.locationReference,
        value,
        this.extension,
        this.locationAddress,
        this.modifierExtension,
        this.date);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ExplanationOfBenefit_Accident#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExplanationOfBenefit_Accident withExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableExplanationOfBenefit_Accident(
        this.type,
        this.locationReference,
        this.id,
        newValue,
        this.locationAddress,
        this.modifierExtension,
        this.date);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ExplanationOfBenefit_Accident#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableExplanationOfBenefit_Accident withExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableExplanationOfBenefit_Accident(
        this.type,
        this.locationReference,
        this.id,
        value,
        this.locationAddress,
        this.modifierExtension,
        this.date);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ExplanationOfBenefit_Accident#locationAddress() locationAddress} attribute.
   * @param value The value for locationAddress
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExplanationOfBenefit_Accident withLocationAddress(Address value) {
    @Nullable Address newValue = Objects.requireNonNull(value, "locationAddress");
    if (this.locationAddress == newValue) return this;
    return new ImmutableExplanationOfBenefit_Accident(
        this.type,
        this.locationReference,
        this.id,
        this.extension,
        newValue,
        this.modifierExtension,
        this.date);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ExplanationOfBenefit_Accident#locationAddress() locationAddress} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for locationAddress
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableExplanationOfBenefit_Accident withLocationAddress(Optional<? extends Address> optional) {
    @Nullable Address value = optional.orElse(null);
    if (this.locationAddress == value) return this;
    return new ImmutableExplanationOfBenefit_Accident(
        this.type,
        this.locationReference,
        this.id,
        this.extension,
        value,
        this.modifierExtension,
        this.date);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ExplanationOfBenefit_Accident#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExplanationOfBenefit_Accident withModifierExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableExplanationOfBenefit_Accident(
        this.type,
        this.locationReference,
        this.id,
        this.extension,
        this.locationAddress,
        newValue,
        this.date);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ExplanationOfBenefit_Accident#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableExplanationOfBenefit_Accident withModifierExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableExplanationOfBenefit_Accident(
        this.type,
        this.locationReference,
        this.id,
        this.extension,
        this.locationAddress,
        value,
        this.date);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ExplanationOfBenefit_Accident#date() date} attribute.
   * @param value The value for date
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExplanationOfBenefit_Accident withDate(Date value) {
    @Nullable Date newValue = Objects.requireNonNull(value, "date");
    if (this.date == newValue) return this;
    return new ImmutableExplanationOfBenefit_Accident(
        this.type,
        this.locationReference,
        this.id,
        this.extension,
        this.locationAddress,
        this.modifierExtension,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ExplanationOfBenefit_Accident#date() date} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for date
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableExplanationOfBenefit_Accident withDate(Optional<? extends Date> optional) {
    @Nullable Date value = optional.orElse(null);
    if (this.date == value) return this;
    return new ImmutableExplanationOfBenefit_Accident(
        this.type,
        this.locationReference,
        this.id,
        this.extension,
        this.locationAddress,
        this.modifierExtension,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableExplanationOfBenefit_Accident} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableExplanationOfBenefit_Accident
        && equalTo((ImmutableExplanationOfBenefit_Accident) another);
  }

  private boolean equalTo(ImmutableExplanationOfBenefit_Accident another) {
    return Objects.equals(type, another.type)
        && Objects.equals(locationReference, another.locationReference)
        && Objects.equals(id, another.id)
        && Objects.equals(extension, another.extension)
        && Objects.equals(locationAddress, another.locationAddress)
        && Objects.equals(modifierExtension, another.modifierExtension)
        && Objects.equals(date, another.date);
  }

  /**
   * Computes a hash code from attributes: {@code type}, {@code locationReference}, {@code id}, {@code extension}, {@code locationAddress}, {@code modifierExtension}, {@code date}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(type);
    h += (h << 5) + Objects.hashCode(locationReference);
    h += (h << 5) + Objects.hashCode(id);
    h += (h << 5) + Objects.hashCode(extension);
    h += (h << 5) + Objects.hashCode(locationAddress);
    h += (h << 5) + Objects.hashCode(modifierExtension);
    h += (h << 5) + Objects.hashCode(date);
    return h;
  }

  /**
   * Prints the immutable value {@code ExplanationOfBenefit_Accident} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("ExplanationOfBenefit_Accident{");
    if (type != null) {
      builder.append("type=").append(type);
    }
    if (locationReference != null) {
      if (builder.length() > 30) builder.append(", ");
      builder.append("locationReference=").append(locationReference);
    }
    if (id != null) {
      if (builder.length() > 30) builder.append(", ");
      builder.append("id=").append(id);
    }
    if (extension != null) {
      if (builder.length() > 30) builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (locationAddress != null) {
      if (builder.length() > 30) builder.append(", ");
      builder.append("locationAddress=").append(locationAddress);
    }
    if (modifierExtension != null) {
      if (builder.length() > 30) builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (date != null) {
      if (builder.length() > 30) builder.append(", ");
      builder.append("date=").append(date);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Generated(from = "ExplanationOfBenefit_Accident", generator = "Immutables")
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements ExplanationOfBenefit_Accident {
    @Nullable Optional<CodeableConcept> type = Optional.empty();
    boolean typeIsSet;
    @Nullable Optional<Reference> locationReference = Optional.empty();
    boolean locationReferenceIsSet;
    @Nullable Optional<String> id = Optional.empty();
    boolean idIsSet;
    @Nullable Optional<List<Extension>> extension = Optional.empty();
    boolean extensionIsSet;
    @Nullable Optional<Address> locationAddress = Optional.empty();
    boolean locationAddressIsSet;
    @Nullable Optional<List<Extension>> modifierExtension = Optional.empty();
    boolean modifierExtensionIsSet;
    @Nullable Optional<Date> date = Optional.empty();
    boolean dateIsSet;
    @JsonProperty("type")
    public void setType(Optional<CodeableConcept> type) {
      this.type = type;
      this.typeIsSet = true;
    }
    @JsonProperty("locationReference")
    public void setLocationReference(Optional<Reference> locationReference) {
      this.locationReference = locationReference;
      this.locationReferenceIsSet = true;
    }
    @JsonProperty("id")
    public void setId(Optional<String> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @JsonProperty("extension")
    public void setExtension(Optional<List<Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @JsonProperty("locationAddress")
    public void setLocationAddress(Optional<Address> locationAddress) {
      this.locationAddress = locationAddress;
      this.locationAddressIsSet = true;
    }
    @JsonProperty("modifierExtension")
    public void setModifierExtension(Optional<List<Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @JsonProperty("date")
    public void setDate(Optional<Date> date) {
      this.date = date;
      this.dateIsSet = true;
    }
    @Override
    public Optional<CodeableConcept> type() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Reference> locationReference() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> id() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Address> locationAddress() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Date> date() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableExplanationOfBenefit_Accident fromJson(Json json) {
    ImmutableExplanationOfBenefit_Accident.Builder builder = ImmutableExplanationOfBenefit_Accident.builder();
    if (json.typeIsSet) {
      builder.type(json.type);
    }
    if (json.locationReferenceIsSet) {
      builder.locationReference(json.locationReference);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.locationAddressIsSet) {
      builder.locationAddress(json.locationAddress);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.dateIsSet) {
      builder.date(json.date);
    }
    return (ImmutableExplanationOfBenefit_Accident) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link ExplanationOfBenefit_Accident} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable ExplanationOfBenefit_Accident instance
   */
  public static ExplanationOfBenefit_Accident copyOf(ExplanationOfBenefit_Accident instance) {
    if (instance instanceof ImmutableExplanationOfBenefit_Accident) {
      return (ImmutableExplanationOfBenefit_Accident) instance;
    }
    return ImmutableExplanationOfBenefit_Accident.builder()
        .type(instance.type())
        .locationReference(instance.locationReference())
        .id(instance.id())
        .extension(instance.extension())
        .locationAddress(instance.locationAddress())
        .modifierExtension(instance.modifierExtension())
        .date(instance.date())
        .build();
  }

  /**
   * Creates a builder for {@link ExplanationOfBenefit_Accident ExplanationOfBenefit_Accident}.
   * <pre>
   * ImmutableExplanationOfBenefit_Accident.builder()
   *    .type(com.fhir.types.fhir.CodeableConcept) // optional {@link ExplanationOfBenefit_Accident#type() type}
   *    .locationReference(com.fhir.types.fhir.Reference) // optional {@link ExplanationOfBenefit_Accident#locationReference() locationReference}
   *    .id(String) // optional {@link ExplanationOfBenefit_Accident#id() id}
   *    .extension(List&amp;lt;com.fhir.types.fhir.Extension&amp;gt;) // optional {@link ExplanationOfBenefit_Accident#extension() extension}
   *    .locationAddress(com.fhir.types.fhir.Address) // optional {@link ExplanationOfBenefit_Accident#locationAddress() locationAddress}
   *    .modifierExtension(List&amp;lt;com.fhir.types.fhir.Extension&amp;gt;) // optional {@link ExplanationOfBenefit_Accident#modifierExtension() modifierExtension}
   *    .date(com.fhir.types.fhir.Date) // optional {@link ExplanationOfBenefit_Accident#date() date}
   *    .build();
   * </pre>
   * @return A new ExplanationOfBenefit_Accident builder
   */
  public static ImmutableExplanationOfBenefit_Accident.Builder builder() {
    return new ImmutableExplanationOfBenefit_Accident.Builder();
  }

  /**
   * Builds instances of type {@link ExplanationOfBenefit_Accident ExplanationOfBenefit_Accident}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "ExplanationOfBenefit_Accident", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder {
    private static final long OPT_BIT_TYPE = 0x1L;
    private static final long OPT_BIT_LOCATION_REFERENCE = 0x2L;
    private static final long OPT_BIT_ID = 0x4L;
    private static final long OPT_BIT_EXTENSION = 0x8L;
    private static final long OPT_BIT_LOCATION_ADDRESS = 0x10L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x20L;
    private static final long OPT_BIT_DATE = 0x40L;
    private long optBits;

    private @Nullable CodeableConcept type;
    private @Nullable Reference locationReference;
    private @Nullable String id;
    private @Nullable List<Extension> extension;
    private @Nullable Address locationAddress;
    private @Nullable List<Extension> modifierExtension;
    private @Nullable Date date;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_Accident#type() type} to type.
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
     * Initializes the optional value {@link ExplanationOfBenefit_Accident#type() type} to type.
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
     * Initializes the optional value {@link ExplanationOfBenefit_Accident#locationReference() locationReference} to locationReference.
     * @param locationReference The value for locationReference
     * @return {@code this} builder for chained invocation
     */
    public final Builder locationReference(Reference locationReference) {
      checkNotIsSet(locationReferenceIsSet(), "locationReference");
      this.locationReference = Objects.requireNonNull(locationReference, "locationReference");
      optBits |= OPT_BIT_LOCATION_REFERENCE;
      return this;
    }

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_Accident#locationReference() locationReference} to locationReference.
     * @param locationReference The value for locationReference
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("locationReference")
    public final Builder locationReference(Optional<? extends Reference> locationReference) {
      checkNotIsSet(locationReferenceIsSet(), "locationReference");
      this.locationReference = locationReference.orElse(null);
      optBits |= OPT_BIT_LOCATION_REFERENCE;
      return this;
    }

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_Accident#id() id} to id.
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
     * Initializes the optional value {@link ExplanationOfBenefit_Accident#id() id} to id.
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
     * Initializes the optional value {@link ExplanationOfBenefit_Accident#extension() extension} to extension.
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
     * Initializes the optional value {@link ExplanationOfBenefit_Accident#extension() extension} to extension.
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
     * Initializes the optional value {@link ExplanationOfBenefit_Accident#locationAddress() locationAddress} to locationAddress.
     * @param locationAddress The value for locationAddress
     * @return {@code this} builder for chained invocation
     */
    public final Builder locationAddress(Address locationAddress) {
      checkNotIsSet(locationAddressIsSet(), "locationAddress");
      this.locationAddress = Objects.requireNonNull(locationAddress, "locationAddress");
      optBits |= OPT_BIT_LOCATION_ADDRESS;
      return this;
    }

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_Accident#locationAddress() locationAddress} to locationAddress.
     * @param locationAddress The value for locationAddress
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("locationAddress")
    public final Builder locationAddress(Optional<? extends Address> locationAddress) {
      checkNotIsSet(locationAddressIsSet(), "locationAddress");
      this.locationAddress = locationAddress.orElse(null);
      optBits |= OPT_BIT_LOCATION_ADDRESS;
      return this;
    }

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_Accident#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link ExplanationOfBenefit_Accident#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link ExplanationOfBenefit_Accident#date() date} to date.
     * @param date The value for date
     * @return {@code this} builder for chained invocation
     */
    public final Builder date(Date date) {
      checkNotIsSet(dateIsSet(), "date");
      this.date = Objects.requireNonNull(date, "date");
      optBits |= OPT_BIT_DATE;
      return this;
    }

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_Accident#date() date} to date.
     * @param date The value for date
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("date")
    public final Builder date(Optional<? extends Date> date) {
      checkNotIsSet(dateIsSet(), "date");
      this.date = date.orElse(null);
      optBits |= OPT_BIT_DATE;
      return this;
    }

    /**
     * Builds a new {@link ExplanationOfBenefit_Accident ExplanationOfBenefit_Accident}.
     * @return An immutable instance of ExplanationOfBenefit_Accident
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ExplanationOfBenefit_Accident build() {
      return new ImmutableExplanationOfBenefit_Accident(type, locationReference, id, extension, locationAddress, modifierExtension, date);
    }

    private boolean typeIsSet() {
      return (optBits & OPT_BIT_TYPE) != 0;
    }

    private boolean locationReferenceIsSet() {
      return (optBits & OPT_BIT_LOCATION_REFERENCE) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean locationAddressIsSet() {
      return (optBits & OPT_BIT_LOCATION_ADDRESS) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean dateIsSet() {
      return (optBits & OPT_BIT_DATE) != 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of ExplanationOfBenefit_Accident is strict, attribute is already set: ".concat(name));
    }
  }
}
