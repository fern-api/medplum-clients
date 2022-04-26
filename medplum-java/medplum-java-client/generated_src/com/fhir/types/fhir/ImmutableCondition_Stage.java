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
 * Immutable implementation of {@link Condition_Stage}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableCondition_Stage.builder()}.
 */
@Generated(from = "Condition_Stage", generator = "Immutables")
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableCondition_Stage implements Condition_Stage {
  private final @Nullable List<Extension> modifierExtension;
  private final @Nullable CodeableConcept summary;
  private final @Nullable List<Reference> assessment;
  private final @Nullable CodeableConcept type;
  private final @Nullable String id;
  private final @Nullable List<Extension> extension;

  private ImmutableCondition_Stage(
      @Nullable List<Extension> modifierExtension,
      @Nullable CodeableConcept summary,
      @Nullable List<Reference> assessment,
      @Nullable CodeableConcept type,
      @Nullable String id,
      @Nullable List<Extension> extension) {
    this.modifierExtension = modifierExtension;
    this.summary = summary;
    this.assessment = assessment;
    this.type = type;
    this.id = id;
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
   * @return The value of the {@code summary} attribute
   */
  @JsonProperty("summary")
  @Override
  public Optional<CodeableConcept> summary() {
    return Optional.ofNullable(summary);
  }

  /**
   * @return The value of the {@code assessment} attribute
   */
  @JsonProperty("assessment")
  @Override
  public Optional<List<Reference>> assessment() {
    return Optional.ofNullable(assessment);
  }

  /**
   * @return The value of the {@code type} attribute
   */
  @JsonProperty("type")
  @Override
  public Optional<CodeableConcept> type() {
    return Optional.ofNullable(type);
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
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Condition_Stage#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCondition_Stage withModifierExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableCondition_Stage(newValue, this.summary, this.assessment, this.type, this.id, this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Condition_Stage#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCondition_Stage withModifierExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableCondition_Stage(value, this.summary, this.assessment, this.type, this.id, this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Condition_Stage#summary() summary} attribute.
   * @param value The value for summary
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCondition_Stage withSummary(CodeableConcept value) {
    @Nullable CodeableConcept newValue = Objects.requireNonNull(value, "summary");
    if (this.summary == newValue) return this;
    return new ImmutableCondition_Stage(this.modifierExtension, newValue, this.assessment, this.type, this.id, this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Condition_Stage#summary() summary} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for summary
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCondition_Stage withSummary(Optional<? extends CodeableConcept> optional) {
    @Nullable CodeableConcept value = optional.orElse(null);
    if (this.summary == value) return this;
    return new ImmutableCondition_Stage(this.modifierExtension, value, this.assessment, this.type, this.id, this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Condition_Stage#assessment() assessment} attribute.
   * @param value The value for assessment
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCondition_Stage withAssessment(List<Reference> value) {
    @Nullable List<Reference> newValue = Objects.requireNonNull(value, "assessment");
    if (this.assessment == newValue) return this;
    return new ImmutableCondition_Stage(this.modifierExtension, this.summary, newValue, this.type, this.id, this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Condition_Stage#assessment() assessment} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for assessment
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCondition_Stage withAssessment(Optional<? extends List<Reference>> optional) {
    @Nullable List<Reference> value = optional.orElse(null);
    if (this.assessment == value) return this;
    return new ImmutableCondition_Stage(this.modifierExtension, this.summary, value, this.type, this.id, this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Condition_Stage#type() type} attribute.
   * @param value The value for type
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCondition_Stage withType(CodeableConcept value) {
    @Nullable CodeableConcept newValue = Objects.requireNonNull(value, "type");
    if (this.type == newValue) return this;
    return new ImmutableCondition_Stage(this.modifierExtension, this.summary, this.assessment, newValue, this.id, this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Condition_Stage#type() type} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for type
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCondition_Stage withType(Optional<? extends CodeableConcept> optional) {
    @Nullable CodeableConcept value = optional.orElse(null);
    if (this.type == value) return this;
    return new ImmutableCondition_Stage(this.modifierExtension, this.summary, this.assessment, value, this.id, this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Condition_Stage#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCondition_Stage withId(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "id");
    if (Objects.equals(this.id, newValue)) return this;
    return new ImmutableCondition_Stage(this.modifierExtension, this.summary, this.assessment, this.type, newValue, this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Condition_Stage#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCondition_Stage withId(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.id, value)) return this;
    return new ImmutableCondition_Stage(this.modifierExtension, this.summary, this.assessment, this.type, value, this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Condition_Stage#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCondition_Stage withExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableCondition_Stage(this.modifierExtension, this.summary, this.assessment, this.type, this.id, newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Condition_Stage#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCondition_Stage withExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableCondition_Stage(this.modifierExtension, this.summary, this.assessment, this.type, this.id, value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableCondition_Stage} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableCondition_Stage
        && equalTo((ImmutableCondition_Stage) another);
  }

  private boolean equalTo(ImmutableCondition_Stage another) {
    return Objects.equals(modifierExtension, another.modifierExtension)
        && Objects.equals(summary, another.summary)
        && Objects.equals(assessment, another.assessment)
        && Objects.equals(type, another.type)
        && Objects.equals(id, another.id)
        && Objects.equals(extension, another.extension);
  }

  /**
   * Computes a hash code from attributes: {@code modifierExtension}, {@code summary}, {@code assessment}, {@code type}, {@code id}, {@code extension}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(modifierExtension);
    h += (h << 5) + Objects.hashCode(summary);
    h += (h << 5) + Objects.hashCode(assessment);
    h += (h << 5) + Objects.hashCode(type);
    h += (h << 5) + Objects.hashCode(id);
    h += (h << 5) + Objects.hashCode(extension);
    return h;
  }

  /**
   * Prints the immutable value {@code Condition_Stage} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("Condition_Stage{");
    if (modifierExtension != null) {
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (summary != null) {
      if (builder.length() > 16) builder.append(", ");
      builder.append("summary=").append(summary);
    }
    if (assessment != null) {
      if (builder.length() > 16) builder.append(", ");
      builder.append("assessment=").append(assessment);
    }
    if (type != null) {
      if (builder.length() > 16) builder.append(", ");
      builder.append("type=").append(type);
    }
    if (id != null) {
      if (builder.length() > 16) builder.append(", ");
      builder.append("id=").append(id);
    }
    if (extension != null) {
      if (builder.length() > 16) builder.append(", ");
      builder.append("extension=").append(extension);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Generated(from = "Condition_Stage", generator = "Immutables")
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements Condition_Stage {
    @Nullable Optional<List<Extension>> modifierExtension = Optional.empty();
    boolean modifierExtensionIsSet;
    @Nullable Optional<CodeableConcept> summary = Optional.empty();
    boolean summaryIsSet;
    @Nullable Optional<List<Reference>> assessment = Optional.empty();
    boolean assessmentIsSet;
    @Nullable Optional<CodeableConcept> type = Optional.empty();
    boolean typeIsSet;
    @Nullable Optional<String> id = Optional.empty();
    boolean idIsSet;
    @Nullable Optional<List<Extension>> extension = Optional.empty();
    boolean extensionIsSet;
    @JsonProperty("modifierExtension")
    public void setModifierExtension(Optional<List<Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @JsonProperty("summary")
    public void setSummary(Optional<CodeableConcept> summary) {
      this.summary = summary;
      this.summaryIsSet = true;
    }
    @JsonProperty("assessment")
    public void setAssessment(Optional<List<Reference>> assessment) {
      this.assessment = assessment;
      this.assessmentIsSet = true;
    }
    @JsonProperty("type")
    public void setType(Optional<CodeableConcept> type) {
      this.type = type;
      this.typeIsSet = true;
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
    public Optional<List<Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<CodeableConcept> summary() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Reference>> assessment() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<CodeableConcept> type() { throw new UnsupportedOperationException(); }
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
  static ImmutableCondition_Stage fromJson(Json json) {
    ImmutableCondition_Stage.Builder builder = ImmutableCondition_Stage.builder();
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.summaryIsSet) {
      builder.summary(json.summary);
    }
    if (json.assessmentIsSet) {
      builder.assessment(json.assessment);
    }
    if (json.typeIsSet) {
      builder.type(json.type);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    return (ImmutableCondition_Stage) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link Condition_Stage} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable Condition_Stage instance
   */
  public static Condition_Stage copyOf(Condition_Stage instance) {
    if (instance instanceof ImmutableCondition_Stage) {
      return (ImmutableCondition_Stage) instance;
    }
    return ImmutableCondition_Stage.builder()
        .modifierExtension(instance.modifierExtension())
        .summary(instance.summary())
        .assessment(instance.assessment())
        .type(instance.type())
        .id(instance.id())
        .extension(instance.extension())
        .build();
  }

  /**
   * Creates a builder for {@link Condition_Stage Condition_Stage}.
   * <pre>
   * ImmutableCondition_Stage.builder()
   *    .modifierExtension(List&amp;lt;com.fhir.types.fhir.Extension&amp;gt;) // optional {@link Condition_Stage#modifierExtension() modifierExtension}
   *    .summary(com.fhir.types.fhir.CodeableConcept) // optional {@link Condition_Stage#summary() summary}
   *    .assessment(List&amp;lt;com.fhir.types.fhir.Reference&amp;gt;) // optional {@link Condition_Stage#assessment() assessment}
   *    .type(com.fhir.types.fhir.CodeableConcept) // optional {@link Condition_Stage#type() type}
   *    .id(String) // optional {@link Condition_Stage#id() id}
   *    .extension(List&amp;lt;com.fhir.types.fhir.Extension&amp;gt;) // optional {@link Condition_Stage#extension() extension}
   *    .build();
   * </pre>
   * @return A new Condition_Stage builder
   */
  public static ImmutableCondition_Stage.Builder builder() {
    return new ImmutableCondition_Stage.Builder();
  }

  /**
   * Builds instances of type {@link Condition_Stage Condition_Stage}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "Condition_Stage", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder {
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x1L;
    private static final long OPT_BIT_SUMMARY = 0x2L;
    private static final long OPT_BIT_ASSESSMENT = 0x4L;
    private static final long OPT_BIT_TYPE = 0x8L;
    private static final long OPT_BIT_ID = 0x10L;
    private static final long OPT_BIT_EXTENSION = 0x20L;
    private long optBits;

    private @Nullable List<Extension> modifierExtension;
    private @Nullable CodeableConcept summary;
    private @Nullable List<Reference> assessment;
    private @Nullable CodeableConcept type;
    private @Nullable String id;
    private @Nullable List<Extension> extension;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link Condition_Stage#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link Condition_Stage#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link Condition_Stage#summary() summary} to summary.
     * @param summary The value for summary
     * @return {@code this} builder for chained invocation
     */
    public final Builder summary(CodeableConcept summary) {
      checkNotIsSet(summaryIsSet(), "summary");
      this.summary = Objects.requireNonNull(summary, "summary");
      optBits |= OPT_BIT_SUMMARY;
      return this;
    }

    /**
     * Initializes the optional value {@link Condition_Stage#summary() summary} to summary.
     * @param summary The value for summary
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("summary")
    public final Builder summary(Optional<? extends CodeableConcept> summary) {
      checkNotIsSet(summaryIsSet(), "summary");
      this.summary = summary.orElse(null);
      optBits |= OPT_BIT_SUMMARY;
      return this;
    }

    /**
     * Initializes the optional value {@link Condition_Stage#assessment() assessment} to assessment.
     * @param assessment The value for assessment
     * @return {@code this} builder for chained invocation
     */
    public final Builder assessment(List<Reference> assessment) {
      checkNotIsSet(assessmentIsSet(), "assessment");
      this.assessment = Objects.requireNonNull(assessment, "assessment");
      optBits |= OPT_BIT_ASSESSMENT;
      return this;
    }

    /**
     * Initializes the optional value {@link Condition_Stage#assessment() assessment} to assessment.
     * @param assessment The value for assessment
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("assessment")
    public final Builder assessment(Optional<? extends List<Reference>> assessment) {
      checkNotIsSet(assessmentIsSet(), "assessment");
      this.assessment = assessment.orElse(null);
      optBits |= OPT_BIT_ASSESSMENT;
      return this;
    }

    /**
     * Initializes the optional value {@link Condition_Stage#type() type} to type.
     * @param type The value for type
     * @return {@code this} builder for chained invocation
     */
    public final Builder type(CodeableConcept type) {
      checkNotIsSet(typeIsSet(), "type");
      this.type = Objects.requireNonNull(type, "type");
      optBits |= OPT_BIT_TYPE;
      return this;
    }

    /**
     * Initializes the optional value {@link Condition_Stage#type() type} to type.
     * @param type The value for type
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("type")
    public final Builder type(Optional<? extends CodeableConcept> type) {
      checkNotIsSet(typeIsSet(), "type");
      this.type = type.orElse(null);
      optBits |= OPT_BIT_TYPE;
      return this;
    }

    /**
     * Initializes the optional value {@link Condition_Stage#id() id} to id.
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
     * Initializes the optional value {@link Condition_Stage#id() id} to id.
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
     * Initializes the optional value {@link Condition_Stage#extension() extension} to extension.
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
     * Initializes the optional value {@link Condition_Stage#extension() extension} to extension.
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
     * Builds a new {@link Condition_Stage Condition_Stage}.
     * @return An immutable instance of Condition_Stage
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public Condition_Stage build() {
      return new ImmutableCondition_Stage(modifierExtension, summary, assessment, type, id, extension);
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean summaryIsSet() {
      return (optBits & OPT_BIT_SUMMARY) != 0;
    }

    private boolean assessmentIsSet() {
      return (optBits & OPT_BIT_ASSESSMENT) != 0;
    }

    private boolean typeIsSet() {
      return (optBits & OPT_BIT_TYPE) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of Condition_Stage is strict, attribute is already set: ".concat(name));
    }
  }
}
