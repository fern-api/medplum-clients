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
 * Immutable implementation of {@link SpecimenDefinition_Handling}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableSpecimenDefinition_Handling.builder()}.
 */
@Generated(from = "SpecimenDefinition_Handling", generator = "Immutables")
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableSpecimenDefinition_Handling implements SpecimenDefinition_Handling {
  private final @Nullable String instruction;
  private final @Nullable List<Extension> modifierExtension;
  private final @Nullable List<Extension> extension;
  private final @Nullable Range temperatureRange;
  private final @Nullable String id;
  private final @Nullable Duration maxDuration;
  private final @Nullable CodeableConcept temperatureQualifier;

  private ImmutableSpecimenDefinition_Handling(
      @Nullable String instruction,
      @Nullable List<Extension> modifierExtension,
      @Nullable List<Extension> extension,
      @Nullable Range temperatureRange,
      @Nullable String id,
      @Nullable Duration maxDuration,
      @Nullable CodeableConcept temperatureQualifier) {
    this.instruction = instruction;
    this.modifierExtension = modifierExtension;
    this.extension = extension;
    this.temperatureRange = temperatureRange;
    this.id = id;
    this.maxDuration = maxDuration;
    this.temperatureQualifier = temperatureQualifier;
  }

  /**
   * @return The value of the {@code instruction} attribute
   */
  @JsonProperty("instruction")
  @Override
  public Optional<String> instruction() {
    return Optional.ofNullable(instruction);
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
   * @return The value of the {@code temperatureRange} attribute
   */
  @JsonProperty("temperatureRange")
  @Override
  public Optional<Range> temperatureRange() {
    return Optional.ofNullable(temperatureRange);
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
   * @return The value of the {@code maxDuration} attribute
   */
  @JsonProperty("maxDuration")
  @Override
  public Optional<Duration> maxDuration() {
    return Optional.ofNullable(maxDuration);
  }

  /**
   * @return The value of the {@code temperatureQualifier} attribute
   */
  @JsonProperty("temperatureQualifier")
  @Override
  public Optional<CodeableConcept> temperatureQualifier() {
    return Optional.ofNullable(temperatureQualifier);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SpecimenDefinition_Handling#instruction() instruction} attribute.
   * @param value The value for instruction
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSpecimenDefinition_Handling withInstruction(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "instruction");
    if (Objects.equals(this.instruction, newValue)) return this;
    return new ImmutableSpecimenDefinition_Handling(
        newValue,
        this.modifierExtension,
        this.extension,
        this.temperatureRange,
        this.id,
        this.maxDuration,
        this.temperatureQualifier);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SpecimenDefinition_Handling#instruction() instruction} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for instruction
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSpecimenDefinition_Handling withInstruction(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.instruction, value)) return this;
    return new ImmutableSpecimenDefinition_Handling(
        value,
        this.modifierExtension,
        this.extension,
        this.temperatureRange,
        this.id,
        this.maxDuration,
        this.temperatureQualifier);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SpecimenDefinition_Handling#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSpecimenDefinition_Handling withModifierExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableSpecimenDefinition_Handling(
        this.instruction,
        newValue,
        this.extension,
        this.temperatureRange,
        this.id,
        this.maxDuration,
        this.temperatureQualifier);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SpecimenDefinition_Handling#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSpecimenDefinition_Handling withModifierExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableSpecimenDefinition_Handling(
        this.instruction,
        value,
        this.extension,
        this.temperatureRange,
        this.id,
        this.maxDuration,
        this.temperatureQualifier);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SpecimenDefinition_Handling#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSpecimenDefinition_Handling withExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableSpecimenDefinition_Handling(
        this.instruction,
        this.modifierExtension,
        newValue,
        this.temperatureRange,
        this.id,
        this.maxDuration,
        this.temperatureQualifier);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SpecimenDefinition_Handling#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSpecimenDefinition_Handling withExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableSpecimenDefinition_Handling(
        this.instruction,
        this.modifierExtension,
        value,
        this.temperatureRange,
        this.id,
        this.maxDuration,
        this.temperatureQualifier);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SpecimenDefinition_Handling#temperatureRange() temperatureRange} attribute.
   * @param value The value for temperatureRange
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSpecimenDefinition_Handling withTemperatureRange(Range value) {
    @Nullable Range newValue = Objects.requireNonNull(value, "temperatureRange");
    if (this.temperatureRange == newValue) return this;
    return new ImmutableSpecimenDefinition_Handling(
        this.instruction,
        this.modifierExtension,
        this.extension,
        newValue,
        this.id,
        this.maxDuration,
        this.temperatureQualifier);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SpecimenDefinition_Handling#temperatureRange() temperatureRange} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for temperatureRange
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSpecimenDefinition_Handling withTemperatureRange(Optional<? extends Range> optional) {
    @Nullable Range value = optional.orElse(null);
    if (this.temperatureRange == value) return this;
    return new ImmutableSpecimenDefinition_Handling(
        this.instruction,
        this.modifierExtension,
        this.extension,
        value,
        this.id,
        this.maxDuration,
        this.temperatureQualifier);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SpecimenDefinition_Handling#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSpecimenDefinition_Handling withId(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "id");
    if (Objects.equals(this.id, newValue)) return this;
    return new ImmutableSpecimenDefinition_Handling(
        this.instruction,
        this.modifierExtension,
        this.extension,
        this.temperatureRange,
        newValue,
        this.maxDuration,
        this.temperatureQualifier);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SpecimenDefinition_Handling#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSpecimenDefinition_Handling withId(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.id, value)) return this;
    return new ImmutableSpecimenDefinition_Handling(
        this.instruction,
        this.modifierExtension,
        this.extension,
        this.temperatureRange,
        value,
        this.maxDuration,
        this.temperatureQualifier);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SpecimenDefinition_Handling#maxDuration() maxDuration} attribute.
   * @param value The value for maxDuration
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSpecimenDefinition_Handling withMaxDuration(Duration value) {
    @Nullable Duration newValue = Objects.requireNonNull(value, "maxDuration");
    if (this.maxDuration == newValue) return this;
    return new ImmutableSpecimenDefinition_Handling(
        this.instruction,
        this.modifierExtension,
        this.extension,
        this.temperatureRange,
        this.id,
        newValue,
        this.temperatureQualifier);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SpecimenDefinition_Handling#maxDuration() maxDuration} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for maxDuration
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSpecimenDefinition_Handling withMaxDuration(Optional<? extends Duration> optional) {
    @Nullable Duration value = optional.orElse(null);
    if (this.maxDuration == value) return this;
    return new ImmutableSpecimenDefinition_Handling(
        this.instruction,
        this.modifierExtension,
        this.extension,
        this.temperatureRange,
        this.id,
        value,
        this.temperatureQualifier);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SpecimenDefinition_Handling#temperatureQualifier() temperatureQualifier} attribute.
   * @param value The value for temperatureQualifier
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSpecimenDefinition_Handling withTemperatureQualifier(CodeableConcept value) {
    @Nullable CodeableConcept newValue = Objects.requireNonNull(value, "temperatureQualifier");
    if (this.temperatureQualifier == newValue) return this;
    return new ImmutableSpecimenDefinition_Handling(
        this.instruction,
        this.modifierExtension,
        this.extension,
        this.temperatureRange,
        this.id,
        this.maxDuration,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SpecimenDefinition_Handling#temperatureQualifier() temperatureQualifier} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for temperatureQualifier
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSpecimenDefinition_Handling withTemperatureQualifier(Optional<? extends CodeableConcept> optional) {
    @Nullable CodeableConcept value = optional.orElse(null);
    if (this.temperatureQualifier == value) return this;
    return new ImmutableSpecimenDefinition_Handling(
        this.instruction,
        this.modifierExtension,
        this.extension,
        this.temperatureRange,
        this.id,
        this.maxDuration,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableSpecimenDefinition_Handling} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableSpecimenDefinition_Handling
        && equalTo((ImmutableSpecimenDefinition_Handling) another);
  }

  private boolean equalTo(ImmutableSpecimenDefinition_Handling another) {
    return Objects.equals(instruction, another.instruction)
        && Objects.equals(modifierExtension, another.modifierExtension)
        && Objects.equals(extension, another.extension)
        && Objects.equals(temperatureRange, another.temperatureRange)
        && Objects.equals(id, another.id)
        && Objects.equals(maxDuration, another.maxDuration)
        && Objects.equals(temperatureQualifier, another.temperatureQualifier);
  }

  /**
   * Computes a hash code from attributes: {@code instruction}, {@code modifierExtension}, {@code extension}, {@code temperatureRange}, {@code id}, {@code maxDuration}, {@code temperatureQualifier}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(instruction);
    h += (h << 5) + Objects.hashCode(modifierExtension);
    h += (h << 5) + Objects.hashCode(extension);
    h += (h << 5) + Objects.hashCode(temperatureRange);
    h += (h << 5) + Objects.hashCode(id);
    h += (h << 5) + Objects.hashCode(maxDuration);
    h += (h << 5) + Objects.hashCode(temperatureQualifier);
    return h;
  }

  /**
   * Prints the immutable value {@code SpecimenDefinition_Handling} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("SpecimenDefinition_Handling{");
    if (instruction != null) {
      builder.append("instruction=").append(instruction);
    }
    if (modifierExtension != null) {
      if (builder.length() > 28) builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (extension != null) {
      if (builder.length() > 28) builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (temperatureRange != null) {
      if (builder.length() > 28) builder.append(", ");
      builder.append("temperatureRange=").append(temperatureRange);
    }
    if (id != null) {
      if (builder.length() > 28) builder.append(", ");
      builder.append("id=").append(id);
    }
    if (maxDuration != null) {
      if (builder.length() > 28) builder.append(", ");
      builder.append("maxDuration=").append(maxDuration);
    }
    if (temperatureQualifier != null) {
      if (builder.length() > 28) builder.append(", ");
      builder.append("temperatureQualifier=").append(temperatureQualifier);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Generated(from = "SpecimenDefinition_Handling", generator = "Immutables")
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements SpecimenDefinition_Handling {
    @Nullable Optional<String> instruction = Optional.empty();
    boolean instructionIsSet;
    @Nullable Optional<List<Extension>> modifierExtension = Optional.empty();
    boolean modifierExtensionIsSet;
    @Nullable Optional<List<Extension>> extension = Optional.empty();
    boolean extensionIsSet;
    @Nullable Optional<Range> temperatureRange = Optional.empty();
    boolean temperatureRangeIsSet;
    @Nullable Optional<String> id = Optional.empty();
    boolean idIsSet;
    @Nullable Optional<Duration> maxDuration = Optional.empty();
    boolean maxDurationIsSet;
    @Nullable Optional<CodeableConcept> temperatureQualifier = Optional.empty();
    boolean temperatureQualifierIsSet;
    @JsonProperty("instruction")
    public void setInstruction(Optional<String> instruction) {
      this.instruction = instruction;
      this.instructionIsSet = true;
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
    @JsonProperty("temperatureRange")
    public void setTemperatureRange(Optional<Range> temperatureRange) {
      this.temperatureRange = temperatureRange;
      this.temperatureRangeIsSet = true;
    }
    @JsonProperty("id")
    public void setId(Optional<String> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @JsonProperty("maxDuration")
    public void setMaxDuration(Optional<Duration> maxDuration) {
      this.maxDuration = maxDuration;
      this.maxDurationIsSet = true;
    }
    @JsonProperty("temperatureQualifier")
    public void setTemperatureQualifier(Optional<CodeableConcept> temperatureQualifier) {
      this.temperatureQualifier = temperatureQualifier;
      this.temperatureQualifierIsSet = true;
    }
    @Override
    public Optional<String> instruction() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Range> temperatureRange() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> id() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Duration> maxDuration() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<CodeableConcept> temperatureQualifier() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableSpecimenDefinition_Handling fromJson(Json json) {
    ImmutableSpecimenDefinition_Handling.Builder builder = ImmutableSpecimenDefinition_Handling.builder();
    if (json.instructionIsSet) {
      builder.instruction(json.instruction);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.temperatureRangeIsSet) {
      builder.temperatureRange(json.temperatureRange);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.maxDurationIsSet) {
      builder.maxDuration(json.maxDuration);
    }
    if (json.temperatureQualifierIsSet) {
      builder.temperatureQualifier(json.temperatureQualifier);
    }
    return (ImmutableSpecimenDefinition_Handling) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link SpecimenDefinition_Handling} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable SpecimenDefinition_Handling instance
   */
  public static SpecimenDefinition_Handling copyOf(SpecimenDefinition_Handling instance) {
    if (instance instanceof ImmutableSpecimenDefinition_Handling) {
      return (ImmutableSpecimenDefinition_Handling) instance;
    }
    return ImmutableSpecimenDefinition_Handling.builder()
        .instruction(instance.instruction())
        .modifierExtension(instance.modifierExtension())
        .extension(instance.extension())
        .temperatureRange(instance.temperatureRange())
        .id(instance.id())
        .maxDuration(instance.maxDuration())
        .temperatureQualifier(instance.temperatureQualifier())
        .build();
  }

  /**
   * Creates a builder for {@link SpecimenDefinition_Handling SpecimenDefinition_Handling}.
   * <pre>
   * ImmutableSpecimenDefinition_Handling.builder()
   *    .instruction(String) // optional {@link SpecimenDefinition_Handling#instruction() instruction}
   *    .modifierExtension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link SpecimenDefinition_Handling#modifierExtension() modifierExtension}
   *    .extension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link SpecimenDefinition_Handling#extension() extension}
   *    .temperatureRange(com.fhir.Range) // optional {@link SpecimenDefinition_Handling#temperatureRange() temperatureRange}
   *    .id(String) // optional {@link SpecimenDefinition_Handling#id() id}
   *    .maxDuration(com.fhir.Duration) // optional {@link SpecimenDefinition_Handling#maxDuration() maxDuration}
   *    .temperatureQualifier(com.fhir.CodeableConcept) // optional {@link SpecimenDefinition_Handling#temperatureQualifier() temperatureQualifier}
   *    .build();
   * </pre>
   * @return A new SpecimenDefinition_Handling builder
   */
  public static ImmutableSpecimenDefinition_Handling.Builder builder() {
    return new ImmutableSpecimenDefinition_Handling.Builder();
  }

  /**
   * Builds instances of type {@link SpecimenDefinition_Handling SpecimenDefinition_Handling}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "SpecimenDefinition_Handling", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder {
    private static final long OPT_BIT_INSTRUCTION = 0x1L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x2L;
    private static final long OPT_BIT_EXTENSION = 0x4L;
    private static final long OPT_BIT_TEMPERATURE_RANGE = 0x8L;
    private static final long OPT_BIT_ID = 0x10L;
    private static final long OPT_BIT_MAX_DURATION = 0x20L;
    private static final long OPT_BIT_TEMPERATURE_QUALIFIER = 0x40L;
    private long optBits;

    private @Nullable String instruction;
    private @Nullable List<Extension> modifierExtension;
    private @Nullable List<Extension> extension;
    private @Nullable Range temperatureRange;
    private @Nullable String id;
    private @Nullable Duration maxDuration;
    private @Nullable CodeableConcept temperatureQualifier;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link SpecimenDefinition_Handling#instruction() instruction} to instruction.
     * @param instruction The value for instruction
     * @return {@code this} builder for chained invocation
     */
    public final Builder instruction(String instruction) {
      checkNotIsSet(instructionIsSet(), "instruction");
      this.instruction = Objects.requireNonNull(instruction, "instruction");
      optBits |= OPT_BIT_INSTRUCTION;
      return this;
    }

    /**
     * Initializes the optional value {@link SpecimenDefinition_Handling#instruction() instruction} to instruction.
     * @param instruction The value for instruction
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("instruction")
    public final Builder instruction(Optional<String> instruction) {
      checkNotIsSet(instructionIsSet(), "instruction");
      this.instruction = instruction.orElse(null);
      optBits |= OPT_BIT_INSTRUCTION;
      return this;
    }

    /**
     * Initializes the optional value {@link SpecimenDefinition_Handling#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link SpecimenDefinition_Handling#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link SpecimenDefinition_Handling#extension() extension} to extension.
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
     * Initializes the optional value {@link SpecimenDefinition_Handling#extension() extension} to extension.
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
     * Initializes the optional value {@link SpecimenDefinition_Handling#temperatureRange() temperatureRange} to temperatureRange.
     * @param temperatureRange The value for temperatureRange
     * @return {@code this} builder for chained invocation
     */
    public final Builder temperatureRange(Range temperatureRange) {
      checkNotIsSet(temperatureRangeIsSet(), "temperatureRange");
      this.temperatureRange = Objects.requireNonNull(temperatureRange, "temperatureRange");
      optBits |= OPT_BIT_TEMPERATURE_RANGE;
      return this;
    }

    /**
     * Initializes the optional value {@link SpecimenDefinition_Handling#temperatureRange() temperatureRange} to temperatureRange.
     * @param temperatureRange The value for temperatureRange
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("temperatureRange")
    public final Builder temperatureRange(Optional<? extends Range> temperatureRange) {
      checkNotIsSet(temperatureRangeIsSet(), "temperatureRange");
      this.temperatureRange = temperatureRange.orElse(null);
      optBits |= OPT_BIT_TEMPERATURE_RANGE;
      return this;
    }

    /**
     * Initializes the optional value {@link SpecimenDefinition_Handling#id() id} to id.
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
     * Initializes the optional value {@link SpecimenDefinition_Handling#id() id} to id.
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
     * Initializes the optional value {@link SpecimenDefinition_Handling#maxDuration() maxDuration} to maxDuration.
     * @param maxDuration The value for maxDuration
     * @return {@code this} builder for chained invocation
     */
    public final Builder maxDuration(Duration maxDuration) {
      checkNotIsSet(maxDurationIsSet(), "maxDuration");
      this.maxDuration = Objects.requireNonNull(maxDuration, "maxDuration");
      optBits |= OPT_BIT_MAX_DURATION;
      return this;
    }

    /**
     * Initializes the optional value {@link SpecimenDefinition_Handling#maxDuration() maxDuration} to maxDuration.
     * @param maxDuration The value for maxDuration
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("maxDuration")
    public final Builder maxDuration(Optional<? extends Duration> maxDuration) {
      checkNotIsSet(maxDurationIsSet(), "maxDuration");
      this.maxDuration = maxDuration.orElse(null);
      optBits |= OPT_BIT_MAX_DURATION;
      return this;
    }

    /**
     * Initializes the optional value {@link SpecimenDefinition_Handling#temperatureQualifier() temperatureQualifier} to temperatureQualifier.
     * @param temperatureQualifier The value for temperatureQualifier
     * @return {@code this} builder for chained invocation
     */
    public final Builder temperatureQualifier(CodeableConcept temperatureQualifier) {
      checkNotIsSet(temperatureQualifierIsSet(), "temperatureQualifier");
      this.temperatureQualifier = Objects.requireNonNull(temperatureQualifier, "temperatureQualifier");
      optBits |= OPT_BIT_TEMPERATURE_QUALIFIER;
      return this;
    }

    /**
     * Initializes the optional value {@link SpecimenDefinition_Handling#temperatureQualifier() temperatureQualifier} to temperatureQualifier.
     * @param temperatureQualifier The value for temperatureQualifier
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("temperatureQualifier")
    public final Builder temperatureQualifier(Optional<? extends CodeableConcept> temperatureQualifier) {
      checkNotIsSet(temperatureQualifierIsSet(), "temperatureQualifier");
      this.temperatureQualifier = temperatureQualifier.orElse(null);
      optBits |= OPT_BIT_TEMPERATURE_QUALIFIER;
      return this;
    }

    /**
     * Builds a new {@link SpecimenDefinition_Handling SpecimenDefinition_Handling}.
     * @return An immutable instance of SpecimenDefinition_Handling
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public SpecimenDefinition_Handling build() {
      return new ImmutableSpecimenDefinition_Handling(
          instruction,
          modifierExtension,
          extension,
          temperatureRange,
          id,
          maxDuration,
          temperatureQualifier);
    }

    private boolean instructionIsSet() {
      return (optBits & OPT_BIT_INSTRUCTION) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean temperatureRangeIsSet() {
      return (optBits & OPT_BIT_TEMPERATURE_RANGE) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean maxDurationIsSet() {
      return (optBits & OPT_BIT_MAX_DURATION) != 0;
    }

    private boolean temperatureQualifierIsSet() {
      return (optBits & OPT_BIT_TEMPERATURE_QUALIFIER) != 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of SpecimenDefinition_Handling is strict, attribute is already set: ".concat(name));
    }
  }
}
