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
 * Immutable implementation of {@link ConceptMap_Group}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableConceptMap_Group.builder()}.
 */
@Generated(from = "ConceptMap_Group", generator = "Immutables")
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableConceptMap_Group implements ConceptMap_Group {
  private final @Nullable Uri target;
  private final @Nullable List<Extension> extension;
  private final @Nullable ConceptMap_Unmapped unmapped;
  private final @Nullable String targetVersion;
  private final @Nullable Uri source;
  private final List<ConceptMap_Element> element;
  private final @Nullable List<Extension> modifierExtension;
  private final @Nullable String id;
  private final @Nullable String sourceVersion;

  private ImmutableConceptMap_Group(
      @Nullable Uri target,
      @Nullable List<Extension> extension,
      @Nullable ConceptMap_Unmapped unmapped,
      @Nullable String targetVersion,
      @Nullable Uri source,
      List<ConceptMap_Element> element,
      @Nullable List<Extension> modifierExtension,
      @Nullable String id,
      @Nullable String sourceVersion) {
    this.target = target;
    this.extension = extension;
    this.unmapped = unmapped;
    this.targetVersion = targetVersion;
    this.source = source;
    this.element = element;
    this.modifierExtension = modifierExtension;
    this.id = id;
    this.sourceVersion = sourceVersion;
  }

  /**
   * @return The value of the {@code target} attribute
   */
  @JsonProperty("target")
  @Override
  public Optional<Uri> target() {
    return Optional.ofNullable(target);
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
   * @return The value of the {@code unmapped} attribute
   */
  @JsonProperty("unmapped")
  @Override
  public Optional<ConceptMap_Unmapped> unmapped() {
    return Optional.ofNullable(unmapped);
  }

  /**
   * @return The value of the {@code targetVersion} attribute
   */
  @JsonProperty("targetVersion")
  @Override
  public Optional<String> targetVersion() {
    return Optional.ofNullable(targetVersion);
  }

  /**
   * @return The value of the {@code source} attribute
   */
  @JsonProperty("source")
  @Override
  public Optional<Uri> source() {
    return Optional.ofNullable(source);
  }

  /**
   * @return The value of the {@code element} attribute
   */
  @JsonProperty("element")
  @Override
  public List<ConceptMap_Element> element() {
    return element;
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
   * @return The value of the {@code sourceVersion} attribute
   */
  @JsonProperty("sourceVersion")
  @Override
  public Optional<String> sourceVersion() {
    return Optional.ofNullable(sourceVersion);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ConceptMap_Group#target() target} attribute.
   * @param value The value for target
   * @return A modified copy of {@code this} object
   */
  public final ImmutableConceptMap_Group withTarget(Uri value) {
    @Nullable Uri newValue = Objects.requireNonNull(value, "target");
    if (this.target == newValue) return this;
    return new ImmutableConceptMap_Group(
        newValue,
        this.extension,
        this.unmapped,
        this.targetVersion,
        this.source,
        this.element,
        this.modifierExtension,
        this.id,
        this.sourceVersion);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ConceptMap_Group#target() target} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for target
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableConceptMap_Group withTarget(Optional<? extends Uri> optional) {
    @Nullable Uri value = optional.orElse(null);
    if (this.target == value) return this;
    return new ImmutableConceptMap_Group(
        value,
        this.extension,
        this.unmapped,
        this.targetVersion,
        this.source,
        this.element,
        this.modifierExtension,
        this.id,
        this.sourceVersion);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ConceptMap_Group#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableConceptMap_Group withExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableConceptMap_Group(
        this.target,
        newValue,
        this.unmapped,
        this.targetVersion,
        this.source,
        this.element,
        this.modifierExtension,
        this.id,
        this.sourceVersion);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ConceptMap_Group#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableConceptMap_Group withExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableConceptMap_Group(
        this.target,
        value,
        this.unmapped,
        this.targetVersion,
        this.source,
        this.element,
        this.modifierExtension,
        this.id,
        this.sourceVersion);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ConceptMap_Group#unmapped() unmapped} attribute.
   * @param value The value for unmapped
   * @return A modified copy of {@code this} object
   */
  public final ImmutableConceptMap_Group withUnmapped(ConceptMap_Unmapped value) {
    @Nullable ConceptMap_Unmapped newValue = Objects.requireNonNull(value, "unmapped");
    if (this.unmapped == newValue) return this;
    return new ImmutableConceptMap_Group(
        this.target,
        this.extension,
        newValue,
        this.targetVersion,
        this.source,
        this.element,
        this.modifierExtension,
        this.id,
        this.sourceVersion);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ConceptMap_Group#unmapped() unmapped} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for unmapped
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableConceptMap_Group withUnmapped(Optional<? extends ConceptMap_Unmapped> optional) {
    @Nullable ConceptMap_Unmapped value = optional.orElse(null);
    if (this.unmapped == value) return this;
    return new ImmutableConceptMap_Group(
        this.target,
        this.extension,
        value,
        this.targetVersion,
        this.source,
        this.element,
        this.modifierExtension,
        this.id,
        this.sourceVersion);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ConceptMap_Group#targetVersion() targetVersion} attribute.
   * @param value The value for targetVersion
   * @return A modified copy of {@code this} object
   */
  public final ImmutableConceptMap_Group withTargetVersion(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "targetVersion");
    if (Objects.equals(this.targetVersion, newValue)) return this;
    return new ImmutableConceptMap_Group(
        this.target,
        this.extension,
        this.unmapped,
        newValue,
        this.source,
        this.element,
        this.modifierExtension,
        this.id,
        this.sourceVersion);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ConceptMap_Group#targetVersion() targetVersion} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for targetVersion
   * @return A modified copy of {@code this} object
   */
  public final ImmutableConceptMap_Group withTargetVersion(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.targetVersion, value)) return this;
    return new ImmutableConceptMap_Group(
        this.target,
        this.extension,
        this.unmapped,
        value,
        this.source,
        this.element,
        this.modifierExtension,
        this.id,
        this.sourceVersion);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ConceptMap_Group#source() source} attribute.
   * @param value The value for source
   * @return A modified copy of {@code this} object
   */
  public final ImmutableConceptMap_Group withSource(Uri value) {
    @Nullable Uri newValue = Objects.requireNonNull(value, "source");
    if (this.source == newValue) return this;
    return new ImmutableConceptMap_Group(
        this.target,
        this.extension,
        this.unmapped,
        this.targetVersion,
        newValue,
        this.element,
        this.modifierExtension,
        this.id,
        this.sourceVersion);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ConceptMap_Group#source() source} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for source
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableConceptMap_Group withSource(Optional<? extends Uri> optional) {
    @Nullable Uri value = optional.orElse(null);
    if (this.source == value) return this;
    return new ImmutableConceptMap_Group(
        this.target,
        this.extension,
        this.unmapped,
        this.targetVersion,
        value,
        this.element,
        this.modifierExtension,
        this.id,
        this.sourceVersion);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link ConceptMap_Group#element() element}.
   * @param elements The elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableConceptMap_Group withElement(ConceptMap_Element... elements) {
    List<ConceptMap_Element> newValue = createUnmodifiableList(false, createSafeList(Arrays.asList(elements), true, false));
    return new ImmutableConceptMap_Group(
        this.target,
        this.extension,
        this.unmapped,
        this.targetVersion,
        this.source,
        newValue,
        this.modifierExtension,
        this.id,
        this.sourceVersion);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link ConceptMap_Group#element() element}.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param elements An iterable of element elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableConceptMap_Group withElement(Iterable<? extends ConceptMap_Element> elements) {
    if (this.element == elements) return this;
    List<ConceptMap_Element> newValue = createUnmodifiableList(false, createSafeList(elements, true, false));
    return new ImmutableConceptMap_Group(
        this.target,
        this.extension,
        this.unmapped,
        this.targetVersion,
        this.source,
        newValue,
        this.modifierExtension,
        this.id,
        this.sourceVersion);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ConceptMap_Group#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableConceptMap_Group withModifierExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableConceptMap_Group(
        this.target,
        this.extension,
        this.unmapped,
        this.targetVersion,
        this.source,
        this.element,
        newValue,
        this.id,
        this.sourceVersion);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ConceptMap_Group#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableConceptMap_Group withModifierExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableConceptMap_Group(
        this.target,
        this.extension,
        this.unmapped,
        this.targetVersion,
        this.source,
        this.element,
        value,
        this.id,
        this.sourceVersion);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ConceptMap_Group#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableConceptMap_Group withId(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "id");
    if (Objects.equals(this.id, newValue)) return this;
    return new ImmutableConceptMap_Group(
        this.target,
        this.extension,
        this.unmapped,
        this.targetVersion,
        this.source,
        this.element,
        this.modifierExtension,
        newValue,
        this.sourceVersion);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ConceptMap_Group#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableConceptMap_Group withId(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.id, value)) return this;
    return new ImmutableConceptMap_Group(
        this.target,
        this.extension,
        this.unmapped,
        this.targetVersion,
        this.source,
        this.element,
        this.modifierExtension,
        value,
        this.sourceVersion);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ConceptMap_Group#sourceVersion() sourceVersion} attribute.
   * @param value The value for sourceVersion
   * @return A modified copy of {@code this} object
   */
  public final ImmutableConceptMap_Group withSourceVersion(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "sourceVersion");
    if (Objects.equals(this.sourceVersion, newValue)) return this;
    return new ImmutableConceptMap_Group(
        this.target,
        this.extension,
        this.unmapped,
        this.targetVersion,
        this.source,
        this.element,
        this.modifierExtension,
        this.id,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ConceptMap_Group#sourceVersion() sourceVersion} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for sourceVersion
   * @return A modified copy of {@code this} object
   */
  public final ImmutableConceptMap_Group withSourceVersion(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.sourceVersion, value)) return this;
    return new ImmutableConceptMap_Group(
        this.target,
        this.extension,
        this.unmapped,
        this.targetVersion,
        this.source,
        this.element,
        this.modifierExtension,
        this.id,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableConceptMap_Group} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableConceptMap_Group
        && equalTo((ImmutableConceptMap_Group) another);
  }

  private boolean equalTo(ImmutableConceptMap_Group another) {
    return Objects.equals(target, another.target)
        && Objects.equals(extension, another.extension)
        && Objects.equals(unmapped, another.unmapped)
        && Objects.equals(targetVersion, another.targetVersion)
        && Objects.equals(source, another.source)
        && element.equals(another.element)
        && Objects.equals(modifierExtension, another.modifierExtension)
        && Objects.equals(id, another.id)
        && Objects.equals(sourceVersion, another.sourceVersion);
  }

  /**
   * Computes a hash code from attributes: {@code target}, {@code extension}, {@code unmapped}, {@code targetVersion}, {@code source}, {@code element}, {@code modifierExtension}, {@code id}, {@code sourceVersion}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(target);
    h += (h << 5) + Objects.hashCode(extension);
    h += (h << 5) + Objects.hashCode(unmapped);
    h += (h << 5) + Objects.hashCode(targetVersion);
    h += (h << 5) + Objects.hashCode(source);
    h += (h << 5) + element.hashCode();
    h += (h << 5) + Objects.hashCode(modifierExtension);
    h += (h << 5) + Objects.hashCode(id);
    h += (h << 5) + Objects.hashCode(sourceVersion);
    return h;
  }

  /**
   * Prints the immutable value {@code ConceptMap_Group} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("ConceptMap_Group{");
    if (target != null) {
      builder.append("target=").append(target);
    }
    if (extension != null) {
      if (builder.length() > 17) builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (unmapped != null) {
      if (builder.length() > 17) builder.append(", ");
      builder.append("unmapped=").append(unmapped);
    }
    if (targetVersion != null) {
      if (builder.length() > 17) builder.append(", ");
      builder.append("targetVersion=").append(targetVersion);
    }
    if (source != null) {
      if (builder.length() > 17) builder.append(", ");
      builder.append("source=").append(source);
    }
    if (builder.length() > 17) builder.append(", ");
    builder.append("element=").append(element);
    if (modifierExtension != null) {
      builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (id != null) {
      builder.append(", ");
      builder.append("id=").append(id);
    }
    if (sourceVersion != null) {
      builder.append(", ");
      builder.append("sourceVersion=").append(sourceVersion);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Generated(from = "ConceptMap_Group", generator = "Immutables")
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements ConceptMap_Group {
    @Nullable Optional<Uri> target = Optional.empty();
    boolean targetIsSet;
    @Nullable Optional<List<Extension>> extension = Optional.empty();
    boolean extensionIsSet;
    @Nullable Optional<ConceptMap_Unmapped> unmapped = Optional.empty();
    boolean unmappedIsSet;
    @Nullable Optional<String> targetVersion = Optional.empty();
    boolean targetVersionIsSet;
    @Nullable Optional<Uri> source = Optional.empty();
    boolean sourceIsSet;
    @Nullable List<ConceptMap_Element> element = Collections.emptyList();
    @Nullable Optional<List<Extension>> modifierExtension = Optional.empty();
    boolean modifierExtensionIsSet;
    @Nullable Optional<String> id = Optional.empty();
    boolean idIsSet;
    @Nullable Optional<String> sourceVersion = Optional.empty();
    boolean sourceVersionIsSet;
    @JsonProperty("target")
    public void setTarget(Optional<Uri> target) {
      this.target = target;
      this.targetIsSet = true;
    }
    @JsonProperty("extension")
    public void setExtension(Optional<List<Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @JsonProperty("unmapped")
    public void setUnmapped(Optional<ConceptMap_Unmapped> unmapped) {
      this.unmapped = unmapped;
      this.unmappedIsSet = true;
    }
    @JsonProperty("targetVersion")
    public void setTargetVersion(Optional<String> targetVersion) {
      this.targetVersion = targetVersion;
      this.targetVersionIsSet = true;
    }
    @JsonProperty("source")
    public void setSource(Optional<Uri> source) {
      this.source = source;
      this.sourceIsSet = true;
    }
    @JsonProperty("element")
    public void setElement(List<ConceptMap_Element> element) {
      this.element = element;
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
    @JsonProperty("sourceVersion")
    public void setSourceVersion(Optional<String> sourceVersion) {
      this.sourceVersion = sourceVersion;
      this.sourceVersionIsSet = true;
    }
    @Override
    public Optional<Uri> target() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<ConceptMap_Unmapped> unmapped() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> targetVersion() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Uri> source() { throw new UnsupportedOperationException(); }
    @Override
    public List<ConceptMap_Element> element() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> id() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> sourceVersion() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableConceptMap_Group fromJson(Json json) {
    ImmutableConceptMap_Group.Builder builder = ImmutableConceptMap_Group.builder();
    if (json.targetIsSet) {
      builder.target(json.target);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.unmappedIsSet) {
      builder.unmapped(json.unmapped);
    }
    if (json.targetVersionIsSet) {
      builder.targetVersion(json.targetVersion);
    }
    if (json.sourceIsSet) {
      builder.source(json.source);
    }
    if (json.element != null) {
      builder.addAllElement(json.element);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.sourceVersionIsSet) {
      builder.sourceVersion(json.sourceVersion);
    }
    return (ImmutableConceptMap_Group) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link ConceptMap_Group} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable ConceptMap_Group instance
   */
  public static ConceptMap_Group copyOf(ConceptMap_Group instance) {
    if (instance instanceof ImmutableConceptMap_Group) {
      return (ImmutableConceptMap_Group) instance;
    }
    return ImmutableConceptMap_Group.builder()
        .target(instance.target())
        .extension(instance.extension())
        .unmapped(instance.unmapped())
        .targetVersion(instance.targetVersion())
        .source(instance.source())
        .addAllElement(instance.element())
        .modifierExtension(instance.modifierExtension())
        .id(instance.id())
        .sourceVersion(instance.sourceVersion())
        .build();
  }

  /**
   * Creates a builder for {@link ConceptMap_Group ConceptMap_Group}.
   * <pre>
   * ImmutableConceptMap_Group.builder()
   *    .target(com.medplum.types.fhir.Uri) // optional {@link ConceptMap_Group#target() target}
   *    .extension(List&amp;lt;com.medplum.types.fhir.Extension&amp;gt;) // optional {@link ConceptMap_Group#extension() extension}
   *    .unmapped(com.medplum.types.fhir.ConceptMap_Unmapped) // optional {@link ConceptMap_Group#unmapped() unmapped}
   *    .targetVersion(String) // optional {@link ConceptMap_Group#targetVersion() targetVersion}
   *    .source(com.medplum.types.fhir.Uri) // optional {@link ConceptMap_Group#source() source}
   *    .addElement|addAllElement(com.medplum.types.fhir.ConceptMap_Element) // {@link ConceptMap_Group#element() element} elements
   *    .modifierExtension(List&amp;lt;com.medplum.types.fhir.Extension&amp;gt;) // optional {@link ConceptMap_Group#modifierExtension() modifierExtension}
   *    .id(String) // optional {@link ConceptMap_Group#id() id}
   *    .sourceVersion(String) // optional {@link ConceptMap_Group#sourceVersion() sourceVersion}
   *    .build();
   * </pre>
   * @return A new ConceptMap_Group builder
   */
  public static ImmutableConceptMap_Group.Builder builder() {
    return new ImmutableConceptMap_Group.Builder();
  }

  /**
   * Builds instances of type {@link ConceptMap_Group ConceptMap_Group}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "ConceptMap_Group", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder {
    private static final long OPT_BIT_TARGET = 0x1L;
    private static final long OPT_BIT_EXTENSION = 0x2L;
    private static final long OPT_BIT_UNMAPPED = 0x4L;
    private static final long OPT_BIT_TARGET_VERSION = 0x8L;
    private static final long OPT_BIT_SOURCE = 0x10L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x20L;
    private static final long OPT_BIT_ID = 0x40L;
    private static final long OPT_BIT_SOURCE_VERSION = 0x80L;
    private long optBits;

    private @Nullable Uri target;
    private @Nullable List<Extension> extension;
    private @Nullable ConceptMap_Unmapped unmapped;
    private @Nullable String targetVersion;
    private @Nullable Uri source;
    private final List<ConceptMap_Element> element = new ArrayList<ConceptMap_Element>();
    private @Nullable List<Extension> modifierExtension;
    private @Nullable String id;
    private @Nullable String sourceVersion;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link ConceptMap_Group#target() target} to target.
     * @param target The value for target
     * @return {@code this} builder for chained invocation
     */
    public final Builder target(Uri target) {
      checkNotIsSet(targetIsSet(), "target");
      this.target = Objects.requireNonNull(target, "target");
      optBits |= OPT_BIT_TARGET;
      return this;
    }

    /**
     * Initializes the optional value {@link ConceptMap_Group#target() target} to target.
     * @param target The value for target
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("target")
    public final Builder target(Optional<? extends Uri> target) {
      checkNotIsSet(targetIsSet(), "target");
      this.target = target.orElse(null);
      optBits |= OPT_BIT_TARGET;
      return this;
    }

    /**
     * Initializes the optional value {@link ConceptMap_Group#extension() extension} to extension.
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
     * Initializes the optional value {@link ConceptMap_Group#extension() extension} to extension.
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
     * Initializes the optional value {@link ConceptMap_Group#unmapped() unmapped} to unmapped.
     * @param unmapped The value for unmapped
     * @return {@code this} builder for chained invocation
     */
    public final Builder unmapped(ConceptMap_Unmapped unmapped) {
      checkNotIsSet(unmappedIsSet(), "unmapped");
      this.unmapped = Objects.requireNonNull(unmapped, "unmapped");
      optBits |= OPT_BIT_UNMAPPED;
      return this;
    }

    /**
     * Initializes the optional value {@link ConceptMap_Group#unmapped() unmapped} to unmapped.
     * @param unmapped The value for unmapped
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("unmapped")
    public final Builder unmapped(Optional<? extends ConceptMap_Unmapped> unmapped) {
      checkNotIsSet(unmappedIsSet(), "unmapped");
      this.unmapped = unmapped.orElse(null);
      optBits |= OPT_BIT_UNMAPPED;
      return this;
    }

    /**
     * Initializes the optional value {@link ConceptMap_Group#targetVersion() targetVersion} to targetVersion.
     * @param targetVersion The value for targetVersion
     * @return {@code this} builder for chained invocation
     */
    public final Builder targetVersion(String targetVersion) {
      checkNotIsSet(targetVersionIsSet(), "targetVersion");
      this.targetVersion = Objects.requireNonNull(targetVersion, "targetVersion");
      optBits |= OPT_BIT_TARGET_VERSION;
      return this;
    }

    /**
     * Initializes the optional value {@link ConceptMap_Group#targetVersion() targetVersion} to targetVersion.
     * @param targetVersion The value for targetVersion
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("targetVersion")
    public final Builder targetVersion(Optional<String> targetVersion) {
      checkNotIsSet(targetVersionIsSet(), "targetVersion");
      this.targetVersion = targetVersion.orElse(null);
      optBits |= OPT_BIT_TARGET_VERSION;
      return this;
    }

    /**
     * Initializes the optional value {@link ConceptMap_Group#source() source} to source.
     * @param source The value for source
     * @return {@code this} builder for chained invocation
     */
    public final Builder source(Uri source) {
      checkNotIsSet(sourceIsSet(), "source");
      this.source = Objects.requireNonNull(source, "source");
      optBits |= OPT_BIT_SOURCE;
      return this;
    }

    /**
     * Initializes the optional value {@link ConceptMap_Group#source() source} to source.
     * @param source The value for source
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("source")
    public final Builder source(Optional<? extends Uri> source) {
      checkNotIsSet(sourceIsSet(), "source");
      this.source = source.orElse(null);
      optBits |= OPT_BIT_SOURCE;
      return this;
    }

    /**
     * Adds one element to {@link ConceptMap_Group#element() element} list.
     * @param element A element element
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addElement(ConceptMap_Element element) {
      this.element.add(Objects.requireNonNull(element, "element element"));
      return this;
    }

    /**
     * Adds elements to {@link ConceptMap_Group#element() element} list.
     * @param elements An array of element elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addElement(ConceptMap_Element... elements) {
      for (ConceptMap_Element element : elements) {
        this.element.add(Objects.requireNonNull(element, "element element"));
      }
      return this;
    }


    /**
     * Adds elements to {@link ConceptMap_Group#element() element} list.
     * @param elements An iterable of element elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addAllElement(Iterable<? extends ConceptMap_Element> elements) {
      for (ConceptMap_Element element : elements) {
        this.element.add(Objects.requireNonNull(element, "element element"));
      }
      return this;
    }

    /**
     * Initializes the optional value {@link ConceptMap_Group#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link ConceptMap_Group#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link ConceptMap_Group#id() id} to id.
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
     * Initializes the optional value {@link ConceptMap_Group#id() id} to id.
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
     * Initializes the optional value {@link ConceptMap_Group#sourceVersion() sourceVersion} to sourceVersion.
     * @param sourceVersion The value for sourceVersion
     * @return {@code this} builder for chained invocation
     */
    public final Builder sourceVersion(String sourceVersion) {
      checkNotIsSet(sourceVersionIsSet(), "sourceVersion");
      this.sourceVersion = Objects.requireNonNull(sourceVersion, "sourceVersion");
      optBits |= OPT_BIT_SOURCE_VERSION;
      return this;
    }

    /**
     * Initializes the optional value {@link ConceptMap_Group#sourceVersion() sourceVersion} to sourceVersion.
     * @param sourceVersion The value for sourceVersion
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("sourceVersion")
    public final Builder sourceVersion(Optional<String> sourceVersion) {
      checkNotIsSet(sourceVersionIsSet(), "sourceVersion");
      this.sourceVersion = sourceVersion.orElse(null);
      optBits |= OPT_BIT_SOURCE_VERSION;
      return this;
    }

    /**
     * Builds a new {@link ConceptMap_Group ConceptMap_Group}.
     * @return An immutable instance of ConceptMap_Group
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ConceptMap_Group build() {
      return new ImmutableConceptMap_Group(
          target,
          extension,
          unmapped,
          targetVersion,
          source,
          createUnmodifiableList(true, element),
          modifierExtension,
          id,
          sourceVersion);
    }

    private boolean targetIsSet() {
      return (optBits & OPT_BIT_TARGET) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean unmappedIsSet() {
      return (optBits & OPT_BIT_UNMAPPED) != 0;
    }

    private boolean targetVersionIsSet() {
      return (optBits & OPT_BIT_TARGET_VERSION) != 0;
    }

    private boolean sourceIsSet() {
      return (optBits & OPT_BIT_SOURCE) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean sourceVersionIsSet() {
      return (optBits & OPT_BIT_SOURCE_VERSION) != 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of ConceptMap_Group is strict, attribute is already set: ".concat(name));
    }
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
