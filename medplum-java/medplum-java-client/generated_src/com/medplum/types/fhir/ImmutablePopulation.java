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
 * Immutable implementation of {@link Population}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutablePopulation.builder()}.
 */
@Generated(from = "Population", generator = "Immutables")
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutablePopulation implements Population {
  private final @Nullable String id;
  private final @Nullable CodeableConcept physiologicalCondition;
  private final @Nullable CodeableConcept ageCodeableConcept;
  private final @Nullable CodeableConcept race;
  private final @Nullable List<Extension> extension;
  private final @Nullable List<Extension> modifierExtension;
  private final @Nullable CodeableConcept gender;
  private final @Nullable Range ageRange;

  private ImmutablePopulation(
      @Nullable String id,
      @Nullable CodeableConcept physiologicalCondition,
      @Nullable CodeableConcept ageCodeableConcept,
      @Nullable CodeableConcept race,
      @Nullable List<Extension> extension,
      @Nullable List<Extension> modifierExtension,
      @Nullable CodeableConcept gender,
      @Nullable Range ageRange) {
    this.id = id;
    this.physiologicalCondition = physiologicalCondition;
    this.ageCodeableConcept = ageCodeableConcept;
    this.race = race;
    this.extension = extension;
    this.modifierExtension = modifierExtension;
    this.gender = gender;
    this.ageRange = ageRange;
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
   * @return The value of the {@code physiologicalCondition} attribute
   */
  @JsonProperty("physiologicalCondition")
  @Override
  public Optional<CodeableConcept> physiologicalCondition() {
    return Optional.ofNullable(physiologicalCondition);
  }

  /**
   * @return The value of the {@code ageCodeableConcept} attribute
   */
  @JsonProperty("ageCodeableConcept")
  @Override
  public Optional<CodeableConcept> ageCodeableConcept() {
    return Optional.ofNullable(ageCodeableConcept);
  }

  /**
   * @return The value of the {@code race} attribute
   */
  @JsonProperty("race")
  @Override
  public Optional<CodeableConcept> race() {
    return Optional.ofNullable(race);
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
   * @return The value of the {@code gender} attribute
   */
  @JsonProperty("gender")
  @Override
  public Optional<CodeableConcept> gender() {
    return Optional.ofNullable(gender);
  }

  /**
   * @return The value of the {@code ageRange} attribute
   */
  @JsonProperty("ageRange")
  @Override
  public Optional<Range> ageRange() {
    return Optional.ofNullable(ageRange);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Population#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePopulation withId(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "id");
    if (Objects.equals(this.id, newValue)) return this;
    return new ImmutablePopulation(
        newValue,
        this.physiologicalCondition,
        this.ageCodeableConcept,
        this.race,
        this.extension,
        this.modifierExtension,
        this.gender,
        this.ageRange);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Population#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePopulation withId(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.id, value)) return this;
    return new ImmutablePopulation(
        value,
        this.physiologicalCondition,
        this.ageCodeableConcept,
        this.race,
        this.extension,
        this.modifierExtension,
        this.gender,
        this.ageRange);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Population#physiologicalCondition() physiologicalCondition} attribute.
   * @param value The value for physiologicalCondition
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePopulation withPhysiologicalCondition(CodeableConcept value) {
    @Nullable CodeableConcept newValue = Objects.requireNonNull(value, "physiologicalCondition");
    if (this.physiologicalCondition == newValue) return this;
    return new ImmutablePopulation(
        this.id,
        newValue,
        this.ageCodeableConcept,
        this.race,
        this.extension,
        this.modifierExtension,
        this.gender,
        this.ageRange);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Population#physiologicalCondition() physiologicalCondition} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for physiologicalCondition
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutablePopulation withPhysiologicalCondition(Optional<? extends CodeableConcept> optional) {
    @Nullable CodeableConcept value = optional.orElse(null);
    if (this.physiologicalCondition == value) return this;
    return new ImmutablePopulation(
        this.id,
        value,
        this.ageCodeableConcept,
        this.race,
        this.extension,
        this.modifierExtension,
        this.gender,
        this.ageRange);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Population#ageCodeableConcept() ageCodeableConcept} attribute.
   * @param value The value for ageCodeableConcept
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePopulation withAgeCodeableConcept(CodeableConcept value) {
    @Nullable CodeableConcept newValue = Objects.requireNonNull(value, "ageCodeableConcept");
    if (this.ageCodeableConcept == newValue) return this;
    return new ImmutablePopulation(
        this.id,
        this.physiologicalCondition,
        newValue,
        this.race,
        this.extension,
        this.modifierExtension,
        this.gender,
        this.ageRange);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Population#ageCodeableConcept() ageCodeableConcept} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for ageCodeableConcept
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutablePopulation withAgeCodeableConcept(Optional<? extends CodeableConcept> optional) {
    @Nullable CodeableConcept value = optional.orElse(null);
    if (this.ageCodeableConcept == value) return this;
    return new ImmutablePopulation(
        this.id,
        this.physiologicalCondition,
        value,
        this.race,
        this.extension,
        this.modifierExtension,
        this.gender,
        this.ageRange);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Population#race() race} attribute.
   * @param value The value for race
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePopulation withRace(CodeableConcept value) {
    @Nullable CodeableConcept newValue = Objects.requireNonNull(value, "race");
    if (this.race == newValue) return this;
    return new ImmutablePopulation(
        this.id,
        this.physiologicalCondition,
        this.ageCodeableConcept,
        newValue,
        this.extension,
        this.modifierExtension,
        this.gender,
        this.ageRange);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Population#race() race} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for race
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutablePopulation withRace(Optional<? extends CodeableConcept> optional) {
    @Nullable CodeableConcept value = optional.orElse(null);
    if (this.race == value) return this;
    return new ImmutablePopulation(
        this.id,
        this.physiologicalCondition,
        this.ageCodeableConcept,
        value,
        this.extension,
        this.modifierExtension,
        this.gender,
        this.ageRange);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Population#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePopulation withExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutablePopulation(
        this.id,
        this.physiologicalCondition,
        this.ageCodeableConcept,
        this.race,
        newValue,
        this.modifierExtension,
        this.gender,
        this.ageRange);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Population#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutablePopulation withExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutablePopulation(
        this.id,
        this.physiologicalCondition,
        this.ageCodeableConcept,
        this.race,
        value,
        this.modifierExtension,
        this.gender,
        this.ageRange);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Population#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePopulation withModifierExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutablePopulation(
        this.id,
        this.physiologicalCondition,
        this.ageCodeableConcept,
        this.race,
        this.extension,
        newValue,
        this.gender,
        this.ageRange);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Population#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutablePopulation withModifierExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutablePopulation(
        this.id,
        this.physiologicalCondition,
        this.ageCodeableConcept,
        this.race,
        this.extension,
        value,
        this.gender,
        this.ageRange);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Population#gender() gender} attribute.
   * @param value The value for gender
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePopulation withGender(CodeableConcept value) {
    @Nullable CodeableConcept newValue = Objects.requireNonNull(value, "gender");
    if (this.gender == newValue) return this;
    return new ImmutablePopulation(
        this.id,
        this.physiologicalCondition,
        this.ageCodeableConcept,
        this.race,
        this.extension,
        this.modifierExtension,
        newValue,
        this.ageRange);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Population#gender() gender} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for gender
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutablePopulation withGender(Optional<? extends CodeableConcept> optional) {
    @Nullable CodeableConcept value = optional.orElse(null);
    if (this.gender == value) return this;
    return new ImmutablePopulation(
        this.id,
        this.physiologicalCondition,
        this.ageCodeableConcept,
        this.race,
        this.extension,
        this.modifierExtension,
        value,
        this.ageRange);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Population#ageRange() ageRange} attribute.
   * @param value The value for ageRange
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePopulation withAgeRange(Range value) {
    @Nullable Range newValue = Objects.requireNonNull(value, "ageRange");
    if (this.ageRange == newValue) return this;
    return new ImmutablePopulation(
        this.id,
        this.physiologicalCondition,
        this.ageCodeableConcept,
        this.race,
        this.extension,
        this.modifierExtension,
        this.gender,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Population#ageRange() ageRange} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for ageRange
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutablePopulation withAgeRange(Optional<? extends Range> optional) {
    @Nullable Range value = optional.orElse(null);
    if (this.ageRange == value) return this;
    return new ImmutablePopulation(
        this.id,
        this.physiologicalCondition,
        this.ageCodeableConcept,
        this.race,
        this.extension,
        this.modifierExtension,
        this.gender,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutablePopulation} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutablePopulation
        && equalTo((ImmutablePopulation) another);
  }

  private boolean equalTo(ImmutablePopulation another) {
    return Objects.equals(id, another.id)
        && Objects.equals(physiologicalCondition, another.physiologicalCondition)
        && Objects.equals(ageCodeableConcept, another.ageCodeableConcept)
        && Objects.equals(race, another.race)
        && Objects.equals(extension, another.extension)
        && Objects.equals(modifierExtension, another.modifierExtension)
        && Objects.equals(gender, another.gender)
        && Objects.equals(ageRange, another.ageRange);
  }

  /**
   * Computes a hash code from attributes: {@code id}, {@code physiologicalCondition}, {@code ageCodeableConcept}, {@code race}, {@code extension}, {@code modifierExtension}, {@code gender}, {@code ageRange}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(id);
    h += (h << 5) + Objects.hashCode(physiologicalCondition);
    h += (h << 5) + Objects.hashCode(ageCodeableConcept);
    h += (h << 5) + Objects.hashCode(race);
    h += (h << 5) + Objects.hashCode(extension);
    h += (h << 5) + Objects.hashCode(modifierExtension);
    h += (h << 5) + Objects.hashCode(gender);
    h += (h << 5) + Objects.hashCode(ageRange);
    return h;
  }

  /**
   * Prints the immutable value {@code Population} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("Population{");
    if (id != null) {
      builder.append("id=").append(id);
    }
    if (physiologicalCondition != null) {
      if (builder.length() > 11) builder.append(", ");
      builder.append("physiologicalCondition=").append(physiologicalCondition);
    }
    if (ageCodeableConcept != null) {
      if (builder.length() > 11) builder.append(", ");
      builder.append("ageCodeableConcept=").append(ageCodeableConcept);
    }
    if (race != null) {
      if (builder.length() > 11) builder.append(", ");
      builder.append("race=").append(race);
    }
    if (extension != null) {
      if (builder.length() > 11) builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (modifierExtension != null) {
      if (builder.length() > 11) builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (gender != null) {
      if (builder.length() > 11) builder.append(", ");
      builder.append("gender=").append(gender);
    }
    if (ageRange != null) {
      if (builder.length() > 11) builder.append(", ");
      builder.append("ageRange=").append(ageRange);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Generated(from = "Population", generator = "Immutables")
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements Population {
    @Nullable Optional<String> id = Optional.empty();
    boolean idIsSet;
    @Nullable Optional<CodeableConcept> physiologicalCondition = Optional.empty();
    boolean physiologicalConditionIsSet;
    @Nullable Optional<CodeableConcept> ageCodeableConcept = Optional.empty();
    boolean ageCodeableConceptIsSet;
    @Nullable Optional<CodeableConcept> race = Optional.empty();
    boolean raceIsSet;
    @Nullable Optional<List<Extension>> extension = Optional.empty();
    boolean extensionIsSet;
    @Nullable Optional<List<Extension>> modifierExtension = Optional.empty();
    boolean modifierExtensionIsSet;
    @Nullable Optional<CodeableConcept> gender = Optional.empty();
    boolean genderIsSet;
    @Nullable Optional<Range> ageRange = Optional.empty();
    boolean ageRangeIsSet;
    @JsonProperty("id")
    public void setId(Optional<String> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @JsonProperty("physiologicalCondition")
    public void setPhysiologicalCondition(Optional<CodeableConcept> physiologicalCondition) {
      this.physiologicalCondition = physiologicalCondition;
      this.physiologicalConditionIsSet = true;
    }
    @JsonProperty("ageCodeableConcept")
    public void setAgeCodeableConcept(Optional<CodeableConcept> ageCodeableConcept) {
      this.ageCodeableConcept = ageCodeableConcept;
      this.ageCodeableConceptIsSet = true;
    }
    @JsonProperty("race")
    public void setRace(Optional<CodeableConcept> race) {
      this.race = race;
      this.raceIsSet = true;
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
    @JsonProperty("gender")
    public void setGender(Optional<CodeableConcept> gender) {
      this.gender = gender;
      this.genderIsSet = true;
    }
    @JsonProperty("ageRange")
    public void setAgeRange(Optional<Range> ageRange) {
      this.ageRange = ageRange;
      this.ageRangeIsSet = true;
    }
    @Override
    public Optional<String> id() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<CodeableConcept> physiologicalCondition() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<CodeableConcept> ageCodeableConcept() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<CodeableConcept> race() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<CodeableConcept> gender() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Range> ageRange() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutablePopulation fromJson(Json json) {
    ImmutablePopulation.Builder builder = ImmutablePopulation.builder();
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.physiologicalConditionIsSet) {
      builder.physiologicalCondition(json.physiologicalCondition);
    }
    if (json.ageCodeableConceptIsSet) {
      builder.ageCodeableConcept(json.ageCodeableConcept);
    }
    if (json.raceIsSet) {
      builder.race(json.race);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.genderIsSet) {
      builder.gender(json.gender);
    }
    if (json.ageRangeIsSet) {
      builder.ageRange(json.ageRange);
    }
    return (ImmutablePopulation) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link Population} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable Population instance
   */
  public static Population copyOf(Population instance) {
    if (instance instanceof ImmutablePopulation) {
      return (ImmutablePopulation) instance;
    }
    return ImmutablePopulation.builder()
        .id(instance.id())
        .physiologicalCondition(instance.physiologicalCondition())
        .ageCodeableConcept(instance.ageCodeableConcept())
        .race(instance.race())
        .extension(instance.extension())
        .modifierExtension(instance.modifierExtension())
        .gender(instance.gender())
        .ageRange(instance.ageRange())
        .build();
  }

  /**
   * Creates a builder for {@link Population Population}.
   * <pre>
   * ImmutablePopulation.builder()
   *    .id(String) // optional {@link Population#id() id}
   *    .physiologicalCondition(com.medplum.types.fhir.CodeableConcept) // optional {@link Population#physiologicalCondition() physiologicalCondition}
   *    .ageCodeableConcept(com.medplum.types.fhir.CodeableConcept) // optional {@link Population#ageCodeableConcept() ageCodeableConcept}
   *    .race(com.medplum.types.fhir.CodeableConcept) // optional {@link Population#race() race}
   *    .extension(List&amp;lt;com.medplum.types.fhir.Extension&amp;gt;) // optional {@link Population#extension() extension}
   *    .modifierExtension(List&amp;lt;com.medplum.types.fhir.Extension&amp;gt;) // optional {@link Population#modifierExtension() modifierExtension}
   *    .gender(com.medplum.types.fhir.CodeableConcept) // optional {@link Population#gender() gender}
   *    .ageRange(com.medplum.types.fhir.Range) // optional {@link Population#ageRange() ageRange}
   *    .build();
   * </pre>
   * @return A new Population builder
   */
  public static ImmutablePopulation.Builder builder() {
    return new ImmutablePopulation.Builder();
  }

  /**
   * Builds instances of type {@link Population Population}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "Population", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder {
    private static final long OPT_BIT_ID = 0x1L;
    private static final long OPT_BIT_PHYSIOLOGICAL_CONDITION = 0x2L;
    private static final long OPT_BIT_AGE_CODEABLE_CONCEPT = 0x4L;
    private static final long OPT_BIT_RACE = 0x8L;
    private static final long OPT_BIT_EXTENSION = 0x10L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x20L;
    private static final long OPT_BIT_GENDER = 0x40L;
    private static final long OPT_BIT_AGE_RANGE = 0x80L;
    private long optBits;

    private @Nullable String id;
    private @Nullable CodeableConcept physiologicalCondition;
    private @Nullable CodeableConcept ageCodeableConcept;
    private @Nullable CodeableConcept race;
    private @Nullable List<Extension> extension;
    private @Nullable List<Extension> modifierExtension;
    private @Nullable CodeableConcept gender;
    private @Nullable Range ageRange;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link Population#id() id} to id.
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
     * Initializes the optional value {@link Population#id() id} to id.
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
     * Initializes the optional value {@link Population#physiologicalCondition() physiologicalCondition} to physiologicalCondition.
     * @param physiologicalCondition The value for physiologicalCondition
     * @return {@code this} builder for chained invocation
     */
    public final Builder physiologicalCondition(CodeableConcept physiologicalCondition) {
      checkNotIsSet(physiologicalConditionIsSet(), "physiologicalCondition");
      this.physiologicalCondition = Objects.requireNonNull(physiologicalCondition, "physiologicalCondition");
      optBits |= OPT_BIT_PHYSIOLOGICAL_CONDITION;
      return this;
    }

    /**
     * Initializes the optional value {@link Population#physiologicalCondition() physiologicalCondition} to physiologicalCondition.
     * @param physiologicalCondition The value for physiologicalCondition
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("physiologicalCondition")
    public final Builder physiologicalCondition(Optional<? extends CodeableConcept> physiologicalCondition) {
      checkNotIsSet(physiologicalConditionIsSet(), "physiologicalCondition");
      this.physiologicalCondition = physiologicalCondition.orElse(null);
      optBits |= OPT_BIT_PHYSIOLOGICAL_CONDITION;
      return this;
    }

    /**
     * Initializes the optional value {@link Population#ageCodeableConcept() ageCodeableConcept} to ageCodeableConcept.
     * @param ageCodeableConcept The value for ageCodeableConcept
     * @return {@code this} builder for chained invocation
     */
    public final Builder ageCodeableConcept(CodeableConcept ageCodeableConcept) {
      checkNotIsSet(ageCodeableConceptIsSet(), "ageCodeableConcept");
      this.ageCodeableConcept = Objects.requireNonNull(ageCodeableConcept, "ageCodeableConcept");
      optBits |= OPT_BIT_AGE_CODEABLE_CONCEPT;
      return this;
    }

    /**
     * Initializes the optional value {@link Population#ageCodeableConcept() ageCodeableConcept} to ageCodeableConcept.
     * @param ageCodeableConcept The value for ageCodeableConcept
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("ageCodeableConcept")
    public final Builder ageCodeableConcept(Optional<? extends CodeableConcept> ageCodeableConcept) {
      checkNotIsSet(ageCodeableConceptIsSet(), "ageCodeableConcept");
      this.ageCodeableConcept = ageCodeableConcept.orElse(null);
      optBits |= OPT_BIT_AGE_CODEABLE_CONCEPT;
      return this;
    }

    /**
     * Initializes the optional value {@link Population#race() race} to race.
     * @param race The value for race
     * @return {@code this} builder for chained invocation
     */
    public final Builder race(CodeableConcept race) {
      checkNotIsSet(raceIsSet(), "race");
      this.race = Objects.requireNonNull(race, "race");
      optBits |= OPT_BIT_RACE;
      return this;
    }

    /**
     * Initializes the optional value {@link Population#race() race} to race.
     * @param race The value for race
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("race")
    public final Builder race(Optional<? extends CodeableConcept> race) {
      checkNotIsSet(raceIsSet(), "race");
      this.race = race.orElse(null);
      optBits |= OPT_BIT_RACE;
      return this;
    }

    /**
     * Initializes the optional value {@link Population#extension() extension} to extension.
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
     * Initializes the optional value {@link Population#extension() extension} to extension.
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
     * Initializes the optional value {@link Population#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link Population#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link Population#gender() gender} to gender.
     * @param gender The value for gender
     * @return {@code this} builder for chained invocation
     */
    public final Builder gender(CodeableConcept gender) {
      checkNotIsSet(genderIsSet(), "gender");
      this.gender = Objects.requireNonNull(gender, "gender");
      optBits |= OPT_BIT_GENDER;
      return this;
    }

    /**
     * Initializes the optional value {@link Population#gender() gender} to gender.
     * @param gender The value for gender
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("gender")
    public final Builder gender(Optional<? extends CodeableConcept> gender) {
      checkNotIsSet(genderIsSet(), "gender");
      this.gender = gender.orElse(null);
      optBits |= OPT_BIT_GENDER;
      return this;
    }

    /**
     * Initializes the optional value {@link Population#ageRange() ageRange} to ageRange.
     * @param ageRange The value for ageRange
     * @return {@code this} builder for chained invocation
     */
    public final Builder ageRange(Range ageRange) {
      checkNotIsSet(ageRangeIsSet(), "ageRange");
      this.ageRange = Objects.requireNonNull(ageRange, "ageRange");
      optBits |= OPT_BIT_AGE_RANGE;
      return this;
    }

    /**
     * Initializes the optional value {@link Population#ageRange() ageRange} to ageRange.
     * @param ageRange The value for ageRange
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("ageRange")
    public final Builder ageRange(Optional<? extends Range> ageRange) {
      checkNotIsSet(ageRangeIsSet(), "ageRange");
      this.ageRange = ageRange.orElse(null);
      optBits |= OPT_BIT_AGE_RANGE;
      return this;
    }

    /**
     * Builds a new {@link Population Population}.
     * @return An immutable instance of Population
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public Population build() {
      return new ImmutablePopulation(
          id,
          physiologicalCondition,
          ageCodeableConcept,
          race,
          extension,
          modifierExtension,
          gender,
          ageRange);
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean physiologicalConditionIsSet() {
      return (optBits & OPT_BIT_PHYSIOLOGICAL_CONDITION) != 0;
    }

    private boolean ageCodeableConceptIsSet() {
      return (optBits & OPT_BIT_AGE_CODEABLE_CONCEPT) != 0;
    }

    private boolean raceIsSet() {
      return (optBits & OPT_BIT_RACE) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean genderIsSet() {
      return (optBits & OPT_BIT_GENDER) != 0;
    }

    private boolean ageRangeIsSet() {
      return (optBits & OPT_BIT_AGE_RANGE) != 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of Population is strict, attribute is already set: ".concat(name));
    }
  }
}
