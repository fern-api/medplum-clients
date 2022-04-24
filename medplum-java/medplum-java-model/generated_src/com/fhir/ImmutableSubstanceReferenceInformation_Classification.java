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
 * Immutable implementation of {@link SubstanceReferenceInformation_Classification}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableSubstanceReferenceInformation_Classification.builder()}.
 */
@Generated(from = "SubstanceReferenceInformation_Classification", generator = "Immutables")
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableSubstanceReferenceInformation_Classification
    implements SubstanceReferenceInformation_Classification {
  private final @Nullable String id;
  private final @Nullable List<Extension> modifierExtension;
  private final @Nullable CodeableConcept domain;
  private final @Nullable CodeableConcept classification;
  private final @Nullable List<Reference> source;
  private final @Nullable List<CodeableConcept> subtype;
  private final @Nullable List<Extension> extension;

  private ImmutableSubstanceReferenceInformation_Classification(
      @Nullable String id,
      @Nullable List<Extension> modifierExtension,
      @Nullable CodeableConcept domain,
      @Nullable CodeableConcept classification,
      @Nullable List<Reference> source,
      @Nullable List<CodeableConcept> subtype,
      @Nullable List<Extension> extension) {
    this.id = id;
    this.modifierExtension = modifierExtension;
    this.domain = domain;
    this.classification = classification;
    this.source = source;
    this.subtype = subtype;
    this.extension = extension;
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
   * @return The value of the {@code modifierExtension} attribute
   */
  @JsonProperty("modifierExtension")
  @Override
  public Optional<List<Extension>> modifierExtension() {
    return Optional.ofNullable(modifierExtension);
  }

  /**
   * @return The value of the {@code domain} attribute
   */
  @JsonProperty("domain")
  @Override
  public Optional<CodeableConcept> domain() {
    return Optional.ofNullable(domain);
  }

  /**
   * @return The value of the {@code classification} attribute
   */
  @JsonProperty("classification")
  @Override
  public Optional<CodeableConcept> classification() {
    return Optional.ofNullable(classification);
  }

  /**
   * @return The value of the {@code source} attribute
   */
  @JsonProperty("source")
  @Override
  public Optional<List<Reference>> source() {
    return Optional.ofNullable(source);
  }

  /**
   * @return The value of the {@code subtype} attribute
   */
  @JsonProperty("subtype")
  @Override
  public Optional<List<CodeableConcept>> subtype() {
    return Optional.ofNullable(subtype);
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
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SubstanceReferenceInformation_Classification#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubstanceReferenceInformation_Classification withId(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "id");
    if (Objects.equals(this.id, newValue)) return this;
    return new ImmutableSubstanceReferenceInformation_Classification(
        newValue,
        this.modifierExtension,
        this.domain,
        this.classification,
        this.source,
        this.subtype,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SubstanceReferenceInformation_Classification#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubstanceReferenceInformation_Classification withId(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.id, value)) return this;
    return new ImmutableSubstanceReferenceInformation_Classification(
        value,
        this.modifierExtension,
        this.domain,
        this.classification,
        this.source,
        this.subtype,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SubstanceReferenceInformation_Classification#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubstanceReferenceInformation_Classification withModifierExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableSubstanceReferenceInformation_Classification(this.id, newValue, this.domain, this.classification, this.source, this.subtype, this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SubstanceReferenceInformation_Classification#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSubstanceReferenceInformation_Classification withModifierExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableSubstanceReferenceInformation_Classification(this.id, value, this.domain, this.classification, this.source, this.subtype, this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SubstanceReferenceInformation_Classification#domain() domain} attribute.
   * @param value The value for domain
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubstanceReferenceInformation_Classification withDomain(CodeableConcept value) {
    @Nullable CodeableConcept newValue = Objects.requireNonNull(value, "domain");
    if (this.domain == newValue) return this;
    return new ImmutableSubstanceReferenceInformation_Classification(
        this.id,
        this.modifierExtension,
        newValue,
        this.classification,
        this.source,
        this.subtype,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SubstanceReferenceInformation_Classification#domain() domain} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for domain
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSubstanceReferenceInformation_Classification withDomain(Optional<? extends CodeableConcept> optional) {
    @Nullable CodeableConcept value = optional.orElse(null);
    if (this.domain == value) return this;
    return new ImmutableSubstanceReferenceInformation_Classification(
        this.id,
        this.modifierExtension,
        value,
        this.classification,
        this.source,
        this.subtype,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SubstanceReferenceInformation_Classification#classification() classification} attribute.
   * @param value The value for classification
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubstanceReferenceInformation_Classification withClassification(CodeableConcept value) {
    @Nullable CodeableConcept newValue = Objects.requireNonNull(value, "classification");
    if (this.classification == newValue) return this;
    return new ImmutableSubstanceReferenceInformation_Classification(
        this.id,
        this.modifierExtension,
        this.domain,
        newValue,
        this.source,
        this.subtype,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SubstanceReferenceInformation_Classification#classification() classification} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for classification
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSubstanceReferenceInformation_Classification withClassification(Optional<? extends CodeableConcept> optional) {
    @Nullable CodeableConcept value = optional.orElse(null);
    if (this.classification == value) return this;
    return new ImmutableSubstanceReferenceInformation_Classification(this.id, this.modifierExtension, this.domain, value, this.source, this.subtype, this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SubstanceReferenceInformation_Classification#source() source} attribute.
   * @param value The value for source
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubstanceReferenceInformation_Classification withSource(List<Reference> value) {
    @Nullable List<Reference> newValue = Objects.requireNonNull(value, "source");
    if (this.source == newValue) return this;
    return new ImmutableSubstanceReferenceInformation_Classification(
        this.id,
        this.modifierExtension,
        this.domain,
        this.classification,
        newValue,
        this.subtype,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SubstanceReferenceInformation_Classification#source() source} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for source
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSubstanceReferenceInformation_Classification withSource(Optional<? extends List<Reference>> optional) {
    @Nullable List<Reference> value = optional.orElse(null);
    if (this.source == value) return this;
    return new ImmutableSubstanceReferenceInformation_Classification(
        this.id,
        this.modifierExtension,
        this.domain,
        this.classification,
        value,
        this.subtype,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SubstanceReferenceInformation_Classification#subtype() subtype} attribute.
   * @param value The value for subtype
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubstanceReferenceInformation_Classification withSubtype(List<CodeableConcept> value) {
    @Nullable List<CodeableConcept> newValue = Objects.requireNonNull(value, "subtype");
    if (this.subtype == newValue) return this;
    return new ImmutableSubstanceReferenceInformation_Classification(
        this.id,
        this.modifierExtension,
        this.domain,
        this.classification,
        this.source,
        newValue,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SubstanceReferenceInformation_Classification#subtype() subtype} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for subtype
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSubstanceReferenceInformation_Classification withSubtype(Optional<? extends List<CodeableConcept>> optional) {
    @Nullable List<CodeableConcept> value = optional.orElse(null);
    if (this.subtype == value) return this;
    return new ImmutableSubstanceReferenceInformation_Classification(
        this.id,
        this.modifierExtension,
        this.domain,
        this.classification,
        this.source,
        value,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SubstanceReferenceInformation_Classification#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubstanceReferenceInformation_Classification withExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableSubstanceReferenceInformation_Classification(
        this.id,
        this.modifierExtension,
        this.domain,
        this.classification,
        this.source,
        this.subtype,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SubstanceReferenceInformation_Classification#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSubstanceReferenceInformation_Classification withExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableSubstanceReferenceInformation_Classification(
        this.id,
        this.modifierExtension,
        this.domain,
        this.classification,
        this.source,
        this.subtype,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableSubstanceReferenceInformation_Classification} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableSubstanceReferenceInformation_Classification
        && equalTo((ImmutableSubstanceReferenceInformation_Classification) another);
  }

  private boolean equalTo(ImmutableSubstanceReferenceInformation_Classification another) {
    return Objects.equals(id, another.id)
        && Objects.equals(modifierExtension, another.modifierExtension)
        && Objects.equals(domain, another.domain)
        && Objects.equals(classification, another.classification)
        && Objects.equals(source, another.source)
        && Objects.equals(subtype, another.subtype)
        && Objects.equals(extension, another.extension);
  }

  /**
   * Computes a hash code from attributes: {@code id}, {@code modifierExtension}, {@code domain}, {@code classification}, {@code source}, {@code subtype}, {@code extension}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(id);
    h += (h << 5) + Objects.hashCode(modifierExtension);
    h += (h << 5) + Objects.hashCode(domain);
    h += (h << 5) + Objects.hashCode(classification);
    h += (h << 5) + Objects.hashCode(source);
    h += (h << 5) + Objects.hashCode(subtype);
    h += (h << 5) + Objects.hashCode(extension);
    return h;
  }

  /**
   * Prints the immutable value {@code SubstanceReferenceInformation_Classification} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("SubstanceReferenceInformation_Classification{");
    if (id != null) {
      builder.append("id=").append(id);
    }
    if (modifierExtension != null) {
      if (builder.length() > 45) builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (domain != null) {
      if (builder.length() > 45) builder.append(", ");
      builder.append("domain=").append(domain);
    }
    if (classification != null) {
      if (builder.length() > 45) builder.append(", ");
      builder.append("classification=").append(classification);
    }
    if (source != null) {
      if (builder.length() > 45) builder.append(", ");
      builder.append("source=").append(source);
    }
    if (subtype != null) {
      if (builder.length() > 45) builder.append(", ");
      builder.append("subtype=").append(subtype);
    }
    if (extension != null) {
      if (builder.length() > 45) builder.append(", ");
      builder.append("extension=").append(extension);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Generated(from = "SubstanceReferenceInformation_Classification", generator = "Immutables")
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements SubstanceReferenceInformation_Classification {
    @Nullable Optional<String> id = Optional.empty();
    boolean idIsSet;
    @Nullable Optional<List<Extension>> modifierExtension = Optional.empty();
    boolean modifierExtensionIsSet;
    @Nullable Optional<CodeableConcept> domain = Optional.empty();
    boolean domainIsSet;
    @Nullable Optional<CodeableConcept> classification = Optional.empty();
    boolean classificationIsSet;
    @Nullable Optional<List<Reference>> source = Optional.empty();
    boolean sourceIsSet;
    @Nullable Optional<List<CodeableConcept>> subtype = Optional.empty();
    boolean subtypeIsSet;
    @Nullable Optional<List<Extension>> extension = Optional.empty();
    boolean extensionIsSet;
    @JsonProperty("id")
    public void setId(Optional<String> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @JsonProperty("modifierExtension")
    public void setModifierExtension(Optional<List<Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @JsonProperty("domain")
    public void setDomain(Optional<CodeableConcept> domain) {
      this.domain = domain;
      this.domainIsSet = true;
    }
    @JsonProperty("classification")
    public void setClassification(Optional<CodeableConcept> classification) {
      this.classification = classification;
      this.classificationIsSet = true;
    }
    @JsonProperty("source")
    public void setSource(Optional<List<Reference>> source) {
      this.source = source;
      this.sourceIsSet = true;
    }
    @JsonProperty("subtype")
    public void setSubtype(Optional<List<CodeableConcept>> subtype) {
      this.subtype = subtype;
      this.subtypeIsSet = true;
    }
    @JsonProperty("extension")
    public void setExtension(Optional<List<Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @Override
    public Optional<String> id() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<CodeableConcept> domain() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<CodeableConcept> classification() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Reference>> source() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<CodeableConcept>> subtype() { throw new UnsupportedOperationException(); }
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
  static ImmutableSubstanceReferenceInformation_Classification fromJson(Json json) {
    ImmutableSubstanceReferenceInformation_Classification.Builder builder = ImmutableSubstanceReferenceInformation_Classification.builder();
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.domainIsSet) {
      builder.domain(json.domain);
    }
    if (json.classificationIsSet) {
      builder.classification(json.classification);
    }
    if (json.sourceIsSet) {
      builder.source(json.source);
    }
    if (json.subtypeIsSet) {
      builder.subtype(json.subtype);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    return (ImmutableSubstanceReferenceInformation_Classification) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link SubstanceReferenceInformation_Classification} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable SubstanceReferenceInformation_Classification instance
   */
  public static SubstanceReferenceInformation_Classification copyOf(SubstanceReferenceInformation_Classification instance) {
    if (instance instanceof ImmutableSubstanceReferenceInformation_Classification) {
      return (ImmutableSubstanceReferenceInformation_Classification) instance;
    }
    return ImmutableSubstanceReferenceInformation_Classification.builder()
        .id(instance.id())
        .modifierExtension(instance.modifierExtension())
        .domain(instance.domain())
        .classification(instance.classification())
        .source(instance.source())
        .subtype(instance.subtype())
        .extension(instance.extension())
        .build();
  }

  /**
   * Creates a builder for {@link SubstanceReferenceInformation_Classification SubstanceReferenceInformation_Classification}.
   * <pre>
   * ImmutableSubstanceReferenceInformation_Classification.builder()
   *    .id(String) // optional {@link SubstanceReferenceInformation_Classification#id() id}
   *    .modifierExtension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link SubstanceReferenceInformation_Classification#modifierExtension() modifierExtension}
   *    .domain(com.fhir.CodeableConcept) // optional {@link SubstanceReferenceInformation_Classification#domain() domain}
   *    .classification(com.fhir.CodeableConcept) // optional {@link SubstanceReferenceInformation_Classification#classification() classification}
   *    .source(List&amp;lt;com.fhir.Reference&amp;gt;) // optional {@link SubstanceReferenceInformation_Classification#source() source}
   *    .subtype(List&amp;lt;com.fhir.CodeableConcept&amp;gt;) // optional {@link SubstanceReferenceInformation_Classification#subtype() subtype}
   *    .extension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link SubstanceReferenceInformation_Classification#extension() extension}
   *    .build();
   * </pre>
   * @return A new SubstanceReferenceInformation_Classification builder
   */
  public static ImmutableSubstanceReferenceInformation_Classification.Builder builder() {
    return new ImmutableSubstanceReferenceInformation_Classification.Builder();
  }

  /**
   * Builds instances of type {@link SubstanceReferenceInformation_Classification SubstanceReferenceInformation_Classification}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "SubstanceReferenceInformation_Classification", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder {
    private static final long OPT_BIT_ID = 0x1L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x2L;
    private static final long OPT_BIT_DOMAIN = 0x4L;
    private static final long OPT_BIT_CLASSIFICATION = 0x8L;
    private static final long OPT_BIT_SOURCE = 0x10L;
    private static final long OPT_BIT_SUBTYPE = 0x20L;
    private static final long OPT_BIT_EXTENSION = 0x40L;
    private long optBits;

    private @Nullable String id;
    private @Nullable List<Extension> modifierExtension;
    private @Nullable CodeableConcept domain;
    private @Nullable CodeableConcept classification;
    private @Nullable List<Reference> source;
    private @Nullable List<CodeableConcept> subtype;
    private @Nullable List<Extension> extension;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link SubstanceReferenceInformation_Classification#id() id} to id.
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
     * Initializes the optional value {@link SubstanceReferenceInformation_Classification#id() id} to id.
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
     * Initializes the optional value {@link SubstanceReferenceInformation_Classification#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link SubstanceReferenceInformation_Classification#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link SubstanceReferenceInformation_Classification#domain() domain} to domain.
     * @param domain The value for domain
     * @return {@code this} builder for chained invocation
     */
    public final Builder domain(CodeableConcept domain) {
      checkNotIsSet(domainIsSet(), "domain");
      this.domain = Objects.requireNonNull(domain, "domain");
      optBits |= OPT_BIT_DOMAIN;
      return this;
    }

    /**
     * Initializes the optional value {@link SubstanceReferenceInformation_Classification#domain() domain} to domain.
     * @param domain The value for domain
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("domain")
    public final Builder domain(Optional<? extends CodeableConcept> domain) {
      checkNotIsSet(domainIsSet(), "domain");
      this.domain = domain.orElse(null);
      optBits |= OPT_BIT_DOMAIN;
      return this;
    }

    /**
     * Initializes the optional value {@link SubstanceReferenceInformation_Classification#classification() classification} to classification.
     * @param classification The value for classification
     * @return {@code this} builder for chained invocation
     */
    public final Builder classification(CodeableConcept classification) {
      checkNotIsSet(classificationIsSet(), "classification");
      this.classification = Objects.requireNonNull(classification, "classification");
      optBits |= OPT_BIT_CLASSIFICATION;
      return this;
    }

    /**
     * Initializes the optional value {@link SubstanceReferenceInformation_Classification#classification() classification} to classification.
     * @param classification The value for classification
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("classification")
    public final Builder classification(Optional<? extends CodeableConcept> classification) {
      checkNotIsSet(classificationIsSet(), "classification");
      this.classification = classification.orElse(null);
      optBits |= OPT_BIT_CLASSIFICATION;
      return this;
    }

    /**
     * Initializes the optional value {@link SubstanceReferenceInformation_Classification#source() source} to source.
     * @param source The value for source
     * @return {@code this} builder for chained invocation
     */
    public final Builder source(List<Reference> source) {
      checkNotIsSet(sourceIsSet(), "source");
      this.source = Objects.requireNonNull(source, "source");
      optBits |= OPT_BIT_SOURCE;
      return this;
    }

    /**
     * Initializes the optional value {@link SubstanceReferenceInformation_Classification#source() source} to source.
     * @param source The value for source
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("source")
    public final Builder source(Optional<? extends List<Reference>> source) {
      checkNotIsSet(sourceIsSet(), "source");
      this.source = source.orElse(null);
      optBits |= OPT_BIT_SOURCE;
      return this;
    }

    /**
     * Initializes the optional value {@link SubstanceReferenceInformation_Classification#subtype() subtype} to subtype.
     * @param subtype The value for subtype
     * @return {@code this} builder for chained invocation
     */
    public final Builder subtype(List<CodeableConcept> subtype) {
      checkNotIsSet(subtypeIsSet(), "subtype");
      this.subtype = Objects.requireNonNull(subtype, "subtype");
      optBits |= OPT_BIT_SUBTYPE;
      return this;
    }

    /**
     * Initializes the optional value {@link SubstanceReferenceInformation_Classification#subtype() subtype} to subtype.
     * @param subtype The value for subtype
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("subtype")
    public final Builder subtype(Optional<? extends List<CodeableConcept>> subtype) {
      checkNotIsSet(subtypeIsSet(), "subtype");
      this.subtype = subtype.orElse(null);
      optBits |= OPT_BIT_SUBTYPE;
      return this;
    }

    /**
     * Initializes the optional value {@link SubstanceReferenceInformation_Classification#extension() extension} to extension.
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
     * Initializes the optional value {@link SubstanceReferenceInformation_Classification#extension() extension} to extension.
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
     * Builds a new {@link SubstanceReferenceInformation_Classification SubstanceReferenceInformation_Classification}.
     * @return An immutable instance of SubstanceReferenceInformation_Classification
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public SubstanceReferenceInformation_Classification build() {
      return new ImmutableSubstanceReferenceInformation_Classification(id, modifierExtension, domain, classification, source, subtype, extension);
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean domainIsSet() {
      return (optBits & OPT_BIT_DOMAIN) != 0;
    }

    private boolean classificationIsSet() {
      return (optBits & OPT_BIT_CLASSIFICATION) != 0;
    }

    private boolean sourceIsSet() {
      return (optBits & OPT_BIT_SOURCE) != 0;
    }

    private boolean subtypeIsSet() {
      return (optBits & OPT_BIT_SUBTYPE) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of SubstanceReferenceInformation_Classification is strict, attribute is already set: ".concat(name));
    }
  }
}