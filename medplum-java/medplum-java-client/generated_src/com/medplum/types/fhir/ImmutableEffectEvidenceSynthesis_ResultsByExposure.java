package com.medplum.types.fhir;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;
import javax.annotation.ParametersAreNonnullByDefault;
import javax.annotation.concurrent.Immutable;
import javax.annotation.concurrent.NotThreadSafe;
import org.immutables.value.Generated;

/**
 * Immutable implementation of {@link EffectEvidenceSynthesis_ResultsByExposure}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableEffectEvidenceSynthesis_ResultsByExposure.builder()}.
 */
@Generated(from = "EffectEvidenceSynthesis_ResultsByExposure", generator = "Immutables")
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableEffectEvidenceSynthesis_ResultsByExposure
    implements EffectEvidenceSynthesis_ResultsByExposure {
  private final @Nullable String id;
  private final @Nullable List<Extension> modifierExtension;
  private final @Nullable String description;
  private final @Nullable CodeableConcept variantState;
  private final Reference riskEvidenceSynthesis;
  private final @Nullable List<Extension> extension;
  private final @Nullable Effectevidencesynthesis_resultsbyexposureExposurestate exposureState;

  private ImmutableEffectEvidenceSynthesis_ResultsByExposure(
      @Nullable String id,
      @Nullable List<Extension> modifierExtension,
      @Nullable String description,
      @Nullable CodeableConcept variantState,
      Reference riskEvidenceSynthesis,
      @Nullable List<Extension> extension,
      @Nullable Effectevidencesynthesis_resultsbyexposureExposurestate exposureState) {
    this.id = id;
    this.modifierExtension = modifierExtension;
    this.description = description;
    this.variantState = variantState;
    this.riskEvidenceSynthesis = riskEvidenceSynthesis;
    this.extension = extension;
    this.exposureState = exposureState;
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
   * @return The value of the {@code description} attribute
   */
  @JsonProperty("description")
  @Override
  public Optional<String> description() {
    return Optional.ofNullable(description);
  }

  /**
   * @return The value of the {@code variantState} attribute
   */
  @JsonProperty("variantState")
  @Override
  public Optional<CodeableConcept> variantState() {
    return Optional.ofNullable(variantState);
  }

  /**
   * @return The value of the {@code riskEvidenceSynthesis} attribute
   */
  @JsonProperty("riskEvidenceSynthesis")
  @Override
  public Reference riskEvidenceSynthesis() {
    return riskEvidenceSynthesis;
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
   * @return The value of the {@code exposureState} attribute
   */
  @JsonProperty("exposureState")
  @Override
  public Optional<Effectevidencesynthesis_resultsbyexposureExposurestate> exposureState() {
    return Optional.ofNullable(exposureState);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link EffectEvidenceSynthesis_ResultsByExposure#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEffectEvidenceSynthesis_ResultsByExposure withId(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "id");
    if (Objects.equals(this.id, newValue)) return this;
    return new ImmutableEffectEvidenceSynthesis_ResultsByExposure(
        newValue,
        this.modifierExtension,
        this.description,
        this.variantState,
        this.riskEvidenceSynthesis,
        this.extension,
        this.exposureState);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link EffectEvidenceSynthesis_ResultsByExposure#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEffectEvidenceSynthesis_ResultsByExposure withId(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.id, value)) return this;
    return new ImmutableEffectEvidenceSynthesis_ResultsByExposure(
        value,
        this.modifierExtension,
        this.description,
        this.variantState,
        this.riskEvidenceSynthesis,
        this.extension,
        this.exposureState);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link EffectEvidenceSynthesis_ResultsByExposure#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEffectEvidenceSynthesis_ResultsByExposure withModifierExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableEffectEvidenceSynthesis_ResultsByExposure(
        this.id,
        newValue,
        this.description,
        this.variantState,
        this.riskEvidenceSynthesis,
        this.extension,
        this.exposureState);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link EffectEvidenceSynthesis_ResultsByExposure#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableEffectEvidenceSynthesis_ResultsByExposure withModifierExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableEffectEvidenceSynthesis_ResultsByExposure(
        this.id,
        value,
        this.description,
        this.variantState,
        this.riskEvidenceSynthesis,
        this.extension,
        this.exposureState);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link EffectEvidenceSynthesis_ResultsByExposure#description() description} attribute.
   * @param value The value for description
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEffectEvidenceSynthesis_ResultsByExposure withDescription(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "description");
    if (Objects.equals(this.description, newValue)) return this;
    return new ImmutableEffectEvidenceSynthesis_ResultsByExposure(
        this.id,
        this.modifierExtension,
        newValue,
        this.variantState,
        this.riskEvidenceSynthesis,
        this.extension,
        this.exposureState);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link EffectEvidenceSynthesis_ResultsByExposure#description() description} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for description
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEffectEvidenceSynthesis_ResultsByExposure withDescription(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.description, value)) return this;
    return new ImmutableEffectEvidenceSynthesis_ResultsByExposure(
        this.id,
        this.modifierExtension,
        value,
        this.variantState,
        this.riskEvidenceSynthesis,
        this.extension,
        this.exposureState);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link EffectEvidenceSynthesis_ResultsByExposure#variantState() variantState} attribute.
   * @param value The value for variantState
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEffectEvidenceSynthesis_ResultsByExposure withVariantState(CodeableConcept value) {
    @Nullable CodeableConcept newValue = Objects.requireNonNull(value, "variantState");
    if (this.variantState == newValue) return this;
    return new ImmutableEffectEvidenceSynthesis_ResultsByExposure(
        this.id,
        this.modifierExtension,
        this.description,
        newValue,
        this.riskEvidenceSynthesis,
        this.extension,
        this.exposureState);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link EffectEvidenceSynthesis_ResultsByExposure#variantState() variantState} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for variantState
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableEffectEvidenceSynthesis_ResultsByExposure withVariantState(Optional<? extends CodeableConcept> optional) {
    @Nullable CodeableConcept value = optional.orElse(null);
    if (this.variantState == value) return this;
    return new ImmutableEffectEvidenceSynthesis_ResultsByExposure(
        this.id,
        this.modifierExtension,
        this.description,
        value,
        this.riskEvidenceSynthesis,
        this.extension,
        this.exposureState);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link EffectEvidenceSynthesis_ResultsByExposure#riskEvidenceSynthesis() riskEvidenceSynthesis} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for riskEvidenceSynthesis
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableEffectEvidenceSynthesis_ResultsByExposure withRiskEvidenceSynthesis(Reference value) {
    if (this.riskEvidenceSynthesis == value) return this;
    Reference newValue = Objects.requireNonNull(value, "riskEvidenceSynthesis");
    return new ImmutableEffectEvidenceSynthesis_ResultsByExposure(
        this.id,
        this.modifierExtension,
        this.description,
        this.variantState,
        newValue,
        this.extension,
        this.exposureState);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link EffectEvidenceSynthesis_ResultsByExposure#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEffectEvidenceSynthesis_ResultsByExposure withExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableEffectEvidenceSynthesis_ResultsByExposure(
        this.id,
        this.modifierExtension,
        this.description,
        this.variantState,
        this.riskEvidenceSynthesis,
        newValue,
        this.exposureState);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link EffectEvidenceSynthesis_ResultsByExposure#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableEffectEvidenceSynthesis_ResultsByExposure withExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableEffectEvidenceSynthesis_ResultsByExposure(
        this.id,
        this.modifierExtension,
        this.description,
        this.variantState,
        this.riskEvidenceSynthesis,
        value,
        this.exposureState);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link EffectEvidenceSynthesis_ResultsByExposure#exposureState() exposureState} attribute.
   * @param value The value for exposureState
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEffectEvidenceSynthesis_ResultsByExposure withExposureState(Effectevidencesynthesis_resultsbyexposureExposurestate value) {
    @Nullable Effectevidencesynthesis_resultsbyexposureExposurestate newValue = Objects.requireNonNull(value, "exposureState");
    if (this.exposureState == newValue) return this;
    return new ImmutableEffectEvidenceSynthesis_ResultsByExposure(
        this.id,
        this.modifierExtension,
        this.description,
        this.variantState,
        this.riskEvidenceSynthesis,
        this.extension,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link EffectEvidenceSynthesis_ResultsByExposure#exposureState() exposureState} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for exposureState
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableEffectEvidenceSynthesis_ResultsByExposure withExposureState(Optional<? extends Effectevidencesynthesis_resultsbyexposureExposurestate> optional) {
    @Nullable Effectevidencesynthesis_resultsbyexposureExposurestate value = optional.orElse(null);
    if (this.exposureState == value) return this;
    return new ImmutableEffectEvidenceSynthesis_ResultsByExposure(
        this.id,
        this.modifierExtension,
        this.description,
        this.variantState,
        this.riskEvidenceSynthesis,
        this.extension,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableEffectEvidenceSynthesis_ResultsByExposure} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableEffectEvidenceSynthesis_ResultsByExposure
        && equalTo((ImmutableEffectEvidenceSynthesis_ResultsByExposure) another);
  }

  private boolean equalTo(ImmutableEffectEvidenceSynthesis_ResultsByExposure another) {
    return Objects.equals(id, another.id)
        && Objects.equals(modifierExtension, another.modifierExtension)
        && Objects.equals(description, another.description)
        && Objects.equals(variantState, another.variantState)
        && riskEvidenceSynthesis.equals(another.riskEvidenceSynthesis)
        && Objects.equals(extension, another.extension)
        && Objects.equals(exposureState, another.exposureState);
  }

  /**
   * Computes a hash code from attributes: {@code id}, {@code modifierExtension}, {@code description}, {@code variantState}, {@code riskEvidenceSynthesis}, {@code extension}, {@code exposureState}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(id);
    h += (h << 5) + Objects.hashCode(modifierExtension);
    h += (h << 5) + Objects.hashCode(description);
    h += (h << 5) + Objects.hashCode(variantState);
    h += (h << 5) + riskEvidenceSynthesis.hashCode();
    h += (h << 5) + Objects.hashCode(extension);
    h += (h << 5) + Objects.hashCode(exposureState);
    return h;
  }

  /**
   * Prints the immutable value {@code EffectEvidenceSynthesis_ResultsByExposure} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("EffectEvidenceSynthesis_ResultsByExposure{");
    if (id != null) {
      builder.append("id=").append(id);
    }
    if (modifierExtension != null) {
      if (builder.length() > 42) builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (description != null) {
      if (builder.length() > 42) builder.append(", ");
      builder.append("description=").append(description);
    }
    if (variantState != null) {
      if (builder.length() > 42) builder.append(", ");
      builder.append("variantState=").append(variantState);
    }
    if (builder.length() > 42) builder.append(", ");
    builder.append("riskEvidenceSynthesis=").append(riskEvidenceSynthesis);
    if (extension != null) {
      builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (exposureState != null) {
      builder.append(", ");
      builder.append("exposureState=").append(exposureState);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Generated(from = "EffectEvidenceSynthesis_ResultsByExposure", generator = "Immutables")
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements EffectEvidenceSynthesis_ResultsByExposure {
    @Nullable Optional<String> id = Optional.empty();
    boolean idIsSet;
    @Nullable Optional<List<Extension>> modifierExtension = Optional.empty();
    boolean modifierExtensionIsSet;
    @Nullable Optional<String> description = Optional.empty();
    boolean descriptionIsSet;
    @Nullable Optional<CodeableConcept> variantState = Optional.empty();
    boolean variantStateIsSet;
    @Nullable Reference riskEvidenceSynthesis;
    @Nullable Optional<List<Extension>> extension = Optional.empty();
    boolean extensionIsSet;
    @Nullable Optional<Effectevidencesynthesis_resultsbyexposureExposurestate> exposureState = Optional.empty();
    boolean exposureStateIsSet;
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
    @JsonProperty("description")
    public void setDescription(Optional<String> description) {
      this.description = description;
      this.descriptionIsSet = true;
    }
    @JsonProperty("variantState")
    public void setVariantState(Optional<CodeableConcept> variantState) {
      this.variantState = variantState;
      this.variantStateIsSet = true;
    }
    @JsonProperty("riskEvidenceSynthesis")
    public void setRiskEvidenceSynthesis(Reference riskEvidenceSynthesis) {
      this.riskEvidenceSynthesis = riskEvidenceSynthesis;
    }
    @JsonProperty("extension")
    public void setExtension(Optional<List<Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @JsonProperty("exposureState")
    public void setExposureState(Optional<Effectevidencesynthesis_resultsbyexposureExposurestate> exposureState) {
      this.exposureState = exposureState;
      this.exposureStateIsSet = true;
    }
    @Override
    public Optional<String> id() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> description() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<CodeableConcept> variantState() { throw new UnsupportedOperationException(); }
    @Override
    public Reference riskEvidenceSynthesis() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Effectevidencesynthesis_resultsbyexposureExposurestate> exposureState() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableEffectEvidenceSynthesis_ResultsByExposure fromJson(Json json) {
    ImmutableEffectEvidenceSynthesis_ResultsByExposure.Builder builder = ((ImmutableEffectEvidenceSynthesis_ResultsByExposure.Builder) ImmutableEffectEvidenceSynthesis_ResultsByExposure.builder());
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.descriptionIsSet) {
      builder.description(json.description);
    }
    if (json.variantStateIsSet) {
      builder.variantState(json.variantState);
    }
    if (json.riskEvidenceSynthesis != null) {
      builder.riskEvidenceSynthesis(json.riskEvidenceSynthesis);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.exposureStateIsSet) {
      builder.exposureState(json.exposureState);
    }
    return (ImmutableEffectEvidenceSynthesis_ResultsByExposure) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link EffectEvidenceSynthesis_ResultsByExposure} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable EffectEvidenceSynthesis_ResultsByExposure instance
   */
  public static EffectEvidenceSynthesis_ResultsByExposure copyOf(EffectEvidenceSynthesis_ResultsByExposure instance) {
    if (instance instanceof ImmutableEffectEvidenceSynthesis_ResultsByExposure) {
      return (ImmutableEffectEvidenceSynthesis_ResultsByExposure) instance;
    }
    return ((ImmutableEffectEvidenceSynthesis_ResultsByExposure.Builder) ImmutableEffectEvidenceSynthesis_ResultsByExposure.builder())
        .id(instance.id())
        .modifierExtension(instance.modifierExtension())
        .description(instance.description())
        .variantState(instance.variantState())
        .riskEvidenceSynthesis(instance.riskEvidenceSynthesis())
        .extension(instance.extension())
        .exposureState(instance.exposureState())
        .build();
  }

  /**
   * Creates a builder for {@link EffectEvidenceSynthesis_ResultsByExposure EffectEvidenceSynthesis_ResultsByExposure}.
   * <pre>
   * ImmutableEffectEvidenceSynthesis_ResultsByExposure.builder()
   *    .id(String) // optional {@link EffectEvidenceSynthesis_ResultsByExposure#id() id}
   *    .modifierExtension(List&amp;lt;com.medplum.types.fhir.Extension&amp;gt;) // optional {@link EffectEvidenceSynthesis_ResultsByExposure#modifierExtension() modifierExtension}
   *    .description(String) // optional {@link EffectEvidenceSynthesis_ResultsByExposure#description() description}
   *    .variantState(com.medplum.types.fhir.CodeableConcept) // optional {@link EffectEvidenceSynthesis_ResultsByExposure#variantState() variantState}
   *    .riskEvidenceSynthesis(com.medplum.types.fhir.Reference) // required {@link EffectEvidenceSynthesis_ResultsByExposure#riskEvidenceSynthesis() riskEvidenceSynthesis}
   *    .extension(List&amp;lt;com.medplum.types.fhir.Extension&amp;gt;) // optional {@link EffectEvidenceSynthesis_ResultsByExposure#extension() extension}
   *    .exposureState(com.medplum.types.fhir.Effectevidencesynthesis_resultsbyexposureExposurestate) // optional {@link EffectEvidenceSynthesis_ResultsByExposure#exposureState() exposureState}
   *    .build();
   * </pre>
   * @return A new EffectEvidenceSynthesis_ResultsByExposure builder
   */
  public static RiskEvidenceSynthesisBuildStage builder() {
    return new ImmutableEffectEvidenceSynthesis_ResultsByExposure.Builder();
  }

  /**
   * Builds instances of type {@link EffectEvidenceSynthesis_ResultsByExposure EffectEvidenceSynthesis_ResultsByExposure}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "EffectEvidenceSynthesis_ResultsByExposure", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder implements RiskEvidenceSynthesisBuildStage, BuildFinal {
    private static final long INIT_BIT_RISK_EVIDENCE_SYNTHESIS = 0x1L;
    private static final long OPT_BIT_ID = 0x1L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x2L;
    private static final long OPT_BIT_DESCRIPTION = 0x4L;
    private static final long OPT_BIT_VARIANT_STATE = 0x8L;
    private static final long OPT_BIT_EXTENSION = 0x10L;
    private static final long OPT_BIT_EXPOSURE_STATE = 0x20L;
    private long initBits = 0x1L;
    private long optBits;

    private @Nullable String id;
    private @Nullable List<Extension> modifierExtension;
    private @Nullable String description;
    private @Nullable CodeableConcept variantState;
    private @Nullable Reference riskEvidenceSynthesis;
    private @Nullable List<Extension> extension;
    private @Nullable Effectevidencesynthesis_resultsbyexposureExposurestate exposureState;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link EffectEvidenceSynthesis_ResultsByExposure#id() id} to id.
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
     * Initializes the optional value {@link EffectEvidenceSynthesis_ResultsByExposure#id() id} to id.
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
     * Initializes the optional value {@link EffectEvidenceSynthesis_ResultsByExposure#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link EffectEvidenceSynthesis_ResultsByExposure#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link EffectEvidenceSynthesis_ResultsByExposure#description() description} to description.
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
     * Initializes the optional value {@link EffectEvidenceSynthesis_ResultsByExposure#description() description} to description.
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
     * Initializes the optional value {@link EffectEvidenceSynthesis_ResultsByExposure#variantState() variantState} to variantState.
     * @param variantState The value for variantState
     * @return {@code this} builder for chained invocation
     */
    public final Builder variantState(CodeableConcept variantState) {
      checkNotIsSet(variantStateIsSet(), "variantState");
      this.variantState = Objects.requireNonNull(variantState, "variantState");
      optBits |= OPT_BIT_VARIANT_STATE;
      return this;
    }

    /**
     * Initializes the optional value {@link EffectEvidenceSynthesis_ResultsByExposure#variantState() variantState} to variantState.
     * @param variantState The value for variantState
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("variantState")
    public final Builder variantState(Optional<? extends CodeableConcept> variantState) {
      checkNotIsSet(variantStateIsSet(), "variantState");
      this.variantState = variantState.orElse(null);
      optBits |= OPT_BIT_VARIANT_STATE;
      return this;
    }

    /**
     * Initializes the value for the {@link EffectEvidenceSynthesis_ResultsByExposure#riskEvidenceSynthesis() riskEvidenceSynthesis} attribute.
     * @param riskEvidenceSynthesis The value for riskEvidenceSynthesis 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("riskEvidenceSynthesis")
    public final Builder riskEvidenceSynthesis(Reference riskEvidenceSynthesis) {
      checkNotIsSet(riskEvidenceSynthesisIsSet(), "riskEvidenceSynthesis");
      this.riskEvidenceSynthesis = Objects.requireNonNull(riskEvidenceSynthesis, "riskEvidenceSynthesis");
      initBits &= ~INIT_BIT_RISK_EVIDENCE_SYNTHESIS;
      return this;
    }

    /**
     * Initializes the optional value {@link EffectEvidenceSynthesis_ResultsByExposure#extension() extension} to extension.
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
     * Initializes the optional value {@link EffectEvidenceSynthesis_ResultsByExposure#extension() extension} to extension.
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
     * Initializes the optional value {@link EffectEvidenceSynthesis_ResultsByExposure#exposureState() exposureState} to exposureState.
     * @param exposureState The value for exposureState
     * @return {@code this} builder for chained invocation
     */
    public final Builder exposureState(Effectevidencesynthesis_resultsbyexposureExposurestate exposureState) {
      checkNotIsSet(exposureStateIsSet(), "exposureState");
      this.exposureState = Objects.requireNonNull(exposureState, "exposureState");
      optBits |= OPT_BIT_EXPOSURE_STATE;
      return this;
    }

    /**
     * Initializes the optional value {@link EffectEvidenceSynthesis_ResultsByExposure#exposureState() exposureState} to exposureState.
     * @param exposureState The value for exposureState
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("exposureState")
    public final Builder exposureState(Optional<? extends Effectevidencesynthesis_resultsbyexposureExposurestate> exposureState) {
      checkNotIsSet(exposureStateIsSet(), "exposureState");
      this.exposureState = exposureState.orElse(null);
      optBits |= OPT_BIT_EXPOSURE_STATE;
      return this;
    }

    /**
     * Builds a new {@link EffectEvidenceSynthesis_ResultsByExposure EffectEvidenceSynthesis_ResultsByExposure}.
     * @return An immutable instance of EffectEvidenceSynthesis_ResultsByExposure
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public EffectEvidenceSynthesis_ResultsByExposure build() {
      checkRequiredAttributes();
      return new ImmutableEffectEvidenceSynthesis_ResultsByExposure(
          id,
          modifierExtension,
          description,
          variantState,
          riskEvidenceSynthesis,
          extension,
          exposureState);
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean descriptionIsSet() {
      return (optBits & OPT_BIT_DESCRIPTION) != 0;
    }

    private boolean variantStateIsSet() {
      return (optBits & OPT_BIT_VARIANT_STATE) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean exposureStateIsSet() {
      return (optBits & OPT_BIT_EXPOSURE_STATE) != 0;
    }

    private boolean riskEvidenceSynthesisIsSet() {
      return (initBits & INIT_BIT_RISK_EVIDENCE_SYNTHESIS) == 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of EffectEvidenceSynthesis_ResultsByExposure is strict, attribute is already set: ".concat(name));
    }

    private void checkRequiredAttributes() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<>();
      if (!riskEvidenceSynthesisIsSet()) attributes.add("riskEvidenceSynthesis");
      return "Cannot build EffectEvidenceSynthesis_ResultsByExposure, some of required attributes are not set " + attributes;
    }
  }

  @Generated(from = "EffectEvidenceSynthesis_ResultsByExposure", generator = "Immutables")
  public interface RiskEvidenceSynthesisBuildStage {
    /**
     * Initializes the value for the {@link EffectEvidenceSynthesis_ResultsByExposure#riskEvidenceSynthesis() riskEvidenceSynthesis} attribute.
     * @param riskEvidenceSynthesis The value for riskEvidenceSynthesis 
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal riskEvidenceSynthesis(Reference riskEvidenceSynthesis);
  }

  @Generated(from = "EffectEvidenceSynthesis_ResultsByExposure", generator = "Immutables")
  public interface BuildFinal {

    /**
     * Initializes the optional value {@link EffectEvidenceSynthesis_ResultsByExposure#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    BuildFinal id(String id);

    /**
     * Initializes the optional value {@link EffectEvidenceSynthesis_ResultsByExposure#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal id(Optional<String> id);

    /**
     * Initializes the optional value {@link EffectEvidenceSynthesis_ResultsByExposure#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal modifierExtension(List<Extension> modifierExtension);

    /**
     * Initializes the optional value {@link EffectEvidenceSynthesis_ResultsByExposure#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal modifierExtension(Optional<? extends List<Extension>> modifierExtension);

    /**
     * Initializes the optional value {@link EffectEvidenceSynthesis_ResultsByExposure#description() description} to description.
     * @param description The value for description
     * @return {@code this} builder for chained invocation
     */
    BuildFinal description(String description);

    /**
     * Initializes the optional value {@link EffectEvidenceSynthesis_ResultsByExposure#description() description} to description.
     * @param description The value for description
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal description(Optional<String> description);

    /**
     * Initializes the optional value {@link EffectEvidenceSynthesis_ResultsByExposure#variantState() variantState} to variantState.
     * @param variantState The value for variantState
     * @return {@code this} builder for chained invocation
     */
    BuildFinal variantState(CodeableConcept variantState);

    /**
     * Initializes the optional value {@link EffectEvidenceSynthesis_ResultsByExposure#variantState() variantState} to variantState.
     * @param variantState The value for variantState
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal variantState(Optional<? extends CodeableConcept> variantState);

    /**
     * Initializes the optional value {@link EffectEvidenceSynthesis_ResultsByExposure#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal extension(List<Extension> extension);

    /**
     * Initializes the optional value {@link EffectEvidenceSynthesis_ResultsByExposure#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal extension(Optional<? extends List<Extension>> extension);

    /**
     * Initializes the optional value {@link EffectEvidenceSynthesis_ResultsByExposure#exposureState() exposureState} to exposureState.
     * @param exposureState The value for exposureState
     * @return {@code this} builder for chained invocation
     */
    BuildFinal exposureState(Effectevidencesynthesis_resultsbyexposureExposurestate exposureState);

    /**
     * Initializes the optional value {@link EffectEvidenceSynthesis_ResultsByExposure#exposureState() exposureState} to exposureState.
     * @param exposureState The value for exposureState
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal exposureState(Optional<? extends Effectevidencesynthesis_resultsbyexposureExposurestate> exposureState);

    /**
     * Builds a new {@link EffectEvidenceSynthesis_ResultsByExposure EffectEvidenceSynthesis_ResultsByExposure}.
     * @return An immutable instance of EffectEvidenceSynthesis_ResultsByExposure
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    EffectEvidenceSynthesis_ResultsByExposure build();
  }
}
