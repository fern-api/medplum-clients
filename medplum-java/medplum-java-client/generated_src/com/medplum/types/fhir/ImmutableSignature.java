package com.medplum.types.fhir;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;
import javax.annotation.ParametersAreNonnullByDefault;
import javax.annotation.concurrent.Immutable;
import javax.annotation.concurrent.NotThreadSafe;
import org.immutables.value.Generated;

/**
 * Immutable implementation of {@link Signature}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableSignature.builder()}.
 */
@Generated(from = "Signature", generator = "Immutables")
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableSignature implements Signature {
  private final @Nullable Base64Binary data;
  private final List<Coding> type;
  private final @Nullable Instant when;
  private final @Nullable Code sigFormat;
  private final @Nullable String id;
  private final @Nullable Code targetFormat;
  private final Reference who;
  private final @Nullable List<Extension> extension;
  private final @Nullable Reference onBehalfOf;

  private ImmutableSignature(
      @Nullable Base64Binary data,
      List<Coding> type,
      @Nullable Instant when,
      @Nullable Code sigFormat,
      @Nullable String id,
      @Nullable Code targetFormat,
      Reference who,
      @Nullable List<Extension> extension,
      @Nullable Reference onBehalfOf) {
    this.data = data;
    this.type = type;
    this.when = when;
    this.sigFormat = sigFormat;
    this.id = id;
    this.targetFormat = targetFormat;
    this.who = who;
    this.extension = extension;
    this.onBehalfOf = onBehalfOf;
  }

  /**
   * @return The value of the {@code data} attribute
   */
  @JsonProperty("data")
  @Override
  public Optional<Base64Binary> data() {
    return Optional.ofNullable(data);
  }

  /**
   * @return The value of the {@code type} attribute
   */
  @JsonProperty("type")
  @Override
  public List<Coding> type() {
    return type;
  }

  /**
   * @return The value of the {@code when} attribute
   */
  @JsonProperty("when")
  @Override
  public Optional<Instant> when() {
    return Optional.ofNullable(when);
  }

  /**
   * @return The value of the {@code sigFormat} attribute
   */
  @JsonProperty("sigFormat")
  @Override
  public Optional<Code> sigFormat() {
    return Optional.ofNullable(sigFormat);
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
   * @return The value of the {@code targetFormat} attribute
   */
  @JsonProperty("targetFormat")
  @Override
  public Optional<Code> targetFormat() {
    return Optional.ofNullable(targetFormat);
  }

  /**
   * @return The value of the {@code who} attribute
   */
  @JsonProperty("who")
  @Override
  public Reference who() {
    return who;
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
   * @return The value of the {@code onBehalfOf} attribute
   */
  @JsonProperty("onBehalfOf")
  @Override
  public Optional<Reference> onBehalfOf() {
    return Optional.ofNullable(onBehalfOf);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Signature#data() data} attribute.
   * @param value The value for data
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSignature withData(Base64Binary value) {
    @Nullable Base64Binary newValue = Objects.requireNonNull(value, "data");
    if (this.data == newValue) return this;
    return new ImmutableSignature(
        newValue,
        this.type,
        this.when,
        this.sigFormat,
        this.id,
        this.targetFormat,
        this.who,
        this.extension,
        this.onBehalfOf);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Signature#data() data} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for data
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSignature withData(Optional<? extends Base64Binary> optional) {
    @Nullable Base64Binary value = optional.orElse(null);
    if (this.data == value) return this;
    return new ImmutableSignature(
        value,
        this.type,
        this.when,
        this.sigFormat,
        this.id,
        this.targetFormat,
        this.who,
        this.extension,
        this.onBehalfOf);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link Signature#type() type}.
   * @param elements The elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSignature withType(Coding... elements) {
    List<Coding> newValue = createUnmodifiableList(false, createSafeList(Arrays.asList(elements), true, false));
    return new ImmutableSignature(
        this.data,
        newValue,
        this.when,
        this.sigFormat,
        this.id,
        this.targetFormat,
        this.who,
        this.extension,
        this.onBehalfOf);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link Signature#type() type}.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param elements An iterable of type elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSignature withType(Iterable<? extends Coding> elements) {
    if (this.type == elements) return this;
    List<Coding> newValue = createUnmodifiableList(false, createSafeList(elements, true, false));
    return new ImmutableSignature(
        this.data,
        newValue,
        this.when,
        this.sigFormat,
        this.id,
        this.targetFormat,
        this.who,
        this.extension,
        this.onBehalfOf);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Signature#when() when} attribute.
   * @param value The value for when
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSignature withWhen(Instant value) {
    @Nullable Instant newValue = Objects.requireNonNull(value, "when");
    if (this.when == newValue) return this;
    return new ImmutableSignature(
        this.data,
        this.type,
        newValue,
        this.sigFormat,
        this.id,
        this.targetFormat,
        this.who,
        this.extension,
        this.onBehalfOf);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Signature#when() when} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for when
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSignature withWhen(Optional<? extends Instant> optional) {
    @Nullable Instant value = optional.orElse(null);
    if (this.when == value) return this;
    return new ImmutableSignature(
        this.data,
        this.type,
        value,
        this.sigFormat,
        this.id,
        this.targetFormat,
        this.who,
        this.extension,
        this.onBehalfOf);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Signature#sigFormat() sigFormat} attribute.
   * @param value The value for sigFormat
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSignature withSigFormat(Code value) {
    @Nullable Code newValue = Objects.requireNonNull(value, "sigFormat");
    if (this.sigFormat == newValue) return this;
    return new ImmutableSignature(
        this.data,
        this.type,
        this.when,
        newValue,
        this.id,
        this.targetFormat,
        this.who,
        this.extension,
        this.onBehalfOf);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Signature#sigFormat() sigFormat} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for sigFormat
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSignature withSigFormat(Optional<? extends Code> optional) {
    @Nullable Code value = optional.orElse(null);
    if (this.sigFormat == value) return this;
    return new ImmutableSignature(
        this.data,
        this.type,
        this.when,
        value,
        this.id,
        this.targetFormat,
        this.who,
        this.extension,
        this.onBehalfOf);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Signature#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSignature withId(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "id");
    if (Objects.equals(this.id, newValue)) return this;
    return new ImmutableSignature(
        this.data,
        this.type,
        this.when,
        this.sigFormat,
        newValue,
        this.targetFormat,
        this.who,
        this.extension,
        this.onBehalfOf);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Signature#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSignature withId(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.id, value)) return this;
    return new ImmutableSignature(
        this.data,
        this.type,
        this.when,
        this.sigFormat,
        value,
        this.targetFormat,
        this.who,
        this.extension,
        this.onBehalfOf);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Signature#targetFormat() targetFormat} attribute.
   * @param value The value for targetFormat
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSignature withTargetFormat(Code value) {
    @Nullable Code newValue = Objects.requireNonNull(value, "targetFormat");
    if (this.targetFormat == newValue) return this;
    return new ImmutableSignature(
        this.data,
        this.type,
        this.when,
        this.sigFormat,
        this.id,
        newValue,
        this.who,
        this.extension,
        this.onBehalfOf);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Signature#targetFormat() targetFormat} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for targetFormat
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSignature withTargetFormat(Optional<? extends Code> optional) {
    @Nullable Code value = optional.orElse(null);
    if (this.targetFormat == value) return this;
    return new ImmutableSignature(
        this.data,
        this.type,
        this.when,
        this.sigFormat,
        this.id,
        value,
        this.who,
        this.extension,
        this.onBehalfOf);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link Signature#who() who} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for who
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableSignature withWho(Reference value) {
    if (this.who == value) return this;
    Reference newValue = Objects.requireNonNull(value, "who");
    return new ImmutableSignature(
        this.data,
        this.type,
        this.when,
        this.sigFormat,
        this.id,
        this.targetFormat,
        newValue,
        this.extension,
        this.onBehalfOf);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Signature#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSignature withExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableSignature(
        this.data,
        this.type,
        this.when,
        this.sigFormat,
        this.id,
        this.targetFormat,
        this.who,
        newValue,
        this.onBehalfOf);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Signature#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSignature withExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableSignature(
        this.data,
        this.type,
        this.when,
        this.sigFormat,
        this.id,
        this.targetFormat,
        this.who,
        value,
        this.onBehalfOf);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Signature#onBehalfOf() onBehalfOf} attribute.
   * @param value The value for onBehalfOf
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSignature withOnBehalfOf(Reference value) {
    @Nullable Reference newValue = Objects.requireNonNull(value, "onBehalfOf");
    if (this.onBehalfOf == newValue) return this;
    return new ImmutableSignature(
        this.data,
        this.type,
        this.when,
        this.sigFormat,
        this.id,
        this.targetFormat,
        this.who,
        this.extension,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Signature#onBehalfOf() onBehalfOf} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for onBehalfOf
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSignature withOnBehalfOf(Optional<? extends Reference> optional) {
    @Nullable Reference value = optional.orElse(null);
    if (this.onBehalfOf == value) return this;
    return new ImmutableSignature(
        this.data,
        this.type,
        this.when,
        this.sigFormat,
        this.id,
        this.targetFormat,
        this.who,
        this.extension,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableSignature} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableSignature
        && equalTo((ImmutableSignature) another);
  }

  private boolean equalTo(ImmutableSignature another) {
    return Objects.equals(data, another.data)
        && type.equals(another.type)
        && Objects.equals(when, another.when)
        && Objects.equals(sigFormat, another.sigFormat)
        && Objects.equals(id, another.id)
        && Objects.equals(targetFormat, another.targetFormat)
        && who.equals(another.who)
        && Objects.equals(extension, another.extension)
        && Objects.equals(onBehalfOf, another.onBehalfOf);
  }

  /**
   * Computes a hash code from attributes: {@code data}, {@code type}, {@code when}, {@code sigFormat}, {@code id}, {@code targetFormat}, {@code who}, {@code extension}, {@code onBehalfOf}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(data);
    h += (h << 5) + type.hashCode();
    h += (h << 5) + Objects.hashCode(when);
    h += (h << 5) + Objects.hashCode(sigFormat);
    h += (h << 5) + Objects.hashCode(id);
    h += (h << 5) + Objects.hashCode(targetFormat);
    h += (h << 5) + who.hashCode();
    h += (h << 5) + Objects.hashCode(extension);
    h += (h << 5) + Objects.hashCode(onBehalfOf);
    return h;
  }

  /**
   * Prints the immutable value {@code Signature} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("Signature{");
    if (data != null) {
      builder.append("data=").append(data);
    }
    if (builder.length() > 10) builder.append(", ");
    builder.append("type=").append(type);
    if (when != null) {
      builder.append(", ");
      builder.append("when=").append(when);
    }
    if (sigFormat != null) {
      builder.append(", ");
      builder.append("sigFormat=").append(sigFormat);
    }
    if (id != null) {
      builder.append(", ");
      builder.append("id=").append(id);
    }
    if (targetFormat != null) {
      builder.append(", ");
      builder.append("targetFormat=").append(targetFormat);
    }
    builder.append(", ");
    builder.append("who=").append(who);
    if (extension != null) {
      builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (onBehalfOf != null) {
      builder.append(", ");
      builder.append("onBehalfOf=").append(onBehalfOf);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Generated(from = "Signature", generator = "Immutables")
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements Signature {
    @Nullable Optional<Base64Binary> data = Optional.empty();
    boolean dataIsSet;
    @Nullable List<Coding> type = Collections.emptyList();
    @Nullable Optional<Instant> when = Optional.empty();
    boolean whenIsSet;
    @Nullable Optional<Code> sigFormat = Optional.empty();
    boolean sigFormatIsSet;
    @Nullable Optional<String> id = Optional.empty();
    boolean idIsSet;
    @Nullable Optional<Code> targetFormat = Optional.empty();
    boolean targetFormatIsSet;
    @Nullable Reference who;
    @Nullable Optional<List<Extension>> extension = Optional.empty();
    boolean extensionIsSet;
    @Nullable Optional<Reference> onBehalfOf = Optional.empty();
    boolean onBehalfOfIsSet;
    @JsonProperty("data")
    public void setData(Optional<Base64Binary> data) {
      this.data = data;
      this.dataIsSet = true;
    }
    @JsonProperty("type")
    public void setType(List<Coding> type) {
      this.type = type;
    }
    @JsonProperty("when")
    public void setWhen(Optional<Instant> when) {
      this.when = when;
      this.whenIsSet = true;
    }
    @JsonProperty("sigFormat")
    public void setSigFormat(Optional<Code> sigFormat) {
      this.sigFormat = sigFormat;
      this.sigFormatIsSet = true;
    }
    @JsonProperty("id")
    public void setId(Optional<String> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @JsonProperty("targetFormat")
    public void setTargetFormat(Optional<Code> targetFormat) {
      this.targetFormat = targetFormat;
      this.targetFormatIsSet = true;
    }
    @JsonProperty("who")
    public void setWho(Reference who) {
      this.who = who;
    }
    @JsonProperty("extension")
    public void setExtension(Optional<List<Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @JsonProperty("onBehalfOf")
    public void setOnBehalfOf(Optional<Reference> onBehalfOf) {
      this.onBehalfOf = onBehalfOf;
      this.onBehalfOfIsSet = true;
    }
    @Override
    public Optional<Base64Binary> data() { throw new UnsupportedOperationException(); }
    @Override
    public List<Coding> type() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Instant> when() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Code> sigFormat() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> id() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Code> targetFormat() { throw new UnsupportedOperationException(); }
    @Override
    public Reference who() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Reference> onBehalfOf() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableSignature fromJson(Json json) {
    ImmutableSignature.Builder builder = ((ImmutableSignature.Builder) ImmutableSignature.builder());
    if (json.dataIsSet) {
      builder.data(json.data);
    }
    if (json.type != null) {
      builder.addAllType(json.type);
    }
    if (json.whenIsSet) {
      builder.when(json.when);
    }
    if (json.sigFormatIsSet) {
      builder.sigFormat(json.sigFormat);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.targetFormatIsSet) {
      builder.targetFormat(json.targetFormat);
    }
    if (json.who != null) {
      builder.who(json.who);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.onBehalfOfIsSet) {
      builder.onBehalfOf(json.onBehalfOf);
    }
    return (ImmutableSignature) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link Signature} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable Signature instance
   */
  public static Signature copyOf(Signature instance) {
    if (instance instanceof ImmutableSignature) {
      return (ImmutableSignature) instance;
    }
    return ((ImmutableSignature.Builder) ImmutableSignature.builder())
        .data(instance.data())
        .addAllType(instance.type())
        .when(instance.when())
        .sigFormat(instance.sigFormat())
        .id(instance.id())
        .targetFormat(instance.targetFormat())
        .who(instance.who())
        .extension(instance.extension())
        .onBehalfOf(instance.onBehalfOf())
        .build();
  }

  /**
   * Creates a builder for {@link Signature Signature}.
   * <pre>
   * ImmutableSignature.builder()
   *    .data(com.medplum.types.fhir.Base64Binary) // optional {@link Signature#data() data}
   *    .addType|addAllType(com.medplum.types.fhir.Coding) // {@link Signature#type() type} elements
   *    .when(com.medplum.types.fhir.Instant) // optional {@link Signature#when() when}
   *    .sigFormat(com.medplum.types.fhir.Code) // optional {@link Signature#sigFormat() sigFormat}
   *    .id(String) // optional {@link Signature#id() id}
   *    .targetFormat(com.medplum.types.fhir.Code) // optional {@link Signature#targetFormat() targetFormat}
   *    .who(com.medplum.types.fhir.Reference) // required {@link Signature#who() who}
   *    .extension(List&amp;lt;com.medplum.types.fhir.Extension&amp;gt;) // optional {@link Signature#extension() extension}
   *    .onBehalfOf(com.medplum.types.fhir.Reference) // optional {@link Signature#onBehalfOf() onBehalfOf}
   *    .build();
   * </pre>
   * @return A new Signature builder
   */
  public static WhoBuildStage builder() {
    return new ImmutableSignature.Builder();
  }

  /**
   * Builds instances of type {@link Signature Signature}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "Signature", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder implements WhoBuildStage, BuildFinal {
    private static final long INIT_BIT_WHO = 0x1L;
    private static final long OPT_BIT_DATA = 0x1L;
    private static final long OPT_BIT_WHEN = 0x2L;
    private static final long OPT_BIT_SIG_FORMAT = 0x4L;
    private static final long OPT_BIT_ID = 0x8L;
    private static final long OPT_BIT_TARGET_FORMAT = 0x10L;
    private static final long OPT_BIT_EXTENSION = 0x20L;
    private static final long OPT_BIT_ON_BEHALF_OF = 0x40L;
    private long initBits = 0x1L;
    private long optBits;

    private @Nullable Base64Binary data;
    private final List<Coding> type = new ArrayList<Coding>();
    private @Nullable Instant when;
    private @Nullable Code sigFormat;
    private @Nullable String id;
    private @Nullable Code targetFormat;
    private @Nullable Reference who;
    private @Nullable List<Extension> extension;
    private @Nullable Reference onBehalfOf;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link Signature#data() data} to data.
     * @param data The value for data
     * @return {@code this} builder for chained invocation
     */
    public final Builder data(Base64Binary data) {
      checkNotIsSet(dataIsSet(), "data");
      this.data = Objects.requireNonNull(data, "data");
      optBits |= OPT_BIT_DATA;
      return this;
    }

    /**
     * Initializes the optional value {@link Signature#data() data} to data.
     * @param data The value for data
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("data")
    public final Builder data(Optional<? extends Base64Binary> data) {
      checkNotIsSet(dataIsSet(), "data");
      this.data = data.orElse(null);
      optBits |= OPT_BIT_DATA;
      return this;
    }

    /**
     * Adds one element to {@link Signature#type() type} list.
     * @param element A type element
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addType(Coding element) {
      this.type.add(Objects.requireNonNull(element, "type element"));
      return this;
    }

    /**
     * Adds elements to {@link Signature#type() type} list.
     * @param elements An array of type elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addType(Coding... elements) {
      for (Coding element : elements) {
        this.type.add(Objects.requireNonNull(element, "type element"));
      }
      return this;
    }


    /**
     * Adds elements to {@link Signature#type() type} list.
     * @param elements An iterable of type elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addAllType(Iterable<? extends Coding> elements) {
      for (Coding element : elements) {
        this.type.add(Objects.requireNonNull(element, "type element"));
      }
      return this;
    }

    /**
     * Initializes the optional value {@link Signature#when() when} to when.
     * @param when The value for when
     * @return {@code this} builder for chained invocation
     */
    public final Builder when(Instant when) {
      checkNotIsSet(whenIsSet(), "when");
      this.when = Objects.requireNonNull(when, "when");
      optBits |= OPT_BIT_WHEN;
      return this;
    }

    /**
     * Initializes the optional value {@link Signature#when() when} to when.
     * @param when The value for when
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("when")
    public final Builder when(Optional<? extends Instant> when) {
      checkNotIsSet(whenIsSet(), "when");
      this.when = when.orElse(null);
      optBits |= OPT_BIT_WHEN;
      return this;
    }

    /**
     * Initializes the optional value {@link Signature#sigFormat() sigFormat} to sigFormat.
     * @param sigFormat The value for sigFormat
     * @return {@code this} builder for chained invocation
     */
    public final Builder sigFormat(Code sigFormat) {
      checkNotIsSet(sigFormatIsSet(), "sigFormat");
      this.sigFormat = Objects.requireNonNull(sigFormat, "sigFormat");
      optBits |= OPT_BIT_SIG_FORMAT;
      return this;
    }

    /**
     * Initializes the optional value {@link Signature#sigFormat() sigFormat} to sigFormat.
     * @param sigFormat The value for sigFormat
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("sigFormat")
    public final Builder sigFormat(Optional<? extends Code> sigFormat) {
      checkNotIsSet(sigFormatIsSet(), "sigFormat");
      this.sigFormat = sigFormat.orElse(null);
      optBits |= OPT_BIT_SIG_FORMAT;
      return this;
    }

    /**
     * Initializes the optional value {@link Signature#id() id} to id.
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
     * Initializes the optional value {@link Signature#id() id} to id.
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
     * Initializes the optional value {@link Signature#targetFormat() targetFormat} to targetFormat.
     * @param targetFormat The value for targetFormat
     * @return {@code this} builder for chained invocation
     */
    public final Builder targetFormat(Code targetFormat) {
      checkNotIsSet(targetFormatIsSet(), "targetFormat");
      this.targetFormat = Objects.requireNonNull(targetFormat, "targetFormat");
      optBits |= OPT_BIT_TARGET_FORMAT;
      return this;
    }

    /**
     * Initializes the optional value {@link Signature#targetFormat() targetFormat} to targetFormat.
     * @param targetFormat The value for targetFormat
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("targetFormat")
    public final Builder targetFormat(Optional<? extends Code> targetFormat) {
      checkNotIsSet(targetFormatIsSet(), "targetFormat");
      this.targetFormat = targetFormat.orElse(null);
      optBits |= OPT_BIT_TARGET_FORMAT;
      return this;
    }

    /**
     * Initializes the value for the {@link Signature#who() who} attribute.
     * @param who The value for who 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("who")
    public final Builder who(Reference who) {
      checkNotIsSet(whoIsSet(), "who");
      this.who = Objects.requireNonNull(who, "who");
      initBits &= ~INIT_BIT_WHO;
      return this;
    }

    /**
     * Initializes the optional value {@link Signature#extension() extension} to extension.
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
     * Initializes the optional value {@link Signature#extension() extension} to extension.
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
     * Initializes the optional value {@link Signature#onBehalfOf() onBehalfOf} to onBehalfOf.
     * @param onBehalfOf The value for onBehalfOf
     * @return {@code this} builder for chained invocation
     */
    public final Builder onBehalfOf(Reference onBehalfOf) {
      checkNotIsSet(onBehalfOfIsSet(), "onBehalfOf");
      this.onBehalfOf = Objects.requireNonNull(onBehalfOf, "onBehalfOf");
      optBits |= OPT_BIT_ON_BEHALF_OF;
      return this;
    }

    /**
     * Initializes the optional value {@link Signature#onBehalfOf() onBehalfOf} to onBehalfOf.
     * @param onBehalfOf The value for onBehalfOf
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("onBehalfOf")
    public final Builder onBehalfOf(Optional<? extends Reference> onBehalfOf) {
      checkNotIsSet(onBehalfOfIsSet(), "onBehalfOf");
      this.onBehalfOf = onBehalfOf.orElse(null);
      optBits |= OPT_BIT_ON_BEHALF_OF;
      return this;
    }

    /**
     * Builds a new {@link Signature Signature}.
     * @return An immutable instance of Signature
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public Signature build() {
      checkRequiredAttributes();
      return new ImmutableSignature(
          data,
          createUnmodifiableList(true, type),
          when,
          sigFormat,
          id,
          targetFormat,
          who,
          extension,
          onBehalfOf);
    }

    private boolean dataIsSet() {
      return (optBits & OPT_BIT_DATA) != 0;
    }

    private boolean whenIsSet() {
      return (optBits & OPT_BIT_WHEN) != 0;
    }

    private boolean sigFormatIsSet() {
      return (optBits & OPT_BIT_SIG_FORMAT) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean targetFormatIsSet() {
      return (optBits & OPT_BIT_TARGET_FORMAT) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean onBehalfOfIsSet() {
      return (optBits & OPT_BIT_ON_BEHALF_OF) != 0;
    }

    private boolean whoIsSet() {
      return (initBits & INIT_BIT_WHO) == 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of Signature is strict, attribute is already set: ".concat(name));
    }

    private void checkRequiredAttributes() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<>();
      if (!whoIsSet()) attributes.add("who");
      return "Cannot build Signature, some of required attributes are not set " + attributes;
    }
  }

  @Generated(from = "Signature", generator = "Immutables")
  public interface WhoBuildStage {
    /**
     * Initializes the value for the {@link Signature#who() who} attribute.
     * @param who The value for who 
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal who(Reference who);
  }

  @Generated(from = "Signature", generator = "Immutables")
  public interface BuildFinal {

    /**
     * Initializes the optional value {@link Signature#data() data} to data.
     * @param data The value for data
     * @return {@code this} builder for chained invocation
     */
    BuildFinal data(Base64Binary data);

    /**
     * Initializes the optional value {@link Signature#data() data} to data.
     * @param data The value for data
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal data(Optional<? extends Base64Binary> data);

    /**
     * Adds one element to {@link Signature#type() type} list.
     * @param element A type element
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal addType(Coding element);

    /**
     * Adds elements to {@link Signature#type() type} list.
     * @param elements An array of type elements
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal addType(Coding... elements);

    /**
     * Adds elements to {@link Signature#type() type} list.
     * @param elements An iterable of type elements
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal addAllType(Iterable<? extends Coding> elements);

    /**
     * Initializes the optional value {@link Signature#when() when} to when.
     * @param when The value for when
     * @return {@code this} builder for chained invocation
     */
    BuildFinal when(Instant when);

    /**
     * Initializes the optional value {@link Signature#when() when} to when.
     * @param when The value for when
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal when(Optional<? extends Instant> when);

    /**
     * Initializes the optional value {@link Signature#sigFormat() sigFormat} to sigFormat.
     * @param sigFormat The value for sigFormat
     * @return {@code this} builder for chained invocation
     */
    BuildFinal sigFormat(Code sigFormat);

    /**
     * Initializes the optional value {@link Signature#sigFormat() sigFormat} to sigFormat.
     * @param sigFormat The value for sigFormat
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal sigFormat(Optional<? extends Code> sigFormat);

    /**
     * Initializes the optional value {@link Signature#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    BuildFinal id(String id);

    /**
     * Initializes the optional value {@link Signature#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal id(Optional<String> id);

    /**
     * Initializes the optional value {@link Signature#targetFormat() targetFormat} to targetFormat.
     * @param targetFormat The value for targetFormat
     * @return {@code this} builder for chained invocation
     */
    BuildFinal targetFormat(Code targetFormat);

    /**
     * Initializes the optional value {@link Signature#targetFormat() targetFormat} to targetFormat.
     * @param targetFormat The value for targetFormat
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal targetFormat(Optional<? extends Code> targetFormat);

    /**
     * Initializes the optional value {@link Signature#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal extension(List<Extension> extension);

    /**
     * Initializes the optional value {@link Signature#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal extension(Optional<? extends List<Extension>> extension);

    /**
     * Initializes the optional value {@link Signature#onBehalfOf() onBehalfOf} to onBehalfOf.
     * @param onBehalfOf The value for onBehalfOf
     * @return {@code this} builder for chained invocation
     */
    BuildFinal onBehalfOf(Reference onBehalfOf);

    /**
     * Initializes the optional value {@link Signature#onBehalfOf() onBehalfOf} to onBehalfOf.
     * @param onBehalfOf The value for onBehalfOf
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal onBehalfOf(Optional<? extends Reference> onBehalfOf);

    /**
     * Builds a new {@link Signature Signature}.
     * @return An immutable instance of Signature
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    Signature build();
  }

  private static <T> List<T> createSafeList(Iterable<? extends T> iterable, boolean checkNulls, boolean skipNulls) {
    ArrayList<T> list;
    if (iterable instanceof Collection<?>) {
      int size = ((Collection<?>) iterable).size();
      if (size == 0) return Collections.emptyList();
      list = new ArrayList<>();
    } else {
      list = new ArrayList<>();
    }
    for (T element : iterable) {
      if (skipNulls && element == null) continue;
      if (checkNulls) Objects.requireNonNull(element, "element");
      list.add(element);
    }
    return list;
  }

  private static <T> List<T> createUnmodifiableList(boolean clone, List<T> list) {
    switch(list.size()) {
    case 0: return Collections.emptyList();
    case 1: return Collections.singletonList(list.get(0));
    default:
      if (clone) {
        return Collections.unmodifiableList(new ArrayList<>(list));
      } else {
        if (list instanceof ArrayList<?>) {
          ((ArrayList<?>) list).trimToSize();
        }
        return Collections.unmodifiableList(list);
      }
    }
  }
}
