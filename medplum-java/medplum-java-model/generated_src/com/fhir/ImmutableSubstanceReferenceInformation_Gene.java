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
 * Immutable implementation of {@link SubstanceReferenceInformation_Gene}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableSubstanceReferenceInformation_Gene.builder()}.
 */
@Generated(from = "SubstanceReferenceInformation_Gene", generator = "Immutables")
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableSubstanceReferenceInformation_Gene
    implements SubstanceReferenceInformation_Gene {
  private final @Nullable List<Reference> source;
  private final @Nullable String id;
  private final @Nullable CodeableConcept gene;
  private final @Nullable List<Extension> modifierExtension;
  private final @Nullable CodeableConcept geneSequenceOrigin;
  private final @Nullable List<Extension> extension;

  private ImmutableSubstanceReferenceInformation_Gene(
      @Nullable List<Reference> source,
      @Nullable String id,
      @Nullable CodeableConcept gene,
      @Nullable List<Extension> modifierExtension,
      @Nullable CodeableConcept geneSequenceOrigin,
      @Nullable List<Extension> extension) {
    this.source = source;
    this.id = id;
    this.gene = gene;
    this.modifierExtension = modifierExtension;
    this.geneSequenceOrigin = geneSequenceOrigin;
    this.extension = extension;
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
   * @return The value of the {@code id} attribute
   */
  @JsonProperty("id")
  @Override
  public Optional<String> id() {
    return Optional.ofNullable(id);
  }

  /**
   * @return The value of the {@code gene} attribute
   */
  @JsonProperty("gene")
  @Override
  public Optional<CodeableConcept> gene() {
    return Optional.ofNullable(gene);
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
   * @return The value of the {@code geneSequenceOrigin} attribute
   */
  @JsonProperty("geneSequenceOrigin")
  @Override
  public Optional<CodeableConcept> geneSequenceOrigin() {
    return Optional.ofNullable(geneSequenceOrigin);
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
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SubstanceReferenceInformation_Gene#source() source} attribute.
   * @param value The value for source
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubstanceReferenceInformation_Gene withSource(List<Reference> value) {
    @Nullable List<Reference> newValue = Objects.requireNonNull(value, "source");
    if (this.source == newValue) return this;
    return new ImmutableSubstanceReferenceInformation_Gene(newValue, this.id, this.gene, this.modifierExtension, this.geneSequenceOrigin, this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SubstanceReferenceInformation_Gene#source() source} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for source
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSubstanceReferenceInformation_Gene withSource(Optional<? extends List<Reference>> optional) {
    @Nullable List<Reference> value = optional.orElse(null);
    if (this.source == value) return this;
    return new ImmutableSubstanceReferenceInformation_Gene(value, this.id, this.gene, this.modifierExtension, this.geneSequenceOrigin, this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SubstanceReferenceInformation_Gene#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubstanceReferenceInformation_Gene withId(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "id");
    if (Objects.equals(this.id, newValue)) return this;
    return new ImmutableSubstanceReferenceInformation_Gene(
        this.source,
        newValue,
        this.gene,
        this.modifierExtension,
        this.geneSequenceOrigin,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SubstanceReferenceInformation_Gene#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubstanceReferenceInformation_Gene withId(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.id, value)) return this;
    return new ImmutableSubstanceReferenceInformation_Gene(this.source, value, this.gene, this.modifierExtension, this.geneSequenceOrigin, this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SubstanceReferenceInformation_Gene#gene() gene} attribute.
   * @param value The value for gene
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubstanceReferenceInformation_Gene withGene(CodeableConcept value) {
    @Nullable CodeableConcept newValue = Objects.requireNonNull(value, "gene");
    if (this.gene == newValue) return this;
    return new ImmutableSubstanceReferenceInformation_Gene(this.source, this.id, newValue, this.modifierExtension, this.geneSequenceOrigin, this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SubstanceReferenceInformation_Gene#gene() gene} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for gene
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSubstanceReferenceInformation_Gene withGene(Optional<? extends CodeableConcept> optional) {
    @Nullable CodeableConcept value = optional.orElse(null);
    if (this.gene == value) return this;
    return new ImmutableSubstanceReferenceInformation_Gene(this.source, this.id, value, this.modifierExtension, this.geneSequenceOrigin, this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SubstanceReferenceInformation_Gene#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubstanceReferenceInformation_Gene withModifierExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableSubstanceReferenceInformation_Gene(this.source, this.id, this.gene, newValue, this.geneSequenceOrigin, this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SubstanceReferenceInformation_Gene#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSubstanceReferenceInformation_Gene withModifierExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableSubstanceReferenceInformation_Gene(this.source, this.id, this.gene, value, this.geneSequenceOrigin, this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SubstanceReferenceInformation_Gene#geneSequenceOrigin() geneSequenceOrigin} attribute.
   * @param value The value for geneSequenceOrigin
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubstanceReferenceInformation_Gene withGeneSequenceOrigin(CodeableConcept value) {
    @Nullable CodeableConcept newValue = Objects.requireNonNull(value, "geneSequenceOrigin");
    if (this.geneSequenceOrigin == newValue) return this;
    return new ImmutableSubstanceReferenceInformation_Gene(this.source, this.id, this.gene, this.modifierExtension, newValue, this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SubstanceReferenceInformation_Gene#geneSequenceOrigin() geneSequenceOrigin} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for geneSequenceOrigin
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSubstanceReferenceInformation_Gene withGeneSequenceOrigin(Optional<? extends CodeableConcept> optional) {
    @Nullable CodeableConcept value = optional.orElse(null);
    if (this.geneSequenceOrigin == value) return this;
    return new ImmutableSubstanceReferenceInformation_Gene(this.source, this.id, this.gene, this.modifierExtension, value, this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SubstanceReferenceInformation_Gene#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubstanceReferenceInformation_Gene withExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableSubstanceReferenceInformation_Gene(this.source, this.id, this.gene, this.modifierExtension, this.geneSequenceOrigin, newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SubstanceReferenceInformation_Gene#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSubstanceReferenceInformation_Gene withExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableSubstanceReferenceInformation_Gene(this.source, this.id, this.gene, this.modifierExtension, this.geneSequenceOrigin, value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableSubstanceReferenceInformation_Gene} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableSubstanceReferenceInformation_Gene
        && equalTo((ImmutableSubstanceReferenceInformation_Gene) another);
  }

  private boolean equalTo(ImmutableSubstanceReferenceInformation_Gene another) {
    return Objects.equals(source, another.source)
        && Objects.equals(id, another.id)
        && Objects.equals(gene, another.gene)
        && Objects.equals(modifierExtension, another.modifierExtension)
        && Objects.equals(geneSequenceOrigin, another.geneSequenceOrigin)
        && Objects.equals(extension, another.extension);
  }

  /**
   * Computes a hash code from attributes: {@code source}, {@code id}, {@code gene}, {@code modifierExtension}, {@code geneSequenceOrigin}, {@code extension}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(source);
    h += (h << 5) + Objects.hashCode(id);
    h += (h << 5) + Objects.hashCode(gene);
    h += (h << 5) + Objects.hashCode(modifierExtension);
    h += (h << 5) + Objects.hashCode(geneSequenceOrigin);
    h += (h << 5) + Objects.hashCode(extension);
    return h;
  }

  /**
   * Prints the immutable value {@code SubstanceReferenceInformation_Gene} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("SubstanceReferenceInformation_Gene{");
    if (source != null) {
      builder.append("source=").append(source);
    }
    if (id != null) {
      if (builder.length() > 35) builder.append(", ");
      builder.append("id=").append(id);
    }
    if (gene != null) {
      if (builder.length() > 35) builder.append(", ");
      builder.append("gene=").append(gene);
    }
    if (modifierExtension != null) {
      if (builder.length() > 35) builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (geneSequenceOrigin != null) {
      if (builder.length() > 35) builder.append(", ");
      builder.append("geneSequenceOrigin=").append(geneSequenceOrigin);
    }
    if (extension != null) {
      if (builder.length() > 35) builder.append(", ");
      builder.append("extension=").append(extension);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Generated(from = "SubstanceReferenceInformation_Gene", generator = "Immutables")
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements SubstanceReferenceInformation_Gene {
    @Nullable Optional<List<Reference>> source = Optional.empty();
    boolean sourceIsSet;
    @Nullable Optional<String> id = Optional.empty();
    boolean idIsSet;
    @Nullable Optional<CodeableConcept> gene = Optional.empty();
    boolean geneIsSet;
    @Nullable Optional<List<Extension>> modifierExtension = Optional.empty();
    boolean modifierExtensionIsSet;
    @Nullable Optional<CodeableConcept> geneSequenceOrigin = Optional.empty();
    boolean geneSequenceOriginIsSet;
    @Nullable Optional<List<Extension>> extension = Optional.empty();
    boolean extensionIsSet;
    @JsonProperty("source")
    public void setSource(Optional<List<Reference>> source) {
      this.source = source;
      this.sourceIsSet = true;
    }
    @JsonProperty("id")
    public void setId(Optional<String> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @JsonProperty("gene")
    public void setGene(Optional<CodeableConcept> gene) {
      this.gene = gene;
      this.geneIsSet = true;
    }
    @JsonProperty("modifierExtension")
    public void setModifierExtension(Optional<List<Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @JsonProperty("geneSequenceOrigin")
    public void setGeneSequenceOrigin(Optional<CodeableConcept> geneSequenceOrigin) {
      this.geneSequenceOrigin = geneSequenceOrigin;
      this.geneSequenceOriginIsSet = true;
    }
    @JsonProperty("extension")
    public void setExtension(Optional<List<Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @Override
    public Optional<List<Reference>> source() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> id() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<CodeableConcept> gene() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<CodeableConcept> geneSequenceOrigin() { throw new UnsupportedOperationException(); }
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
  static ImmutableSubstanceReferenceInformation_Gene fromJson(Json json) {
    ImmutableSubstanceReferenceInformation_Gene.Builder builder = ImmutableSubstanceReferenceInformation_Gene.builder();
    if (json.sourceIsSet) {
      builder.source(json.source);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.geneIsSet) {
      builder.gene(json.gene);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.geneSequenceOriginIsSet) {
      builder.geneSequenceOrigin(json.geneSequenceOrigin);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    return (ImmutableSubstanceReferenceInformation_Gene) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link SubstanceReferenceInformation_Gene} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable SubstanceReferenceInformation_Gene instance
   */
  public static SubstanceReferenceInformation_Gene copyOf(SubstanceReferenceInformation_Gene instance) {
    if (instance instanceof ImmutableSubstanceReferenceInformation_Gene) {
      return (ImmutableSubstanceReferenceInformation_Gene) instance;
    }
    return ImmutableSubstanceReferenceInformation_Gene.builder()
        .source(instance.source())
        .id(instance.id())
        .gene(instance.gene())
        .modifierExtension(instance.modifierExtension())
        .geneSequenceOrigin(instance.geneSequenceOrigin())
        .extension(instance.extension())
        .build();
  }

  /**
   * Creates a builder for {@link SubstanceReferenceInformation_Gene SubstanceReferenceInformation_Gene}.
   * <pre>
   * ImmutableSubstanceReferenceInformation_Gene.builder()
   *    .source(List&amp;lt;com.fhir.Reference&amp;gt;) // optional {@link SubstanceReferenceInformation_Gene#source() source}
   *    .id(String) // optional {@link SubstanceReferenceInformation_Gene#id() id}
   *    .gene(com.fhir.CodeableConcept) // optional {@link SubstanceReferenceInformation_Gene#gene() gene}
   *    .modifierExtension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link SubstanceReferenceInformation_Gene#modifierExtension() modifierExtension}
   *    .geneSequenceOrigin(com.fhir.CodeableConcept) // optional {@link SubstanceReferenceInformation_Gene#geneSequenceOrigin() geneSequenceOrigin}
   *    .extension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link SubstanceReferenceInformation_Gene#extension() extension}
   *    .build();
   * </pre>
   * @return A new SubstanceReferenceInformation_Gene builder
   */
  public static ImmutableSubstanceReferenceInformation_Gene.Builder builder() {
    return new ImmutableSubstanceReferenceInformation_Gene.Builder();
  }

  /**
   * Builds instances of type {@link SubstanceReferenceInformation_Gene SubstanceReferenceInformation_Gene}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "SubstanceReferenceInformation_Gene", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder {
    private static final long OPT_BIT_SOURCE = 0x1L;
    private static final long OPT_BIT_ID = 0x2L;
    private static final long OPT_BIT_GENE = 0x4L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x8L;
    private static final long OPT_BIT_GENE_SEQUENCE_ORIGIN = 0x10L;
    private static final long OPT_BIT_EXTENSION = 0x20L;
    private long optBits;

    private @Nullable List<Reference> source;
    private @Nullable String id;
    private @Nullable CodeableConcept gene;
    private @Nullable List<Extension> modifierExtension;
    private @Nullable CodeableConcept geneSequenceOrigin;
    private @Nullable List<Extension> extension;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link SubstanceReferenceInformation_Gene#source() source} to source.
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
     * Initializes the optional value {@link SubstanceReferenceInformation_Gene#source() source} to source.
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
     * Initializes the optional value {@link SubstanceReferenceInformation_Gene#id() id} to id.
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
     * Initializes the optional value {@link SubstanceReferenceInformation_Gene#id() id} to id.
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
     * Initializes the optional value {@link SubstanceReferenceInformation_Gene#gene() gene} to gene.
     * @param gene The value for gene
     * @return {@code this} builder for chained invocation
     */
    public final Builder gene(CodeableConcept gene) {
      checkNotIsSet(geneIsSet(), "gene");
      this.gene = Objects.requireNonNull(gene, "gene");
      optBits |= OPT_BIT_GENE;
      return this;
    }

    /**
     * Initializes the optional value {@link SubstanceReferenceInformation_Gene#gene() gene} to gene.
     * @param gene The value for gene
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("gene")
    public final Builder gene(Optional<? extends CodeableConcept> gene) {
      checkNotIsSet(geneIsSet(), "gene");
      this.gene = gene.orElse(null);
      optBits |= OPT_BIT_GENE;
      return this;
    }

    /**
     * Initializes the optional value {@link SubstanceReferenceInformation_Gene#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link SubstanceReferenceInformation_Gene#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link SubstanceReferenceInformation_Gene#geneSequenceOrigin() geneSequenceOrigin} to geneSequenceOrigin.
     * @param geneSequenceOrigin The value for geneSequenceOrigin
     * @return {@code this} builder for chained invocation
     */
    public final Builder geneSequenceOrigin(CodeableConcept geneSequenceOrigin) {
      checkNotIsSet(geneSequenceOriginIsSet(), "geneSequenceOrigin");
      this.geneSequenceOrigin = Objects.requireNonNull(geneSequenceOrigin, "geneSequenceOrigin");
      optBits |= OPT_BIT_GENE_SEQUENCE_ORIGIN;
      return this;
    }

    /**
     * Initializes the optional value {@link SubstanceReferenceInformation_Gene#geneSequenceOrigin() geneSequenceOrigin} to geneSequenceOrigin.
     * @param geneSequenceOrigin The value for geneSequenceOrigin
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("geneSequenceOrigin")
    public final Builder geneSequenceOrigin(Optional<? extends CodeableConcept> geneSequenceOrigin) {
      checkNotIsSet(geneSequenceOriginIsSet(), "geneSequenceOrigin");
      this.geneSequenceOrigin = geneSequenceOrigin.orElse(null);
      optBits |= OPT_BIT_GENE_SEQUENCE_ORIGIN;
      return this;
    }

    /**
     * Initializes the optional value {@link SubstanceReferenceInformation_Gene#extension() extension} to extension.
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
     * Initializes the optional value {@link SubstanceReferenceInformation_Gene#extension() extension} to extension.
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
     * Builds a new {@link SubstanceReferenceInformation_Gene SubstanceReferenceInformation_Gene}.
     * @return An immutable instance of SubstanceReferenceInformation_Gene
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public SubstanceReferenceInformation_Gene build() {
      return new ImmutableSubstanceReferenceInformation_Gene(source, id, gene, modifierExtension, geneSequenceOrigin, extension);
    }

    private boolean sourceIsSet() {
      return (optBits & OPT_BIT_SOURCE) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean geneIsSet() {
      return (optBits & OPT_BIT_GENE) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean geneSequenceOriginIsSet() {
      return (optBits & OPT_BIT_GENE_SEQUENCE_ORIGIN) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of SubstanceReferenceInformation_Gene is strict, attribute is already set: ".concat(name));
    }
  }
}
