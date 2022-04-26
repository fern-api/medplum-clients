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
 * Immutable implementation of {@link MeasureReport_Stratifier}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableMeasureReport_Stratifier.builder()}.
 */
@Generated(from = "MeasureReport_Stratifier", generator = "Immutables")
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableMeasureReport_Stratifier
    implements MeasureReport_Stratifier {
  private final @Nullable List<Extension> modifierExtension;
  private final @Nullable List<CodeableConcept> code;
  private final @Nullable String id;
  private final @Nullable List<MeasureReport_Stratum> stratum;
  private final @Nullable List<Extension> extension;

  private ImmutableMeasureReport_Stratifier(
      @Nullable List<Extension> modifierExtension,
      @Nullable List<CodeableConcept> code,
      @Nullable String id,
      @Nullable List<MeasureReport_Stratum> stratum,
      @Nullable List<Extension> extension) {
    this.modifierExtension = modifierExtension;
    this.code = code;
    this.id = id;
    this.stratum = stratum;
    this.extension = extension;
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
   * @return The value of the {@code code} attribute
   */
  @JsonProperty("code")
  @Override
  public Optional<List<CodeableConcept>> code() {
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
   * @return The value of the {@code stratum} attribute
   */
  @JsonProperty("stratum")
  @Override
  public Optional<List<MeasureReport_Stratum>> stratum() {
    return Optional.ofNullable(stratum);
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
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MeasureReport_Stratifier#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMeasureReport_Stratifier withModifierExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableMeasureReport_Stratifier(newValue, this.code, this.id, this.stratum, this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MeasureReport_Stratifier#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMeasureReport_Stratifier withModifierExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableMeasureReport_Stratifier(value, this.code, this.id, this.stratum, this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MeasureReport_Stratifier#code() code} attribute.
   * @param value The value for code
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMeasureReport_Stratifier withCode(List<CodeableConcept> value) {
    @Nullable List<CodeableConcept> newValue = Objects.requireNonNull(value, "code");
    if (this.code == newValue) return this;
    return new ImmutableMeasureReport_Stratifier(this.modifierExtension, newValue, this.id, this.stratum, this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MeasureReport_Stratifier#code() code} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for code
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMeasureReport_Stratifier withCode(Optional<? extends List<CodeableConcept>> optional) {
    @Nullable List<CodeableConcept> value = optional.orElse(null);
    if (this.code == value) return this;
    return new ImmutableMeasureReport_Stratifier(this.modifierExtension, value, this.id, this.stratum, this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MeasureReport_Stratifier#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMeasureReport_Stratifier withId(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "id");
    if (Objects.equals(this.id, newValue)) return this;
    return new ImmutableMeasureReport_Stratifier(this.modifierExtension, this.code, newValue, this.stratum, this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MeasureReport_Stratifier#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMeasureReport_Stratifier withId(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.id, value)) return this;
    return new ImmutableMeasureReport_Stratifier(this.modifierExtension, this.code, value, this.stratum, this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MeasureReport_Stratifier#stratum() stratum} attribute.
   * @param value The value for stratum
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMeasureReport_Stratifier withStratum(List<MeasureReport_Stratum> value) {
    @Nullable List<MeasureReport_Stratum> newValue = Objects.requireNonNull(value, "stratum");
    if (this.stratum == newValue) return this;
    return new ImmutableMeasureReport_Stratifier(this.modifierExtension, this.code, this.id, newValue, this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MeasureReport_Stratifier#stratum() stratum} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for stratum
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMeasureReport_Stratifier withStratum(Optional<? extends List<MeasureReport_Stratum>> optional) {
    @Nullable List<MeasureReport_Stratum> value = optional.orElse(null);
    if (this.stratum == value) return this;
    return new ImmutableMeasureReport_Stratifier(this.modifierExtension, this.code, this.id, value, this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MeasureReport_Stratifier#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMeasureReport_Stratifier withExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableMeasureReport_Stratifier(this.modifierExtension, this.code, this.id, this.stratum, newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MeasureReport_Stratifier#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMeasureReport_Stratifier withExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableMeasureReport_Stratifier(this.modifierExtension, this.code, this.id, this.stratum, value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableMeasureReport_Stratifier} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableMeasureReport_Stratifier
        && equalTo((ImmutableMeasureReport_Stratifier) another);
  }

  private boolean equalTo(ImmutableMeasureReport_Stratifier another) {
    return Objects.equals(modifierExtension, another.modifierExtension)
        && Objects.equals(code, another.code)
        && Objects.equals(id, another.id)
        && Objects.equals(stratum, another.stratum)
        && Objects.equals(extension, another.extension);
  }

  /**
   * Computes a hash code from attributes: {@code modifierExtension}, {@code code}, {@code id}, {@code stratum}, {@code extension}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(modifierExtension);
    h += (h << 5) + Objects.hashCode(code);
    h += (h << 5) + Objects.hashCode(id);
    h += (h << 5) + Objects.hashCode(stratum);
    h += (h << 5) + Objects.hashCode(extension);
    return h;
  }

  /**
   * Prints the immutable value {@code MeasureReport_Stratifier} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("MeasureReport_Stratifier{");
    if (modifierExtension != null) {
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (code != null) {
      if (builder.length() > 25) builder.append(", ");
      builder.append("code=").append(code);
    }
    if (id != null) {
      if (builder.length() > 25) builder.append(", ");
      builder.append("id=").append(id);
    }
    if (stratum != null) {
      if (builder.length() > 25) builder.append(", ");
      builder.append("stratum=").append(stratum);
    }
    if (extension != null) {
      if (builder.length() > 25) builder.append(", ");
      builder.append("extension=").append(extension);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Generated(from = "MeasureReport_Stratifier", generator = "Immutables")
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements MeasureReport_Stratifier {
    @Nullable Optional<List<Extension>> modifierExtension = Optional.empty();
    boolean modifierExtensionIsSet;
    @Nullable Optional<List<CodeableConcept>> code = Optional.empty();
    boolean codeIsSet;
    @Nullable Optional<String> id = Optional.empty();
    boolean idIsSet;
    @Nullable Optional<List<MeasureReport_Stratum>> stratum = Optional.empty();
    boolean stratumIsSet;
    @Nullable Optional<List<Extension>> extension = Optional.empty();
    boolean extensionIsSet;
    @JsonProperty("modifierExtension")
    public void setModifierExtension(Optional<List<Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @JsonProperty("code")
    public void setCode(Optional<List<CodeableConcept>> code) {
      this.code = code;
      this.codeIsSet = true;
    }
    @JsonProperty("id")
    public void setId(Optional<String> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @JsonProperty("stratum")
    public void setStratum(Optional<List<MeasureReport_Stratum>> stratum) {
      this.stratum = stratum;
      this.stratumIsSet = true;
    }
    @JsonProperty("extension")
    public void setExtension(Optional<List<Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @Override
    public Optional<List<Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<CodeableConcept>> code() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> id() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<MeasureReport_Stratum>> stratum() { throw new UnsupportedOperationException(); }
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
  static ImmutableMeasureReport_Stratifier fromJson(Json json) {
    ImmutableMeasureReport_Stratifier.Builder builder = ImmutableMeasureReport_Stratifier.builder();
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.codeIsSet) {
      builder.code(json.code);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.stratumIsSet) {
      builder.stratum(json.stratum);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    return (ImmutableMeasureReport_Stratifier) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link MeasureReport_Stratifier} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable MeasureReport_Stratifier instance
   */
  public static MeasureReport_Stratifier copyOf(MeasureReport_Stratifier instance) {
    if (instance instanceof ImmutableMeasureReport_Stratifier) {
      return (ImmutableMeasureReport_Stratifier) instance;
    }
    return ImmutableMeasureReport_Stratifier.builder()
        .modifierExtension(instance.modifierExtension())
        .code(instance.code())
        .id(instance.id())
        .stratum(instance.stratum())
        .extension(instance.extension())
        .build();
  }

  /**
   * Creates a builder for {@link MeasureReport_Stratifier MeasureReport_Stratifier}.
   * <pre>
   * ImmutableMeasureReport_Stratifier.builder()
   *    .modifierExtension(List&amp;lt;com.medplum.types.fhir.Extension&amp;gt;) // optional {@link MeasureReport_Stratifier#modifierExtension() modifierExtension}
   *    .code(List&amp;lt;com.medplum.types.fhir.CodeableConcept&amp;gt;) // optional {@link MeasureReport_Stratifier#code() code}
   *    .id(String) // optional {@link MeasureReport_Stratifier#id() id}
   *    .stratum(List&amp;lt;com.medplum.types.fhir.MeasureReport_Stratum&amp;gt;) // optional {@link MeasureReport_Stratifier#stratum() stratum}
   *    .extension(List&amp;lt;com.medplum.types.fhir.Extension&amp;gt;) // optional {@link MeasureReport_Stratifier#extension() extension}
   *    .build();
   * </pre>
   * @return A new MeasureReport_Stratifier builder
   */
  public static ImmutableMeasureReport_Stratifier.Builder builder() {
    return new ImmutableMeasureReport_Stratifier.Builder();
  }

  /**
   * Builds instances of type {@link MeasureReport_Stratifier MeasureReport_Stratifier}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "MeasureReport_Stratifier", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder {
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x1L;
    private static final long OPT_BIT_CODE = 0x2L;
    private static final long OPT_BIT_ID = 0x4L;
    private static final long OPT_BIT_STRATUM = 0x8L;
    private static final long OPT_BIT_EXTENSION = 0x10L;
    private long optBits;

    private @Nullable List<Extension> modifierExtension;
    private @Nullable List<CodeableConcept> code;
    private @Nullable String id;
    private @Nullable List<MeasureReport_Stratum> stratum;
    private @Nullable List<Extension> extension;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link MeasureReport_Stratifier#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link MeasureReport_Stratifier#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link MeasureReport_Stratifier#code() code} to code.
     * @param code The value for code
     * @return {@code this} builder for chained invocation
     */
    public final Builder code(List<CodeableConcept> code) {
      checkNotIsSet(codeIsSet(), "code");
      this.code = Objects.requireNonNull(code, "code");
      optBits |= OPT_BIT_CODE;
      return this;
    }

    /**
     * Initializes the optional value {@link MeasureReport_Stratifier#code() code} to code.
     * @param code The value for code
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("code")
    public final Builder code(Optional<? extends List<CodeableConcept>> code) {
      checkNotIsSet(codeIsSet(), "code");
      this.code = code.orElse(null);
      optBits |= OPT_BIT_CODE;
      return this;
    }

    /**
     * Initializes the optional value {@link MeasureReport_Stratifier#id() id} to id.
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
     * Initializes the optional value {@link MeasureReport_Stratifier#id() id} to id.
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
     * Initializes the optional value {@link MeasureReport_Stratifier#stratum() stratum} to stratum.
     * @param stratum The value for stratum
     * @return {@code this} builder for chained invocation
     */
    public final Builder stratum(List<MeasureReport_Stratum> stratum) {
      checkNotIsSet(stratumIsSet(), "stratum");
      this.stratum = Objects.requireNonNull(stratum, "stratum");
      optBits |= OPT_BIT_STRATUM;
      return this;
    }

    /**
     * Initializes the optional value {@link MeasureReport_Stratifier#stratum() stratum} to stratum.
     * @param stratum The value for stratum
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("stratum")
    public final Builder stratum(Optional<? extends List<MeasureReport_Stratum>> stratum) {
      checkNotIsSet(stratumIsSet(), "stratum");
      this.stratum = stratum.orElse(null);
      optBits |= OPT_BIT_STRATUM;
      return this;
    }

    /**
     * Initializes the optional value {@link MeasureReport_Stratifier#extension() extension} to extension.
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
     * Initializes the optional value {@link MeasureReport_Stratifier#extension() extension} to extension.
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
     * Builds a new {@link MeasureReport_Stratifier MeasureReport_Stratifier}.
     * @return An immutable instance of MeasureReport_Stratifier
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public MeasureReport_Stratifier build() {
      return new ImmutableMeasureReport_Stratifier(modifierExtension, code, id, stratum, extension);
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean codeIsSet() {
      return (optBits & OPT_BIT_CODE) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean stratumIsSet() {
      return (optBits & OPT_BIT_STRATUM) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of MeasureReport_Stratifier is strict, attribute is already set: ".concat(name));
    }
  }
}
