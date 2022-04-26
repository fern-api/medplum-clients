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
 * Immutable implementation of {@link MedicinalProductAuthorization_JurisdictionalAuthorization}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableMedicinalProductAuthorization_JurisdictionalAuthorization.builder()}.
 */
@Generated(from = "MedicinalProductAuthorization_JurisdictionalAuthorization", generator = "Immutables")
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableMedicinalProductAuthorization_JurisdictionalAuthorization
    implements MedicinalProductAuthorization_JurisdictionalAuthorization {
  private final @Nullable String id;
  private final @Nullable List<Extension> modifierExtension;
  private final @Nullable CodeableConcept legalStatusOfSupply;
  private final @Nullable List<Extension> extension;
  private final @Nullable CodeableConcept country;
  private final @Nullable Period validityPeriod;
  private final @Nullable List<Identifier> identifier;
  private final @Nullable List<CodeableConcept> jurisdiction;

  private ImmutableMedicinalProductAuthorization_JurisdictionalAuthorization(
      @Nullable String id,
      @Nullable List<Extension> modifierExtension,
      @Nullable CodeableConcept legalStatusOfSupply,
      @Nullable List<Extension> extension,
      @Nullable CodeableConcept country,
      @Nullable Period validityPeriod,
      @Nullable List<Identifier> identifier,
      @Nullable List<CodeableConcept> jurisdiction) {
    this.id = id;
    this.modifierExtension = modifierExtension;
    this.legalStatusOfSupply = legalStatusOfSupply;
    this.extension = extension;
    this.country = country;
    this.validityPeriod = validityPeriod;
    this.identifier = identifier;
    this.jurisdiction = jurisdiction;
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
   * @return The value of the {@code modifierExtension} attribute
   */
  @JsonProperty("modifierExtension")
  @Override
  public Optional<List<Extension>> modifierExtension() {
    return Optional.ofNullable(modifierExtension);
  }

  /**
   * @return The value of the {@code legalStatusOfSupply} attribute
   */
  @JsonProperty("legalStatusOfSupply")
  @Override
  public Optional<CodeableConcept> legalStatusOfSupply() {
    return Optional.ofNullable(legalStatusOfSupply);
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
   * @return The value of the {@code country} attribute
   */
  @JsonProperty("country")
  @Override
  public Optional<CodeableConcept> country() {
    return Optional.ofNullable(country);
  }

  /**
   * @return The value of the {@code validityPeriod} attribute
   */
  @JsonProperty("validityPeriod")
  @Override
  public Optional<Period> validityPeriod() {
    return Optional.ofNullable(validityPeriod);
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
   * @return The value of the {@code jurisdiction} attribute
   */
  @JsonProperty("jurisdiction")
  @Override
  public Optional<List<CodeableConcept>> jurisdiction() {
    return Optional.ofNullable(jurisdiction);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicinalProductAuthorization_JurisdictionalAuthorization#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicinalProductAuthorization_JurisdictionalAuthorization withId(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "id");
    if (Objects.equals(this.id, newValue)) return this;
    return new ImmutableMedicinalProductAuthorization_JurisdictionalAuthorization(
        newValue,
        this.modifierExtension,
        this.legalStatusOfSupply,
        this.extension,
        this.country,
        this.validityPeriod,
        this.identifier,
        this.jurisdiction);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicinalProductAuthorization_JurisdictionalAuthorization#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicinalProductAuthorization_JurisdictionalAuthorization withId(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.id, value)) return this;
    return new ImmutableMedicinalProductAuthorization_JurisdictionalAuthorization(
        value,
        this.modifierExtension,
        this.legalStatusOfSupply,
        this.extension,
        this.country,
        this.validityPeriod,
        this.identifier,
        this.jurisdiction);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicinalProductAuthorization_JurisdictionalAuthorization#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicinalProductAuthorization_JurisdictionalAuthorization withModifierExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableMedicinalProductAuthorization_JurisdictionalAuthorization(
        this.id,
        newValue,
        this.legalStatusOfSupply,
        this.extension,
        this.country,
        this.validityPeriod,
        this.identifier,
        this.jurisdiction);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicinalProductAuthorization_JurisdictionalAuthorization#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicinalProductAuthorization_JurisdictionalAuthorization withModifierExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableMedicinalProductAuthorization_JurisdictionalAuthorization(
        this.id,
        value,
        this.legalStatusOfSupply,
        this.extension,
        this.country,
        this.validityPeriod,
        this.identifier,
        this.jurisdiction);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicinalProductAuthorization_JurisdictionalAuthorization#legalStatusOfSupply() legalStatusOfSupply} attribute.
   * @param value The value for legalStatusOfSupply
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicinalProductAuthorization_JurisdictionalAuthorization withLegalStatusOfSupply(CodeableConcept value) {
    @Nullable CodeableConcept newValue = Objects.requireNonNull(value, "legalStatusOfSupply");
    if (this.legalStatusOfSupply == newValue) return this;
    return new ImmutableMedicinalProductAuthorization_JurisdictionalAuthorization(
        this.id,
        this.modifierExtension,
        newValue,
        this.extension,
        this.country,
        this.validityPeriod,
        this.identifier,
        this.jurisdiction);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicinalProductAuthorization_JurisdictionalAuthorization#legalStatusOfSupply() legalStatusOfSupply} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for legalStatusOfSupply
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicinalProductAuthorization_JurisdictionalAuthorization withLegalStatusOfSupply(Optional<? extends CodeableConcept> optional) {
    @Nullable CodeableConcept value = optional.orElse(null);
    if (this.legalStatusOfSupply == value) return this;
    return new ImmutableMedicinalProductAuthorization_JurisdictionalAuthorization(
        this.id,
        this.modifierExtension,
        value,
        this.extension,
        this.country,
        this.validityPeriod,
        this.identifier,
        this.jurisdiction);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicinalProductAuthorization_JurisdictionalAuthorization#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicinalProductAuthorization_JurisdictionalAuthorization withExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableMedicinalProductAuthorization_JurisdictionalAuthorization(
        this.id,
        this.modifierExtension,
        this.legalStatusOfSupply,
        newValue,
        this.country,
        this.validityPeriod,
        this.identifier,
        this.jurisdiction);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicinalProductAuthorization_JurisdictionalAuthorization#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicinalProductAuthorization_JurisdictionalAuthorization withExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableMedicinalProductAuthorization_JurisdictionalAuthorization(
        this.id,
        this.modifierExtension,
        this.legalStatusOfSupply,
        value,
        this.country,
        this.validityPeriod,
        this.identifier,
        this.jurisdiction);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicinalProductAuthorization_JurisdictionalAuthorization#country() country} attribute.
   * @param value The value for country
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicinalProductAuthorization_JurisdictionalAuthorization withCountry(CodeableConcept value) {
    @Nullable CodeableConcept newValue = Objects.requireNonNull(value, "country");
    if (this.country == newValue) return this;
    return new ImmutableMedicinalProductAuthorization_JurisdictionalAuthorization(
        this.id,
        this.modifierExtension,
        this.legalStatusOfSupply,
        this.extension,
        newValue,
        this.validityPeriod,
        this.identifier,
        this.jurisdiction);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicinalProductAuthorization_JurisdictionalAuthorization#country() country} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for country
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicinalProductAuthorization_JurisdictionalAuthorization withCountry(Optional<? extends CodeableConcept> optional) {
    @Nullable CodeableConcept value = optional.orElse(null);
    if (this.country == value) return this;
    return new ImmutableMedicinalProductAuthorization_JurisdictionalAuthorization(
        this.id,
        this.modifierExtension,
        this.legalStatusOfSupply,
        this.extension,
        value,
        this.validityPeriod,
        this.identifier,
        this.jurisdiction);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicinalProductAuthorization_JurisdictionalAuthorization#validityPeriod() validityPeriod} attribute.
   * @param value The value for validityPeriod
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicinalProductAuthorization_JurisdictionalAuthorization withValidityPeriod(Period value) {
    @Nullable Period newValue = Objects.requireNonNull(value, "validityPeriod");
    if (this.validityPeriod == newValue) return this;
    return new ImmutableMedicinalProductAuthorization_JurisdictionalAuthorization(
        this.id,
        this.modifierExtension,
        this.legalStatusOfSupply,
        this.extension,
        this.country,
        newValue,
        this.identifier,
        this.jurisdiction);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicinalProductAuthorization_JurisdictionalAuthorization#validityPeriod() validityPeriod} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for validityPeriod
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicinalProductAuthorization_JurisdictionalAuthorization withValidityPeriod(Optional<? extends Period> optional) {
    @Nullable Period value = optional.orElse(null);
    if (this.validityPeriod == value) return this;
    return new ImmutableMedicinalProductAuthorization_JurisdictionalAuthorization(
        this.id,
        this.modifierExtension,
        this.legalStatusOfSupply,
        this.extension,
        this.country,
        value,
        this.identifier,
        this.jurisdiction);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicinalProductAuthorization_JurisdictionalAuthorization#identifier() identifier} attribute.
   * @param value The value for identifier
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicinalProductAuthorization_JurisdictionalAuthorization withIdentifier(List<Identifier> value) {
    @Nullable List<Identifier> newValue = Objects.requireNonNull(value, "identifier");
    if (this.identifier == newValue) return this;
    return new ImmutableMedicinalProductAuthorization_JurisdictionalAuthorization(
        this.id,
        this.modifierExtension,
        this.legalStatusOfSupply,
        this.extension,
        this.country,
        this.validityPeriod,
        newValue,
        this.jurisdiction);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicinalProductAuthorization_JurisdictionalAuthorization#identifier() identifier} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for identifier
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicinalProductAuthorization_JurisdictionalAuthorization withIdentifier(Optional<? extends List<Identifier>> optional) {
    @Nullable List<Identifier> value = optional.orElse(null);
    if (this.identifier == value) return this;
    return new ImmutableMedicinalProductAuthorization_JurisdictionalAuthorization(
        this.id,
        this.modifierExtension,
        this.legalStatusOfSupply,
        this.extension,
        this.country,
        this.validityPeriod,
        value,
        this.jurisdiction);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicinalProductAuthorization_JurisdictionalAuthorization#jurisdiction() jurisdiction} attribute.
   * @param value The value for jurisdiction
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicinalProductAuthorization_JurisdictionalAuthorization withJurisdiction(List<CodeableConcept> value) {
    @Nullable List<CodeableConcept> newValue = Objects.requireNonNull(value, "jurisdiction");
    if (this.jurisdiction == newValue) return this;
    return new ImmutableMedicinalProductAuthorization_JurisdictionalAuthorization(
        this.id,
        this.modifierExtension,
        this.legalStatusOfSupply,
        this.extension,
        this.country,
        this.validityPeriod,
        this.identifier,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicinalProductAuthorization_JurisdictionalAuthorization#jurisdiction() jurisdiction} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for jurisdiction
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicinalProductAuthorization_JurisdictionalAuthorization withJurisdiction(Optional<? extends List<CodeableConcept>> optional) {
    @Nullable List<CodeableConcept> value = optional.orElse(null);
    if (this.jurisdiction == value) return this;
    return new ImmutableMedicinalProductAuthorization_JurisdictionalAuthorization(
        this.id,
        this.modifierExtension,
        this.legalStatusOfSupply,
        this.extension,
        this.country,
        this.validityPeriod,
        this.identifier,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableMedicinalProductAuthorization_JurisdictionalAuthorization} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableMedicinalProductAuthorization_JurisdictionalAuthorization
        && equalTo((ImmutableMedicinalProductAuthorization_JurisdictionalAuthorization) another);
  }

  private boolean equalTo(ImmutableMedicinalProductAuthorization_JurisdictionalAuthorization another) {
    return Objects.equals(id, another.id)
        && Objects.equals(modifierExtension, another.modifierExtension)
        && Objects.equals(legalStatusOfSupply, another.legalStatusOfSupply)
        && Objects.equals(extension, another.extension)
        && Objects.equals(country, another.country)
        && Objects.equals(validityPeriod, another.validityPeriod)
        && Objects.equals(identifier, another.identifier)
        && Objects.equals(jurisdiction, another.jurisdiction);
  }

  /**
   * Computes a hash code from attributes: {@code id}, {@code modifierExtension}, {@code legalStatusOfSupply}, {@code extension}, {@code country}, {@code validityPeriod}, {@code identifier}, {@code jurisdiction}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(id);
    h += (h << 5) + Objects.hashCode(modifierExtension);
    h += (h << 5) + Objects.hashCode(legalStatusOfSupply);
    h += (h << 5) + Objects.hashCode(extension);
    h += (h << 5) + Objects.hashCode(country);
    h += (h << 5) + Objects.hashCode(validityPeriod);
    h += (h << 5) + Objects.hashCode(identifier);
    h += (h << 5) + Objects.hashCode(jurisdiction);
    return h;
  }

  /**
   * Prints the immutable value {@code MedicinalProductAuthorization_JurisdictionalAuthorization} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("MedicinalProductAuthorization_JurisdictionalAuthorization{");
    if (id != null) {
      builder.append("id=").append(id);
    }
    if (modifierExtension != null) {
      if (builder.length() > 58) builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (legalStatusOfSupply != null) {
      if (builder.length() > 58) builder.append(", ");
      builder.append("legalStatusOfSupply=").append(legalStatusOfSupply);
    }
    if (extension != null) {
      if (builder.length() > 58) builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (country != null) {
      if (builder.length() > 58) builder.append(", ");
      builder.append("country=").append(country);
    }
    if (validityPeriod != null) {
      if (builder.length() > 58) builder.append(", ");
      builder.append("validityPeriod=").append(validityPeriod);
    }
    if (identifier != null) {
      if (builder.length() > 58) builder.append(", ");
      builder.append("identifier=").append(identifier);
    }
    if (jurisdiction != null) {
      if (builder.length() > 58) builder.append(", ");
      builder.append("jurisdiction=").append(jurisdiction);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Generated(from = "MedicinalProductAuthorization_JurisdictionalAuthorization", generator = "Immutables")
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json
      implements MedicinalProductAuthorization_JurisdictionalAuthorization {
    @Nullable Optional<String> id = Optional.empty();
    boolean idIsSet;
    @Nullable Optional<List<Extension>> modifierExtension = Optional.empty();
    boolean modifierExtensionIsSet;
    @Nullable Optional<CodeableConcept> legalStatusOfSupply = Optional.empty();
    boolean legalStatusOfSupplyIsSet;
    @Nullable Optional<List<Extension>> extension = Optional.empty();
    boolean extensionIsSet;
    @Nullable Optional<CodeableConcept> country = Optional.empty();
    boolean countryIsSet;
    @Nullable Optional<Period> validityPeriod = Optional.empty();
    boolean validityPeriodIsSet;
    @Nullable Optional<List<Identifier>> identifier = Optional.empty();
    boolean identifierIsSet;
    @Nullable Optional<List<CodeableConcept>> jurisdiction = Optional.empty();
    boolean jurisdictionIsSet;
    @JsonProperty("id")
    public void setId(Optional<String> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @JsonProperty("modifierExtension")
    public void setModifierExtension(Optional<List<Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @JsonProperty("legalStatusOfSupply")
    public void setLegalStatusOfSupply(Optional<CodeableConcept> legalStatusOfSupply) {
      this.legalStatusOfSupply = legalStatusOfSupply;
      this.legalStatusOfSupplyIsSet = true;
    }
    @JsonProperty("extension")
    public void setExtension(Optional<List<Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @JsonProperty("country")
    public void setCountry(Optional<CodeableConcept> country) {
      this.country = country;
      this.countryIsSet = true;
    }
    @JsonProperty("validityPeriod")
    public void setValidityPeriod(Optional<Period> validityPeriod) {
      this.validityPeriod = validityPeriod;
      this.validityPeriodIsSet = true;
    }
    @JsonProperty("identifier")
    public void setIdentifier(Optional<List<Identifier>> identifier) {
      this.identifier = identifier;
      this.identifierIsSet = true;
    }
    @JsonProperty("jurisdiction")
    public void setJurisdiction(Optional<List<CodeableConcept>> jurisdiction) {
      this.jurisdiction = jurisdiction;
      this.jurisdictionIsSet = true;
    }
    @Override
    public Optional<String> id() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<CodeableConcept> legalStatusOfSupply() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<CodeableConcept> country() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Period> validityPeriod() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Identifier>> identifier() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<CodeableConcept>> jurisdiction() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableMedicinalProductAuthorization_JurisdictionalAuthorization fromJson(Json json) {
    ImmutableMedicinalProductAuthorization_JurisdictionalAuthorization.Builder builder = ImmutableMedicinalProductAuthorization_JurisdictionalAuthorization.builder();
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.legalStatusOfSupplyIsSet) {
      builder.legalStatusOfSupply(json.legalStatusOfSupply);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.countryIsSet) {
      builder.country(json.country);
    }
    if (json.validityPeriodIsSet) {
      builder.validityPeriod(json.validityPeriod);
    }
    if (json.identifierIsSet) {
      builder.identifier(json.identifier);
    }
    if (json.jurisdictionIsSet) {
      builder.jurisdiction(json.jurisdiction);
    }
    return (ImmutableMedicinalProductAuthorization_JurisdictionalAuthorization) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link MedicinalProductAuthorization_JurisdictionalAuthorization} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable MedicinalProductAuthorization_JurisdictionalAuthorization instance
   */
  public static MedicinalProductAuthorization_JurisdictionalAuthorization copyOf(MedicinalProductAuthorization_JurisdictionalAuthorization instance) {
    if (instance instanceof ImmutableMedicinalProductAuthorization_JurisdictionalAuthorization) {
      return (ImmutableMedicinalProductAuthorization_JurisdictionalAuthorization) instance;
    }
    return ImmutableMedicinalProductAuthorization_JurisdictionalAuthorization.builder()
        .id(instance.id())
        .modifierExtension(instance.modifierExtension())
        .legalStatusOfSupply(instance.legalStatusOfSupply())
        .extension(instance.extension())
        .country(instance.country())
        .validityPeriod(instance.validityPeriod())
        .identifier(instance.identifier())
        .jurisdiction(instance.jurisdiction())
        .build();
  }

  /**
   * Creates a builder for {@link MedicinalProductAuthorization_JurisdictionalAuthorization MedicinalProductAuthorization_JurisdictionalAuthorization}.
   * <pre>
   * ImmutableMedicinalProductAuthorization_JurisdictionalAuthorization.builder()
   *    .id(String) // optional {@link MedicinalProductAuthorization_JurisdictionalAuthorization#id() id}
   *    .modifierExtension(List&amp;lt;com.fhir.types.fhir.Extension&amp;gt;) // optional {@link MedicinalProductAuthorization_JurisdictionalAuthorization#modifierExtension() modifierExtension}
   *    .legalStatusOfSupply(com.fhir.types.fhir.CodeableConcept) // optional {@link MedicinalProductAuthorization_JurisdictionalAuthorization#legalStatusOfSupply() legalStatusOfSupply}
   *    .extension(List&amp;lt;com.fhir.types.fhir.Extension&amp;gt;) // optional {@link MedicinalProductAuthorization_JurisdictionalAuthorization#extension() extension}
   *    .country(com.fhir.types.fhir.CodeableConcept) // optional {@link MedicinalProductAuthorization_JurisdictionalAuthorization#country() country}
   *    .validityPeriod(com.fhir.types.fhir.Period) // optional {@link MedicinalProductAuthorization_JurisdictionalAuthorization#validityPeriod() validityPeriod}
   *    .identifier(List&amp;lt;com.fhir.types.fhir.Identifier&amp;gt;) // optional {@link MedicinalProductAuthorization_JurisdictionalAuthorization#identifier() identifier}
   *    .jurisdiction(List&amp;lt;com.fhir.types.fhir.CodeableConcept&amp;gt;) // optional {@link MedicinalProductAuthorization_JurisdictionalAuthorization#jurisdiction() jurisdiction}
   *    .build();
   * </pre>
   * @return A new MedicinalProductAuthorization_JurisdictionalAuthorization builder
   */
  public static ImmutableMedicinalProductAuthorization_JurisdictionalAuthorization.Builder builder() {
    return new ImmutableMedicinalProductAuthorization_JurisdictionalAuthorization.Builder();
  }

  /**
   * Builds instances of type {@link MedicinalProductAuthorization_JurisdictionalAuthorization MedicinalProductAuthorization_JurisdictionalAuthorization}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "MedicinalProductAuthorization_JurisdictionalAuthorization", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder {
    private static final long OPT_BIT_ID = 0x1L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x2L;
    private static final long OPT_BIT_LEGAL_STATUS_OF_SUPPLY = 0x4L;
    private static final long OPT_BIT_EXTENSION = 0x8L;
    private static final long OPT_BIT_COUNTRY = 0x10L;
    private static final long OPT_BIT_VALIDITY_PERIOD = 0x20L;
    private static final long OPT_BIT_IDENTIFIER = 0x40L;
    private static final long OPT_BIT_JURISDICTION = 0x80L;
    private long optBits;

    private @Nullable String id;
    private @Nullable List<Extension> modifierExtension;
    private @Nullable CodeableConcept legalStatusOfSupply;
    private @Nullable List<Extension> extension;
    private @Nullable CodeableConcept country;
    private @Nullable Period validityPeriod;
    private @Nullable List<Identifier> identifier;
    private @Nullable List<CodeableConcept> jurisdiction;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link MedicinalProductAuthorization_JurisdictionalAuthorization#id() id} to id.
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
     * Initializes the optional value {@link MedicinalProductAuthorization_JurisdictionalAuthorization#id() id} to id.
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
     * Initializes the optional value {@link MedicinalProductAuthorization_JurisdictionalAuthorization#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link MedicinalProductAuthorization_JurisdictionalAuthorization#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link MedicinalProductAuthorization_JurisdictionalAuthorization#legalStatusOfSupply() legalStatusOfSupply} to legalStatusOfSupply.
     * @param legalStatusOfSupply The value for legalStatusOfSupply
     * @return {@code this} builder for chained invocation
     */
    public final Builder legalStatusOfSupply(CodeableConcept legalStatusOfSupply) {
      checkNotIsSet(legalStatusOfSupplyIsSet(), "legalStatusOfSupply");
      this.legalStatusOfSupply = Objects.requireNonNull(legalStatusOfSupply, "legalStatusOfSupply");
      optBits |= OPT_BIT_LEGAL_STATUS_OF_SUPPLY;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicinalProductAuthorization_JurisdictionalAuthorization#legalStatusOfSupply() legalStatusOfSupply} to legalStatusOfSupply.
     * @param legalStatusOfSupply The value for legalStatusOfSupply
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("legalStatusOfSupply")
    public final Builder legalStatusOfSupply(Optional<? extends CodeableConcept> legalStatusOfSupply) {
      checkNotIsSet(legalStatusOfSupplyIsSet(), "legalStatusOfSupply");
      this.legalStatusOfSupply = legalStatusOfSupply.orElse(null);
      optBits |= OPT_BIT_LEGAL_STATUS_OF_SUPPLY;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicinalProductAuthorization_JurisdictionalAuthorization#extension() extension} to extension.
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
     * Initializes the optional value {@link MedicinalProductAuthorization_JurisdictionalAuthorization#extension() extension} to extension.
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
     * Initializes the optional value {@link MedicinalProductAuthorization_JurisdictionalAuthorization#country() country} to country.
     * @param country The value for country
     * @return {@code this} builder for chained invocation
     */
    public final Builder country(CodeableConcept country) {
      checkNotIsSet(countryIsSet(), "country");
      this.country = Objects.requireNonNull(country, "country");
      optBits |= OPT_BIT_COUNTRY;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicinalProductAuthorization_JurisdictionalAuthorization#country() country} to country.
     * @param country The value for country
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("country")
    public final Builder country(Optional<? extends CodeableConcept> country) {
      checkNotIsSet(countryIsSet(), "country");
      this.country = country.orElse(null);
      optBits |= OPT_BIT_COUNTRY;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicinalProductAuthorization_JurisdictionalAuthorization#validityPeriod() validityPeriod} to validityPeriod.
     * @param validityPeriod The value for validityPeriod
     * @return {@code this} builder for chained invocation
     */
    public final Builder validityPeriod(Period validityPeriod) {
      checkNotIsSet(validityPeriodIsSet(), "validityPeriod");
      this.validityPeriod = Objects.requireNonNull(validityPeriod, "validityPeriod");
      optBits |= OPT_BIT_VALIDITY_PERIOD;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicinalProductAuthorization_JurisdictionalAuthorization#validityPeriod() validityPeriod} to validityPeriod.
     * @param validityPeriod The value for validityPeriod
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("validityPeriod")
    public final Builder validityPeriod(Optional<? extends Period> validityPeriod) {
      checkNotIsSet(validityPeriodIsSet(), "validityPeriod");
      this.validityPeriod = validityPeriod.orElse(null);
      optBits |= OPT_BIT_VALIDITY_PERIOD;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicinalProductAuthorization_JurisdictionalAuthorization#identifier() identifier} to identifier.
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
     * Initializes the optional value {@link MedicinalProductAuthorization_JurisdictionalAuthorization#identifier() identifier} to identifier.
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
     * Initializes the optional value {@link MedicinalProductAuthorization_JurisdictionalAuthorization#jurisdiction() jurisdiction} to jurisdiction.
     * @param jurisdiction The value for jurisdiction
     * @return {@code this} builder for chained invocation
     */
    public final Builder jurisdiction(List<CodeableConcept> jurisdiction) {
      checkNotIsSet(jurisdictionIsSet(), "jurisdiction");
      this.jurisdiction = Objects.requireNonNull(jurisdiction, "jurisdiction");
      optBits |= OPT_BIT_JURISDICTION;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicinalProductAuthorization_JurisdictionalAuthorization#jurisdiction() jurisdiction} to jurisdiction.
     * @param jurisdiction The value for jurisdiction
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("jurisdiction")
    public final Builder jurisdiction(Optional<? extends List<CodeableConcept>> jurisdiction) {
      checkNotIsSet(jurisdictionIsSet(), "jurisdiction");
      this.jurisdiction = jurisdiction.orElse(null);
      optBits |= OPT_BIT_JURISDICTION;
      return this;
    }

    /**
     * Builds a new {@link MedicinalProductAuthorization_JurisdictionalAuthorization MedicinalProductAuthorization_JurisdictionalAuthorization}.
     * @return An immutable instance of MedicinalProductAuthorization_JurisdictionalAuthorization
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public MedicinalProductAuthorization_JurisdictionalAuthorization build() {
      return new ImmutableMedicinalProductAuthorization_JurisdictionalAuthorization(
          id,
          modifierExtension,
          legalStatusOfSupply,
          extension,
          country,
          validityPeriod,
          identifier,
          jurisdiction);
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean legalStatusOfSupplyIsSet() {
      return (optBits & OPT_BIT_LEGAL_STATUS_OF_SUPPLY) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean countryIsSet() {
      return (optBits & OPT_BIT_COUNTRY) != 0;
    }

    private boolean validityPeriodIsSet() {
      return (optBits & OPT_BIT_VALIDITY_PERIOD) != 0;
    }

    private boolean identifierIsSet() {
      return (optBits & OPT_BIT_IDENTIFIER) != 0;
    }

    private boolean jurisdictionIsSet() {
      return (optBits & OPT_BIT_JURISDICTION) != 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of MedicinalProductAuthorization_JurisdictionalAuthorization is strict, attribute is already set: ".concat(name));
    }
  }
}
