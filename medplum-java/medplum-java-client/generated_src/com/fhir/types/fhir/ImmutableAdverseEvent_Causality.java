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
 * Immutable implementation of {@link AdverseEvent_Causality}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableAdverseEvent_Causality.builder()}.
 */
@Generated(from = "AdverseEvent_Causality", generator = "Immutables")
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableAdverseEvent_Causality implements AdverseEvent_Causality {
  private final @Nullable String productRelatedness;
  private final @Nullable List<Extension> modifierExtension;
  private final @Nullable CodeableConcept assessment;
  private final @Nullable Reference author;
  private final @Nullable List<Extension> extension;
  private final @Nullable String id;
  private final @Nullable CodeableConcept method;

  private ImmutableAdverseEvent_Causality(
      @Nullable String productRelatedness,
      @Nullable List<Extension> modifierExtension,
      @Nullable CodeableConcept assessment,
      @Nullable Reference author,
      @Nullable List<Extension> extension,
      @Nullable String id,
      @Nullable CodeableConcept method) {
    this.productRelatedness = productRelatedness;
    this.modifierExtension = modifierExtension;
    this.assessment = assessment;
    this.author = author;
    this.extension = extension;
    this.id = id;
    this.method = method;
  }

  /**
   * @return The value of the {@code productRelatedness} attribute
   */
  @JsonProperty("productRelatedness")
  @Override
  public Optional<String> productRelatedness() {
    return Optional.ofNullable(productRelatedness);
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
   * @return The value of the {@code assessment} attribute
   */
  @JsonProperty("assessment")
  @Override
  public Optional<CodeableConcept> assessment() {
    return Optional.ofNullable(assessment);
  }

  /**
   * @return The value of the {@code author} attribute
   */
  @JsonProperty("author")
  @Override
  public Optional<Reference> author() {
    return Optional.ofNullable(author);
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
   * @return The value of the {@code method} attribute
   */
  @JsonProperty("method")
  @Override
  public Optional<CodeableConcept> method() {
    return Optional.ofNullable(method);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link AdverseEvent_Causality#productRelatedness() productRelatedness} attribute.
   * @param value The value for productRelatedness
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAdverseEvent_Causality withProductRelatedness(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "productRelatedness");
    if (Objects.equals(this.productRelatedness, newValue)) return this;
    return new ImmutableAdverseEvent_Causality(
        newValue,
        this.modifierExtension,
        this.assessment,
        this.author,
        this.extension,
        this.id,
        this.method);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link AdverseEvent_Causality#productRelatedness() productRelatedness} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for productRelatedness
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAdverseEvent_Causality withProductRelatedness(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.productRelatedness, value)) return this;
    return new ImmutableAdverseEvent_Causality(
        value,
        this.modifierExtension,
        this.assessment,
        this.author,
        this.extension,
        this.id,
        this.method);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link AdverseEvent_Causality#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAdverseEvent_Causality withModifierExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableAdverseEvent_Causality(
        this.productRelatedness,
        newValue,
        this.assessment,
        this.author,
        this.extension,
        this.id,
        this.method);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link AdverseEvent_Causality#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableAdverseEvent_Causality withModifierExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableAdverseEvent_Causality(
        this.productRelatedness,
        value,
        this.assessment,
        this.author,
        this.extension,
        this.id,
        this.method);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link AdverseEvent_Causality#assessment() assessment} attribute.
   * @param value The value for assessment
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAdverseEvent_Causality withAssessment(CodeableConcept value) {
    @Nullable CodeableConcept newValue = Objects.requireNonNull(value, "assessment");
    if (this.assessment == newValue) return this;
    return new ImmutableAdverseEvent_Causality(
        this.productRelatedness,
        this.modifierExtension,
        newValue,
        this.author,
        this.extension,
        this.id,
        this.method);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link AdverseEvent_Causality#assessment() assessment} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for assessment
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableAdverseEvent_Causality withAssessment(Optional<? extends CodeableConcept> optional) {
    @Nullable CodeableConcept value = optional.orElse(null);
    if (this.assessment == value) return this;
    return new ImmutableAdverseEvent_Causality(
        this.productRelatedness,
        this.modifierExtension,
        value,
        this.author,
        this.extension,
        this.id,
        this.method);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link AdverseEvent_Causality#author() author} attribute.
   * @param value The value for author
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAdverseEvent_Causality withAuthor(Reference value) {
    @Nullable Reference newValue = Objects.requireNonNull(value, "author");
    if (this.author == newValue) return this;
    return new ImmutableAdverseEvent_Causality(
        this.productRelatedness,
        this.modifierExtension,
        this.assessment,
        newValue,
        this.extension,
        this.id,
        this.method);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link AdverseEvent_Causality#author() author} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for author
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableAdverseEvent_Causality withAuthor(Optional<? extends Reference> optional) {
    @Nullable Reference value = optional.orElse(null);
    if (this.author == value) return this;
    return new ImmutableAdverseEvent_Causality(
        this.productRelatedness,
        this.modifierExtension,
        this.assessment,
        value,
        this.extension,
        this.id,
        this.method);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link AdverseEvent_Causality#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAdverseEvent_Causality withExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableAdverseEvent_Causality(
        this.productRelatedness,
        this.modifierExtension,
        this.assessment,
        this.author,
        newValue,
        this.id,
        this.method);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link AdverseEvent_Causality#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableAdverseEvent_Causality withExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableAdverseEvent_Causality(
        this.productRelatedness,
        this.modifierExtension,
        this.assessment,
        this.author,
        value,
        this.id,
        this.method);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link AdverseEvent_Causality#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAdverseEvent_Causality withId(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "id");
    if (Objects.equals(this.id, newValue)) return this;
    return new ImmutableAdverseEvent_Causality(
        this.productRelatedness,
        this.modifierExtension,
        this.assessment,
        this.author,
        this.extension,
        newValue,
        this.method);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link AdverseEvent_Causality#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAdverseEvent_Causality withId(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.id, value)) return this;
    return new ImmutableAdverseEvent_Causality(
        this.productRelatedness,
        this.modifierExtension,
        this.assessment,
        this.author,
        this.extension,
        value,
        this.method);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link AdverseEvent_Causality#method() method} attribute.
   * @param value The value for method
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAdverseEvent_Causality withMethod(CodeableConcept value) {
    @Nullable CodeableConcept newValue = Objects.requireNonNull(value, "method");
    if (this.method == newValue) return this;
    return new ImmutableAdverseEvent_Causality(
        this.productRelatedness,
        this.modifierExtension,
        this.assessment,
        this.author,
        this.extension,
        this.id,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link AdverseEvent_Causality#method() method} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for method
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableAdverseEvent_Causality withMethod(Optional<? extends CodeableConcept> optional) {
    @Nullable CodeableConcept value = optional.orElse(null);
    if (this.method == value) return this;
    return new ImmutableAdverseEvent_Causality(
        this.productRelatedness,
        this.modifierExtension,
        this.assessment,
        this.author,
        this.extension,
        this.id,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableAdverseEvent_Causality} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableAdverseEvent_Causality
        && equalTo((ImmutableAdverseEvent_Causality) another);
  }

  private boolean equalTo(ImmutableAdverseEvent_Causality another) {
    return Objects.equals(productRelatedness, another.productRelatedness)
        && Objects.equals(modifierExtension, another.modifierExtension)
        && Objects.equals(assessment, another.assessment)
        && Objects.equals(author, another.author)
        && Objects.equals(extension, another.extension)
        && Objects.equals(id, another.id)
        && Objects.equals(method, another.method);
  }

  /**
   * Computes a hash code from attributes: {@code productRelatedness}, {@code modifierExtension}, {@code assessment}, {@code author}, {@code extension}, {@code id}, {@code method}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(productRelatedness);
    h += (h << 5) + Objects.hashCode(modifierExtension);
    h += (h << 5) + Objects.hashCode(assessment);
    h += (h << 5) + Objects.hashCode(author);
    h += (h << 5) + Objects.hashCode(extension);
    h += (h << 5) + Objects.hashCode(id);
    h += (h << 5) + Objects.hashCode(method);
    return h;
  }

  /**
   * Prints the immutable value {@code AdverseEvent_Causality} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("AdverseEvent_Causality{");
    if (productRelatedness != null) {
      builder.append("productRelatedness=").append(productRelatedness);
    }
    if (modifierExtension != null) {
      if (builder.length() > 23) builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (assessment != null) {
      if (builder.length() > 23) builder.append(", ");
      builder.append("assessment=").append(assessment);
    }
    if (author != null) {
      if (builder.length() > 23) builder.append(", ");
      builder.append("author=").append(author);
    }
    if (extension != null) {
      if (builder.length() > 23) builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (id != null) {
      if (builder.length() > 23) builder.append(", ");
      builder.append("id=").append(id);
    }
    if (method != null) {
      if (builder.length() > 23) builder.append(", ");
      builder.append("method=").append(method);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Generated(from = "AdverseEvent_Causality", generator = "Immutables")
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements AdverseEvent_Causality {
    @Nullable Optional<String> productRelatedness = Optional.empty();
    boolean productRelatednessIsSet;
    @Nullable Optional<List<Extension>> modifierExtension = Optional.empty();
    boolean modifierExtensionIsSet;
    @Nullable Optional<CodeableConcept> assessment = Optional.empty();
    boolean assessmentIsSet;
    @Nullable Optional<Reference> author = Optional.empty();
    boolean authorIsSet;
    @Nullable Optional<List<Extension>> extension = Optional.empty();
    boolean extensionIsSet;
    @Nullable Optional<String> id = Optional.empty();
    boolean idIsSet;
    @Nullable Optional<CodeableConcept> method = Optional.empty();
    boolean methodIsSet;
    @JsonProperty("productRelatedness")
    public void setProductRelatedness(Optional<String> productRelatedness) {
      this.productRelatedness = productRelatedness;
      this.productRelatednessIsSet = true;
    }
    @JsonProperty("modifierExtension")
    public void setModifierExtension(Optional<List<Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @JsonProperty("assessment")
    public void setAssessment(Optional<CodeableConcept> assessment) {
      this.assessment = assessment;
      this.assessmentIsSet = true;
    }
    @JsonProperty("author")
    public void setAuthor(Optional<Reference> author) {
      this.author = author;
      this.authorIsSet = true;
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
    @JsonProperty("method")
    public void setMethod(Optional<CodeableConcept> method) {
      this.method = method;
      this.methodIsSet = true;
    }
    @Override
    public Optional<String> productRelatedness() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<CodeableConcept> assessment() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Reference> author() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> id() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<CodeableConcept> method() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableAdverseEvent_Causality fromJson(Json json) {
    ImmutableAdverseEvent_Causality.Builder builder = ImmutableAdverseEvent_Causality.builder();
    if (json.productRelatednessIsSet) {
      builder.productRelatedness(json.productRelatedness);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.assessmentIsSet) {
      builder.assessment(json.assessment);
    }
    if (json.authorIsSet) {
      builder.author(json.author);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.methodIsSet) {
      builder.method(json.method);
    }
    return (ImmutableAdverseEvent_Causality) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link AdverseEvent_Causality} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable AdverseEvent_Causality instance
   */
  public static AdverseEvent_Causality copyOf(AdverseEvent_Causality instance) {
    if (instance instanceof ImmutableAdverseEvent_Causality) {
      return (ImmutableAdverseEvent_Causality) instance;
    }
    return ImmutableAdverseEvent_Causality.builder()
        .productRelatedness(instance.productRelatedness())
        .modifierExtension(instance.modifierExtension())
        .assessment(instance.assessment())
        .author(instance.author())
        .extension(instance.extension())
        .id(instance.id())
        .method(instance.method())
        .build();
  }

  /**
   * Creates a builder for {@link AdverseEvent_Causality AdverseEvent_Causality}.
   * <pre>
   * ImmutableAdverseEvent_Causality.builder()
   *    .productRelatedness(String) // optional {@link AdverseEvent_Causality#productRelatedness() productRelatedness}
   *    .modifierExtension(List&amp;lt;com.fhir.types.fhir.Extension&amp;gt;) // optional {@link AdverseEvent_Causality#modifierExtension() modifierExtension}
   *    .assessment(com.fhir.types.fhir.CodeableConcept) // optional {@link AdverseEvent_Causality#assessment() assessment}
   *    .author(com.fhir.types.fhir.Reference) // optional {@link AdverseEvent_Causality#author() author}
   *    .extension(List&amp;lt;com.fhir.types.fhir.Extension&amp;gt;) // optional {@link AdverseEvent_Causality#extension() extension}
   *    .id(String) // optional {@link AdverseEvent_Causality#id() id}
   *    .method(com.fhir.types.fhir.CodeableConcept) // optional {@link AdverseEvent_Causality#method() method}
   *    .build();
   * </pre>
   * @return A new AdverseEvent_Causality builder
   */
  public static ImmutableAdverseEvent_Causality.Builder builder() {
    return new ImmutableAdverseEvent_Causality.Builder();
  }

  /**
   * Builds instances of type {@link AdverseEvent_Causality AdverseEvent_Causality}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "AdverseEvent_Causality", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder {
    private static final long OPT_BIT_PRODUCT_RELATEDNESS = 0x1L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x2L;
    private static final long OPT_BIT_ASSESSMENT = 0x4L;
    private static final long OPT_BIT_AUTHOR = 0x8L;
    private static final long OPT_BIT_EXTENSION = 0x10L;
    private static final long OPT_BIT_ID = 0x20L;
    private static final long OPT_BIT_METHOD = 0x40L;
    private long optBits;

    private @Nullable String productRelatedness;
    private @Nullable List<Extension> modifierExtension;
    private @Nullable CodeableConcept assessment;
    private @Nullable Reference author;
    private @Nullable List<Extension> extension;
    private @Nullable String id;
    private @Nullable CodeableConcept method;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link AdverseEvent_Causality#productRelatedness() productRelatedness} to productRelatedness.
     * @param productRelatedness The value for productRelatedness
     * @return {@code this} builder for chained invocation
     */
    public final Builder productRelatedness(String productRelatedness) {
      checkNotIsSet(productRelatednessIsSet(), "productRelatedness");
      this.productRelatedness = Objects.requireNonNull(productRelatedness, "productRelatedness");
      optBits |= OPT_BIT_PRODUCT_RELATEDNESS;
      return this;
    }

    /**
     * Initializes the optional value {@link AdverseEvent_Causality#productRelatedness() productRelatedness} to productRelatedness.
     * @param productRelatedness The value for productRelatedness
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("productRelatedness")
    public final Builder productRelatedness(Optional<String> productRelatedness) {
      checkNotIsSet(productRelatednessIsSet(), "productRelatedness");
      this.productRelatedness = productRelatedness.orElse(null);
      optBits |= OPT_BIT_PRODUCT_RELATEDNESS;
      return this;
    }

    /**
     * Initializes the optional value {@link AdverseEvent_Causality#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link AdverseEvent_Causality#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link AdverseEvent_Causality#assessment() assessment} to assessment.
     * @param assessment The value for assessment
     * @return {@code this} builder for chained invocation
     */
    public final Builder assessment(CodeableConcept assessment) {
      checkNotIsSet(assessmentIsSet(), "assessment");
      this.assessment = Objects.requireNonNull(assessment, "assessment");
      optBits |= OPT_BIT_ASSESSMENT;
      return this;
    }

    /**
     * Initializes the optional value {@link AdverseEvent_Causality#assessment() assessment} to assessment.
     * @param assessment The value for assessment
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("assessment")
    public final Builder assessment(Optional<? extends CodeableConcept> assessment) {
      checkNotIsSet(assessmentIsSet(), "assessment");
      this.assessment = assessment.orElse(null);
      optBits |= OPT_BIT_ASSESSMENT;
      return this;
    }

    /**
     * Initializes the optional value {@link AdverseEvent_Causality#author() author} to author.
     * @param author The value for author
     * @return {@code this} builder for chained invocation
     */
    public final Builder author(Reference author) {
      checkNotIsSet(authorIsSet(), "author");
      this.author = Objects.requireNonNull(author, "author");
      optBits |= OPT_BIT_AUTHOR;
      return this;
    }

    /**
     * Initializes the optional value {@link AdverseEvent_Causality#author() author} to author.
     * @param author The value for author
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("author")
    public final Builder author(Optional<? extends Reference> author) {
      checkNotIsSet(authorIsSet(), "author");
      this.author = author.orElse(null);
      optBits |= OPT_BIT_AUTHOR;
      return this;
    }

    /**
     * Initializes the optional value {@link AdverseEvent_Causality#extension() extension} to extension.
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
     * Initializes the optional value {@link AdverseEvent_Causality#extension() extension} to extension.
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
     * Initializes the optional value {@link AdverseEvent_Causality#id() id} to id.
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
     * Initializes the optional value {@link AdverseEvent_Causality#id() id} to id.
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
     * Initializes the optional value {@link AdverseEvent_Causality#method() method} to method.
     * @param method The value for method
     * @return {@code this} builder for chained invocation
     */
    public final Builder method(CodeableConcept method) {
      checkNotIsSet(methodIsSet(), "method");
      this.method = Objects.requireNonNull(method, "method");
      optBits |= OPT_BIT_METHOD;
      return this;
    }

    /**
     * Initializes the optional value {@link AdverseEvent_Causality#method() method} to method.
     * @param method The value for method
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("method")
    public final Builder method(Optional<? extends CodeableConcept> method) {
      checkNotIsSet(methodIsSet(), "method");
      this.method = method.orElse(null);
      optBits |= OPT_BIT_METHOD;
      return this;
    }

    /**
     * Builds a new {@link AdverseEvent_Causality AdverseEvent_Causality}.
     * @return An immutable instance of AdverseEvent_Causality
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public AdverseEvent_Causality build() {
      return new ImmutableAdverseEvent_Causality(productRelatedness, modifierExtension, assessment, author, extension, id, method);
    }

    private boolean productRelatednessIsSet() {
      return (optBits & OPT_BIT_PRODUCT_RELATEDNESS) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean assessmentIsSet() {
      return (optBits & OPT_BIT_ASSESSMENT) != 0;
    }

    private boolean authorIsSet() {
      return (optBits & OPT_BIT_AUTHOR) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean methodIsSet() {
      return (optBits & OPT_BIT_METHOD) != 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of AdverseEvent_Causality is strict, attribute is already set: ".concat(name));
    }
  }
}
