package com.fhir.types.fhir;

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
 * Immutable implementation of {@link Encounter_Diagnosis}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableEncounter_Diagnosis.builder()}.
 */
@Generated(from = "Encounter_Diagnosis", generator = "Immutables")
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableEncounter_Diagnosis implements Encounter_Diagnosis {
  private final @Nullable List<Extension> extension;
  private final @Nullable List<Extension> modifierExtension;
  private final @Nullable String id;
  private final @Nullable CodeableConcept use;
  private final @Nullable PositiveInt rank;
  private final Reference condition;

  private ImmutableEncounter_Diagnosis(
      @Nullable List<Extension> extension,
      @Nullable List<Extension> modifierExtension,
      @Nullable String id,
      @Nullable CodeableConcept use,
      @Nullable PositiveInt rank,
      Reference condition) {
    this.extension = extension;
    this.modifierExtension = modifierExtension;
    this.id = id;
    this.use = use;
    this.rank = rank;
    this.condition = condition;
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
   * @return The value of the {@code id} attribute
   */
  @JsonProperty("id")
  @Override
  public Optional<String> id() {
    return Optional.ofNullable(id);
  }

  /**
   * @return The value of the {@code use} attribute
   */
  @JsonProperty("use")
  @Override
  public Optional<CodeableConcept> use() {
    return Optional.ofNullable(use);
  }

  /**
   * @return The value of the {@code rank} attribute
   */
  @JsonProperty("rank")
  @Override
  public Optional<PositiveInt> rank() {
    return Optional.ofNullable(rank);
  }

  /**
   * @return The value of the {@code condition} attribute
   */
  @JsonProperty("condition")
  @Override
  public Reference condition() {
    return condition;
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Encounter_Diagnosis#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEncounter_Diagnosis withExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableEncounter_Diagnosis(newValue, this.modifierExtension, this.id, this.use, this.rank, this.condition);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Encounter_Diagnosis#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableEncounter_Diagnosis withExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableEncounter_Diagnosis(value, this.modifierExtension, this.id, this.use, this.rank, this.condition);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Encounter_Diagnosis#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEncounter_Diagnosis withModifierExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableEncounter_Diagnosis(this.extension, newValue, this.id, this.use, this.rank, this.condition);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Encounter_Diagnosis#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableEncounter_Diagnosis withModifierExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableEncounter_Diagnosis(this.extension, value, this.id, this.use, this.rank, this.condition);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Encounter_Diagnosis#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEncounter_Diagnosis withId(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "id");
    if (Objects.equals(this.id, newValue)) return this;
    return new ImmutableEncounter_Diagnosis(this.extension, this.modifierExtension, newValue, this.use, this.rank, this.condition);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Encounter_Diagnosis#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEncounter_Diagnosis withId(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.id, value)) return this;
    return new ImmutableEncounter_Diagnosis(this.extension, this.modifierExtension, value, this.use, this.rank, this.condition);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Encounter_Diagnosis#use() use} attribute.
   * @param value The value for use
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEncounter_Diagnosis withUse(CodeableConcept value) {
    @Nullable CodeableConcept newValue = Objects.requireNonNull(value, "use");
    if (this.use == newValue) return this;
    return new ImmutableEncounter_Diagnosis(this.extension, this.modifierExtension, this.id, newValue, this.rank, this.condition);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Encounter_Diagnosis#use() use} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for use
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableEncounter_Diagnosis withUse(Optional<? extends CodeableConcept> optional) {
    @Nullable CodeableConcept value = optional.orElse(null);
    if (this.use == value) return this;
    return new ImmutableEncounter_Diagnosis(this.extension, this.modifierExtension, this.id, value, this.rank, this.condition);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Encounter_Diagnosis#rank() rank} attribute.
   * @param value The value for rank
   * @return A modified copy of {@code this} object
   */
  public final ImmutableEncounter_Diagnosis withRank(PositiveInt value) {
    @Nullable PositiveInt newValue = Objects.requireNonNull(value, "rank");
    if (this.rank == newValue) return this;
    return new ImmutableEncounter_Diagnosis(this.extension, this.modifierExtension, this.id, this.use, newValue, this.condition);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Encounter_Diagnosis#rank() rank} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for rank
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableEncounter_Diagnosis withRank(Optional<? extends PositiveInt> optional) {
    @Nullable PositiveInt value = optional.orElse(null);
    if (this.rank == value) return this;
    return new ImmutableEncounter_Diagnosis(this.extension, this.modifierExtension, this.id, this.use, value, this.condition);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link Encounter_Diagnosis#condition() condition} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for condition
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableEncounter_Diagnosis withCondition(Reference value) {
    if (this.condition == value) return this;
    Reference newValue = Objects.requireNonNull(value, "condition");
    return new ImmutableEncounter_Diagnosis(this.extension, this.modifierExtension, this.id, this.use, this.rank, newValue);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableEncounter_Diagnosis} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableEncounter_Diagnosis
        && equalTo((ImmutableEncounter_Diagnosis) another);
  }

  private boolean equalTo(ImmutableEncounter_Diagnosis another) {
    return Objects.equals(extension, another.extension)
        && Objects.equals(modifierExtension, another.modifierExtension)
        && Objects.equals(id, another.id)
        && Objects.equals(use, another.use)
        && Objects.equals(rank, another.rank)
        && condition.equals(another.condition);
  }

  /**
   * Computes a hash code from attributes: {@code extension}, {@code modifierExtension}, {@code id}, {@code use}, {@code rank}, {@code condition}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(extension);
    h += (h << 5) + Objects.hashCode(modifierExtension);
    h += (h << 5) + Objects.hashCode(id);
    h += (h << 5) + Objects.hashCode(use);
    h += (h << 5) + Objects.hashCode(rank);
    h += (h << 5) + condition.hashCode();
    return h;
  }

  /**
   * Prints the immutable value {@code Encounter_Diagnosis} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("Encounter_Diagnosis{");
    if (extension != null) {
      builder.append("extension=").append(extension);
    }
    if (modifierExtension != null) {
      if (builder.length() > 20) builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (id != null) {
      if (builder.length() > 20) builder.append(", ");
      builder.append("id=").append(id);
    }
    if (use != null) {
      if (builder.length() > 20) builder.append(", ");
      builder.append("use=").append(use);
    }
    if (rank != null) {
      if (builder.length() > 20) builder.append(", ");
      builder.append("rank=").append(rank);
    }
    if (builder.length() > 20) builder.append(", ");
    builder.append("condition=").append(condition);
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Generated(from = "Encounter_Diagnosis", generator = "Immutables")
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements Encounter_Diagnosis {
    @Nullable Optional<List<Extension>> extension = Optional.empty();
    boolean extensionIsSet;
    @Nullable Optional<List<Extension>> modifierExtension = Optional.empty();
    boolean modifierExtensionIsSet;
    @Nullable Optional<String> id = Optional.empty();
    boolean idIsSet;
    @Nullable Optional<CodeableConcept> use = Optional.empty();
    boolean useIsSet;
    @Nullable Optional<PositiveInt> rank = Optional.empty();
    boolean rankIsSet;
    @Nullable Reference condition;
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
    @JsonProperty("id")
    public void setId(Optional<String> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @JsonProperty("use")
    public void setUse(Optional<CodeableConcept> use) {
      this.use = use;
      this.useIsSet = true;
    }
    @JsonProperty("rank")
    public void setRank(Optional<PositiveInt> rank) {
      this.rank = rank;
      this.rankIsSet = true;
    }
    @JsonProperty("condition")
    public void setCondition(Reference condition) {
      this.condition = condition;
    }
    @Override
    public Optional<List<Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> id() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<CodeableConcept> use() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<PositiveInt> rank() { throw new UnsupportedOperationException(); }
    @Override
    public Reference condition() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableEncounter_Diagnosis fromJson(Json json) {
    ImmutableEncounter_Diagnosis.Builder builder = ((ImmutableEncounter_Diagnosis.Builder) ImmutableEncounter_Diagnosis.builder());
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.useIsSet) {
      builder.use(json.use);
    }
    if (json.rankIsSet) {
      builder.rank(json.rank);
    }
    if (json.condition != null) {
      builder.condition(json.condition);
    }
    return (ImmutableEncounter_Diagnosis) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link Encounter_Diagnosis} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable Encounter_Diagnosis instance
   */
  public static Encounter_Diagnosis copyOf(Encounter_Diagnosis instance) {
    if (instance instanceof ImmutableEncounter_Diagnosis) {
      return (ImmutableEncounter_Diagnosis) instance;
    }
    return ((ImmutableEncounter_Diagnosis.Builder) ImmutableEncounter_Diagnosis.builder())
        .extension(instance.extension())
        .modifierExtension(instance.modifierExtension())
        .id(instance.id())
        .use(instance.use())
        .rank(instance.rank())
        .condition(instance.condition())
        .build();
  }

  /**
   * Creates a builder for {@link Encounter_Diagnosis Encounter_Diagnosis}.
   * <pre>
   * ImmutableEncounter_Diagnosis.builder()
   *    .extension(List&amp;lt;com.fhir.types.fhir.Extension&amp;gt;) // optional {@link Encounter_Diagnosis#extension() extension}
   *    .modifierExtension(List&amp;lt;com.fhir.types.fhir.Extension&amp;gt;) // optional {@link Encounter_Diagnosis#modifierExtension() modifierExtension}
   *    .id(String) // optional {@link Encounter_Diagnosis#id() id}
   *    .use(com.fhir.types.fhir.CodeableConcept) // optional {@link Encounter_Diagnosis#use() use}
   *    .rank(com.fhir.types.fhir.PositiveInt) // optional {@link Encounter_Diagnosis#rank() rank}
   *    .condition(com.fhir.types.fhir.Reference) // required {@link Encounter_Diagnosis#condition() condition}
   *    .build();
   * </pre>
   * @return A new Encounter_Diagnosis builder
   */
  public static ConditionBuildStage builder() {
    return new ImmutableEncounter_Diagnosis.Builder();
  }

  /**
   * Builds instances of type {@link Encounter_Diagnosis Encounter_Diagnosis}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "Encounter_Diagnosis", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder implements ConditionBuildStage, BuildFinal {
    private static final long INIT_BIT_CONDITION = 0x1L;
    private static final long OPT_BIT_EXTENSION = 0x1L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x2L;
    private static final long OPT_BIT_ID = 0x4L;
    private static final long OPT_BIT_USE = 0x8L;
    private static final long OPT_BIT_RANK = 0x10L;
    private long initBits = 0x1L;
    private long optBits;

    private @Nullable List<Extension> extension;
    private @Nullable List<Extension> modifierExtension;
    private @Nullable String id;
    private @Nullable CodeableConcept use;
    private @Nullable PositiveInt rank;
    private @Nullable Reference condition;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link Encounter_Diagnosis#extension() extension} to extension.
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
     * Initializes the optional value {@link Encounter_Diagnosis#extension() extension} to extension.
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
     * Initializes the optional value {@link Encounter_Diagnosis#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link Encounter_Diagnosis#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link Encounter_Diagnosis#id() id} to id.
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
     * Initializes the optional value {@link Encounter_Diagnosis#id() id} to id.
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
     * Initializes the optional value {@link Encounter_Diagnosis#use() use} to use.
     * @param use The value for use
     * @return {@code this} builder for chained invocation
     */
    public final Builder use(CodeableConcept use) {
      checkNotIsSet(useIsSet(), "use");
      this.use = Objects.requireNonNull(use, "use");
      optBits |= OPT_BIT_USE;
      return this;
    }

    /**
     * Initializes the optional value {@link Encounter_Diagnosis#use() use} to use.
     * @param use The value for use
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("use")
    public final Builder use(Optional<? extends CodeableConcept> use) {
      checkNotIsSet(useIsSet(), "use");
      this.use = use.orElse(null);
      optBits |= OPT_BIT_USE;
      return this;
    }

    /**
     * Initializes the optional value {@link Encounter_Diagnosis#rank() rank} to rank.
     * @param rank The value for rank
     * @return {@code this} builder for chained invocation
     */
    public final Builder rank(PositiveInt rank) {
      checkNotIsSet(rankIsSet(), "rank");
      this.rank = Objects.requireNonNull(rank, "rank");
      optBits |= OPT_BIT_RANK;
      return this;
    }

    /**
     * Initializes the optional value {@link Encounter_Diagnosis#rank() rank} to rank.
     * @param rank The value for rank
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("rank")
    public final Builder rank(Optional<? extends PositiveInt> rank) {
      checkNotIsSet(rankIsSet(), "rank");
      this.rank = rank.orElse(null);
      optBits |= OPT_BIT_RANK;
      return this;
    }

    /**
     * Initializes the value for the {@link Encounter_Diagnosis#condition() condition} attribute.
     * @param condition The value for condition 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("condition")
    public final Builder condition(Reference condition) {
      checkNotIsSet(conditionIsSet(), "condition");
      this.condition = Objects.requireNonNull(condition, "condition");
      initBits &= ~INIT_BIT_CONDITION;
      return this;
    }

    /**
     * Builds a new {@link Encounter_Diagnosis Encounter_Diagnosis}.
     * @return An immutable instance of Encounter_Diagnosis
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public Encounter_Diagnosis build() {
      checkRequiredAttributes();
      return new ImmutableEncounter_Diagnosis(extension, modifierExtension, id, use, rank, condition);
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean useIsSet() {
      return (optBits & OPT_BIT_USE) != 0;
    }

    private boolean rankIsSet() {
      return (optBits & OPT_BIT_RANK) != 0;
    }

    private boolean conditionIsSet() {
      return (initBits & INIT_BIT_CONDITION) == 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of Encounter_Diagnosis is strict, attribute is already set: ".concat(name));
    }

    private void checkRequiredAttributes() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<>();
      if (!conditionIsSet()) attributes.add("condition");
      return "Cannot build Encounter_Diagnosis, some of required attributes are not set " + attributes;
    }
  }

  @Generated(from = "Encounter_Diagnosis", generator = "Immutables")
  public interface ConditionBuildStage {
    /**
     * Initializes the value for the {@link Encounter_Diagnosis#condition() condition} attribute.
     * @param condition The value for condition 
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal condition(Reference condition);
  }

  @Generated(from = "Encounter_Diagnosis", generator = "Immutables")
  public interface BuildFinal {

    /**
     * Initializes the optional value {@link Encounter_Diagnosis#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal extension(List<Extension> extension);

    /**
     * Initializes the optional value {@link Encounter_Diagnosis#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal extension(Optional<? extends List<Extension>> extension);

    /**
     * Initializes the optional value {@link Encounter_Diagnosis#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal modifierExtension(List<Extension> modifierExtension);

    /**
     * Initializes the optional value {@link Encounter_Diagnosis#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal modifierExtension(Optional<? extends List<Extension>> modifierExtension);

    /**
     * Initializes the optional value {@link Encounter_Diagnosis#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    BuildFinal id(String id);

    /**
     * Initializes the optional value {@link Encounter_Diagnosis#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal id(Optional<String> id);

    /**
     * Initializes the optional value {@link Encounter_Diagnosis#use() use} to use.
     * @param use The value for use
     * @return {@code this} builder for chained invocation
     */
    BuildFinal use(CodeableConcept use);

    /**
     * Initializes the optional value {@link Encounter_Diagnosis#use() use} to use.
     * @param use The value for use
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal use(Optional<? extends CodeableConcept> use);

    /**
     * Initializes the optional value {@link Encounter_Diagnosis#rank() rank} to rank.
     * @param rank The value for rank
     * @return {@code this} builder for chained invocation
     */
    BuildFinal rank(PositiveInt rank);

    /**
     * Initializes the optional value {@link Encounter_Diagnosis#rank() rank} to rank.
     * @param rank The value for rank
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal rank(Optional<? extends PositiveInt> rank);

    /**
     * Builds a new {@link Encounter_Diagnosis Encounter_Diagnosis}.
     * @return An immutable instance of Encounter_Diagnosis
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    Encounter_Diagnosis build();
  }
}
