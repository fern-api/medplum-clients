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
 * Immutable implementation of {@link SubstanceSpecification_Isotope}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableSubstanceSpecification_Isotope.builder()}.
 */
@Generated(from = "SubstanceSpecification_Isotope", generator = "Immutables")
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableSubstanceSpecification_Isotope
    implements SubstanceSpecification_Isotope {
  private final @Nullable CodeableConcept name;
  private final @Nullable String id;
  private final @Nullable List<Extension> extension;
  private final @Nullable CodeableConcept substitution;
  private final @Nullable List<Extension> modifierExtension;
  private final @Nullable SubstanceSpecification_MolecularWeight molecularWeight;
  private final @Nullable Quantity halfLife;
  private final @Nullable Identifier identifier;

  private ImmutableSubstanceSpecification_Isotope(
      @Nullable CodeableConcept name,
      @Nullable String id,
      @Nullable List<Extension> extension,
      @Nullable CodeableConcept substitution,
      @Nullable List<Extension> modifierExtension,
      @Nullable SubstanceSpecification_MolecularWeight molecularWeight,
      @Nullable Quantity halfLife,
      @Nullable Identifier identifier) {
    this.name = name;
    this.id = id;
    this.extension = extension;
    this.substitution = substitution;
    this.modifierExtension = modifierExtension;
    this.molecularWeight = molecularWeight;
    this.halfLife = halfLife;
    this.identifier = identifier;
  }

  /**
   * @return The value of the {@code name} attribute
   */
  @JsonProperty("name")
  @Override
  public Optional<CodeableConcept> name() {
    return Optional.ofNullable(name);
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
   * @return The value of the {@code substitution} attribute
   */
  @JsonProperty("substitution")
  @Override
  public Optional<CodeableConcept> substitution() {
    return Optional.ofNullable(substitution);
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
   * @return The value of the {@code molecularWeight} attribute
   */
  @JsonProperty("molecularWeight")
  @Override
  public Optional<SubstanceSpecification_MolecularWeight> molecularWeight() {
    return Optional.ofNullable(molecularWeight);
  }

  /**
   * @return The value of the {@code halfLife} attribute
   */
  @JsonProperty("halfLife")
  @Override
  public Optional<Quantity> halfLife() {
    return Optional.ofNullable(halfLife);
  }

  /**
   * @return The value of the {@code identifier} attribute
   */
  @JsonProperty("identifier")
  @Override
  public Optional<Identifier> identifier() {
    return Optional.ofNullable(identifier);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SubstanceSpecification_Isotope#name() name} attribute.
   * @param value The value for name
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubstanceSpecification_Isotope withName(CodeableConcept value) {
    @Nullable CodeableConcept newValue = Objects.requireNonNull(value, "name");
    if (this.name == newValue) return this;
    return new ImmutableSubstanceSpecification_Isotope(
        newValue,
        this.id,
        this.extension,
        this.substitution,
        this.modifierExtension,
        this.molecularWeight,
        this.halfLife,
        this.identifier);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SubstanceSpecification_Isotope#name() name} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for name
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSubstanceSpecification_Isotope withName(Optional<? extends CodeableConcept> optional) {
    @Nullable CodeableConcept value = optional.orElse(null);
    if (this.name == value) return this;
    return new ImmutableSubstanceSpecification_Isotope(
        value,
        this.id,
        this.extension,
        this.substitution,
        this.modifierExtension,
        this.molecularWeight,
        this.halfLife,
        this.identifier);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SubstanceSpecification_Isotope#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubstanceSpecification_Isotope withId(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "id");
    if (Objects.equals(this.id, newValue)) return this;
    return new ImmutableSubstanceSpecification_Isotope(
        this.name,
        newValue,
        this.extension,
        this.substitution,
        this.modifierExtension,
        this.molecularWeight,
        this.halfLife,
        this.identifier);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SubstanceSpecification_Isotope#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubstanceSpecification_Isotope withId(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.id, value)) return this;
    return new ImmutableSubstanceSpecification_Isotope(
        this.name,
        value,
        this.extension,
        this.substitution,
        this.modifierExtension,
        this.molecularWeight,
        this.halfLife,
        this.identifier);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SubstanceSpecification_Isotope#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubstanceSpecification_Isotope withExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableSubstanceSpecification_Isotope(
        this.name,
        this.id,
        newValue,
        this.substitution,
        this.modifierExtension,
        this.molecularWeight,
        this.halfLife,
        this.identifier);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SubstanceSpecification_Isotope#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSubstanceSpecification_Isotope withExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableSubstanceSpecification_Isotope(
        this.name,
        this.id,
        value,
        this.substitution,
        this.modifierExtension,
        this.molecularWeight,
        this.halfLife,
        this.identifier);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SubstanceSpecification_Isotope#substitution() substitution} attribute.
   * @param value The value for substitution
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubstanceSpecification_Isotope withSubstitution(CodeableConcept value) {
    @Nullable CodeableConcept newValue = Objects.requireNonNull(value, "substitution");
    if (this.substitution == newValue) return this;
    return new ImmutableSubstanceSpecification_Isotope(
        this.name,
        this.id,
        this.extension,
        newValue,
        this.modifierExtension,
        this.molecularWeight,
        this.halfLife,
        this.identifier);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SubstanceSpecification_Isotope#substitution() substitution} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for substitution
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSubstanceSpecification_Isotope withSubstitution(Optional<? extends CodeableConcept> optional) {
    @Nullable CodeableConcept value = optional.orElse(null);
    if (this.substitution == value) return this;
    return new ImmutableSubstanceSpecification_Isotope(
        this.name,
        this.id,
        this.extension,
        value,
        this.modifierExtension,
        this.molecularWeight,
        this.halfLife,
        this.identifier);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SubstanceSpecification_Isotope#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubstanceSpecification_Isotope withModifierExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableSubstanceSpecification_Isotope(
        this.name,
        this.id,
        this.extension,
        this.substitution,
        newValue,
        this.molecularWeight,
        this.halfLife,
        this.identifier);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SubstanceSpecification_Isotope#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSubstanceSpecification_Isotope withModifierExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableSubstanceSpecification_Isotope(
        this.name,
        this.id,
        this.extension,
        this.substitution,
        value,
        this.molecularWeight,
        this.halfLife,
        this.identifier);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SubstanceSpecification_Isotope#molecularWeight() molecularWeight} attribute.
   * @param value The value for molecularWeight
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubstanceSpecification_Isotope withMolecularWeight(SubstanceSpecification_MolecularWeight value) {
    @Nullable SubstanceSpecification_MolecularWeight newValue = Objects.requireNonNull(value, "molecularWeight");
    if (this.molecularWeight == newValue) return this;
    return new ImmutableSubstanceSpecification_Isotope(
        this.name,
        this.id,
        this.extension,
        this.substitution,
        this.modifierExtension,
        newValue,
        this.halfLife,
        this.identifier);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SubstanceSpecification_Isotope#molecularWeight() molecularWeight} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for molecularWeight
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSubstanceSpecification_Isotope withMolecularWeight(Optional<? extends SubstanceSpecification_MolecularWeight> optional) {
    @Nullable SubstanceSpecification_MolecularWeight value = optional.orElse(null);
    if (this.molecularWeight == value) return this;
    return new ImmutableSubstanceSpecification_Isotope(
        this.name,
        this.id,
        this.extension,
        this.substitution,
        this.modifierExtension,
        value,
        this.halfLife,
        this.identifier);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SubstanceSpecification_Isotope#halfLife() halfLife} attribute.
   * @param value The value for halfLife
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubstanceSpecification_Isotope withHalfLife(Quantity value) {
    @Nullable Quantity newValue = Objects.requireNonNull(value, "halfLife");
    if (this.halfLife == newValue) return this;
    return new ImmutableSubstanceSpecification_Isotope(
        this.name,
        this.id,
        this.extension,
        this.substitution,
        this.modifierExtension,
        this.molecularWeight,
        newValue,
        this.identifier);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SubstanceSpecification_Isotope#halfLife() halfLife} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for halfLife
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSubstanceSpecification_Isotope withHalfLife(Optional<? extends Quantity> optional) {
    @Nullable Quantity value = optional.orElse(null);
    if (this.halfLife == value) return this;
    return new ImmutableSubstanceSpecification_Isotope(
        this.name,
        this.id,
        this.extension,
        this.substitution,
        this.modifierExtension,
        this.molecularWeight,
        value,
        this.identifier);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SubstanceSpecification_Isotope#identifier() identifier} attribute.
   * @param value The value for identifier
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubstanceSpecification_Isotope withIdentifier(Identifier value) {
    @Nullable Identifier newValue = Objects.requireNonNull(value, "identifier");
    if (this.identifier == newValue) return this;
    return new ImmutableSubstanceSpecification_Isotope(
        this.name,
        this.id,
        this.extension,
        this.substitution,
        this.modifierExtension,
        this.molecularWeight,
        this.halfLife,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SubstanceSpecification_Isotope#identifier() identifier} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for identifier
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSubstanceSpecification_Isotope withIdentifier(Optional<? extends Identifier> optional) {
    @Nullable Identifier value = optional.orElse(null);
    if (this.identifier == value) return this;
    return new ImmutableSubstanceSpecification_Isotope(
        this.name,
        this.id,
        this.extension,
        this.substitution,
        this.modifierExtension,
        this.molecularWeight,
        this.halfLife,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableSubstanceSpecification_Isotope} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableSubstanceSpecification_Isotope
        && equalTo((ImmutableSubstanceSpecification_Isotope) another);
  }

  private boolean equalTo(ImmutableSubstanceSpecification_Isotope another) {
    return Objects.equals(name, another.name)
        && Objects.equals(id, another.id)
        && Objects.equals(extension, another.extension)
        && Objects.equals(substitution, another.substitution)
        && Objects.equals(modifierExtension, another.modifierExtension)
        && Objects.equals(molecularWeight, another.molecularWeight)
        && Objects.equals(halfLife, another.halfLife)
        && Objects.equals(identifier, another.identifier);
  }

  /**
   * Computes a hash code from attributes: {@code name}, {@code id}, {@code extension}, {@code substitution}, {@code modifierExtension}, {@code molecularWeight}, {@code halfLife}, {@code identifier}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(name);
    h += (h << 5) + Objects.hashCode(id);
    h += (h << 5) + Objects.hashCode(extension);
    h += (h << 5) + Objects.hashCode(substitution);
    h += (h << 5) + Objects.hashCode(modifierExtension);
    h += (h << 5) + Objects.hashCode(molecularWeight);
    h += (h << 5) + Objects.hashCode(halfLife);
    h += (h << 5) + Objects.hashCode(identifier);
    return h;
  }

  /**
   * Prints the immutable value {@code SubstanceSpecification_Isotope} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("SubstanceSpecification_Isotope{");
    if (name != null) {
      builder.append("name=").append(name);
    }
    if (id != null) {
      if (builder.length() > 31) builder.append(", ");
      builder.append("id=").append(id);
    }
    if (extension != null) {
      if (builder.length() > 31) builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (substitution != null) {
      if (builder.length() > 31) builder.append(", ");
      builder.append("substitution=").append(substitution);
    }
    if (modifierExtension != null) {
      if (builder.length() > 31) builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (molecularWeight != null) {
      if (builder.length() > 31) builder.append(", ");
      builder.append("molecularWeight=").append(molecularWeight);
    }
    if (halfLife != null) {
      if (builder.length() > 31) builder.append(", ");
      builder.append("halfLife=").append(halfLife);
    }
    if (identifier != null) {
      if (builder.length() > 31) builder.append(", ");
      builder.append("identifier=").append(identifier);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Generated(from = "SubstanceSpecification_Isotope", generator = "Immutables")
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements SubstanceSpecification_Isotope {
    @Nullable Optional<CodeableConcept> name = Optional.empty();
    boolean nameIsSet;
    @Nullable Optional<String> id = Optional.empty();
    boolean idIsSet;
    @Nullable Optional<List<Extension>> extension = Optional.empty();
    boolean extensionIsSet;
    @Nullable Optional<CodeableConcept> substitution = Optional.empty();
    boolean substitutionIsSet;
    @Nullable Optional<List<Extension>> modifierExtension = Optional.empty();
    boolean modifierExtensionIsSet;
    @Nullable Optional<SubstanceSpecification_MolecularWeight> molecularWeight = Optional.empty();
    boolean molecularWeightIsSet;
    @Nullable Optional<Quantity> halfLife = Optional.empty();
    boolean halfLifeIsSet;
    @Nullable Optional<Identifier> identifier = Optional.empty();
    boolean identifierIsSet;
    @JsonProperty("name")
    public void setName(Optional<CodeableConcept> name) {
      this.name = name;
      this.nameIsSet = true;
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
    @JsonProperty("substitution")
    public void setSubstitution(Optional<CodeableConcept> substitution) {
      this.substitution = substitution;
      this.substitutionIsSet = true;
    }
    @JsonProperty("modifierExtension")
    public void setModifierExtension(Optional<List<Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @JsonProperty("molecularWeight")
    public void setMolecularWeight(Optional<SubstanceSpecification_MolecularWeight> molecularWeight) {
      this.molecularWeight = molecularWeight;
      this.molecularWeightIsSet = true;
    }
    @JsonProperty("halfLife")
    public void setHalfLife(Optional<Quantity> halfLife) {
      this.halfLife = halfLife;
      this.halfLifeIsSet = true;
    }
    @JsonProperty("identifier")
    public void setIdentifier(Optional<Identifier> identifier) {
      this.identifier = identifier;
      this.identifierIsSet = true;
    }
    @Override
    public Optional<CodeableConcept> name() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> id() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<CodeableConcept> substitution() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<SubstanceSpecification_MolecularWeight> molecularWeight() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Quantity> halfLife() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Identifier> identifier() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableSubstanceSpecification_Isotope fromJson(Json json) {
    ImmutableSubstanceSpecification_Isotope.Builder builder = ImmutableSubstanceSpecification_Isotope.builder();
    if (json.nameIsSet) {
      builder.name(json.name);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.substitutionIsSet) {
      builder.substitution(json.substitution);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.molecularWeightIsSet) {
      builder.molecularWeight(json.molecularWeight);
    }
    if (json.halfLifeIsSet) {
      builder.halfLife(json.halfLife);
    }
    if (json.identifierIsSet) {
      builder.identifier(json.identifier);
    }
    return (ImmutableSubstanceSpecification_Isotope) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link SubstanceSpecification_Isotope} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable SubstanceSpecification_Isotope instance
   */
  public static SubstanceSpecification_Isotope copyOf(SubstanceSpecification_Isotope instance) {
    if (instance instanceof ImmutableSubstanceSpecification_Isotope) {
      return (ImmutableSubstanceSpecification_Isotope) instance;
    }
    return ImmutableSubstanceSpecification_Isotope.builder()
        .name(instance.name())
        .id(instance.id())
        .extension(instance.extension())
        .substitution(instance.substitution())
        .modifierExtension(instance.modifierExtension())
        .molecularWeight(instance.molecularWeight())
        .halfLife(instance.halfLife())
        .identifier(instance.identifier())
        .build();
  }

  /**
   * Creates a builder for {@link SubstanceSpecification_Isotope SubstanceSpecification_Isotope}.
   * <pre>
   * ImmutableSubstanceSpecification_Isotope.builder()
   *    .name(com.fhir.types.fhir.CodeableConcept) // optional {@link SubstanceSpecification_Isotope#name() name}
   *    .id(String) // optional {@link SubstanceSpecification_Isotope#id() id}
   *    .extension(List&amp;lt;com.fhir.types.fhir.Extension&amp;gt;) // optional {@link SubstanceSpecification_Isotope#extension() extension}
   *    .substitution(com.fhir.types.fhir.CodeableConcept) // optional {@link SubstanceSpecification_Isotope#substitution() substitution}
   *    .modifierExtension(List&amp;lt;com.fhir.types.fhir.Extension&amp;gt;) // optional {@link SubstanceSpecification_Isotope#modifierExtension() modifierExtension}
   *    .molecularWeight(com.fhir.types.fhir.SubstanceSpecification_MolecularWeight) // optional {@link SubstanceSpecification_Isotope#molecularWeight() molecularWeight}
   *    .halfLife(com.fhir.types.fhir.Quantity) // optional {@link SubstanceSpecification_Isotope#halfLife() halfLife}
   *    .identifier(com.fhir.types.fhir.Identifier) // optional {@link SubstanceSpecification_Isotope#identifier() identifier}
   *    .build();
   * </pre>
   * @return A new SubstanceSpecification_Isotope builder
   */
  public static ImmutableSubstanceSpecification_Isotope.Builder builder() {
    return new ImmutableSubstanceSpecification_Isotope.Builder();
  }

  /**
   * Builds instances of type {@link SubstanceSpecification_Isotope SubstanceSpecification_Isotope}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "SubstanceSpecification_Isotope", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder {
    private static final long OPT_BIT_NAME = 0x1L;
    private static final long OPT_BIT_ID = 0x2L;
    private static final long OPT_BIT_EXTENSION = 0x4L;
    private static final long OPT_BIT_SUBSTITUTION = 0x8L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x10L;
    private static final long OPT_BIT_MOLECULAR_WEIGHT = 0x20L;
    private static final long OPT_BIT_HALF_LIFE = 0x40L;
    private static final long OPT_BIT_IDENTIFIER = 0x80L;
    private long optBits;

    private @Nullable CodeableConcept name;
    private @Nullable String id;
    private @Nullable List<Extension> extension;
    private @Nullable CodeableConcept substitution;
    private @Nullable List<Extension> modifierExtension;
    private @Nullable SubstanceSpecification_MolecularWeight molecularWeight;
    private @Nullable Quantity halfLife;
    private @Nullable Identifier identifier;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link SubstanceSpecification_Isotope#name() name} to name.
     * @param name The value for name
     * @return {@code this} builder for chained invocation
     */
    public final Builder name(CodeableConcept name) {
      checkNotIsSet(nameIsSet(), "name");
      this.name = Objects.requireNonNull(name, "name");
      optBits |= OPT_BIT_NAME;
      return this;
    }

    /**
     * Initializes the optional value {@link SubstanceSpecification_Isotope#name() name} to name.
     * @param name The value for name
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("name")
    public final Builder name(Optional<? extends CodeableConcept> name) {
      checkNotIsSet(nameIsSet(), "name");
      this.name = name.orElse(null);
      optBits |= OPT_BIT_NAME;
      return this;
    }

    /**
     * Initializes the optional value {@link SubstanceSpecification_Isotope#id() id} to id.
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
     * Initializes the optional value {@link SubstanceSpecification_Isotope#id() id} to id.
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
     * Initializes the optional value {@link SubstanceSpecification_Isotope#extension() extension} to extension.
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
     * Initializes the optional value {@link SubstanceSpecification_Isotope#extension() extension} to extension.
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
     * Initializes the optional value {@link SubstanceSpecification_Isotope#substitution() substitution} to substitution.
     * @param substitution The value for substitution
     * @return {@code this} builder for chained invocation
     */
    public final Builder substitution(CodeableConcept substitution) {
      checkNotIsSet(substitutionIsSet(), "substitution");
      this.substitution = Objects.requireNonNull(substitution, "substitution");
      optBits |= OPT_BIT_SUBSTITUTION;
      return this;
    }

    /**
     * Initializes the optional value {@link SubstanceSpecification_Isotope#substitution() substitution} to substitution.
     * @param substitution The value for substitution
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("substitution")
    public final Builder substitution(Optional<? extends CodeableConcept> substitution) {
      checkNotIsSet(substitutionIsSet(), "substitution");
      this.substitution = substitution.orElse(null);
      optBits |= OPT_BIT_SUBSTITUTION;
      return this;
    }

    /**
     * Initializes the optional value {@link SubstanceSpecification_Isotope#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link SubstanceSpecification_Isotope#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link SubstanceSpecification_Isotope#molecularWeight() molecularWeight} to molecularWeight.
     * @param molecularWeight The value for molecularWeight
     * @return {@code this} builder for chained invocation
     */
    public final Builder molecularWeight(SubstanceSpecification_MolecularWeight molecularWeight) {
      checkNotIsSet(molecularWeightIsSet(), "molecularWeight");
      this.molecularWeight = Objects.requireNonNull(molecularWeight, "molecularWeight");
      optBits |= OPT_BIT_MOLECULAR_WEIGHT;
      return this;
    }

    /**
     * Initializes the optional value {@link SubstanceSpecification_Isotope#molecularWeight() molecularWeight} to molecularWeight.
     * @param molecularWeight The value for molecularWeight
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("molecularWeight")
    public final Builder molecularWeight(Optional<? extends SubstanceSpecification_MolecularWeight> molecularWeight) {
      checkNotIsSet(molecularWeightIsSet(), "molecularWeight");
      this.molecularWeight = molecularWeight.orElse(null);
      optBits |= OPT_BIT_MOLECULAR_WEIGHT;
      return this;
    }

    /**
     * Initializes the optional value {@link SubstanceSpecification_Isotope#halfLife() halfLife} to halfLife.
     * @param halfLife The value for halfLife
     * @return {@code this} builder for chained invocation
     */
    public final Builder halfLife(Quantity halfLife) {
      checkNotIsSet(halfLifeIsSet(), "halfLife");
      this.halfLife = Objects.requireNonNull(halfLife, "halfLife");
      optBits |= OPT_BIT_HALF_LIFE;
      return this;
    }

    /**
     * Initializes the optional value {@link SubstanceSpecification_Isotope#halfLife() halfLife} to halfLife.
     * @param halfLife The value for halfLife
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("halfLife")
    public final Builder halfLife(Optional<? extends Quantity> halfLife) {
      checkNotIsSet(halfLifeIsSet(), "halfLife");
      this.halfLife = halfLife.orElse(null);
      optBits |= OPT_BIT_HALF_LIFE;
      return this;
    }

    /**
     * Initializes the optional value {@link SubstanceSpecification_Isotope#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for chained invocation
     */
    public final Builder identifier(Identifier identifier) {
      checkNotIsSet(identifierIsSet(), "identifier");
      this.identifier = Objects.requireNonNull(identifier, "identifier");
      optBits |= OPT_BIT_IDENTIFIER;
      return this;
    }

    /**
     * Initializes the optional value {@link SubstanceSpecification_Isotope#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("identifier")
    public final Builder identifier(Optional<? extends Identifier> identifier) {
      checkNotIsSet(identifierIsSet(), "identifier");
      this.identifier = identifier.orElse(null);
      optBits |= OPT_BIT_IDENTIFIER;
      return this;
    }

    /**
     * Builds a new {@link SubstanceSpecification_Isotope SubstanceSpecification_Isotope}.
     * @return An immutable instance of SubstanceSpecification_Isotope
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public SubstanceSpecification_Isotope build() {
      return new ImmutableSubstanceSpecification_Isotope(name, id, extension, substitution, modifierExtension, molecularWeight, halfLife, identifier);
    }

    private boolean nameIsSet() {
      return (optBits & OPT_BIT_NAME) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean substitutionIsSet() {
      return (optBits & OPT_BIT_SUBSTITUTION) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean molecularWeightIsSet() {
      return (optBits & OPT_BIT_MOLECULAR_WEIGHT) != 0;
    }

    private boolean halfLifeIsSet() {
      return (optBits & OPT_BIT_HALF_LIFE) != 0;
    }

    private boolean identifierIsSet() {
      return (optBits & OPT_BIT_IDENTIFIER) != 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of SubstanceSpecification_Isotope is strict, attribute is already set: ".concat(name));
    }
  }
}
