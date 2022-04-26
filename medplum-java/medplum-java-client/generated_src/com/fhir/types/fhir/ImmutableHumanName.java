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
 * Immutable implementation of {@link HumanName}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableHumanName.builder()}.
 */
@Generated(from = "HumanName", generator = "Immutables")
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableHumanName implements HumanName {
  private final @Nullable String text;
  private final @Nullable List<String> given;
  private final @Nullable List<String> prefix;
  private final @Nullable String id;
  private final @Nullable String family;
  private final @Nullable HumannameUse use;
  private final @Nullable List<String> suffix;
  private final @Nullable Period period;
  private final @Nullable List<Extension> extension;

  private ImmutableHumanName(
      @Nullable String text,
      @Nullable List<String> given,
      @Nullable List<String> prefix,
      @Nullable String id,
      @Nullable String family,
      @Nullable HumannameUse use,
      @Nullable List<String> suffix,
      @Nullable Period period,
      @Nullable List<Extension> extension) {
    this.text = text;
    this.given = given;
    this.prefix = prefix;
    this.id = id;
    this.family = family;
    this.use = use;
    this.suffix = suffix;
    this.period = period;
    this.extension = extension;
  }

  /**
   * @return The value of the {@code text} attribute
   */
  @JsonProperty("text")
  @Override
  public Optional<String> text() {
    return Optional.ofNullable(text);
  }

  /**
   * @return The value of the {@code given} attribute
   */
  @JsonProperty("given")
  @Override
  public Optional<List<String>> given() {
    return Optional.ofNullable(given);
  }

  /**
   * @return The value of the {@code prefix} attribute
   */
  @JsonProperty("prefix")
  @Override
  public Optional<List<String>> prefix() {
    return Optional.ofNullable(prefix);
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
   * @return The value of the {@code family} attribute
   */
  @JsonProperty("family")
  @Override
  public Optional<String> family() {
    return Optional.ofNullable(family);
  }

  /**
   * @return The value of the {@code use} attribute
   */
  @JsonProperty("use")
  @Override
  public Optional<HumannameUse> use() {
    return Optional.ofNullable(use);
  }

  /**
   * @return The value of the {@code suffix} attribute
   */
  @JsonProperty("suffix")
  @Override
  public Optional<List<String>> suffix() {
    return Optional.ofNullable(suffix);
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
   * @return The value of the {@code extension} attribute
   */
  @JsonProperty("extension")
  @Override
  public Optional<List<Extension>> extension() {
    return Optional.ofNullable(extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link HumanName#text() text} attribute.
   * @param value The value for text
   * @return A modified copy of {@code this} object
   */
  public final ImmutableHumanName withText(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "text");
    if (Objects.equals(this.text, newValue)) return this;
    return new ImmutableHumanName(
        newValue,
        this.given,
        this.prefix,
        this.id,
        this.family,
        this.use,
        this.suffix,
        this.period,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link HumanName#text() text} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for text
   * @return A modified copy of {@code this} object
   */
  public final ImmutableHumanName withText(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.text, value)) return this;
    return new ImmutableHumanName(
        value,
        this.given,
        this.prefix,
        this.id,
        this.family,
        this.use,
        this.suffix,
        this.period,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link HumanName#given() given} attribute.
   * @param value The value for given
   * @return A modified copy of {@code this} object
   */
  public final ImmutableHumanName withGiven(List<String> value) {
    @Nullable List<String> newValue = Objects.requireNonNull(value, "given");
    if (this.given == newValue) return this;
    return new ImmutableHumanName(
        this.text,
        newValue,
        this.prefix,
        this.id,
        this.family,
        this.use,
        this.suffix,
        this.period,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link HumanName#given() given} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for given
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableHumanName withGiven(Optional<? extends List<String>> optional) {
    @Nullable List<String> value = optional.orElse(null);
    if (this.given == value) return this;
    return new ImmutableHumanName(
        this.text,
        value,
        this.prefix,
        this.id,
        this.family,
        this.use,
        this.suffix,
        this.period,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link HumanName#prefix() prefix} attribute.
   * @param value The value for prefix
   * @return A modified copy of {@code this} object
   */
  public final ImmutableHumanName withPrefix(List<String> value) {
    @Nullable List<String> newValue = Objects.requireNonNull(value, "prefix");
    if (this.prefix == newValue) return this;
    return new ImmutableHumanName(
        this.text,
        this.given,
        newValue,
        this.id,
        this.family,
        this.use,
        this.suffix,
        this.period,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link HumanName#prefix() prefix} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for prefix
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableHumanName withPrefix(Optional<? extends List<String>> optional) {
    @Nullable List<String> value = optional.orElse(null);
    if (this.prefix == value) return this;
    return new ImmutableHumanName(
        this.text,
        this.given,
        value,
        this.id,
        this.family,
        this.use,
        this.suffix,
        this.period,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link HumanName#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableHumanName withId(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "id");
    if (Objects.equals(this.id, newValue)) return this;
    return new ImmutableHumanName(
        this.text,
        this.given,
        this.prefix,
        newValue,
        this.family,
        this.use,
        this.suffix,
        this.period,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link HumanName#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableHumanName withId(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.id, value)) return this;
    return new ImmutableHumanName(
        this.text,
        this.given,
        this.prefix,
        value,
        this.family,
        this.use,
        this.suffix,
        this.period,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link HumanName#family() family} attribute.
   * @param value The value for family
   * @return A modified copy of {@code this} object
   */
  public final ImmutableHumanName withFamily(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "family");
    if (Objects.equals(this.family, newValue)) return this;
    return new ImmutableHumanName(
        this.text,
        this.given,
        this.prefix,
        this.id,
        newValue,
        this.use,
        this.suffix,
        this.period,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link HumanName#family() family} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for family
   * @return A modified copy of {@code this} object
   */
  public final ImmutableHumanName withFamily(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.family, value)) return this;
    return new ImmutableHumanName(
        this.text,
        this.given,
        this.prefix,
        this.id,
        value,
        this.use,
        this.suffix,
        this.period,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link HumanName#use() use} attribute.
   * @param value The value for use
   * @return A modified copy of {@code this} object
   */
  public final ImmutableHumanName withUse(HumannameUse value) {
    @Nullable HumannameUse newValue = Objects.requireNonNull(value, "use");
    if (this.use == newValue) return this;
    return new ImmutableHumanName(
        this.text,
        this.given,
        this.prefix,
        this.id,
        this.family,
        newValue,
        this.suffix,
        this.period,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link HumanName#use() use} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for use
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableHumanName withUse(Optional<? extends HumannameUse> optional) {
    @Nullable HumannameUse value = optional.orElse(null);
    if (this.use == value) return this;
    return new ImmutableHumanName(
        this.text,
        this.given,
        this.prefix,
        this.id,
        this.family,
        value,
        this.suffix,
        this.period,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link HumanName#suffix() suffix} attribute.
   * @param value The value for suffix
   * @return A modified copy of {@code this} object
   */
  public final ImmutableHumanName withSuffix(List<String> value) {
    @Nullable List<String> newValue = Objects.requireNonNull(value, "suffix");
    if (this.suffix == newValue) return this;
    return new ImmutableHumanName(
        this.text,
        this.given,
        this.prefix,
        this.id,
        this.family,
        this.use,
        newValue,
        this.period,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link HumanName#suffix() suffix} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for suffix
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableHumanName withSuffix(Optional<? extends List<String>> optional) {
    @Nullable List<String> value = optional.orElse(null);
    if (this.suffix == value) return this;
    return new ImmutableHumanName(
        this.text,
        this.given,
        this.prefix,
        this.id,
        this.family,
        this.use,
        value,
        this.period,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link HumanName#period() period} attribute.
   * @param value The value for period
   * @return A modified copy of {@code this} object
   */
  public final ImmutableHumanName withPeriod(Period value) {
    @Nullable Period newValue = Objects.requireNonNull(value, "period");
    if (this.period == newValue) return this;
    return new ImmutableHumanName(
        this.text,
        this.given,
        this.prefix,
        this.id,
        this.family,
        this.use,
        this.suffix,
        newValue,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link HumanName#period() period} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for period
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableHumanName withPeriod(Optional<? extends Period> optional) {
    @Nullable Period value = optional.orElse(null);
    if (this.period == value) return this;
    return new ImmutableHumanName(
        this.text,
        this.given,
        this.prefix,
        this.id,
        this.family,
        this.use,
        this.suffix,
        value,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link HumanName#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableHumanName withExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableHumanName(
        this.text,
        this.given,
        this.prefix,
        this.id,
        this.family,
        this.use,
        this.suffix,
        this.period,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link HumanName#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableHumanName withExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableHumanName(
        this.text,
        this.given,
        this.prefix,
        this.id,
        this.family,
        this.use,
        this.suffix,
        this.period,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableHumanName} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableHumanName
        && equalTo((ImmutableHumanName) another);
  }

  private boolean equalTo(ImmutableHumanName another) {
    return Objects.equals(text, another.text)
        && Objects.equals(given, another.given)
        && Objects.equals(prefix, another.prefix)
        && Objects.equals(id, another.id)
        && Objects.equals(family, another.family)
        && Objects.equals(use, another.use)
        && Objects.equals(suffix, another.suffix)
        && Objects.equals(period, another.period)
        && Objects.equals(extension, another.extension);
  }

  /**
   * Computes a hash code from attributes: {@code text}, {@code given}, {@code prefix}, {@code id}, {@code family}, {@code use}, {@code suffix}, {@code period}, {@code extension}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(text);
    h += (h << 5) + Objects.hashCode(given);
    h += (h << 5) + Objects.hashCode(prefix);
    h += (h << 5) + Objects.hashCode(id);
    h += (h << 5) + Objects.hashCode(family);
    h += (h << 5) + Objects.hashCode(use);
    h += (h << 5) + Objects.hashCode(suffix);
    h += (h << 5) + Objects.hashCode(period);
    h += (h << 5) + Objects.hashCode(extension);
    return h;
  }

  /**
   * Prints the immutable value {@code HumanName} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("HumanName{");
    if (text != null) {
      builder.append("text=").append(text);
    }
    if (given != null) {
      if (builder.length() > 10) builder.append(", ");
      builder.append("given=").append(given);
    }
    if (prefix != null) {
      if (builder.length() > 10) builder.append(", ");
      builder.append("prefix=").append(prefix);
    }
    if (id != null) {
      if (builder.length() > 10) builder.append(", ");
      builder.append("id=").append(id);
    }
    if (family != null) {
      if (builder.length() > 10) builder.append(", ");
      builder.append("family=").append(family);
    }
    if (use != null) {
      if (builder.length() > 10) builder.append(", ");
      builder.append("use=").append(use);
    }
    if (suffix != null) {
      if (builder.length() > 10) builder.append(", ");
      builder.append("suffix=").append(suffix);
    }
    if (period != null) {
      if (builder.length() > 10) builder.append(", ");
      builder.append("period=").append(period);
    }
    if (extension != null) {
      if (builder.length() > 10) builder.append(", ");
      builder.append("extension=").append(extension);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Generated(from = "HumanName", generator = "Immutables")
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements HumanName {
    @Nullable Optional<String> text = Optional.empty();
    boolean textIsSet;
    @Nullable Optional<List<String>> given = Optional.empty();
    boolean givenIsSet;
    @Nullable Optional<List<String>> prefix = Optional.empty();
    boolean prefixIsSet;
    @Nullable Optional<String> id = Optional.empty();
    boolean idIsSet;
    @Nullable Optional<String> family = Optional.empty();
    boolean familyIsSet;
    @Nullable Optional<HumannameUse> use = Optional.empty();
    boolean useIsSet;
    @Nullable Optional<List<String>> suffix = Optional.empty();
    boolean suffixIsSet;
    @Nullable Optional<Period> period = Optional.empty();
    boolean periodIsSet;
    @Nullable Optional<List<Extension>> extension = Optional.empty();
    boolean extensionIsSet;
    @JsonProperty("text")
    public void setText(Optional<String> text) {
      this.text = text;
      this.textIsSet = true;
    }
    @JsonProperty("given")
    public void setGiven(Optional<List<String>> given) {
      this.given = given;
      this.givenIsSet = true;
    }
    @JsonProperty("prefix")
    public void setPrefix(Optional<List<String>> prefix) {
      this.prefix = prefix;
      this.prefixIsSet = true;
    }
    @JsonProperty("id")
    public void setId(Optional<String> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @JsonProperty("family")
    public void setFamily(Optional<String> family) {
      this.family = family;
      this.familyIsSet = true;
    }
    @JsonProperty("use")
    public void setUse(Optional<HumannameUse> use) {
      this.use = use;
      this.useIsSet = true;
    }
    @JsonProperty("suffix")
    public void setSuffix(Optional<List<String>> suffix) {
      this.suffix = suffix;
      this.suffixIsSet = true;
    }
    @JsonProperty("period")
    public void setPeriod(Optional<Period> period) {
      this.period = period;
      this.periodIsSet = true;
    }
    @JsonProperty("extension")
    public void setExtension(Optional<List<Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @Override
    public Optional<String> text() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<String>> given() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<String>> prefix() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> id() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> family() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<HumannameUse> use() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<String>> suffix() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Period> period() { throw new UnsupportedOperationException(); }
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
  static ImmutableHumanName fromJson(Json json) {
    ImmutableHumanName.Builder builder = ImmutableHumanName.builder();
    if (json.textIsSet) {
      builder.text(json.text);
    }
    if (json.givenIsSet) {
      builder.given(json.given);
    }
    if (json.prefixIsSet) {
      builder.prefix(json.prefix);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.familyIsSet) {
      builder.family(json.family);
    }
    if (json.useIsSet) {
      builder.use(json.use);
    }
    if (json.suffixIsSet) {
      builder.suffix(json.suffix);
    }
    if (json.periodIsSet) {
      builder.period(json.period);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    return (ImmutableHumanName) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link HumanName} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable HumanName instance
   */
  public static HumanName copyOf(HumanName instance) {
    if (instance instanceof ImmutableHumanName) {
      return (ImmutableHumanName) instance;
    }
    return ImmutableHumanName.builder()
        .text(instance.text())
        .given(instance.given())
        .prefix(instance.prefix())
        .id(instance.id())
        .family(instance.family())
        .use(instance.use())
        .suffix(instance.suffix())
        .period(instance.period())
        .extension(instance.extension())
        .build();
  }

  /**
   * Creates a builder for {@link HumanName HumanName}.
   * <pre>
   * ImmutableHumanName.builder()
   *    .text(String) // optional {@link HumanName#text() text}
   *    .given(List&amp;lt;String&amp;gt;) // optional {@link HumanName#given() given}
   *    .prefix(List&amp;lt;String&amp;gt;) // optional {@link HumanName#prefix() prefix}
   *    .id(String) // optional {@link HumanName#id() id}
   *    .family(String) // optional {@link HumanName#family() family}
   *    .use(com.fhir.types.fhir.HumannameUse) // optional {@link HumanName#use() use}
   *    .suffix(List&amp;lt;String&amp;gt;) // optional {@link HumanName#suffix() suffix}
   *    .period(com.fhir.types.fhir.Period) // optional {@link HumanName#period() period}
   *    .extension(List&amp;lt;com.fhir.types.fhir.Extension&amp;gt;) // optional {@link HumanName#extension() extension}
   *    .build();
   * </pre>
   * @return A new HumanName builder
   */
  public static ImmutableHumanName.Builder builder() {
    return new ImmutableHumanName.Builder();
  }

  /**
   * Builds instances of type {@link HumanName HumanName}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "HumanName", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder {
    private static final long OPT_BIT_TEXT = 0x1L;
    private static final long OPT_BIT_GIVEN = 0x2L;
    private static final long OPT_BIT_PREFIX = 0x4L;
    private static final long OPT_BIT_ID = 0x8L;
    private static final long OPT_BIT_FAMILY = 0x10L;
    private static final long OPT_BIT_USE = 0x20L;
    private static final long OPT_BIT_SUFFIX = 0x40L;
    private static final long OPT_BIT_PERIOD = 0x80L;
    private static final long OPT_BIT_EXTENSION = 0x100L;
    private long optBits;

    private @Nullable String text;
    private @Nullable List<String> given;
    private @Nullable List<String> prefix;
    private @Nullable String id;
    private @Nullable String family;
    private @Nullable HumannameUse use;
    private @Nullable List<String> suffix;
    private @Nullable Period period;
    private @Nullable List<Extension> extension;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link HumanName#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for chained invocation
     */
    public final Builder text(String text) {
      checkNotIsSet(textIsSet(), "text");
      this.text = Objects.requireNonNull(text, "text");
      optBits |= OPT_BIT_TEXT;
      return this;
    }

    /**
     * Initializes the optional value {@link HumanName#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("text")
    public final Builder text(Optional<String> text) {
      checkNotIsSet(textIsSet(), "text");
      this.text = text.orElse(null);
      optBits |= OPT_BIT_TEXT;
      return this;
    }

    /**
     * Initializes the optional value {@link HumanName#given() given} to given.
     * @param given The value for given
     * @return {@code this} builder for chained invocation
     */
    public final Builder given(List<String> given) {
      checkNotIsSet(givenIsSet(), "given");
      this.given = Objects.requireNonNull(given, "given");
      optBits |= OPT_BIT_GIVEN;
      return this;
    }

    /**
     * Initializes the optional value {@link HumanName#given() given} to given.
     * @param given The value for given
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("given")
    public final Builder given(Optional<? extends List<String>> given) {
      checkNotIsSet(givenIsSet(), "given");
      this.given = given.orElse(null);
      optBits |= OPT_BIT_GIVEN;
      return this;
    }

    /**
     * Initializes the optional value {@link HumanName#prefix() prefix} to prefix.
     * @param prefix The value for prefix
     * @return {@code this} builder for chained invocation
     */
    public final Builder prefix(List<String> prefix) {
      checkNotIsSet(prefixIsSet(), "prefix");
      this.prefix = Objects.requireNonNull(prefix, "prefix");
      optBits |= OPT_BIT_PREFIX;
      return this;
    }

    /**
     * Initializes the optional value {@link HumanName#prefix() prefix} to prefix.
     * @param prefix The value for prefix
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("prefix")
    public final Builder prefix(Optional<? extends List<String>> prefix) {
      checkNotIsSet(prefixIsSet(), "prefix");
      this.prefix = prefix.orElse(null);
      optBits |= OPT_BIT_PREFIX;
      return this;
    }

    /**
     * Initializes the optional value {@link HumanName#id() id} to id.
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
     * Initializes the optional value {@link HumanName#id() id} to id.
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
     * Initializes the optional value {@link HumanName#family() family} to family.
     * @param family The value for family
     * @return {@code this} builder for chained invocation
     */
    public final Builder family(String family) {
      checkNotIsSet(familyIsSet(), "family");
      this.family = Objects.requireNonNull(family, "family");
      optBits |= OPT_BIT_FAMILY;
      return this;
    }

    /**
     * Initializes the optional value {@link HumanName#family() family} to family.
     * @param family The value for family
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("family")
    public final Builder family(Optional<String> family) {
      checkNotIsSet(familyIsSet(), "family");
      this.family = family.orElse(null);
      optBits |= OPT_BIT_FAMILY;
      return this;
    }

    /**
     * Initializes the optional value {@link HumanName#use() use} to use.
     * @param use The value for use
     * @return {@code this} builder for chained invocation
     */
    public final Builder use(HumannameUse use) {
      checkNotIsSet(useIsSet(), "use");
      this.use = Objects.requireNonNull(use, "use");
      optBits |= OPT_BIT_USE;
      return this;
    }

    /**
     * Initializes the optional value {@link HumanName#use() use} to use.
     * @param use The value for use
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("use")
    public final Builder use(Optional<? extends HumannameUse> use) {
      checkNotIsSet(useIsSet(), "use");
      this.use = use.orElse(null);
      optBits |= OPT_BIT_USE;
      return this;
    }

    /**
     * Initializes the optional value {@link HumanName#suffix() suffix} to suffix.
     * @param suffix The value for suffix
     * @return {@code this} builder for chained invocation
     */
    public final Builder suffix(List<String> suffix) {
      checkNotIsSet(suffixIsSet(), "suffix");
      this.suffix = Objects.requireNonNull(suffix, "suffix");
      optBits |= OPT_BIT_SUFFIX;
      return this;
    }

    /**
     * Initializes the optional value {@link HumanName#suffix() suffix} to suffix.
     * @param suffix The value for suffix
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("suffix")
    public final Builder suffix(Optional<? extends List<String>> suffix) {
      checkNotIsSet(suffixIsSet(), "suffix");
      this.suffix = suffix.orElse(null);
      optBits |= OPT_BIT_SUFFIX;
      return this;
    }

    /**
     * Initializes the optional value {@link HumanName#period() period} to period.
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
     * Initializes the optional value {@link HumanName#period() period} to period.
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
     * Initializes the optional value {@link HumanName#extension() extension} to extension.
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
     * Initializes the optional value {@link HumanName#extension() extension} to extension.
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
     * Builds a new {@link HumanName HumanName}.
     * @return An immutable instance of HumanName
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public HumanName build() {
      return new ImmutableHumanName(text, given, prefix, id, family, use, suffix, period, extension);
    }

    private boolean textIsSet() {
      return (optBits & OPT_BIT_TEXT) != 0;
    }

    private boolean givenIsSet() {
      return (optBits & OPT_BIT_GIVEN) != 0;
    }

    private boolean prefixIsSet() {
      return (optBits & OPT_BIT_PREFIX) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean familyIsSet() {
      return (optBits & OPT_BIT_FAMILY) != 0;
    }

    private boolean useIsSet() {
      return (optBits & OPT_BIT_USE) != 0;
    }

    private boolean suffixIsSet() {
      return (optBits & OPT_BIT_SUFFIX) != 0;
    }

    private boolean periodIsSet() {
      return (optBits & OPT_BIT_PERIOD) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of HumanName is strict, attribute is already set: ".concat(name));
    }
  }
}
