package com.fhir;

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
 * Immutable implementation of {@link MedicationKnowledge_Regulatory}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableMedicationKnowledge_Regulatory.builder()}.
 */
@Generated(from = "MedicationKnowledge_Regulatory", generator = "Immutables")
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableMedicationKnowledge_Regulatory implements MedicationKnowledge_Regulatory {
  private final Reference regulatoryAuthority;
  private final @Nullable MedicationKnowledge_MaxDispense maxDispense;
  private final @Nullable List<MedicationKnowledge_Substitution> substitution;
  private final @Nullable String id;
  private final @Nullable List<Extension> extension;
  private final @Nullable List<MedicationKnowledge_Schedule> schedule;
  private final @Nullable List<Extension> modifierExtension;

  private ImmutableMedicationKnowledge_Regulatory(
      Reference regulatoryAuthority,
      @Nullable MedicationKnowledge_MaxDispense maxDispense,
      @Nullable List<MedicationKnowledge_Substitution> substitution,
      @Nullable String id,
      @Nullable List<Extension> extension,
      @Nullable List<MedicationKnowledge_Schedule> schedule,
      @Nullable List<Extension> modifierExtension) {
    this.regulatoryAuthority = regulatoryAuthority;
    this.maxDispense = maxDispense;
    this.substitution = substitution;
    this.id = id;
    this.extension = extension;
    this.schedule = schedule;
    this.modifierExtension = modifierExtension;
  }

  /**
   * @return The value of the {@code regulatoryAuthority} attribute
   */
  @JsonProperty("regulatoryAuthority")
  @Override
  public Reference regulatoryAuthority() {
    return regulatoryAuthority;
  }

  /**
   * @return The value of the {@code maxDispense} attribute
   */
  @JsonProperty("maxDispense")
  @Override
  public Optional<MedicationKnowledge_MaxDispense> maxDispense() {
    return Optional.ofNullable(maxDispense);
  }

  /**
   * @return The value of the {@code substitution} attribute
   */
  @JsonProperty("substitution")
  @Override
  public Optional<List<MedicationKnowledge_Substitution>> substitution() {
    return Optional.ofNullable(substitution);
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
   * @return The value of the {@code schedule} attribute
   */
  @JsonProperty("schedule")
  @Override
  public Optional<List<MedicationKnowledge_Schedule>> schedule() {
    return Optional.ofNullable(schedule);
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
   * Copy the current immutable object by setting a value for the {@link MedicationKnowledge_Regulatory#regulatoryAuthority() regulatoryAuthority} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for regulatoryAuthority
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableMedicationKnowledge_Regulatory withRegulatoryAuthority(Reference value) {
    if (this.regulatoryAuthority == value) return this;
    Reference newValue = Objects.requireNonNull(value, "regulatoryAuthority");
    return new ImmutableMedicationKnowledge_Regulatory(
        newValue,
        this.maxDispense,
        this.substitution,
        this.id,
        this.extension,
        this.schedule,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicationKnowledge_Regulatory#maxDispense() maxDispense} attribute.
   * @param value The value for maxDispense
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicationKnowledge_Regulatory withMaxDispense(MedicationKnowledge_MaxDispense value) {
    @Nullable MedicationKnowledge_MaxDispense newValue = Objects.requireNonNull(value, "maxDispense");
    if (this.maxDispense == newValue) return this;
    return new ImmutableMedicationKnowledge_Regulatory(
        this.regulatoryAuthority,
        newValue,
        this.substitution,
        this.id,
        this.extension,
        this.schedule,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicationKnowledge_Regulatory#maxDispense() maxDispense} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for maxDispense
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicationKnowledge_Regulatory withMaxDispense(Optional<? extends MedicationKnowledge_MaxDispense> optional) {
    @Nullable MedicationKnowledge_MaxDispense value = optional.orElse(null);
    if (this.maxDispense == value) return this;
    return new ImmutableMedicationKnowledge_Regulatory(
        this.regulatoryAuthority,
        value,
        this.substitution,
        this.id,
        this.extension,
        this.schedule,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicationKnowledge_Regulatory#substitution() substitution} attribute.
   * @param value The value for substitution
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicationKnowledge_Regulatory withSubstitution(List<MedicationKnowledge_Substitution> value) {
    @Nullable List<MedicationKnowledge_Substitution> newValue = Objects.requireNonNull(value, "substitution");
    if (this.substitution == newValue) return this;
    return new ImmutableMedicationKnowledge_Regulatory(
        this.regulatoryAuthority,
        this.maxDispense,
        newValue,
        this.id,
        this.extension,
        this.schedule,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicationKnowledge_Regulatory#substitution() substitution} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for substitution
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicationKnowledge_Regulatory withSubstitution(Optional<? extends List<MedicationKnowledge_Substitution>> optional) {
    @Nullable List<MedicationKnowledge_Substitution> value = optional.orElse(null);
    if (this.substitution == value) return this;
    return new ImmutableMedicationKnowledge_Regulatory(
        this.regulatoryAuthority,
        this.maxDispense,
        value,
        this.id,
        this.extension,
        this.schedule,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicationKnowledge_Regulatory#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicationKnowledge_Regulatory withId(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "id");
    if (Objects.equals(this.id, newValue)) return this;
    return new ImmutableMedicationKnowledge_Regulatory(
        this.regulatoryAuthority,
        this.maxDispense,
        this.substitution,
        newValue,
        this.extension,
        this.schedule,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicationKnowledge_Regulatory#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicationKnowledge_Regulatory withId(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.id, value)) return this;
    return new ImmutableMedicationKnowledge_Regulatory(
        this.regulatoryAuthority,
        this.maxDispense,
        this.substitution,
        value,
        this.extension,
        this.schedule,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicationKnowledge_Regulatory#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicationKnowledge_Regulatory withExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableMedicationKnowledge_Regulatory(
        this.regulatoryAuthority,
        this.maxDispense,
        this.substitution,
        this.id,
        newValue,
        this.schedule,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicationKnowledge_Regulatory#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicationKnowledge_Regulatory withExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableMedicationKnowledge_Regulatory(
        this.regulatoryAuthority,
        this.maxDispense,
        this.substitution,
        this.id,
        value,
        this.schedule,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicationKnowledge_Regulatory#schedule() schedule} attribute.
   * @param value The value for schedule
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicationKnowledge_Regulatory withSchedule(List<MedicationKnowledge_Schedule> value) {
    @Nullable List<MedicationKnowledge_Schedule> newValue = Objects.requireNonNull(value, "schedule");
    if (this.schedule == newValue) return this;
    return new ImmutableMedicationKnowledge_Regulatory(
        this.regulatoryAuthority,
        this.maxDispense,
        this.substitution,
        this.id,
        this.extension,
        newValue,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicationKnowledge_Regulatory#schedule() schedule} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for schedule
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicationKnowledge_Regulatory withSchedule(Optional<? extends List<MedicationKnowledge_Schedule>> optional) {
    @Nullable List<MedicationKnowledge_Schedule> value = optional.orElse(null);
    if (this.schedule == value) return this;
    return new ImmutableMedicationKnowledge_Regulatory(
        this.regulatoryAuthority,
        this.maxDispense,
        this.substitution,
        this.id,
        this.extension,
        value,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicationKnowledge_Regulatory#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicationKnowledge_Regulatory withModifierExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableMedicationKnowledge_Regulatory(
        this.regulatoryAuthority,
        this.maxDispense,
        this.substitution,
        this.id,
        this.extension,
        this.schedule,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicationKnowledge_Regulatory#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicationKnowledge_Regulatory withModifierExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableMedicationKnowledge_Regulatory(
        this.regulatoryAuthority,
        this.maxDispense,
        this.substitution,
        this.id,
        this.extension,
        this.schedule,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableMedicationKnowledge_Regulatory} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableMedicationKnowledge_Regulatory
        && equalTo((ImmutableMedicationKnowledge_Regulatory) another);
  }

  private boolean equalTo(ImmutableMedicationKnowledge_Regulatory another) {
    return regulatoryAuthority.equals(another.regulatoryAuthority)
        && Objects.equals(maxDispense, another.maxDispense)
        && Objects.equals(substitution, another.substitution)
        && Objects.equals(id, another.id)
        && Objects.equals(extension, another.extension)
        && Objects.equals(schedule, another.schedule)
        && Objects.equals(modifierExtension, another.modifierExtension);
  }

  /**
   * Computes a hash code from attributes: {@code regulatoryAuthority}, {@code maxDispense}, {@code substitution}, {@code id}, {@code extension}, {@code schedule}, {@code modifierExtension}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + regulatoryAuthority.hashCode();
    h += (h << 5) + Objects.hashCode(maxDispense);
    h += (h << 5) + Objects.hashCode(substitution);
    h += (h << 5) + Objects.hashCode(id);
    h += (h << 5) + Objects.hashCode(extension);
    h += (h << 5) + Objects.hashCode(schedule);
    h += (h << 5) + Objects.hashCode(modifierExtension);
    return h;
  }

  /**
   * Prints the immutable value {@code MedicationKnowledge_Regulatory} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("MedicationKnowledge_Regulatory{");
    builder.append("regulatoryAuthority=").append(regulatoryAuthority);
    if (maxDispense != null) {
      builder.append(", ");
      builder.append("maxDispense=").append(maxDispense);
    }
    if (substitution != null) {
      builder.append(", ");
      builder.append("substitution=").append(substitution);
    }
    if (id != null) {
      builder.append(", ");
      builder.append("id=").append(id);
    }
    if (extension != null) {
      builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (schedule != null) {
      builder.append(", ");
      builder.append("schedule=").append(schedule);
    }
    if (modifierExtension != null) {
      builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Generated(from = "MedicationKnowledge_Regulatory", generator = "Immutables")
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements MedicationKnowledge_Regulatory {
    @Nullable Reference regulatoryAuthority;
    @Nullable Optional<MedicationKnowledge_MaxDispense> maxDispense = Optional.empty();
    boolean maxDispenseIsSet;
    @Nullable Optional<List<MedicationKnowledge_Substitution>> substitution = Optional.empty();
    boolean substitutionIsSet;
    @Nullable Optional<String> id = Optional.empty();
    boolean idIsSet;
    @Nullable Optional<List<Extension>> extension = Optional.empty();
    boolean extensionIsSet;
    @Nullable Optional<List<MedicationKnowledge_Schedule>> schedule = Optional.empty();
    boolean scheduleIsSet;
    @Nullable Optional<List<Extension>> modifierExtension = Optional.empty();
    boolean modifierExtensionIsSet;
    @JsonProperty("regulatoryAuthority")
    public void setRegulatoryAuthority(Reference regulatoryAuthority) {
      this.regulatoryAuthority = regulatoryAuthority;
    }
    @JsonProperty("maxDispense")
    public void setMaxDispense(Optional<MedicationKnowledge_MaxDispense> maxDispense) {
      this.maxDispense = maxDispense;
      this.maxDispenseIsSet = true;
    }
    @JsonProperty("substitution")
    public void setSubstitution(Optional<List<MedicationKnowledge_Substitution>> substitution) {
      this.substitution = substitution;
      this.substitutionIsSet = true;
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
    @JsonProperty("schedule")
    public void setSchedule(Optional<List<MedicationKnowledge_Schedule>> schedule) {
      this.schedule = schedule;
      this.scheduleIsSet = true;
    }
    @JsonProperty("modifierExtension")
    public void setModifierExtension(Optional<List<Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @Override
    public Reference regulatoryAuthority() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<MedicationKnowledge_MaxDispense> maxDispense() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<MedicationKnowledge_Substitution>> substitution() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> id() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<MedicationKnowledge_Schedule>> schedule() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableMedicationKnowledge_Regulatory fromJson(Json json) {
    ImmutableMedicationKnowledge_Regulatory.Builder builder = ((ImmutableMedicationKnowledge_Regulatory.Builder) ImmutableMedicationKnowledge_Regulatory.builder());
    if (json.regulatoryAuthority != null) {
      builder.regulatoryAuthority(json.regulatoryAuthority);
    }
    if (json.maxDispenseIsSet) {
      builder.maxDispense(json.maxDispense);
    }
    if (json.substitutionIsSet) {
      builder.substitution(json.substitution);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.scheduleIsSet) {
      builder.schedule(json.schedule);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    return (ImmutableMedicationKnowledge_Regulatory) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link MedicationKnowledge_Regulatory} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable MedicationKnowledge_Regulatory instance
   */
  public static MedicationKnowledge_Regulatory copyOf(MedicationKnowledge_Regulatory instance) {
    if (instance instanceof ImmutableMedicationKnowledge_Regulatory) {
      return (ImmutableMedicationKnowledge_Regulatory) instance;
    }
    return ((ImmutableMedicationKnowledge_Regulatory.Builder) ImmutableMedicationKnowledge_Regulatory.builder())
        .regulatoryAuthority(instance.regulatoryAuthority())
        .maxDispense(instance.maxDispense())
        .substitution(instance.substitution())
        .id(instance.id())
        .extension(instance.extension())
        .schedule(instance.schedule())
        .modifierExtension(instance.modifierExtension())
        .build();
  }

  /**
   * Creates a builder for {@link MedicationKnowledge_Regulatory MedicationKnowledge_Regulatory}.
   * <pre>
   * ImmutableMedicationKnowledge_Regulatory.builder()
   *    .regulatoryAuthority(com.fhir.Reference) // required {@link MedicationKnowledge_Regulatory#regulatoryAuthority() regulatoryAuthority}
   *    .maxDispense(com.fhir.MedicationKnowledge_MaxDispense) // optional {@link MedicationKnowledge_Regulatory#maxDispense() maxDispense}
   *    .substitution(List&amp;lt;com.fhir.MedicationKnowledge_Substitution&amp;gt;) // optional {@link MedicationKnowledge_Regulatory#substitution() substitution}
   *    .id(String) // optional {@link MedicationKnowledge_Regulatory#id() id}
   *    .extension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link MedicationKnowledge_Regulatory#extension() extension}
   *    .schedule(List&amp;lt;com.fhir.MedicationKnowledge_Schedule&amp;gt;) // optional {@link MedicationKnowledge_Regulatory#schedule() schedule}
   *    .modifierExtension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link MedicationKnowledge_Regulatory#modifierExtension() modifierExtension}
   *    .build();
   * </pre>
   * @return A new MedicationKnowledge_Regulatory builder
   */
  public static RegulatoryAuthorityBuildStage builder() {
    return new ImmutableMedicationKnowledge_Regulatory.Builder();
  }

  /**
   * Builds instances of type {@link MedicationKnowledge_Regulatory MedicationKnowledge_Regulatory}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "MedicationKnowledge_Regulatory", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder implements RegulatoryAuthorityBuildStage, BuildFinal {
    private static final long INIT_BIT_REGULATORY_AUTHORITY = 0x1L;
    private static final long OPT_BIT_MAX_DISPENSE = 0x1L;
    private static final long OPT_BIT_SUBSTITUTION = 0x2L;
    private static final long OPT_BIT_ID = 0x4L;
    private static final long OPT_BIT_EXTENSION = 0x8L;
    private static final long OPT_BIT_SCHEDULE = 0x10L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x20L;
    private long initBits = 0x1L;
    private long optBits;

    private @Nullable Reference regulatoryAuthority;
    private @Nullable MedicationKnowledge_MaxDispense maxDispense;
    private @Nullable List<MedicationKnowledge_Substitution> substitution;
    private @Nullable String id;
    private @Nullable List<Extension> extension;
    private @Nullable List<MedicationKnowledge_Schedule> schedule;
    private @Nullable List<Extension> modifierExtension;

    private Builder() {
    }

    /**
     * Initializes the value for the {@link MedicationKnowledge_Regulatory#regulatoryAuthority() regulatoryAuthority} attribute.
     * @param regulatoryAuthority The value for regulatoryAuthority 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("regulatoryAuthority")
    public final Builder regulatoryAuthority(Reference regulatoryAuthority) {
      checkNotIsSet(regulatoryAuthorityIsSet(), "regulatoryAuthority");
      this.regulatoryAuthority = Objects.requireNonNull(regulatoryAuthority, "regulatoryAuthority");
      initBits &= ~INIT_BIT_REGULATORY_AUTHORITY;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicationKnowledge_Regulatory#maxDispense() maxDispense} to maxDispense.
     * @param maxDispense The value for maxDispense
     * @return {@code this} builder for chained invocation
     */
    public final Builder maxDispense(MedicationKnowledge_MaxDispense maxDispense) {
      checkNotIsSet(maxDispenseIsSet(), "maxDispense");
      this.maxDispense = Objects.requireNonNull(maxDispense, "maxDispense");
      optBits |= OPT_BIT_MAX_DISPENSE;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicationKnowledge_Regulatory#maxDispense() maxDispense} to maxDispense.
     * @param maxDispense The value for maxDispense
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("maxDispense")
    public final Builder maxDispense(Optional<? extends MedicationKnowledge_MaxDispense> maxDispense) {
      checkNotIsSet(maxDispenseIsSet(), "maxDispense");
      this.maxDispense = maxDispense.orElse(null);
      optBits |= OPT_BIT_MAX_DISPENSE;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicationKnowledge_Regulatory#substitution() substitution} to substitution.
     * @param substitution The value for substitution
     * @return {@code this} builder for chained invocation
     */
    public final Builder substitution(List<MedicationKnowledge_Substitution> substitution) {
      checkNotIsSet(substitutionIsSet(), "substitution");
      this.substitution = Objects.requireNonNull(substitution, "substitution");
      optBits |= OPT_BIT_SUBSTITUTION;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicationKnowledge_Regulatory#substitution() substitution} to substitution.
     * @param substitution The value for substitution
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("substitution")
    public final Builder substitution(Optional<? extends List<MedicationKnowledge_Substitution>> substitution) {
      checkNotIsSet(substitutionIsSet(), "substitution");
      this.substitution = substitution.orElse(null);
      optBits |= OPT_BIT_SUBSTITUTION;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicationKnowledge_Regulatory#id() id} to id.
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
     * Initializes the optional value {@link MedicationKnowledge_Regulatory#id() id} to id.
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
     * Initializes the optional value {@link MedicationKnowledge_Regulatory#extension() extension} to extension.
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
     * Initializes the optional value {@link MedicationKnowledge_Regulatory#extension() extension} to extension.
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
     * Initializes the optional value {@link MedicationKnowledge_Regulatory#schedule() schedule} to schedule.
     * @param schedule The value for schedule
     * @return {@code this} builder for chained invocation
     */
    public final Builder schedule(List<MedicationKnowledge_Schedule> schedule) {
      checkNotIsSet(scheduleIsSet(), "schedule");
      this.schedule = Objects.requireNonNull(schedule, "schedule");
      optBits |= OPT_BIT_SCHEDULE;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicationKnowledge_Regulatory#schedule() schedule} to schedule.
     * @param schedule The value for schedule
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("schedule")
    public final Builder schedule(Optional<? extends List<MedicationKnowledge_Schedule>> schedule) {
      checkNotIsSet(scheduleIsSet(), "schedule");
      this.schedule = schedule.orElse(null);
      optBits |= OPT_BIT_SCHEDULE;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicationKnowledge_Regulatory#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link MedicationKnowledge_Regulatory#modifierExtension() modifierExtension} to modifierExtension.
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
     * Builds a new {@link MedicationKnowledge_Regulatory MedicationKnowledge_Regulatory}.
     * @return An immutable instance of MedicationKnowledge_Regulatory
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public MedicationKnowledge_Regulatory build() {
      checkRequiredAttributes();
      return new ImmutableMedicationKnowledge_Regulatory(regulatoryAuthority, maxDispense, substitution, id, extension, schedule, modifierExtension);
    }

    private boolean maxDispenseIsSet() {
      return (optBits & OPT_BIT_MAX_DISPENSE) != 0;
    }

    private boolean substitutionIsSet() {
      return (optBits & OPT_BIT_SUBSTITUTION) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean scheduleIsSet() {
      return (optBits & OPT_BIT_SCHEDULE) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean regulatoryAuthorityIsSet() {
      return (initBits & INIT_BIT_REGULATORY_AUTHORITY) == 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of MedicationKnowledge_Regulatory is strict, attribute is already set: ".concat(name));
    }

    private void checkRequiredAttributes() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<>();
      if (!regulatoryAuthorityIsSet()) attributes.add("regulatoryAuthority");
      return "Cannot build MedicationKnowledge_Regulatory, some of required attributes are not set " + attributes;
    }
  }

  @Generated(from = "MedicationKnowledge_Regulatory", generator = "Immutables")
  public interface RegulatoryAuthorityBuildStage {
    /**
     * Initializes the value for the {@link MedicationKnowledge_Regulatory#regulatoryAuthority() regulatoryAuthority} attribute.
     * @param regulatoryAuthority The value for regulatoryAuthority 
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal regulatoryAuthority(Reference regulatoryAuthority);
  }

  @Generated(from = "MedicationKnowledge_Regulatory", generator = "Immutables")
  public interface BuildFinal {

    /**
     * Initializes the optional value {@link MedicationKnowledge_Regulatory#maxDispense() maxDispense} to maxDispense.
     * @param maxDispense The value for maxDispense
     * @return {@code this} builder for chained invocation
     */
    BuildFinal maxDispense(MedicationKnowledge_MaxDispense maxDispense);

    /**
     * Initializes the optional value {@link MedicationKnowledge_Regulatory#maxDispense() maxDispense} to maxDispense.
     * @param maxDispense The value for maxDispense
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal maxDispense(Optional<? extends MedicationKnowledge_MaxDispense> maxDispense);

    /**
     * Initializes the optional value {@link MedicationKnowledge_Regulatory#substitution() substitution} to substitution.
     * @param substitution The value for substitution
     * @return {@code this} builder for chained invocation
     */
    BuildFinal substitution(List<MedicationKnowledge_Substitution> substitution);

    /**
     * Initializes the optional value {@link MedicationKnowledge_Regulatory#substitution() substitution} to substitution.
     * @param substitution The value for substitution
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal substitution(Optional<? extends List<MedicationKnowledge_Substitution>> substitution);

    /**
     * Initializes the optional value {@link MedicationKnowledge_Regulatory#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    BuildFinal id(String id);

    /**
     * Initializes the optional value {@link MedicationKnowledge_Regulatory#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal id(Optional<String> id);

    /**
     * Initializes the optional value {@link MedicationKnowledge_Regulatory#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal extension(List<Extension> extension);

    /**
     * Initializes the optional value {@link MedicationKnowledge_Regulatory#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal extension(Optional<? extends List<Extension>> extension);

    /**
     * Initializes the optional value {@link MedicationKnowledge_Regulatory#schedule() schedule} to schedule.
     * @param schedule The value for schedule
     * @return {@code this} builder for chained invocation
     */
    BuildFinal schedule(List<MedicationKnowledge_Schedule> schedule);

    /**
     * Initializes the optional value {@link MedicationKnowledge_Regulatory#schedule() schedule} to schedule.
     * @param schedule The value for schedule
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal schedule(Optional<? extends List<MedicationKnowledge_Schedule>> schedule);

    /**
     * Initializes the optional value {@link MedicationKnowledge_Regulatory#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal modifierExtension(List<Extension> modifierExtension);

    /**
     * Initializes the optional value {@link MedicationKnowledge_Regulatory#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal modifierExtension(Optional<? extends List<Extension>> modifierExtension);

    /**
     * Builds a new {@link MedicationKnowledge_Regulatory MedicationKnowledge_Regulatory}.
     * @return An immutable instance of MedicationKnowledge_Regulatory
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    MedicationKnowledge_Regulatory build();
  }
}
