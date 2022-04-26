package com.medplum.types.fhir;

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
 * Immutable implementation of {@link InsurancePlan_Plan}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableInsurancePlan_Plan.builder()}.
 */
@Generated(from = "InsurancePlan_Plan", generator = "Immutables")
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableInsurancePlan_Plan implements InsurancePlan_Plan {
  private final @Nullable List<Identifier> identifier;
  private final @Nullable List<InsurancePlan_SpecificCost> specificCost;
  private final @Nullable CodeableConcept type;
  private final @Nullable List<Extension> extension;
  private final @Nullable List<Reference> coverageArea;
  private final @Nullable List<Extension> modifierExtension;
  private final @Nullable List<Reference> network;
  private final @Nullable String id;
  private final @Nullable List<InsurancePlan_GeneralCost> generalCost;

  private ImmutableInsurancePlan_Plan(
      @Nullable List<Identifier> identifier,
      @Nullable List<InsurancePlan_SpecificCost> specificCost,
      @Nullable CodeableConcept type,
      @Nullable List<Extension> extension,
      @Nullable List<Reference> coverageArea,
      @Nullable List<Extension> modifierExtension,
      @Nullable List<Reference> network,
      @Nullable String id,
      @Nullable List<InsurancePlan_GeneralCost> generalCost) {
    this.identifier = identifier;
    this.specificCost = specificCost;
    this.type = type;
    this.extension = extension;
    this.coverageArea = coverageArea;
    this.modifierExtension = modifierExtension;
    this.network = network;
    this.id = id;
    this.generalCost = generalCost;
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
   * @return The value of the {@code specificCost} attribute
   */
  @JsonProperty("specificCost")
  @Override
  public Optional<List<InsurancePlan_SpecificCost>> specificCost() {
    return Optional.ofNullable(specificCost);
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
   * @return The value of the {@code coverageArea} attribute
   */
  @JsonProperty("coverageArea")
  @Override
  public Optional<List<Reference>> coverageArea() {
    return Optional.ofNullable(coverageArea);
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
   * @return The value of the {@code network} attribute
   */
  @JsonProperty("network")
  @Override
  public Optional<List<Reference>> network() {
    return Optional.ofNullable(network);
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
   * @return The value of the {@code generalCost} attribute
   */
  @JsonProperty("generalCost")
  @Override
  public Optional<List<InsurancePlan_GeneralCost>> generalCost() {
    return Optional.ofNullable(generalCost);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link InsurancePlan_Plan#identifier() identifier} attribute.
   * @param value The value for identifier
   * @return A modified copy of {@code this} object
   */
  public final ImmutableInsurancePlan_Plan withIdentifier(List<Identifier> value) {
    @Nullable List<Identifier> newValue = Objects.requireNonNull(value, "identifier");
    if (this.identifier == newValue) return this;
    return new ImmutableInsurancePlan_Plan(
        newValue,
        this.specificCost,
        this.type,
        this.extension,
        this.coverageArea,
        this.modifierExtension,
        this.network,
        this.id,
        this.generalCost);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link InsurancePlan_Plan#identifier() identifier} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for identifier
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableInsurancePlan_Plan withIdentifier(Optional<? extends List<Identifier>> optional) {
    @Nullable List<Identifier> value = optional.orElse(null);
    if (this.identifier == value) return this;
    return new ImmutableInsurancePlan_Plan(
        value,
        this.specificCost,
        this.type,
        this.extension,
        this.coverageArea,
        this.modifierExtension,
        this.network,
        this.id,
        this.generalCost);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link InsurancePlan_Plan#specificCost() specificCost} attribute.
   * @param value The value for specificCost
   * @return A modified copy of {@code this} object
   */
  public final ImmutableInsurancePlan_Plan withSpecificCost(List<InsurancePlan_SpecificCost> value) {
    @Nullable List<InsurancePlan_SpecificCost> newValue = Objects.requireNonNull(value, "specificCost");
    if (this.specificCost == newValue) return this;
    return new ImmutableInsurancePlan_Plan(
        this.identifier,
        newValue,
        this.type,
        this.extension,
        this.coverageArea,
        this.modifierExtension,
        this.network,
        this.id,
        this.generalCost);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link InsurancePlan_Plan#specificCost() specificCost} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for specificCost
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableInsurancePlan_Plan withSpecificCost(Optional<? extends List<InsurancePlan_SpecificCost>> optional) {
    @Nullable List<InsurancePlan_SpecificCost> value = optional.orElse(null);
    if (this.specificCost == value) return this;
    return new ImmutableInsurancePlan_Plan(
        this.identifier,
        value,
        this.type,
        this.extension,
        this.coverageArea,
        this.modifierExtension,
        this.network,
        this.id,
        this.generalCost);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link InsurancePlan_Plan#type() type} attribute.
   * @param value The value for type
   * @return A modified copy of {@code this} object
   */
  public final ImmutableInsurancePlan_Plan withType(CodeableConcept value) {
    @Nullable CodeableConcept newValue = Objects.requireNonNull(value, "type");
    if (this.type == newValue) return this;
    return new ImmutableInsurancePlan_Plan(
        this.identifier,
        this.specificCost,
        newValue,
        this.extension,
        this.coverageArea,
        this.modifierExtension,
        this.network,
        this.id,
        this.generalCost);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link InsurancePlan_Plan#type() type} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for type
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableInsurancePlan_Plan withType(Optional<? extends CodeableConcept> optional) {
    @Nullable CodeableConcept value = optional.orElse(null);
    if (this.type == value) return this;
    return new ImmutableInsurancePlan_Plan(
        this.identifier,
        this.specificCost,
        value,
        this.extension,
        this.coverageArea,
        this.modifierExtension,
        this.network,
        this.id,
        this.generalCost);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link InsurancePlan_Plan#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableInsurancePlan_Plan withExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableInsurancePlan_Plan(
        this.identifier,
        this.specificCost,
        this.type,
        newValue,
        this.coverageArea,
        this.modifierExtension,
        this.network,
        this.id,
        this.generalCost);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link InsurancePlan_Plan#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableInsurancePlan_Plan withExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableInsurancePlan_Plan(
        this.identifier,
        this.specificCost,
        this.type,
        value,
        this.coverageArea,
        this.modifierExtension,
        this.network,
        this.id,
        this.generalCost);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link InsurancePlan_Plan#coverageArea() coverageArea} attribute.
   * @param value The value for coverageArea
   * @return A modified copy of {@code this} object
   */
  public final ImmutableInsurancePlan_Plan withCoverageArea(List<Reference> value) {
    @Nullable List<Reference> newValue = Objects.requireNonNull(value, "coverageArea");
    if (this.coverageArea == newValue) return this;
    return new ImmutableInsurancePlan_Plan(
        this.identifier,
        this.specificCost,
        this.type,
        this.extension,
        newValue,
        this.modifierExtension,
        this.network,
        this.id,
        this.generalCost);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link InsurancePlan_Plan#coverageArea() coverageArea} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for coverageArea
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableInsurancePlan_Plan withCoverageArea(Optional<? extends List<Reference>> optional) {
    @Nullable List<Reference> value = optional.orElse(null);
    if (this.coverageArea == value) return this;
    return new ImmutableInsurancePlan_Plan(
        this.identifier,
        this.specificCost,
        this.type,
        this.extension,
        value,
        this.modifierExtension,
        this.network,
        this.id,
        this.generalCost);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link InsurancePlan_Plan#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableInsurancePlan_Plan withModifierExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableInsurancePlan_Plan(
        this.identifier,
        this.specificCost,
        this.type,
        this.extension,
        this.coverageArea,
        newValue,
        this.network,
        this.id,
        this.generalCost);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link InsurancePlan_Plan#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableInsurancePlan_Plan withModifierExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableInsurancePlan_Plan(
        this.identifier,
        this.specificCost,
        this.type,
        this.extension,
        this.coverageArea,
        value,
        this.network,
        this.id,
        this.generalCost);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link InsurancePlan_Plan#network() network} attribute.
   * @param value The value for network
   * @return A modified copy of {@code this} object
   */
  public final ImmutableInsurancePlan_Plan withNetwork(List<Reference> value) {
    @Nullable List<Reference> newValue = Objects.requireNonNull(value, "network");
    if (this.network == newValue) return this;
    return new ImmutableInsurancePlan_Plan(
        this.identifier,
        this.specificCost,
        this.type,
        this.extension,
        this.coverageArea,
        this.modifierExtension,
        newValue,
        this.id,
        this.generalCost);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link InsurancePlan_Plan#network() network} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for network
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableInsurancePlan_Plan withNetwork(Optional<? extends List<Reference>> optional) {
    @Nullable List<Reference> value = optional.orElse(null);
    if (this.network == value) return this;
    return new ImmutableInsurancePlan_Plan(
        this.identifier,
        this.specificCost,
        this.type,
        this.extension,
        this.coverageArea,
        this.modifierExtension,
        value,
        this.id,
        this.generalCost);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link InsurancePlan_Plan#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableInsurancePlan_Plan withId(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "id");
    if (Objects.equals(this.id, newValue)) return this;
    return new ImmutableInsurancePlan_Plan(
        this.identifier,
        this.specificCost,
        this.type,
        this.extension,
        this.coverageArea,
        this.modifierExtension,
        this.network,
        newValue,
        this.generalCost);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link InsurancePlan_Plan#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableInsurancePlan_Plan withId(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.id, value)) return this;
    return new ImmutableInsurancePlan_Plan(
        this.identifier,
        this.specificCost,
        this.type,
        this.extension,
        this.coverageArea,
        this.modifierExtension,
        this.network,
        value,
        this.generalCost);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link InsurancePlan_Plan#generalCost() generalCost} attribute.
   * @param value The value for generalCost
   * @return A modified copy of {@code this} object
   */
  public final ImmutableInsurancePlan_Plan withGeneralCost(List<InsurancePlan_GeneralCost> value) {
    @Nullable List<InsurancePlan_GeneralCost> newValue = Objects.requireNonNull(value, "generalCost");
    if (this.generalCost == newValue) return this;
    return new ImmutableInsurancePlan_Plan(
        this.identifier,
        this.specificCost,
        this.type,
        this.extension,
        this.coverageArea,
        this.modifierExtension,
        this.network,
        this.id,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link InsurancePlan_Plan#generalCost() generalCost} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for generalCost
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableInsurancePlan_Plan withGeneralCost(Optional<? extends List<InsurancePlan_GeneralCost>> optional) {
    @Nullable List<InsurancePlan_GeneralCost> value = optional.orElse(null);
    if (this.generalCost == value) return this;
    return new ImmutableInsurancePlan_Plan(
        this.identifier,
        this.specificCost,
        this.type,
        this.extension,
        this.coverageArea,
        this.modifierExtension,
        this.network,
        this.id,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableInsurancePlan_Plan} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableInsurancePlan_Plan
        && equalTo((ImmutableInsurancePlan_Plan) another);
  }

  private boolean equalTo(ImmutableInsurancePlan_Plan another) {
    return Objects.equals(identifier, another.identifier)
        && Objects.equals(specificCost, another.specificCost)
        && Objects.equals(type, another.type)
        && Objects.equals(extension, another.extension)
        && Objects.equals(coverageArea, another.coverageArea)
        && Objects.equals(modifierExtension, another.modifierExtension)
        && Objects.equals(network, another.network)
        && Objects.equals(id, another.id)
        && Objects.equals(generalCost, another.generalCost);
  }

  /**
   * Computes a hash code from attributes: {@code identifier}, {@code specificCost}, {@code type}, {@code extension}, {@code coverageArea}, {@code modifierExtension}, {@code network}, {@code id}, {@code generalCost}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(identifier);
    h += (h << 5) + Objects.hashCode(specificCost);
    h += (h << 5) + Objects.hashCode(type);
    h += (h << 5) + Objects.hashCode(extension);
    h += (h << 5) + Objects.hashCode(coverageArea);
    h += (h << 5) + Objects.hashCode(modifierExtension);
    h += (h << 5) + Objects.hashCode(network);
    h += (h << 5) + Objects.hashCode(id);
    h += (h << 5) + Objects.hashCode(generalCost);
    return h;
  }

  /**
   * Prints the immutable value {@code InsurancePlan_Plan} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("InsurancePlan_Plan{");
    if (identifier != null) {
      builder.append("identifier=").append(identifier);
    }
    if (specificCost != null) {
      if (builder.length() > 19) builder.append(", ");
      builder.append("specificCost=").append(specificCost);
    }
    if (type != null) {
      if (builder.length() > 19) builder.append(", ");
      builder.append("type=").append(type);
    }
    if (extension != null) {
      if (builder.length() > 19) builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (coverageArea != null) {
      if (builder.length() > 19) builder.append(", ");
      builder.append("coverageArea=").append(coverageArea);
    }
    if (modifierExtension != null) {
      if (builder.length() > 19) builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (network != null) {
      if (builder.length() > 19) builder.append(", ");
      builder.append("network=").append(network);
    }
    if (id != null) {
      if (builder.length() > 19) builder.append(", ");
      builder.append("id=").append(id);
    }
    if (generalCost != null) {
      if (builder.length() > 19) builder.append(", ");
      builder.append("generalCost=").append(generalCost);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Generated(from = "InsurancePlan_Plan", generator = "Immutables")
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements InsurancePlan_Plan {
    @Nullable Optional<List<Identifier>> identifier = Optional.empty();
    boolean identifierIsSet;
    @Nullable Optional<List<InsurancePlan_SpecificCost>> specificCost = Optional.empty();
    boolean specificCostIsSet;
    @Nullable Optional<CodeableConcept> type = Optional.empty();
    boolean typeIsSet;
    @Nullable Optional<List<Extension>> extension = Optional.empty();
    boolean extensionIsSet;
    @Nullable Optional<List<Reference>> coverageArea = Optional.empty();
    boolean coverageAreaIsSet;
    @Nullable Optional<List<Extension>> modifierExtension = Optional.empty();
    boolean modifierExtensionIsSet;
    @Nullable Optional<List<Reference>> network = Optional.empty();
    boolean networkIsSet;
    @Nullable Optional<String> id = Optional.empty();
    boolean idIsSet;
    @Nullable Optional<List<InsurancePlan_GeneralCost>> generalCost = Optional.empty();
    boolean generalCostIsSet;
    @JsonProperty("identifier")
    public void setIdentifier(Optional<List<Identifier>> identifier) {
      this.identifier = identifier;
      this.identifierIsSet = true;
    }
    @JsonProperty("specificCost")
    public void setSpecificCost(Optional<List<InsurancePlan_SpecificCost>> specificCost) {
      this.specificCost = specificCost;
      this.specificCostIsSet = true;
    }
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
    @JsonProperty("coverageArea")
    public void setCoverageArea(Optional<List<Reference>> coverageArea) {
      this.coverageArea = coverageArea;
      this.coverageAreaIsSet = true;
    }
    @JsonProperty("modifierExtension")
    public void setModifierExtension(Optional<List<Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @JsonProperty("network")
    public void setNetwork(Optional<List<Reference>> network) {
      this.network = network;
      this.networkIsSet = true;
    }
    @JsonProperty("id")
    public void setId(Optional<String> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @JsonProperty("generalCost")
    public void setGeneralCost(Optional<List<InsurancePlan_GeneralCost>> generalCost) {
      this.generalCost = generalCost;
      this.generalCostIsSet = true;
    }
    @Override
    public Optional<List<Identifier>> identifier() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<InsurancePlan_SpecificCost>> specificCost() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<CodeableConcept> type() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Reference>> coverageArea() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Reference>> network() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> id() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<InsurancePlan_GeneralCost>> generalCost() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableInsurancePlan_Plan fromJson(Json json) {
    ImmutableInsurancePlan_Plan.Builder builder = ImmutableInsurancePlan_Plan.builder();
    if (json.identifierIsSet) {
      builder.identifier(json.identifier);
    }
    if (json.specificCostIsSet) {
      builder.specificCost(json.specificCost);
    }
    if (json.typeIsSet) {
      builder.type(json.type);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.coverageAreaIsSet) {
      builder.coverageArea(json.coverageArea);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.networkIsSet) {
      builder.network(json.network);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.generalCostIsSet) {
      builder.generalCost(json.generalCost);
    }
    return (ImmutableInsurancePlan_Plan) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link InsurancePlan_Plan} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable InsurancePlan_Plan instance
   */
  public static InsurancePlan_Plan copyOf(InsurancePlan_Plan instance) {
    if (instance instanceof ImmutableInsurancePlan_Plan) {
      return (ImmutableInsurancePlan_Plan) instance;
    }
    return ImmutableInsurancePlan_Plan.builder()
        .identifier(instance.identifier())
        .specificCost(instance.specificCost())
        .type(instance.type())
        .extension(instance.extension())
        .coverageArea(instance.coverageArea())
        .modifierExtension(instance.modifierExtension())
        .network(instance.network())
        .id(instance.id())
        .generalCost(instance.generalCost())
        .build();
  }

  /**
   * Creates a builder for {@link InsurancePlan_Plan InsurancePlan_Plan}.
   * <pre>
   * ImmutableInsurancePlan_Plan.builder()
   *    .identifier(List&amp;lt;com.medplum.types.fhir.Identifier&amp;gt;) // optional {@link InsurancePlan_Plan#identifier() identifier}
   *    .specificCost(List&amp;lt;com.medplum.types.fhir.InsurancePlan_SpecificCost&amp;gt;) // optional {@link InsurancePlan_Plan#specificCost() specificCost}
   *    .type(com.medplum.types.fhir.CodeableConcept) // optional {@link InsurancePlan_Plan#type() type}
   *    .extension(List&amp;lt;com.medplum.types.fhir.Extension&amp;gt;) // optional {@link InsurancePlan_Plan#extension() extension}
   *    .coverageArea(List&amp;lt;com.medplum.types.fhir.Reference&amp;gt;) // optional {@link InsurancePlan_Plan#coverageArea() coverageArea}
   *    .modifierExtension(List&amp;lt;com.medplum.types.fhir.Extension&amp;gt;) // optional {@link InsurancePlan_Plan#modifierExtension() modifierExtension}
   *    .network(List&amp;lt;com.medplum.types.fhir.Reference&amp;gt;) // optional {@link InsurancePlan_Plan#network() network}
   *    .id(String) // optional {@link InsurancePlan_Plan#id() id}
   *    .generalCost(List&amp;lt;com.medplum.types.fhir.InsurancePlan_GeneralCost&amp;gt;) // optional {@link InsurancePlan_Plan#generalCost() generalCost}
   *    .build();
   * </pre>
   * @return A new InsurancePlan_Plan builder
   */
  public static ImmutableInsurancePlan_Plan.Builder builder() {
    return new ImmutableInsurancePlan_Plan.Builder();
  }

  /**
   * Builds instances of type {@link InsurancePlan_Plan InsurancePlan_Plan}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "InsurancePlan_Plan", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder {
    private static final long OPT_BIT_IDENTIFIER = 0x1L;
    private static final long OPT_BIT_SPECIFIC_COST = 0x2L;
    private static final long OPT_BIT_TYPE = 0x4L;
    private static final long OPT_BIT_EXTENSION = 0x8L;
    private static final long OPT_BIT_COVERAGE_AREA = 0x10L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x20L;
    private static final long OPT_BIT_NETWORK = 0x40L;
    private static final long OPT_BIT_ID = 0x80L;
    private static final long OPT_BIT_GENERAL_COST = 0x100L;
    private long optBits;

    private @Nullable List<Identifier> identifier;
    private @Nullable List<InsurancePlan_SpecificCost> specificCost;
    private @Nullable CodeableConcept type;
    private @Nullable List<Extension> extension;
    private @Nullable List<Reference> coverageArea;
    private @Nullable List<Extension> modifierExtension;
    private @Nullable List<Reference> network;
    private @Nullable String id;
    private @Nullable List<InsurancePlan_GeneralCost> generalCost;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link InsurancePlan_Plan#identifier() identifier} to identifier.
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
     * Initializes the optional value {@link InsurancePlan_Plan#identifier() identifier} to identifier.
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
     * Initializes the optional value {@link InsurancePlan_Plan#specificCost() specificCost} to specificCost.
     * @param specificCost The value for specificCost
     * @return {@code this} builder for chained invocation
     */
    public final Builder specificCost(List<InsurancePlan_SpecificCost> specificCost) {
      checkNotIsSet(specificCostIsSet(), "specificCost");
      this.specificCost = Objects.requireNonNull(specificCost, "specificCost");
      optBits |= OPT_BIT_SPECIFIC_COST;
      return this;
    }

    /**
     * Initializes the optional value {@link InsurancePlan_Plan#specificCost() specificCost} to specificCost.
     * @param specificCost The value for specificCost
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("specificCost")
    public final Builder specificCost(Optional<? extends List<InsurancePlan_SpecificCost>> specificCost) {
      checkNotIsSet(specificCostIsSet(), "specificCost");
      this.specificCost = specificCost.orElse(null);
      optBits |= OPT_BIT_SPECIFIC_COST;
      return this;
    }

    /**
     * Initializes the optional value {@link InsurancePlan_Plan#type() type} to type.
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
     * Initializes the optional value {@link InsurancePlan_Plan#type() type} to type.
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
     * Initializes the optional value {@link InsurancePlan_Plan#extension() extension} to extension.
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
     * Initializes the optional value {@link InsurancePlan_Plan#extension() extension} to extension.
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
     * Initializes the optional value {@link InsurancePlan_Plan#coverageArea() coverageArea} to coverageArea.
     * @param coverageArea The value for coverageArea
     * @return {@code this} builder for chained invocation
     */
    public final Builder coverageArea(List<Reference> coverageArea) {
      checkNotIsSet(coverageAreaIsSet(), "coverageArea");
      this.coverageArea = Objects.requireNonNull(coverageArea, "coverageArea");
      optBits |= OPT_BIT_COVERAGE_AREA;
      return this;
    }

    /**
     * Initializes the optional value {@link InsurancePlan_Plan#coverageArea() coverageArea} to coverageArea.
     * @param coverageArea The value for coverageArea
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("coverageArea")
    public final Builder coverageArea(Optional<? extends List<Reference>> coverageArea) {
      checkNotIsSet(coverageAreaIsSet(), "coverageArea");
      this.coverageArea = coverageArea.orElse(null);
      optBits |= OPT_BIT_COVERAGE_AREA;
      return this;
    }

    /**
     * Initializes the optional value {@link InsurancePlan_Plan#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link InsurancePlan_Plan#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link InsurancePlan_Plan#network() network} to network.
     * @param network The value for network
     * @return {@code this} builder for chained invocation
     */
    public final Builder network(List<Reference> network) {
      checkNotIsSet(networkIsSet(), "network");
      this.network = Objects.requireNonNull(network, "network");
      optBits |= OPT_BIT_NETWORK;
      return this;
    }

    /**
     * Initializes the optional value {@link InsurancePlan_Plan#network() network} to network.
     * @param network The value for network
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("network")
    public final Builder network(Optional<? extends List<Reference>> network) {
      checkNotIsSet(networkIsSet(), "network");
      this.network = network.orElse(null);
      optBits |= OPT_BIT_NETWORK;
      return this;
    }

    /**
     * Initializes the optional value {@link InsurancePlan_Plan#id() id} to id.
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
     * Initializes the optional value {@link InsurancePlan_Plan#id() id} to id.
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
     * Initializes the optional value {@link InsurancePlan_Plan#generalCost() generalCost} to generalCost.
     * @param generalCost The value for generalCost
     * @return {@code this} builder for chained invocation
     */
    public final Builder generalCost(List<InsurancePlan_GeneralCost> generalCost) {
      checkNotIsSet(generalCostIsSet(), "generalCost");
      this.generalCost = Objects.requireNonNull(generalCost, "generalCost");
      optBits |= OPT_BIT_GENERAL_COST;
      return this;
    }

    /**
     * Initializes the optional value {@link InsurancePlan_Plan#generalCost() generalCost} to generalCost.
     * @param generalCost The value for generalCost
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("generalCost")
    public final Builder generalCost(Optional<? extends List<InsurancePlan_GeneralCost>> generalCost) {
      checkNotIsSet(generalCostIsSet(), "generalCost");
      this.generalCost = generalCost.orElse(null);
      optBits |= OPT_BIT_GENERAL_COST;
      return this;
    }

    /**
     * Builds a new {@link InsurancePlan_Plan InsurancePlan_Plan}.
     * @return An immutable instance of InsurancePlan_Plan
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public InsurancePlan_Plan build() {
      return new ImmutableInsurancePlan_Plan(
          identifier,
          specificCost,
          type,
          extension,
          coverageArea,
          modifierExtension,
          network,
          id,
          generalCost);
    }

    private boolean identifierIsSet() {
      return (optBits & OPT_BIT_IDENTIFIER) != 0;
    }

    private boolean specificCostIsSet() {
      return (optBits & OPT_BIT_SPECIFIC_COST) != 0;
    }

    private boolean typeIsSet() {
      return (optBits & OPT_BIT_TYPE) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean coverageAreaIsSet() {
      return (optBits & OPT_BIT_COVERAGE_AREA) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean networkIsSet() {
      return (optBits & OPT_BIT_NETWORK) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean generalCostIsSet() {
      return (optBits & OPT_BIT_GENERAL_COST) != 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of InsurancePlan_Plan is strict, attribute is already set: ".concat(name));
    }
  }
}
