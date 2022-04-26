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
 * Immutable implementation of {@link Timing}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableTiming.builder()}.
 */
@Generated(from = "Timing", generator = "Immutables")
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableTiming implements Timing {
  private final @Nullable CodeableConcept code;
  private final @Nullable String id;
  private final @Nullable List<Extension> extension;
  private final @Nullable List<DateTime> event;
  private final @Nullable List<Extension> modifierExtension;
  private final @Nullable Timing_Repeat repeat;

  private ImmutableTiming(
      @Nullable CodeableConcept code,
      @Nullable String id,
      @Nullable List<Extension> extension,
      @Nullable List<DateTime> event,
      @Nullable List<Extension> modifierExtension,
      @Nullable Timing_Repeat repeat) {
    this.code = code;
    this.id = id;
    this.extension = extension;
    this.event = event;
    this.modifierExtension = modifierExtension;
    this.repeat = repeat;
  }

  /**
   * @return The value of the {@code code} attribute
   */
  @JsonProperty("code")
  @Override
  public Optional<CodeableConcept> code() {
    return Optional.ofNullable(code);
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
   * @return The value of the {@code event} attribute
   */
  @JsonProperty("event")
  @Override
  public Optional<List<DateTime>> event() {
    return Optional.ofNullable(event);
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
   * @return The value of the {@code repeat} attribute
   */
  @JsonProperty("repeat")
  @Override
  public Optional<Timing_Repeat> repeat() {
    return Optional.ofNullable(repeat);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Timing#code() code} attribute.
   * @param value The value for code
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTiming withCode(CodeableConcept value) {
    @Nullable CodeableConcept newValue = Objects.requireNonNull(value, "code");
    if (this.code == newValue) return this;
    return new ImmutableTiming(newValue, this.id, this.extension, this.event, this.modifierExtension, this.repeat);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Timing#code() code} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for code
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableTiming withCode(Optional<? extends CodeableConcept> optional) {
    @Nullable CodeableConcept value = optional.orElse(null);
    if (this.code == value) return this;
    return new ImmutableTiming(value, this.id, this.extension, this.event, this.modifierExtension, this.repeat);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Timing#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTiming withId(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "id");
    if (Objects.equals(this.id, newValue)) return this;
    return new ImmutableTiming(this.code, newValue, this.extension, this.event, this.modifierExtension, this.repeat);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Timing#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTiming withId(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.id, value)) return this;
    return new ImmutableTiming(this.code, value, this.extension, this.event, this.modifierExtension, this.repeat);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Timing#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTiming withExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableTiming(this.code, this.id, newValue, this.event, this.modifierExtension, this.repeat);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Timing#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableTiming withExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableTiming(this.code, this.id, value, this.event, this.modifierExtension, this.repeat);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Timing#event() event} attribute.
   * @param value The value for event
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTiming withEvent(List<DateTime> value) {
    @Nullable List<DateTime> newValue = Objects.requireNonNull(value, "event");
    if (this.event == newValue) return this;
    return new ImmutableTiming(this.code, this.id, this.extension, newValue, this.modifierExtension, this.repeat);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Timing#event() event} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for event
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableTiming withEvent(Optional<? extends List<DateTime>> optional) {
    @Nullable List<DateTime> value = optional.orElse(null);
    if (this.event == value) return this;
    return new ImmutableTiming(this.code, this.id, this.extension, value, this.modifierExtension, this.repeat);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Timing#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTiming withModifierExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableTiming(this.code, this.id, this.extension, this.event, newValue, this.repeat);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Timing#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableTiming withModifierExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableTiming(this.code, this.id, this.extension, this.event, value, this.repeat);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Timing#repeat() repeat} attribute.
   * @param value The value for repeat
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTiming withRepeat(Timing_Repeat value) {
    @Nullable Timing_Repeat newValue = Objects.requireNonNull(value, "repeat");
    if (this.repeat == newValue) return this;
    return new ImmutableTiming(this.code, this.id, this.extension, this.event, this.modifierExtension, newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Timing#repeat() repeat} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for repeat
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableTiming withRepeat(Optional<? extends Timing_Repeat> optional) {
    @Nullable Timing_Repeat value = optional.orElse(null);
    if (this.repeat == value) return this;
    return new ImmutableTiming(this.code, this.id, this.extension, this.event, this.modifierExtension, value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableTiming} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableTiming
        && equalTo((ImmutableTiming) another);
  }

  private boolean equalTo(ImmutableTiming another) {
    return Objects.equals(code, another.code)
        && Objects.equals(id, another.id)
        && Objects.equals(extension, another.extension)
        && Objects.equals(event, another.event)
        && Objects.equals(modifierExtension, another.modifierExtension)
        && Objects.equals(repeat, another.repeat);
  }

  /**
   * Computes a hash code from attributes: {@code code}, {@code id}, {@code extension}, {@code event}, {@code modifierExtension}, {@code repeat}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(code);
    h += (h << 5) + Objects.hashCode(id);
    h += (h << 5) + Objects.hashCode(extension);
    h += (h << 5) + Objects.hashCode(event);
    h += (h << 5) + Objects.hashCode(modifierExtension);
    h += (h << 5) + Objects.hashCode(repeat);
    return h;
  }

  /**
   * Prints the immutable value {@code Timing} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("Timing{");
    if (code != null) {
      builder.append("code=").append(code);
    }
    if (id != null) {
      if (builder.length() > 7) builder.append(", ");
      builder.append("id=").append(id);
    }
    if (extension != null) {
      if (builder.length() > 7) builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (event != null) {
      if (builder.length() > 7) builder.append(", ");
      builder.append("event=").append(event);
    }
    if (modifierExtension != null) {
      if (builder.length() > 7) builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (repeat != null) {
      if (builder.length() > 7) builder.append(", ");
      builder.append("repeat=").append(repeat);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Generated(from = "Timing", generator = "Immutables")
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements Timing {
    @Nullable Optional<CodeableConcept> code = Optional.empty();
    boolean codeIsSet;
    @Nullable Optional<String> id = Optional.empty();
    boolean idIsSet;
    @Nullable Optional<List<Extension>> extension = Optional.empty();
    boolean extensionIsSet;
    @Nullable Optional<List<DateTime>> event = Optional.empty();
    boolean eventIsSet;
    @Nullable Optional<List<Extension>> modifierExtension = Optional.empty();
    boolean modifierExtensionIsSet;
    @Nullable Optional<Timing_Repeat> repeat = Optional.empty();
    boolean repeatIsSet;
    @JsonProperty("code")
    public void setCode(Optional<CodeableConcept> code) {
      this.code = code;
      this.codeIsSet = true;
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
    @JsonProperty("event")
    public void setEvent(Optional<List<DateTime>> event) {
      this.event = event;
      this.eventIsSet = true;
    }
    @JsonProperty("modifierExtension")
    public void setModifierExtension(Optional<List<Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @JsonProperty("repeat")
    public void setRepeat(Optional<Timing_Repeat> repeat) {
      this.repeat = repeat;
      this.repeatIsSet = true;
    }
    @Override
    public Optional<CodeableConcept> code() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> id() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<DateTime>> event() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Timing_Repeat> repeat() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableTiming fromJson(Json json) {
    ImmutableTiming.Builder builder = ImmutableTiming.builder();
    if (json.codeIsSet) {
      builder.code(json.code);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.eventIsSet) {
      builder.event(json.event);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.repeatIsSet) {
      builder.repeat(json.repeat);
    }
    return (ImmutableTiming) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link Timing} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable Timing instance
   */
  public static Timing copyOf(Timing instance) {
    if (instance instanceof ImmutableTiming) {
      return (ImmutableTiming) instance;
    }
    return ImmutableTiming.builder()
        .code(instance.code())
        .id(instance.id())
        .extension(instance.extension())
        .event(instance.event())
        .modifierExtension(instance.modifierExtension())
        .repeat(instance.repeat())
        .build();
  }

  /**
   * Creates a builder for {@link Timing Timing}.
   * <pre>
   * ImmutableTiming.builder()
   *    .code(com.fhir.types.fhir.CodeableConcept) // optional {@link Timing#code() code}
   *    .id(String) // optional {@link Timing#id() id}
   *    .extension(List&amp;lt;com.fhir.types.fhir.Extension&amp;gt;) // optional {@link Timing#extension() extension}
   *    .event(List&amp;lt;com.fhir.types.fhir.DateTime&amp;gt;) // optional {@link Timing#event() event}
   *    .modifierExtension(List&amp;lt;com.fhir.types.fhir.Extension&amp;gt;) // optional {@link Timing#modifierExtension() modifierExtension}
   *    .repeat(com.fhir.types.fhir.Timing_Repeat) // optional {@link Timing#repeat() repeat}
   *    .build();
   * </pre>
   * @return A new Timing builder
   */
  public static ImmutableTiming.Builder builder() {
    return new ImmutableTiming.Builder();
  }

  /**
   * Builds instances of type {@link Timing Timing}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "Timing", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder {
    private static final long OPT_BIT_CODE = 0x1L;
    private static final long OPT_BIT_ID = 0x2L;
    private static final long OPT_BIT_EXTENSION = 0x4L;
    private static final long OPT_BIT_EVENT = 0x8L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x10L;
    private static final long OPT_BIT_REPEAT = 0x20L;
    private long optBits;

    private @Nullable CodeableConcept code;
    private @Nullable String id;
    private @Nullable List<Extension> extension;
    private @Nullable List<DateTime> event;
    private @Nullable List<Extension> modifierExtension;
    private @Nullable Timing_Repeat repeat;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link Timing#code() code} to code.
     * @param code The value for code
     * @return {@code this} builder for chained invocation
     */
    public final Builder code(CodeableConcept code) {
      checkNotIsSet(codeIsSet(), "code");
      this.code = Objects.requireNonNull(code, "code");
      optBits |= OPT_BIT_CODE;
      return this;
    }

    /**
     * Initializes the optional value {@link Timing#code() code} to code.
     * @param code The value for code
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("code")
    public final Builder code(Optional<? extends CodeableConcept> code) {
      checkNotIsSet(codeIsSet(), "code");
      this.code = code.orElse(null);
      optBits |= OPT_BIT_CODE;
      return this;
    }

    /**
     * Initializes the optional value {@link Timing#id() id} to id.
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
     * Initializes the optional value {@link Timing#id() id} to id.
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
     * Initializes the optional value {@link Timing#extension() extension} to extension.
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
     * Initializes the optional value {@link Timing#extension() extension} to extension.
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
     * Initializes the optional value {@link Timing#event() event} to event.
     * @param event The value for event
     * @return {@code this} builder for chained invocation
     */
    public final Builder event(List<DateTime> event) {
      checkNotIsSet(eventIsSet(), "event");
      this.event = Objects.requireNonNull(event, "event");
      optBits |= OPT_BIT_EVENT;
      return this;
    }

    /**
     * Initializes the optional value {@link Timing#event() event} to event.
     * @param event The value for event
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("event")
    public final Builder event(Optional<? extends List<DateTime>> event) {
      checkNotIsSet(eventIsSet(), "event");
      this.event = event.orElse(null);
      optBits |= OPT_BIT_EVENT;
      return this;
    }

    /**
     * Initializes the optional value {@link Timing#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link Timing#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link Timing#repeat() repeat} to repeat.
     * @param repeat The value for repeat
     * @return {@code this} builder for chained invocation
     */
    public final Builder repeat(Timing_Repeat repeat) {
      checkNotIsSet(repeatIsSet(), "repeat");
      this.repeat = Objects.requireNonNull(repeat, "repeat");
      optBits |= OPT_BIT_REPEAT;
      return this;
    }

    /**
     * Initializes the optional value {@link Timing#repeat() repeat} to repeat.
     * @param repeat The value for repeat
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("repeat")
    public final Builder repeat(Optional<? extends Timing_Repeat> repeat) {
      checkNotIsSet(repeatIsSet(), "repeat");
      this.repeat = repeat.orElse(null);
      optBits |= OPT_BIT_REPEAT;
      return this;
    }

    /**
     * Builds a new {@link Timing Timing}.
     * @return An immutable instance of Timing
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public Timing build() {
      return new ImmutableTiming(code, id, extension, event, modifierExtension, repeat);
    }

    private boolean codeIsSet() {
      return (optBits & OPT_BIT_CODE) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean eventIsSet() {
      return (optBits & OPT_BIT_EVENT) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean repeatIsSet() {
      return (optBits & OPT_BIT_REPEAT) != 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of Timing is strict, attribute is already set: ".concat(name));
    }
  }
}
