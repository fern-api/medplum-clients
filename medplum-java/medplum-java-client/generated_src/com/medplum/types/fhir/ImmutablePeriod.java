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
 * Immutable implementation of {@link Period}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutablePeriod.builder()}.
 */
@Generated(from = "Period", generator = "Immutables")
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutablePeriod implements Period {
  private final @Nullable List<Extension> extension;
  private final @Nullable DateTime end;
  private final @Nullable String id;
  private final @Nullable DateTime start;

  private ImmutablePeriod(
      @Nullable List<Extension> extension,
      @Nullable DateTime end,
      @Nullable String id,
      @Nullable DateTime start) {
    this.extension = extension;
    this.end = end;
    this.id = id;
    this.start = start;
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
   * @return The value of the {@code end} attribute
   */
  @JsonProperty("end")
  @Override
  public Optional<DateTime> end() {
    return Optional.ofNullable(end);
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
   * @return The value of the {@code start} attribute
   */
  @JsonProperty("start")
  @Override
  public Optional<DateTime> start() {
    return Optional.ofNullable(start);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Period#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePeriod withExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutablePeriod(newValue, this.end, this.id, this.start);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Period#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutablePeriod withExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutablePeriod(value, this.end, this.id, this.start);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Period#end() end} attribute.
   * @param value The value for end
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePeriod withEnd(DateTime value) {
    @Nullable DateTime newValue = Objects.requireNonNull(value, "end");
    if (this.end == newValue) return this;
    return new ImmutablePeriod(this.extension, newValue, this.id, this.start);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Period#end() end} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for end
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutablePeriod withEnd(Optional<? extends DateTime> optional) {
    @Nullable DateTime value = optional.orElse(null);
    if (this.end == value) return this;
    return new ImmutablePeriod(this.extension, value, this.id, this.start);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Period#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePeriod withId(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "id");
    if (Objects.equals(this.id, newValue)) return this;
    return new ImmutablePeriod(this.extension, this.end, newValue, this.start);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Period#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePeriod withId(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.id, value)) return this;
    return new ImmutablePeriod(this.extension, this.end, value, this.start);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Period#start() start} attribute.
   * @param value The value for start
   * @return A modified copy of {@code this} object
   */
  public final ImmutablePeriod withStart(DateTime value) {
    @Nullable DateTime newValue = Objects.requireNonNull(value, "start");
    if (this.start == newValue) return this;
    return new ImmutablePeriod(this.extension, this.end, this.id, newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Period#start() start} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for start
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutablePeriod withStart(Optional<? extends DateTime> optional) {
    @Nullable DateTime value = optional.orElse(null);
    if (this.start == value) return this;
    return new ImmutablePeriod(this.extension, this.end, this.id, value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutablePeriod} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutablePeriod
        && equalTo((ImmutablePeriod) another);
  }

  private boolean equalTo(ImmutablePeriod another) {
    return Objects.equals(extension, another.extension)
        && Objects.equals(end, another.end)
        && Objects.equals(id, another.id)
        && Objects.equals(start, another.start);
  }

  /**
   * Computes a hash code from attributes: {@code extension}, {@code end}, {@code id}, {@code start}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(extension);
    h += (h << 5) + Objects.hashCode(end);
    h += (h << 5) + Objects.hashCode(id);
    h += (h << 5) + Objects.hashCode(start);
    return h;
  }

  /**
   * Prints the immutable value {@code Period} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("Period{");
    if (extension != null) {
      builder.append("extension=").append(extension);
    }
    if (end != null) {
      if (builder.length() > 7) builder.append(", ");
      builder.append("end=").append(end);
    }
    if (id != null) {
      if (builder.length() > 7) builder.append(", ");
      builder.append("id=").append(id);
    }
    if (start != null) {
      if (builder.length() > 7) builder.append(", ");
      builder.append("start=").append(start);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Generated(from = "Period", generator = "Immutables")
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements Period {
    @Nullable Optional<List<Extension>> extension = Optional.empty();
    boolean extensionIsSet;
    @Nullable Optional<DateTime> end = Optional.empty();
    boolean endIsSet;
    @Nullable Optional<String> id = Optional.empty();
    boolean idIsSet;
    @Nullable Optional<DateTime> start = Optional.empty();
    boolean startIsSet;
    @JsonProperty("extension")
    public void setExtension(Optional<List<Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @JsonProperty("end")
    public void setEnd(Optional<DateTime> end) {
      this.end = end;
      this.endIsSet = true;
    }
    @JsonProperty("id")
    public void setId(Optional<String> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @JsonProperty("start")
    public void setStart(Optional<DateTime> start) {
      this.start = start;
      this.startIsSet = true;
    }
    @Override
    public Optional<List<Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<DateTime> end() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> id() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<DateTime> start() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutablePeriod fromJson(Json json) {
    ImmutablePeriod.Builder builder = ImmutablePeriod.builder();
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.endIsSet) {
      builder.end(json.end);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.startIsSet) {
      builder.start(json.start);
    }
    return (ImmutablePeriod) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link Period} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable Period instance
   */
  public static Period copyOf(Period instance) {
    if (instance instanceof ImmutablePeriod) {
      return (ImmutablePeriod) instance;
    }
    return ImmutablePeriod.builder()
        .extension(instance.extension())
        .end(instance.end())
        .id(instance.id())
        .start(instance.start())
        .build();
  }

  /**
   * Creates a builder for {@link Period Period}.
   * <pre>
   * ImmutablePeriod.builder()
   *    .extension(List&amp;lt;com.medplum.types.fhir.Extension&amp;gt;) // optional {@link Period#extension() extension}
   *    .end(com.medplum.types.fhir.DateTime) // optional {@link Period#end() end}
   *    .id(String) // optional {@link Period#id() id}
   *    .start(com.medplum.types.fhir.DateTime) // optional {@link Period#start() start}
   *    .build();
   * </pre>
   * @return A new Period builder
   */
  public static ImmutablePeriod.Builder builder() {
    return new ImmutablePeriod.Builder();
  }

  /**
   * Builds instances of type {@link Period Period}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "Period", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder {
    private static final long OPT_BIT_EXTENSION = 0x1L;
    private static final long OPT_BIT_END = 0x2L;
    private static final long OPT_BIT_ID = 0x4L;
    private static final long OPT_BIT_START = 0x8L;
    private long optBits;

    private @Nullable List<Extension> extension;
    private @Nullable DateTime end;
    private @Nullable String id;
    private @Nullable DateTime start;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link Period#extension() extension} to extension.
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
     * Initializes the optional value {@link Period#extension() extension} to extension.
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
     * Initializes the optional value {@link Period#end() end} to end.
     * @param end The value for end
     * @return {@code this} builder for chained invocation
     */
    public final Builder end(DateTime end) {
      checkNotIsSet(endIsSet(), "end");
      this.end = Objects.requireNonNull(end, "end");
      optBits |= OPT_BIT_END;
      return this;
    }

    /**
     * Initializes the optional value {@link Period#end() end} to end.
     * @param end The value for end
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("end")
    public final Builder end(Optional<? extends DateTime> end) {
      checkNotIsSet(endIsSet(), "end");
      this.end = end.orElse(null);
      optBits |= OPT_BIT_END;
      return this;
    }

    /**
     * Initializes the optional value {@link Period#id() id} to id.
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
     * Initializes the optional value {@link Period#id() id} to id.
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
     * Initializes the optional value {@link Period#start() start} to start.
     * @param start The value for start
     * @return {@code this} builder for chained invocation
     */
    public final Builder start(DateTime start) {
      checkNotIsSet(startIsSet(), "start");
      this.start = Objects.requireNonNull(start, "start");
      optBits |= OPT_BIT_START;
      return this;
    }

    /**
     * Initializes the optional value {@link Period#start() start} to start.
     * @param start The value for start
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("start")
    public final Builder start(Optional<? extends DateTime> start) {
      checkNotIsSet(startIsSet(), "start");
      this.start = start.orElse(null);
      optBits |= OPT_BIT_START;
      return this;
    }

    /**
     * Builds a new {@link Period Period}.
     * @return An immutable instance of Period
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public Period build() {
      return new ImmutablePeriod(extension, end, id, start);
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean endIsSet() {
      return (optBits & OPT_BIT_END) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean startIsSet() {
      return (optBits & OPT_BIT_START) != 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of Period is strict, attribute is already set: ".concat(name));
    }
  }
}
