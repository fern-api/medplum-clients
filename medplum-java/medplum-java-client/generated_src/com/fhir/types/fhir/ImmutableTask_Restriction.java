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
 * Immutable implementation of {@link Task_Restriction}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableTask_Restriction.builder()}.
 */
@Generated(from = "Task_Restriction", generator = "Immutables")
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableTask_Restriction implements Task_Restriction {
  private final @Nullable PositiveInt repetitions;
  private final @Nullable List<Reference> recipient;
  private final @Nullable List<Extension> modifierExtension;
  private final @Nullable Period period;
  private final @Nullable String id;
  private final @Nullable List<Extension> extension;

  private ImmutableTask_Restriction(
      @Nullable PositiveInt repetitions,
      @Nullable List<Reference> recipient,
      @Nullable List<Extension> modifierExtension,
      @Nullable Period period,
      @Nullable String id,
      @Nullable List<Extension> extension) {
    this.repetitions = repetitions;
    this.recipient = recipient;
    this.modifierExtension = modifierExtension;
    this.period = period;
    this.id = id;
    this.extension = extension;
  }

  /**
   * @return The value of the {@code repetitions} attribute
   */
  @JsonProperty("repetitions")
  @Override
  public Optional<PositiveInt> repetitions() {
    return Optional.ofNullable(repetitions);
  }

  /**
   * @return The value of the {@code recipient} attribute
   */
  @JsonProperty("recipient")
  @Override
  public Optional<List<Reference>> recipient() {
    return Optional.ofNullable(recipient);
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
   * @return The value of the {@code period} attribute
   */
  @JsonProperty("period")
  @Override
  public Optional<Period> period() {
    return Optional.ofNullable(period);
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
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Task_Restriction#repetitions() repetitions} attribute.
   * @param value The value for repetitions
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTask_Restriction withRepetitions(PositiveInt value) {
    @Nullable PositiveInt newValue = Objects.requireNonNull(value, "repetitions");
    if (this.repetitions == newValue) return this;
    return new ImmutableTask_Restriction(newValue, this.recipient, this.modifierExtension, this.period, this.id, this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Task_Restriction#repetitions() repetitions} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for repetitions
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableTask_Restriction withRepetitions(Optional<? extends PositiveInt> optional) {
    @Nullable PositiveInt value = optional.orElse(null);
    if (this.repetitions == value) return this;
    return new ImmutableTask_Restriction(value, this.recipient, this.modifierExtension, this.period, this.id, this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Task_Restriction#recipient() recipient} attribute.
   * @param value The value for recipient
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTask_Restriction withRecipient(List<Reference> value) {
    @Nullable List<Reference> newValue = Objects.requireNonNull(value, "recipient");
    if (this.recipient == newValue) return this;
    return new ImmutableTask_Restriction(this.repetitions, newValue, this.modifierExtension, this.period, this.id, this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Task_Restriction#recipient() recipient} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for recipient
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableTask_Restriction withRecipient(Optional<? extends List<Reference>> optional) {
    @Nullable List<Reference> value = optional.orElse(null);
    if (this.recipient == value) return this;
    return new ImmutableTask_Restriction(this.repetitions, value, this.modifierExtension, this.period, this.id, this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Task_Restriction#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTask_Restriction withModifierExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableTask_Restriction(this.repetitions, this.recipient, newValue, this.period, this.id, this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Task_Restriction#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableTask_Restriction withModifierExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableTask_Restriction(this.repetitions, this.recipient, value, this.period, this.id, this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Task_Restriction#period() period} attribute.
   * @param value The value for period
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTask_Restriction withPeriod(Period value) {
    @Nullable Period newValue = Objects.requireNonNull(value, "period");
    if (this.period == newValue) return this;
    return new ImmutableTask_Restriction(this.repetitions, this.recipient, this.modifierExtension, newValue, this.id, this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Task_Restriction#period() period} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for period
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableTask_Restriction withPeriod(Optional<? extends Period> optional) {
    @Nullable Period value = optional.orElse(null);
    if (this.period == value) return this;
    return new ImmutableTask_Restriction(this.repetitions, this.recipient, this.modifierExtension, value, this.id, this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Task_Restriction#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTask_Restriction withId(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "id");
    if (Objects.equals(this.id, newValue)) return this;
    return new ImmutableTask_Restriction(this.repetitions, this.recipient, this.modifierExtension, this.period, newValue, this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Task_Restriction#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTask_Restriction withId(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.id, value)) return this;
    return new ImmutableTask_Restriction(this.repetitions, this.recipient, this.modifierExtension, this.period, value, this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Task_Restriction#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTask_Restriction withExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableTask_Restriction(this.repetitions, this.recipient, this.modifierExtension, this.period, this.id, newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Task_Restriction#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableTask_Restriction withExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableTask_Restriction(this.repetitions, this.recipient, this.modifierExtension, this.period, this.id, value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableTask_Restriction} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableTask_Restriction
        && equalTo((ImmutableTask_Restriction) another);
  }

  private boolean equalTo(ImmutableTask_Restriction another) {
    return Objects.equals(repetitions, another.repetitions)
        && Objects.equals(recipient, another.recipient)
        && Objects.equals(modifierExtension, another.modifierExtension)
        && Objects.equals(period, another.period)
        && Objects.equals(id, another.id)
        && Objects.equals(extension, another.extension);
  }

  /**
   * Computes a hash code from attributes: {@code repetitions}, {@code recipient}, {@code modifierExtension}, {@code period}, {@code id}, {@code extension}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(repetitions);
    h += (h << 5) + Objects.hashCode(recipient);
    h += (h << 5) + Objects.hashCode(modifierExtension);
    h += (h << 5) + Objects.hashCode(period);
    h += (h << 5) + Objects.hashCode(id);
    h += (h << 5) + Objects.hashCode(extension);
    return h;
  }

  /**
   * Prints the immutable value {@code Task_Restriction} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("Task_Restriction{");
    if (repetitions != null) {
      builder.append("repetitions=").append(repetitions);
    }
    if (recipient != null) {
      if (builder.length() > 17) builder.append(", ");
      builder.append("recipient=").append(recipient);
    }
    if (modifierExtension != null) {
      if (builder.length() > 17) builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (period != null) {
      if (builder.length() > 17) builder.append(", ");
      builder.append("period=").append(period);
    }
    if (id != null) {
      if (builder.length() > 17) builder.append(", ");
      builder.append("id=").append(id);
    }
    if (extension != null) {
      if (builder.length() > 17) builder.append(", ");
      builder.append("extension=").append(extension);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Generated(from = "Task_Restriction", generator = "Immutables")
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements Task_Restriction {
    @Nullable Optional<PositiveInt> repetitions = Optional.empty();
    boolean repetitionsIsSet;
    @Nullable Optional<List<Reference>> recipient = Optional.empty();
    boolean recipientIsSet;
    @Nullable Optional<List<Extension>> modifierExtension = Optional.empty();
    boolean modifierExtensionIsSet;
    @Nullable Optional<Period> period = Optional.empty();
    boolean periodIsSet;
    @Nullable Optional<String> id = Optional.empty();
    boolean idIsSet;
    @Nullable Optional<List<Extension>> extension = Optional.empty();
    boolean extensionIsSet;
    @JsonProperty("repetitions")
    public void setRepetitions(Optional<PositiveInt> repetitions) {
      this.repetitions = repetitions;
      this.repetitionsIsSet = true;
    }
    @JsonProperty("recipient")
    public void setRecipient(Optional<List<Reference>> recipient) {
      this.recipient = recipient;
      this.recipientIsSet = true;
    }
    @JsonProperty("modifierExtension")
    public void setModifierExtension(Optional<List<Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @JsonProperty("period")
    public void setPeriod(Optional<Period> period) {
      this.period = period;
      this.periodIsSet = true;
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
    @Override
    public Optional<PositiveInt> repetitions() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Reference>> recipient() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Period> period() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> id() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> extension() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableTask_Restriction fromJson(Json json) {
    ImmutableTask_Restriction.Builder builder = ImmutableTask_Restriction.builder();
    if (json.repetitionsIsSet) {
      builder.repetitions(json.repetitions);
    }
    if (json.recipientIsSet) {
      builder.recipient(json.recipient);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.periodIsSet) {
      builder.period(json.period);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    return (ImmutableTask_Restriction) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link Task_Restriction} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable Task_Restriction instance
   */
  public static Task_Restriction copyOf(Task_Restriction instance) {
    if (instance instanceof ImmutableTask_Restriction) {
      return (ImmutableTask_Restriction) instance;
    }
    return ImmutableTask_Restriction.builder()
        .repetitions(instance.repetitions())
        .recipient(instance.recipient())
        .modifierExtension(instance.modifierExtension())
        .period(instance.period())
        .id(instance.id())
        .extension(instance.extension())
        .build();
  }

  /**
   * Creates a builder for {@link Task_Restriction Task_Restriction}.
   * <pre>
   * ImmutableTask_Restriction.builder()
   *    .repetitions(com.fhir.types.fhir.PositiveInt) // optional {@link Task_Restriction#repetitions() repetitions}
   *    .recipient(List&amp;lt;com.fhir.types.fhir.Reference&amp;gt;) // optional {@link Task_Restriction#recipient() recipient}
   *    .modifierExtension(List&amp;lt;com.fhir.types.fhir.Extension&amp;gt;) // optional {@link Task_Restriction#modifierExtension() modifierExtension}
   *    .period(com.fhir.types.fhir.Period) // optional {@link Task_Restriction#period() period}
   *    .id(String) // optional {@link Task_Restriction#id() id}
   *    .extension(List&amp;lt;com.fhir.types.fhir.Extension&amp;gt;) // optional {@link Task_Restriction#extension() extension}
   *    .build();
   * </pre>
   * @return A new Task_Restriction builder
   */
  public static ImmutableTask_Restriction.Builder builder() {
    return new ImmutableTask_Restriction.Builder();
  }

  /**
   * Builds instances of type {@link Task_Restriction Task_Restriction}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "Task_Restriction", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder {
    private static final long OPT_BIT_REPETITIONS = 0x1L;
    private static final long OPT_BIT_RECIPIENT = 0x2L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x4L;
    private static final long OPT_BIT_PERIOD = 0x8L;
    private static final long OPT_BIT_ID = 0x10L;
    private static final long OPT_BIT_EXTENSION = 0x20L;
    private long optBits;

    private @Nullable PositiveInt repetitions;
    private @Nullable List<Reference> recipient;
    private @Nullable List<Extension> modifierExtension;
    private @Nullable Period period;
    private @Nullable String id;
    private @Nullable List<Extension> extension;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link Task_Restriction#repetitions() repetitions} to repetitions.
     * @param repetitions The value for repetitions
     * @return {@code this} builder for chained invocation
     */
    public final Builder repetitions(PositiveInt repetitions) {
      checkNotIsSet(repetitionsIsSet(), "repetitions");
      this.repetitions = Objects.requireNonNull(repetitions, "repetitions");
      optBits |= OPT_BIT_REPETITIONS;
      return this;
    }

    /**
     * Initializes the optional value {@link Task_Restriction#repetitions() repetitions} to repetitions.
     * @param repetitions The value for repetitions
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("repetitions")
    public final Builder repetitions(Optional<? extends PositiveInt> repetitions) {
      checkNotIsSet(repetitionsIsSet(), "repetitions");
      this.repetitions = repetitions.orElse(null);
      optBits |= OPT_BIT_REPETITIONS;
      return this;
    }

    /**
     * Initializes the optional value {@link Task_Restriction#recipient() recipient} to recipient.
     * @param recipient The value for recipient
     * @return {@code this} builder for chained invocation
     */
    public final Builder recipient(List<Reference> recipient) {
      checkNotIsSet(recipientIsSet(), "recipient");
      this.recipient = Objects.requireNonNull(recipient, "recipient");
      optBits |= OPT_BIT_RECIPIENT;
      return this;
    }

    /**
     * Initializes the optional value {@link Task_Restriction#recipient() recipient} to recipient.
     * @param recipient The value for recipient
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("recipient")
    public final Builder recipient(Optional<? extends List<Reference>> recipient) {
      checkNotIsSet(recipientIsSet(), "recipient");
      this.recipient = recipient.orElse(null);
      optBits |= OPT_BIT_RECIPIENT;
      return this;
    }

    /**
     * Initializes the optional value {@link Task_Restriction#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link Task_Restriction#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link Task_Restriction#period() period} to period.
     * @param period The value for period
     * @return {@code this} builder for chained invocation
     */
    public final Builder period(Period period) {
      checkNotIsSet(periodIsSet(), "period");
      this.period = Objects.requireNonNull(period, "period");
      optBits |= OPT_BIT_PERIOD;
      return this;
    }

    /**
     * Initializes the optional value {@link Task_Restriction#period() period} to period.
     * @param period The value for period
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("period")
    public final Builder period(Optional<? extends Period> period) {
      checkNotIsSet(periodIsSet(), "period");
      this.period = period.orElse(null);
      optBits |= OPT_BIT_PERIOD;
      return this;
    }

    /**
     * Initializes the optional value {@link Task_Restriction#id() id} to id.
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
     * Initializes the optional value {@link Task_Restriction#id() id} to id.
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
     * Initializes the optional value {@link Task_Restriction#extension() extension} to extension.
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
     * Initializes the optional value {@link Task_Restriction#extension() extension} to extension.
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
     * Builds a new {@link Task_Restriction Task_Restriction}.
     * @return An immutable instance of Task_Restriction
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public Task_Restriction build() {
      return new ImmutableTask_Restriction(repetitions, recipient, modifierExtension, period, id, extension);
    }

    private boolean repetitionsIsSet() {
      return (optBits & OPT_BIT_REPETITIONS) != 0;
    }

    private boolean recipientIsSet() {
      return (optBits & OPT_BIT_RECIPIENT) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean periodIsSet() {
      return (optBits & OPT_BIT_PERIOD) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of Task_Restriction is strict, attribute is already set: ".concat(name));
    }
  }
}
