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
 * Immutable implementation of {@link DetectedIssue_Evidence}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableDetectedIssue_Evidence.builder()}.
 */
@Generated(from = "DetectedIssue_Evidence", generator = "Immutables")
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableDetectedIssue_Evidence implements DetectedIssue_Evidence {
  private final @Nullable List<CodeableConcept> code;
  private final @Nullable List<Extension> modifierExtension;
  private final @Nullable String id;
  private final @Nullable List<Extension> extension;
  private final @Nullable List<Reference> detail;

  private ImmutableDetectedIssue_Evidence(
      @Nullable List<CodeableConcept> code,
      @Nullable List<Extension> modifierExtension,
      @Nullable String id,
      @Nullable List<Extension> extension,
      @Nullable List<Reference> detail) {
    this.code = code;
    this.modifierExtension = modifierExtension;
    this.id = id;
    this.extension = extension;
    this.detail = detail;
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
   * @return The value of the {@code extension} attribute
   */
  @JsonProperty("extension")
  @Override
  public Optional<List<Extension>> extension() {
    return Optional.ofNullable(extension);
  }

  /**
   * @return The value of the {@code detail} attribute
   */
  @JsonProperty("detail")
  @Override
  public Optional<List<Reference>> detail() {
    return Optional.ofNullable(detail);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link DetectedIssue_Evidence#code() code} attribute.
   * @param value The value for code
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDetectedIssue_Evidence withCode(List<CodeableConcept> value) {
    @Nullable List<CodeableConcept> newValue = Objects.requireNonNull(value, "code");
    if (this.code == newValue) return this;
    return new ImmutableDetectedIssue_Evidence(newValue, this.modifierExtension, this.id, this.extension, this.detail);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link DetectedIssue_Evidence#code() code} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for code
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableDetectedIssue_Evidence withCode(Optional<? extends List<CodeableConcept>> optional) {
    @Nullable List<CodeableConcept> value = optional.orElse(null);
    if (this.code == value) return this;
    return new ImmutableDetectedIssue_Evidence(value, this.modifierExtension, this.id, this.extension, this.detail);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link DetectedIssue_Evidence#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDetectedIssue_Evidence withModifierExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableDetectedIssue_Evidence(this.code, newValue, this.id, this.extension, this.detail);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link DetectedIssue_Evidence#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableDetectedIssue_Evidence withModifierExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableDetectedIssue_Evidence(this.code, value, this.id, this.extension, this.detail);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link DetectedIssue_Evidence#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDetectedIssue_Evidence withId(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "id");
    if (Objects.equals(this.id, newValue)) return this;
    return new ImmutableDetectedIssue_Evidence(this.code, this.modifierExtension, newValue, this.extension, this.detail);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link DetectedIssue_Evidence#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDetectedIssue_Evidence withId(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.id, value)) return this;
    return new ImmutableDetectedIssue_Evidence(this.code, this.modifierExtension, value, this.extension, this.detail);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link DetectedIssue_Evidence#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDetectedIssue_Evidence withExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableDetectedIssue_Evidence(this.code, this.modifierExtension, this.id, newValue, this.detail);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link DetectedIssue_Evidence#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableDetectedIssue_Evidence withExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableDetectedIssue_Evidence(this.code, this.modifierExtension, this.id, value, this.detail);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link DetectedIssue_Evidence#detail() detail} attribute.
   * @param value The value for detail
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDetectedIssue_Evidence withDetail(List<Reference> value) {
    @Nullable List<Reference> newValue = Objects.requireNonNull(value, "detail");
    if (this.detail == newValue) return this;
    return new ImmutableDetectedIssue_Evidence(this.code, this.modifierExtension, this.id, this.extension, newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link DetectedIssue_Evidence#detail() detail} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for detail
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableDetectedIssue_Evidence withDetail(Optional<? extends List<Reference>> optional) {
    @Nullable List<Reference> value = optional.orElse(null);
    if (this.detail == value) return this;
    return new ImmutableDetectedIssue_Evidence(this.code, this.modifierExtension, this.id, this.extension, value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableDetectedIssue_Evidence} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableDetectedIssue_Evidence
        && equalTo((ImmutableDetectedIssue_Evidence) another);
  }

  private boolean equalTo(ImmutableDetectedIssue_Evidence another) {
    return Objects.equals(code, another.code)
        && Objects.equals(modifierExtension, another.modifierExtension)
        && Objects.equals(id, another.id)
        && Objects.equals(extension, another.extension)
        && Objects.equals(detail, another.detail);
  }

  /**
   * Computes a hash code from attributes: {@code code}, {@code modifierExtension}, {@code id}, {@code extension}, {@code detail}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(code);
    h += (h << 5) + Objects.hashCode(modifierExtension);
    h += (h << 5) + Objects.hashCode(id);
    h += (h << 5) + Objects.hashCode(extension);
    h += (h << 5) + Objects.hashCode(detail);
    return h;
  }

  /**
   * Prints the immutable value {@code DetectedIssue_Evidence} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("DetectedIssue_Evidence{");
    if (code != null) {
      builder.append("code=").append(code);
    }
    if (modifierExtension != null) {
      if (builder.length() > 23) builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (id != null) {
      if (builder.length() > 23) builder.append(", ");
      builder.append("id=").append(id);
    }
    if (extension != null) {
      if (builder.length() > 23) builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (detail != null) {
      if (builder.length() > 23) builder.append(", ");
      builder.append("detail=").append(detail);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Generated(from = "DetectedIssue_Evidence", generator = "Immutables")
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements DetectedIssue_Evidence {
    @Nullable Optional<List<CodeableConcept>> code = Optional.empty();
    boolean codeIsSet;
    @Nullable Optional<List<Extension>> modifierExtension = Optional.empty();
    boolean modifierExtensionIsSet;
    @Nullable Optional<String> id = Optional.empty();
    boolean idIsSet;
    @Nullable Optional<List<Extension>> extension = Optional.empty();
    boolean extensionIsSet;
    @Nullable Optional<List<Reference>> detail = Optional.empty();
    boolean detailIsSet;
    @JsonProperty("code")
    public void setCode(Optional<List<CodeableConcept>> code) {
      this.code = code;
      this.codeIsSet = true;
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
    @JsonProperty("extension")
    public void setExtension(Optional<List<Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @JsonProperty("detail")
    public void setDetail(Optional<List<Reference>> detail) {
      this.detail = detail;
      this.detailIsSet = true;
    }
    @Override
    public Optional<List<CodeableConcept>> code() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> id() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Reference>> detail() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableDetectedIssue_Evidence fromJson(Json json) {
    ImmutableDetectedIssue_Evidence.Builder builder = ImmutableDetectedIssue_Evidence.builder();
    if (json.codeIsSet) {
      builder.code(json.code);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.detailIsSet) {
      builder.detail(json.detail);
    }
    return (ImmutableDetectedIssue_Evidence) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link DetectedIssue_Evidence} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable DetectedIssue_Evidence instance
   */
  public static DetectedIssue_Evidence copyOf(DetectedIssue_Evidence instance) {
    if (instance instanceof ImmutableDetectedIssue_Evidence) {
      return (ImmutableDetectedIssue_Evidence) instance;
    }
    return ImmutableDetectedIssue_Evidence.builder()
        .code(instance.code())
        .modifierExtension(instance.modifierExtension())
        .id(instance.id())
        .extension(instance.extension())
        .detail(instance.detail())
        .build();
  }

  /**
   * Creates a builder for {@link DetectedIssue_Evidence DetectedIssue_Evidence}.
   * <pre>
   * ImmutableDetectedIssue_Evidence.builder()
   *    .code(List&amp;lt;com.fhir.CodeableConcept&amp;gt;) // optional {@link DetectedIssue_Evidence#code() code}
   *    .modifierExtension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link DetectedIssue_Evidence#modifierExtension() modifierExtension}
   *    .id(String) // optional {@link DetectedIssue_Evidence#id() id}
   *    .extension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link DetectedIssue_Evidence#extension() extension}
   *    .detail(List&amp;lt;com.fhir.Reference&amp;gt;) // optional {@link DetectedIssue_Evidence#detail() detail}
   *    .build();
   * </pre>
   * @return A new DetectedIssue_Evidence builder
   */
  public static ImmutableDetectedIssue_Evidence.Builder builder() {
    return new ImmutableDetectedIssue_Evidence.Builder();
  }

  /**
   * Builds instances of type {@link DetectedIssue_Evidence DetectedIssue_Evidence}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "DetectedIssue_Evidence", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder {
    private static final long OPT_BIT_CODE = 0x1L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x2L;
    private static final long OPT_BIT_ID = 0x4L;
    private static final long OPT_BIT_EXTENSION = 0x8L;
    private static final long OPT_BIT_DETAIL = 0x10L;
    private long optBits;

    private @Nullable List<CodeableConcept> code;
    private @Nullable List<Extension> modifierExtension;
    private @Nullable String id;
    private @Nullable List<Extension> extension;
    private @Nullable List<Reference> detail;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link DetectedIssue_Evidence#code() code} to code.
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
     * Initializes the optional value {@link DetectedIssue_Evidence#code() code} to code.
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
     * Initializes the optional value {@link DetectedIssue_Evidence#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link DetectedIssue_Evidence#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link DetectedIssue_Evidence#id() id} to id.
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
     * Initializes the optional value {@link DetectedIssue_Evidence#id() id} to id.
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
     * Initializes the optional value {@link DetectedIssue_Evidence#extension() extension} to extension.
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
     * Initializes the optional value {@link DetectedIssue_Evidence#extension() extension} to extension.
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
     * Initializes the optional value {@link DetectedIssue_Evidence#detail() detail} to detail.
     * @param detail The value for detail
     * @return {@code this} builder for chained invocation
     */
    public final Builder detail(List<Reference> detail) {
      checkNotIsSet(detailIsSet(), "detail");
      this.detail = Objects.requireNonNull(detail, "detail");
      optBits |= OPT_BIT_DETAIL;
      return this;
    }

    /**
     * Initializes the optional value {@link DetectedIssue_Evidence#detail() detail} to detail.
     * @param detail The value for detail
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("detail")
    public final Builder detail(Optional<? extends List<Reference>> detail) {
      checkNotIsSet(detailIsSet(), "detail");
      this.detail = detail.orElse(null);
      optBits |= OPT_BIT_DETAIL;
      return this;
    }

    /**
     * Builds a new {@link DetectedIssue_Evidence DetectedIssue_Evidence}.
     * @return An immutable instance of DetectedIssue_Evidence
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public DetectedIssue_Evidence build() {
      return new ImmutableDetectedIssue_Evidence(code, modifierExtension, id, extension, detail);
    }

    private boolean codeIsSet() {
      return (optBits & OPT_BIT_CODE) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean detailIsSet() {
      return (optBits & OPT_BIT_DETAIL) != 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of DetectedIssue_Evidence is strict, attribute is already set: ".concat(name));
    }
  }
}
