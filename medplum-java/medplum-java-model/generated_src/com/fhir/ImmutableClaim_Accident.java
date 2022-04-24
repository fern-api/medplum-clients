//-no-import-rewrite
package com.fhir;

import java.lang.Object;
import java.lang.String;
import java.lang.Float;
import java.lang.Double;

/**
 * Immutable implementation of {@link Claim_Accident}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableClaim_Accident.builder()}.
 */
@org.immutables.value.Generated(from = "Claim_Accident", generator = "Immutables")
@SuppressWarnings({"all"})
@edu.umd.cs.findbugs.annotations.SuppressFBWarnings
@javax.annotation.ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@javax.annotation.concurrent.Immutable
@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableClaim_Accident implements com.fhir.Claim_Accident {
  private final @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension;
  private final @javax.annotation.Nullable com.fhir.CodeableConcept type;
  private final @javax.annotation.Nullable com.fhir.Reference locationReference;
  private final @javax.annotation.Nullable com.fhir.date date;
  private final @javax.annotation.Nullable java.lang.String id;
  private final @javax.annotation.Nullable com.fhir.Address locationAddress;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension;

  private ImmutableClaim_Accident(
      @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension,
      @javax.annotation.Nullable com.fhir.CodeableConcept type,
      @javax.annotation.Nullable com.fhir.Reference locationReference,
      @javax.annotation.Nullable com.fhir.date date,
      @javax.annotation.Nullable java.lang.String id,
      @javax.annotation.Nullable com.fhir.Address locationAddress,
      @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension) {
    this.extension = extension;
    this.type = type;
    this.locationReference = locationReference;
    this.date = date;
    this.id = id;
    this.locationAddress = locationAddress;
    this.modifierExtension = modifierExtension;
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
   * @return The value of the {@code type} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("type")
  @Override
  public java.util.Optional<com.fhir.CodeableConcept> type() {
    return java.util.Optional.ofNullable(type);
  }

  /**
   * @return The value of the {@code locationReference} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("locationReference")
  @Override
  public java.util.Optional<com.fhir.Reference> locationReference() {
    return java.util.Optional.ofNullable(locationReference);
  }

  /**
   * @return The value of the {@code date} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("date")
  @Override
  public java.util.Optional<com.fhir.date> date() {
    return java.util.Optional.ofNullable(date);
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
   * @return The value of the {@code locationAddress} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("locationAddress")
  @Override
  public java.util.Optional<com.fhir.Address> locationAddress() {
    return java.util.Optional.ofNullable(locationAddress);
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
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Claim_Accident#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableClaim_Accident withExtension(java.util.List<com.fhir.Extension> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> newValue = java.util.Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableClaim_Accident(
        newValue,
        this.type,
        this.locationReference,
        this.date,
        this.id,
        this.locationAddress,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Claim_Accident#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableClaim_Accident withExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableClaim_Accident(
        value,
        this.type,
        this.locationReference,
        this.date,
        this.id,
        this.locationAddress,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Claim_Accident#type() type} attribute.
   * @param value The value for type
   * @return A modified copy of {@code this} object
   */
  public final ImmutableClaim_Accident withType(com.fhir.CodeableConcept value) {
    @javax.annotation.Nullable com.fhir.CodeableConcept newValue = java.util.Objects.requireNonNull(value, "type");
    if (this.type == newValue) return this;
    return new ImmutableClaim_Accident(
        this.extension,
        newValue,
        this.locationReference,
        this.date,
        this.id,
        this.locationAddress,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Claim_Accident#type() type} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for type
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableClaim_Accident withType(java.util.Optional<? extends com.fhir.CodeableConcept> optional) {
    @javax.annotation.Nullable com.fhir.CodeableConcept value = optional.orElse(null);
    if (this.type == value) return this;
    return new ImmutableClaim_Accident(
        this.extension,
        value,
        this.locationReference,
        this.date,
        this.id,
        this.locationAddress,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Claim_Accident#locationReference() locationReference} attribute.
   * @param value The value for locationReference
   * @return A modified copy of {@code this} object
   */
  public final ImmutableClaim_Accident withLocationReference(com.fhir.Reference value) {
    @javax.annotation.Nullable com.fhir.Reference newValue = java.util.Objects.requireNonNull(value, "locationReference");
    if (this.locationReference == newValue) return this;
    return new ImmutableClaim_Accident(
        this.extension,
        this.type,
        newValue,
        this.date,
        this.id,
        this.locationAddress,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Claim_Accident#locationReference() locationReference} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for locationReference
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableClaim_Accident withLocationReference(java.util.Optional<? extends com.fhir.Reference> optional) {
    @javax.annotation.Nullable com.fhir.Reference value = optional.orElse(null);
    if (this.locationReference == value) return this;
    return new ImmutableClaim_Accident(
        this.extension,
        this.type,
        value,
        this.date,
        this.id,
        this.locationAddress,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Claim_Accident#date() date} attribute.
   * @param value The value for date
   * @return A modified copy of {@code this} object
   */
  public final ImmutableClaim_Accident withDate(com.fhir.date value) {
    @javax.annotation.Nullable com.fhir.date newValue = java.util.Objects.requireNonNull(value, "date");
    if (this.date == newValue) return this;
    return new ImmutableClaim_Accident(
        this.extension,
        this.type,
        this.locationReference,
        newValue,
        this.id,
        this.locationAddress,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Claim_Accident#date() date} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for date
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableClaim_Accident withDate(java.util.Optional<? extends com.fhir.date> optional) {
    @javax.annotation.Nullable com.fhir.date value = optional.orElse(null);
    if (this.date == value) return this;
    return new ImmutableClaim_Accident(
        this.extension,
        this.type,
        this.locationReference,
        value,
        this.id,
        this.locationAddress,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Claim_Accident#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableClaim_Accident withId(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "id");
    if (java.util.Objects.equals(this.id, newValue)) return this;
    return new ImmutableClaim_Accident(
        this.extension,
        this.type,
        this.locationReference,
        this.date,
        newValue,
        this.locationAddress,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Claim_Accident#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableClaim_Accident withId(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.id, value)) return this;
    return new ImmutableClaim_Accident(
        this.extension,
        this.type,
        this.locationReference,
        this.date,
        value,
        this.locationAddress,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Claim_Accident#locationAddress() locationAddress} attribute.
   * @param value The value for locationAddress
   * @return A modified copy of {@code this} object
   */
  public final ImmutableClaim_Accident withLocationAddress(com.fhir.Address value) {
    @javax.annotation.Nullable com.fhir.Address newValue = java.util.Objects.requireNonNull(value, "locationAddress");
    if (this.locationAddress == newValue) return this;
    return new ImmutableClaim_Accident(
        this.extension,
        this.type,
        this.locationReference,
        this.date,
        this.id,
        newValue,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Claim_Accident#locationAddress() locationAddress} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for locationAddress
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableClaim_Accident withLocationAddress(java.util.Optional<? extends com.fhir.Address> optional) {
    @javax.annotation.Nullable com.fhir.Address value = optional.orElse(null);
    if (this.locationAddress == value) return this;
    return new ImmutableClaim_Accident(
        this.extension,
        this.type,
        this.locationReference,
        this.date,
        this.id,
        value,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Claim_Accident#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableClaim_Accident withModifierExtension(java.util.List<com.fhir.Extension> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> newValue = java.util.Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableClaim_Accident(
        this.extension,
        this.type,
        this.locationReference,
        this.date,
        this.id,
        this.locationAddress,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Claim_Accident#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableClaim_Accident withModifierExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableClaim_Accident(
        this.extension,
        this.type,
        this.locationReference,
        this.date,
        this.id,
        this.locationAddress,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableClaim_Accident} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@javax.annotation.Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableClaim_Accident
        && equalTo((ImmutableClaim_Accident) another);
  }

  private boolean equalTo(ImmutableClaim_Accident another) {
    return java.util.Objects.equals(extension, another.extension)
        && java.util.Objects.equals(type, another.type)
        && java.util.Objects.equals(locationReference, another.locationReference)
        && java.util.Objects.equals(date, another.date)
        && java.util.Objects.equals(id, another.id)
        && java.util.Objects.equals(locationAddress, another.locationAddress)
        && java.util.Objects.equals(modifierExtension, another.modifierExtension);
  }

  /**
   * Computes a hash code from attributes: {@code extension}, {@code type}, {@code locationReference}, {@code date}, {@code id}, {@code locationAddress}, {@code modifierExtension}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + java.util.Objects.hashCode(extension);
    h += (h << 5) + java.util.Objects.hashCode(type);
    h += (h << 5) + java.util.Objects.hashCode(locationReference);
    h += (h << 5) + java.util.Objects.hashCode(date);
    h += (h << 5) + java.util.Objects.hashCode(id);
    h += (h << 5) + java.util.Objects.hashCode(locationAddress);
    h += (h << 5) + java.util.Objects.hashCode(modifierExtension);
    return h;
  }

  /**
   * Prints the immutable value {@code Claim_Accident} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    java.lang.StringBuilder builder = new java.lang.StringBuilder("Claim_Accident{");
    if (extension != null) {
      builder.append("extension=").append(extension);
    }
    if (type != null) {
      if (builder.length() > 15) builder.append(", ");
      builder.append("type=").append(type);
    }
    if (locationReference != null) {
      if (builder.length() > 15) builder.append(", ");
      builder.append("locationReference=").append(locationReference);
    }
    if (date != null) {
      if (builder.length() > 15) builder.append(", ");
      builder.append("date=").append(date);
    }
    if (id != null) {
      if (builder.length() > 15) builder.append(", ");
      builder.append("id=").append(id);
    }
    if (locationAddress != null) {
      if (builder.length() > 15) builder.append(", ");
      builder.append("locationAddress=").append(locationAddress);
    }
    if (modifierExtension != null) {
      if (builder.length() > 15) builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @org.immutables.value.Generated(from = "Claim_Accident", generator = "Immutables")
  @Deprecated
  @com.fasterxml.jackson.databind.annotation.JsonDeserialize
  @com.fasterxml.jackson.annotation.JsonAutoDetect(fieldVisibility = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.NONE)
  static final class Json implements com.fhir.Claim_Accident {
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Extension>> extension = java.util.Optional.empty();
    boolean extensionIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.CodeableConcept> type = java.util.Optional.empty();
    boolean typeIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Reference> locationReference = java.util.Optional.empty();
    boolean locationReferenceIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.date> date = java.util.Optional.empty();
    boolean dateIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.String> id = java.util.Optional.empty();
    boolean idIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Address> locationAddress = java.util.Optional.empty();
    boolean locationAddressIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension = java.util.Optional.empty();
    boolean modifierExtensionIsSet;
    @com.fasterxml.jackson.annotation.JsonProperty("extension")
    public void setExtension(java.util.Optional<java.util.List<com.fhir.Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("type")
    public void setType(java.util.Optional<com.fhir.CodeableConcept> type) {
      this.type = type;
      this.typeIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("locationReference")
    public void setLocationReference(java.util.Optional<com.fhir.Reference> locationReference) {
      this.locationReference = locationReference;
      this.locationReferenceIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("date")
    public void setDate(java.util.Optional<com.fhir.date> date) {
      this.date = date;
      this.dateIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    public void setId(java.util.Optional<java.lang.String> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("locationAddress")
    public void setLocationAddress(java.util.Optional<com.fhir.Address> locationAddress) {
      this.locationAddress = locationAddress;
      this.locationAddressIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("modifierExtension")
    public void setModifierExtension(java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.CodeableConcept> type() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Reference> locationReference() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.date> date() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.String> id() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Address> locationAddress() { throw new UnsupportedOperationException(); }
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
  static ImmutableClaim_Accident fromJson(Json json) {
    ImmutableClaim_Accident.Builder builder = ImmutableClaim_Accident.builder();
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.typeIsSet) {
      builder.type(json.type);
    }
    if (json.locationReferenceIsSet) {
      builder.locationReference(json.locationReference);
    }
    if (json.dateIsSet) {
      builder.date(json.date);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.locationAddressIsSet) {
      builder.locationAddress(json.locationAddress);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    return (ImmutableClaim_Accident) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link Claim_Accident} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable Claim_Accident instance
   */
  public static Claim_Accident copyOf(Claim_Accident instance) {
    if (instance instanceof ImmutableClaim_Accident) {
      return (ImmutableClaim_Accident) instance;
    }
    return ImmutableClaim_Accident.builder()
        .extension(instance.extension())
        .type(instance.type())
        .locationReference(instance.locationReference())
        .date(instance.date())
        .id(instance.id())
        .locationAddress(instance.locationAddress())
        .modifierExtension(instance.modifierExtension())
        .build();
  }

  /**
   * Creates a builder for {@link Claim_Accident Claim_Accident}.
   * <pre>
   * ImmutableClaim_Accident.builder()
   *    .extension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link Claim_Accident#extension() extension}
   *    .type(com.fhir.CodeableConcept) // optional {@link Claim_Accident#type() type}
   *    .locationReference(com.fhir.Reference) // optional {@link Claim_Accident#locationReference() locationReference}
   *    .date(com.fhir.date) // optional {@link Claim_Accident#date() date}
   *    .id(String) // optional {@link Claim_Accident#id() id}
   *    .locationAddress(com.fhir.Address) // optional {@link Claim_Accident#locationAddress() locationAddress}
   *    .modifierExtension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link Claim_Accident#modifierExtension() modifierExtension}
   *    .build();
   * </pre>
   * @return A new Claim_Accident builder
   */
  public static ImmutableClaim_Accident.Builder builder() {
    return new ImmutableClaim_Accident.Builder();
  }

  /**
   * Builds instances of type {@link Claim_Accident Claim_Accident}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @org.immutables.value.Generated(from = "Claim_Accident", generator = "Immutables")
  @javax.annotation.concurrent.NotThreadSafe
  public static final class Builder {
    private static final long OPT_BIT_EXTENSION = 0x1L;
    private static final long OPT_BIT_TYPE = 0x2L;
    private static final long OPT_BIT_LOCATION_REFERENCE = 0x4L;
    private static final long OPT_BIT_DATE = 0x8L;
    private static final long OPT_BIT_ID = 0x10L;
    private static final long OPT_BIT_LOCATION_ADDRESS = 0x20L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x40L;
    private long optBits;

    private @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension;
    private @javax.annotation.Nullable com.fhir.CodeableConcept type;
    private @javax.annotation.Nullable com.fhir.Reference locationReference;
    private @javax.annotation.Nullable com.fhir.date date;
    private @javax.annotation.Nullable java.lang.String id;
    private @javax.annotation.Nullable com.fhir.Address locationAddress;
    private @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link Claim_Accident#extension() extension} to extension.
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
     * Initializes the optional value {@link Claim_Accident#extension() extension} to extension.
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
     * Initializes the optional value {@link Claim_Accident#type() type} to type.
     * @param type The value for type
     * @return {@code this} builder for chained invocation
     */
    public final Builder type(com.fhir.CodeableConcept type) {
      checkNotIsSet(typeIsSet(), "type");
      this.type = java.util.Objects.requireNonNull(type, "type");
      optBits |= OPT_BIT_TYPE;
      return this;
    }

    /**
     * Initializes the optional value {@link Claim_Accident#type() type} to type.
     * @param type The value for type
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("type")
    public final Builder type(java.util.Optional<? extends com.fhir.CodeableConcept> type) {
      checkNotIsSet(typeIsSet(), "type");
      this.type = type.orElse(null);
      optBits |= OPT_BIT_TYPE;
      return this;
    }

    /**
     * Initializes the optional value {@link Claim_Accident#locationReference() locationReference} to locationReference.
     * @param locationReference The value for locationReference
     * @return {@code this} builder for chained invocation
     */
    public final Builder locationReference(com.fhir.Reference locationReference) {
      checkNotIsSet(locationReferenceIsSet(), "locationReference");
      this.locationReference = java.util.Objects.requireNonNull(locationReference, "locationReference");
      optBits |= OPT_BIT_LOCATION_REFERENCE;
      return this;
    }

    /**
     * Initializes the optional value {@link Claim_Accident#locationReference() locationReference} to locationReference.
     * @param locationReference The value for locationReference
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("locationReference")
    public final Builder locationReference(java.util.Optional<? extends com.fhir.Reference> locationReference) {
      checkNotIsSet(locationReferenceIsSet(), "locationReference");
      this.locationReference = locationReference.orElse(null);
      optBits |= OPT_BIT_LOCATION_REFERENCE;
      return this;
    }

    /**
     * Initializes the optional value {@link Claim_Accident#date() date} to date.
     * @param date The value for date
     * @return {@code this} builder for chained invocation
     */
    public final Builder date(com.fhir.date date) {
      checkNotIsSet(dateIsSet(), "date");
      this.date = java.util.Objects.requireNonNull(date, "date");
      optBits |= OPT_BIT_DATE;
      return this;
    }

    /**
     * Initializes the optional value {@link Claim_Accident#date() date} to date.
     * @param date The value for date
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("date")
    public final Builder date(java.util.Optional<? extends com.fhir.date> date) {
      checkNotIsSet(dateIsSet(), "date");
      this.date = date.orElse(null);
      optBits |= OPT_BIT_DATE;
      return this;
    }

    /**
     * Initializes the optional value {@link Claim_Accident#id() id} to id.
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
     * Initializes the optional value {@link Claim_Accident#id() id} to id.
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
     * Initializes the optional value {@link Claim_Accident#locationAddress() locationAddress} to locationAddress.
     * @param locationAddress The value for locationAddress
     * @return {@code this} builder for chained invocation
     */
    public final Builder locationAddress(com.fhir.Address locationAddress) {
      checkNotIsSet(locationAddressIsSet(), "locationAddress");
      this.locationAddress = java.util.Objects.requireNonNull(locationAddress, "locationAddress");
      optBits |= OPT_BIT_LOCATION_ADDRESS;
      return this;
    }

    /**
     * Initializes the optional value {@link Claim_Accident#locationAddress() locationAddress} to locationAddress.
     * @param locationAddress The value for locationAddress
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("locationAddress")
    public final Builder locationAddress(java.util.Optional<? extends com.fhir.Address> locationAddress) {
      checkNotIsSet(locationAddressIsSet(), "locationAddress");
      this.locationAddress = locationAddress.orElse(null);
      optBits |= OPT_BIT_LOCATION_ADDRESS;
      return this;
    }

    /**
     * Initializes the optional value {@link Claim_Accident#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link Claim_Accident#modifierExtension() modifierExtension} to modifierExtension.
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
     * Builds a new {@link Claim_Accident Claim_Accident}.
     * @return An immutable instance of Claim_Accident
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public com.fhir.Claim_Accident build() {
      return new ImmutableClaim_Accident(extension, type, locationReference, date, id, locationAddress, modifierExtension);
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean typeIsSet() {
      return (optBits & OPT_BIT_TYPE) != 0;
    }

    private boolean locationReferenceIsSet() {
      return (optBits & OPT_BIT_LOCATION_REFERENCE) != 0;
    }

    private boolean dateIsSet() {
      return (optBits & OPT_BIT_DATE) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean locationAddressIsSet() {
      return (optBits & OPT_BIT_LOCATION_ADDRESS) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new java.lang.IllegalStateException("Builder of Claim_Accident is strict, attribute is already set: ".concat(name));
    }
  }
}
