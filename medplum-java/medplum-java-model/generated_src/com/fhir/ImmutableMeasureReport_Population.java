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
 * Immutable implementation of {@link MeasureReport_Population}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableMeasureReport_Population.builder()}.
 */
@Generated(from = "MeasureReport_Population", generator = "Immutables")
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableMeasureReport_Population implements MeasureReport_Population {
  private final @Nullable List<Extension> modifierExtension;
  private final @Nullable List<Extension> extension;
  private final @Nullable String id;
  private final @Nullable Reference subjectResults;
  private final @Nullable Integer count;
  private final @Nullable CodeableConcept code;

  private ImmutableMeasureReport_Population(
      @Nullable List<Extension> modifierExtension,
      @Nullable List<Extension> extension,
      @Nullable String id,
      @Nullable Reference subjectResults,
      @Nullable Integer count,
      @Nullable CodeableConcept code) {
    this.modifierExtension = modifierExtension;
    this.extension = extension;
    this.id = id;
    this.subjectResults = subjectResults;
    this.count = count;
    this.code = code;
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
   * @return The value of the {@code id} attribute
   */
  @JsonProperty("id")
  @Override
  public Optional<String> id() {
    return Optional.ofNullable(id);
  }

  /**
   * @return The value of the {@code subjectResults} attribute
   */
  @JsonProperty("subjectResults")
  @Override
  public Optional<Reference> subjectResults() {
    return Optional.ofNullable(subjectResults);
  }

  /**
   * @return The value of the {@code count} attribute
   */
  @JsonProperty("count")
  @Override
  public Optional<Integer> count() {
    return Optional.ofNullable(count);
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
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MeasureReport_Population#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMeasureReport_Population withModifierExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableMeasureReport_Population(newValue, this.extension, this.id, this.subjectResults, this.count, this.code);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MeasureReport_Population#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMeasureReport_Population withModifierExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableMeasureReport_Population(value, this.extension, this.id, this.subjectResults, this.count, this.code);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MeasureReport_Population#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMeasureReport_Population withExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableMeasureReport_Population(this.modifierExtension, newValue, this.id, this.subjectResults, this.count, this.code);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MeasureReport_Population#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMeasureReport_Population withExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableMeasureReport_Population(this.modifierExtension, value, this.id, this.subjectResults, this.count, this.code);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MeasureReport_Population#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMeasureReport_Population withId(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "id");
    if (Objects.equals(this.id, newValue)) return this;
    return new ImmutableMeasureReport_Population(this.modifierExtension, this.extension, newValue, this.subjectResults, this.count, this.code);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MeasureReport_Population#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMeasureReport_Population withId(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.id, value)) return this;
    return new ImmutableMeasureReport_Population(this.modifierExtension, this.extension, value, this.subjectResults, this.count, this.code);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MeasureReport_Population#subjectResults() subjectResults} attribute.
   * @param value The value for subjectResults
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMeasureReport_Population withSubjectResults(Reference value) {
    @Nullable Reference newValue = Objects.requireNonNull(value, "subjectResults");
    if (this.subjectResults == newValue) return this;
    return new ImmutableMeasureReport_Population(this.modifierExtension, this.extension, this.id, newValue, this.count, this.code);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MeasureReport_Population#subjectResults() subjectResults} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for subjectResults
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMeasureReport_Population withSubjectResults(Optional<? extends Reference> optional) {
    @Nullable Reference value = optional.orElse(null);
    if (this.subjectResults == value) return this;
    return new ImmutableMeasureReport_Population(this.modifierExtension, this.extension, this.id, value, this.count, this.code);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MeasureReport_Population#count() count} attribute.
   * @param value The value for count
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMeasureReport_Population withCount(int value) {
    @Nullable Integer newValue = value;
    if (Objects.equals(this.count, newValue)) return this;
    return new ImmutableMeasureReport_Population(this.modifierExtension, this.extension, this.id, this.subjectResults, newValue, this.code);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MeasureReport_Population#count() count} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for count
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMeasureReport_Population withCount(Optional<Integer> optional) {
    @Nullable Integer value = optional.orElse(null);
    if (Objects.equals(this.count, value)) return this;
    return new ImmutableMeasureReport_Population(this.modifierExtension, this.extension, this.id, this.subjectResults, value, this.code);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MeasureReport_Population#code() code} attribute.
   * @param value The value for code
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMeasureReport_Population withCode(CodeableConcept value) {
    @Nullable CodeableConcept newValue = Objects.requireNonNull(value, "code");
    if (this.code == newValue) return this;
    return new ImmutableMeasureReport_Population(this.modifierExtension, this.extension, this.id, this.subjectResults, this.count, newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MeasureReport_Population#code() code} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for code
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMeasureReport_Population withCode(Optional<? extends CodeableConcept> optional) {
    @Nullable CodeableConcept value = optional.orElse(null);
    if (this.code == value) return this;
    return new ImmutableMeasureReport_Population(this.modifierExtension, this.extension, this.id, this.subjectResults, this.count, value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableMeasureReport_Population} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableMeasureReport_Population
        && equalTo((ImmutableMeasureReport_Population) another);
  }

  private boolean equalTo(ImmutableMeasureReport_Population another) {
    return Objects.equals(modifierExtension, another.modifierExtension)
        && Objects.equals(extension, another.extension)
        && Objects.equals(id, another.id)
        && Objects.equals(subjectResults, another.subjectResults)
        && Objects.equals(count, another.count)
        && Objects.equals(code, another.code);
  }

  /**
   * Computes a hash code from attributes: {@code modifierExtension}, {@code extension}, {@code id}, {@code subjectResults}, {@code count}, {@code code}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(modifierExtension);
    h += (h << 5) + Objects.hashCode(extension);
    h += (h << 5) + Objects.hashCode(id);
    h += (h << 5) + Objects.hashCode(subjectResults);
    h += (h << 5) + Objects.hashCode(count);
    h += (h << 5) + Objects.hashCode(code);
    return h;
  }

  /**
   * Prints the immutable value {@code MeasureReport_Population} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("MeasureReport_Population{");
    if (modifierExtension != null) {
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (extension != null) {
      if (builder.length() > 25) builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (id != null) {
      if (builder.length() > 25) builder.append(", ");
      builder.append("id=").append(id);
    }
    if (subjectResults != null) {
      if (builder.length() > 25) builder.append(", ");
      builder.append("subjectResults=").append(subjectResults);
    }
    if (count != null) {
      if (builder.length() > 25) builder.append(", ");
      builder.append("count=").append(count);
    }
    if (code != null) {
      if (builder.length() > 25) builder.append(", ");
      builder.append("code=").append(code);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Generated(from = "MeasureReport_Population", generator = "Immutables")
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements MeasureReport_Population {
    @Nullable Optional<List<Extension>> modifierExtension = Optional.empty();
    boolean modifierExtensionIsSet;
    @Nullable Optional<List<Extension>> extension = Optional.empty();
    boolean extensionIsSet;
    @Nullable Optional<String> id = Optional.empty();
    boolean idIsSet;
    @Nullable Optional<Reference> subjectResults = Optional.empty();
    boolean subjectResultsIsSet;
    @Nullable Optional<Integer> count = Optional.empty();
    boolean countIsSet;
    @Nullable Optional<CodeableConcept> code = Optional.empty();
    boolean codeIsSet;
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
    @JsonProperty("id")
    public void setId(Optional<String> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @JsonProperty("subjectResults")
    public void setSubjectResults(Optional<Reference> subjectResults) {
      this.subjectResults = subjectResults;
      this.subjectResultsIsSet = true;
    }
    @JsonProperty("count")
    public void setCount(Optional<Integer> count) {
      this.count = count;
      this.countIsSet = true;
    }
    @JsonProperty("code")
    public void setCode(Optional<CodeableConcept> code) {
      this.code = code;
      this.codeIsSet = true;
    }
    @Override
    public Optional<List<Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> id() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Reference> subjectResults() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Integer> count() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<CodeableConcept> code() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableMeasureReport_Population fromJson(Json json) {
    ImmutableMeasureReport_Population.Builder builder = ImmutableMeasureReport_Population.builder();
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.subjectResultsIsSet) {
      builder.subjectResults(json.subjectResults);
    }
    if (json.countIsSet) {
      builder.count(json.count);
    }
    if (json.codeIsSet) {
      builder.code(json.code);
    }
    return (ImmutableMeasureReport_Population) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link MeasureReport_Population} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable MeasureReport_Population instance
   */
  public static MeasureReport_Population copyOf(MeasureReport_Population instance) {
    if (instance instanceof ImmutableMeasureReport_Population) {
      return (ImmutableMeasureReport_Population) instance;
    }
    return ImmutableMeasureReport_Population.builder()
        .modifierExtension(instance.modifierExtension())
        .extension(instance.extension())
        .id(instance.id())
        .subjectResults(instance.subjectResults())
        .count(instance.count())
        .code(instance.code())
        .build();
  }

  /**
   * Creates a builder for {@link MeasureReport_Population MeasureReport_Population}.
   * <pre>
   * ImmutableMeasureReport_Population.builder()
   *    .modifierExtension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link MeasureReport_Population#modifierExtension() modifierExtension}
   *    .extension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link MeasureReport_Population#extension() extension}
   *    .id(String) // optional {@link MeasureReport_Population#id() id}
   *    .subjectResults(com.fhir.Reference) // optional {@link MeasureReport_Population#subjectResults() subjectResults}
   *    .count(Integer) // optional {@link MeasureReport_Population#count() count}
   *    .code(com.fhir.CodeableConcept) // optional {@link MeasureReport_Population#code() code}
   *    .build();
   * </pre>
   * @return A new MeasureReport_Population builder
   */
  public static ImmutableMeasureReport_Population.Builder builder() {
    return new ImmutableMeasureReport_Population.Builder();
  }

  /**
   * Builds instances of type {@link MeasureReport_Population MeasureReport_Population}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "MeasureReport_Population", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder {
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x1L;
    private static final long OPT_BIT_EXTENSION = 0x2L;
    private static final long OPT_BIT_ID = 0x4L;
    private static final long OPT_BIT_SUBJECT_RESULTS = 0x8L;
    private static final long OPT_BIT_COUNT = 0x10L;
    private static final long OPT_BIT_CODE = 0x20L;
    private long optBits;

    private @Nullable List<Extension> modifierExtension;
    private @Nullable List<Extension> extension;
    private @Nullable String id;
    private @Nullable Reference subjectResults;
    private @Nullable Integer count;
    private @Nullable CodeableConcept code;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link MeasureReport_Population#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link MeasureReport_Population#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link MeasureReport_Population#extension() extension} to extension.
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
     * Initializes the optional value {@link MeasureReport_Population#extension() extension} to extension.
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
     * Initializes the optional value {@link MeasureReport_Population#id() id} to id.
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
     * Initializes the optional value {@link MeasureReport_Population#id() id} to id.
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
     * Initializes the optional value {@link MeasureReport_Population#subjectResults() subjectResults} to subjectResults.
     * @param subjectResults The value for subjectResults
     * @return {@code this} builder for chained invocation
     */
    public final Builder subjectResults(Reference subjectResults) {
      checkNotIsSet(subjectResultsIsSet(), "subjectResults");
      this.subjectResults = Objects.requireNonNull(subjectResults, "subjectResults");
      optBits |= OPT_BIT_SUBJECT_RESULTS;
      return this;
    }

    /**
     * Initializes the optional value {@link MeasureReport_Population#subjectResults() subjectResults} to subjectResults.
     * @param subjectResults The value for subjectResults
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("subjectResults")
    public final Builder subjectResults(Optional<? extends Reference> subjectResults) {
      checkNotIsSet(subjectResultsIsSet(), "subjectResults");
      this.subjectResults = subjectResults.orElse(null);
      optBits |= OPT_BIT_SUBJECT_RESULTS;
      return this;
    }

    /**
     * Initializes the optional value {@link MeasureReport_Population#count() count} to count.
     * @param count The value for count
     * @return {@code this} builder for chained invocation
     */
    public final Builder count(int count) {
      checkNotIsSet(countIsSet(), "count");
      this.count = count;
      optBits |= OPT_BIT_COUNT;
      return this;
    }

    /**
     * Initializes the optional value {@link MeasureReport_Population#count() count} to count.
     * @param count The value for count
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("count")
    public final Builder count(Optional<Integer> count) {
      checkNotIsSet(countIsSet(), "count");
      this.count = count.orElse(null);
      optBits |= OPT_BIT_COUNT;
      return this;
    }

    /**
     * Initializes the optional value {@link MeasureReport_Population#code() code} to code.
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
     * Initializes the optional value {@link MeasureReport_Population#code() code} to code.
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
     * Builds a new {@link MeasureReport_Population MeasureReport_Population}.
     * @return An immutable instance of MeasureReport_Population
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public MeasureReport_Population build() {
      return new ImmutableMeasureReport_Population(modifierExtension, extension, id, subjectResults, count, code);
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean subjectResultsIsSet() {
      return (optBits & OPT_BIT_SUBJECT_RESULTS) != 0;
    }

    private boolean countIsSet() {
      return (optBits & OPT_BIT_COUNT) != 0;
    }

    private boolean codeIsSet() {
      return (optBits & OPT_BIT_CODE) != 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of MeasureReport_Population is strict, attribute is already set: ".concat(name));
    }
  }
}
