package com.fhir.types.fhir;

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
 * Immutable implementation of {@link StructureMap_Rule}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableStructureMap_Rule.builder()}.
 */
@Generated(from = "StructureMap_Rule", generator = "Immutables")
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableStructureMap_Rule implements StructureMap_Rule {
  private final @Nullable String id;
  private final @Nullable String documentation;
  private final @Nullable List<Extension> extension;
  private final @Nullable List<StructureMap_Dependent> dependent;
  private final List<StructureMap_Source> source;
  private final @Nullable List<StructureMap_Target> target;
  private final @Nullable List<Extension> modifierExtension;
  private final @Nullable Id name;
  private final @Nullable List<StructureMap_Rule> rule;

  private ImmutableStructureMap_Rule(
      @Nullable String id,
      @Nullable String documentation,
      @Nullable List<Extension> extension,
      @Nullable List<StructureMap_Dependent> dependent,
      List<StructureMap_Source> source,
      @Nullable List<StructureMap_Target> target,
      @Nullable List<Extension> modifierExtension,
      @Nullable Id name,
      @Nullable List<StructureMap_Rule> rule) {
    this.id = id;
    this.documentation = documentation;
    this.extension = extension;
    this.dependent = dependent;
    this.source = source;
    this.target = target;
    this.modifierExtension = modifierExtension;
    this.name = name;
    this.rule = rule;
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
   * @return The value of the {@code documentation} attribute
   */
  @JsonProperty("documentation")
  @Override
  public Optional<String> documentation() {
    return Optional.ofNullable(documentation);
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
   * @return The value of the {@code dependent} attribute
   */
  @JsonProperty("dependent")
  @Override
  public Optional<List<StructureMap_Dependent>> dependent() {
    return Optional.ofNullable(dependent);
  }

  /**
   * @return The value of the {@code source} attribute
   */
  @JsonProperty("source")
  @Override
  public List<StructureMap_Source> source() {
    return source;
  }

  /**
   * @return The value of the {@code target} attribute
   */
  @JsonProperty("target")
  @Override
  public Optional<List<StructureMap_Target>> target() {
    return Optional.ofNullable(target);
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
   * @return The value of the {@code name} attribute
   */
  @JsonProperty("name")
  @Override
  public Optional<Id> name() {
    return Optional.ofNullable(name);
  }

  /**
   * @return The value of the {@code rule} attribute
   */
  @JsonProperty("rule")
  @Override
  public Optional<List<StructureMap_Rule>> rule() {
    return Optional.ofNullable(rule);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link StructureMap_Rule#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableStructureMap_Rule withId(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "id");
    if (Objects.equals(this.id, newValue)) return this;
    return new ImmutableStructureMap_Rule(
        newValue,
        this.documentation,
        this.extension,
        this.dependent,
        this.source,
        this.target,
        this.modifierExtension,
        this.name,
        this.rule);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link StructureMap_Rule#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableStructureMap_Rule withId(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.id, value)) return this;
    return new ImmutableStructureMap_Rule(
        value,
        this.documentation,
        this.extension,
        this.dependent,
        this.source,
        this.target,
        this.modifierExtension,
        this.name,
        this.rule);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link StructureMap_Rule#documentation() documentation} attribute.
   * @param value The value for documentation
   * @return A modified copy of {@code this} object
   */
  public final ImmutableStructureMap_Rule withDocumentation(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "documentation");
    if (Objects.equals(this.documentation, newValue)) return this;
    return new ImmutableStructureMap_Rule(
        this.id,
        newValue,
        this.extension,
        this.dependent,
        this.source,
        this.target,
        this.modifierExtension,
        this.name,
        this.rule);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link StructureMap_Rule#documentation() documentation} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for documentation
   * @return A modified copy of {@code this} object
   */
  public final ImmutableStructureMap_Rule withDocumentation(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.documentation, value)) return this;
    return new ImmutableStructureMap_Rule(
        this.id,
        value,
        this.extension,
        this.dependent,
        this.source,
        this.target,
        this.modifierExtension,
        this.name,
        this.rule);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link StructureMap_Rule#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableStructureMap_Rule withExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableStructureMap_Rule(
        this.id,
        this.documentation,
        newValue,
        this.dependent,
        this.source,
        this.target,
        this.modifierExtension,
        this.name,
        this.rule);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link StructureMap_Rule#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableStructureMap_Rule withExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableStructureMap_Rule(
        this.id,
        this.documentation,
        value,
        this.dependent,
        this.source,
        this.target,
        this.modifierExtension,
        this.name,
        this.rule);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link StructureMap_Rule#dependent() dependent} attribute.
   * @param value The value for dependent
   * @return A modified copy of {@code this} object
   */
  public final ImmutableStructureMap_Rule withDependent(List<StructureMap_Dependent> value) {
    @Nullable List<StructureMap_Dependent> newValue = Objects.requireNonNull(value, "dependent");
    if (this.dependent == newValue) return this;
    return new ImmutableStructureMap_Rule(
        this.id,
        this.documentation,
        this.extension,
        newValue,
        this.source,
        this.target,
        this.modifierExtension,
        this.name,
        this.rule);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link StructureMap_Rule#dependent() dependent} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for dependent
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableStructureMap_Rule withDependent(Optional<? extends List<StructureMap_Dependent>> optional) {
    @Nullable List<StructureMap_Dependent> value = optional.orElse(null);
    if (this.dependent == value) return this;
    return new ImmutableStructureMap_Rule(
        this.id,
        this.documentation,
        this.extension,
        value,
        this.source,
        this.target,
        this.modifierExtension,
        this.name,
        this.rule);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link StructureMap_Rule#source() source}.
   * @param elements The elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableStructureMap_Rule withSource(StructureMap_Source... elements) {
    List<StructureMap_Source> newValue = createUnmodifiableList(false, createSafeList(Arrays.asList(elements), true, false));
    return new ImmutableStructureMap_Rule(
        this.id,
        this.documentation,
        this.extension,
        this.dependent,
        newValue,
        this.target,
        this.modifierExtension,
        this.name,
        this.rule);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link StructureMap_Rule#source() source}.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param elements An iterable of source elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableStructureMap_Rule withSource(Iterable<? extends StructureMap_Source> elements) {
    if (this.source == elements) return this;
    List<StructureMap_Source> newValue = createUnmodifiableList(false, createSafeList(elements, true, false));
    return new ImmutableStructureMap_Rule(
        this.id,
        this.documentation,
        this.extension,
        this.dependent,
        newValue,
        this.target,
        this.modifierExtension,
        this.name,
        this.rule);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link StructureMap_Rule#target() target} attribute.
   * @param value The value for target
   * @return A modified copy of {@code this} object
   */
  public final ImmutableStructureMap_Rule withTarget(List<StructureMap_Target> value) {
    @Nullable List<StructureMap_Target> newValue = Objects.requireNonNull(value, "target");
    if (this.target == newValue) return this;
    return new ImmutableStructureMap_Rule(
        this.id,
        this.documentation,
        this.extension,
        this.dependent,
        this.source,
        newValue,
        this.modifierExtension,
        this.name,
        this.rule);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link StructureMap_Rule#target() target} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for target
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableStructureMap_Rule withTarget(Optional<? extends List<StructureMap_Target>> optional) {
    @Nullable List<StructureMap_Target> value = optional.orElse(null);
    if (this.target == value) return this;
    return new ImmutableStructureMap_Rule(
        this.id,
        this.documentation,
        this.extension,
        this.dependent,
        this.source,
        value,
        this.modifierExtension,
        this.name,
        this.rule);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link StructureMap_Rule#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableStructureMap_Rule withModifierExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableStructureMap_Rule(
        this.id,
        this.documentation,
        this.extension,
        this.dependent,
        this.source,
        this.target,
        newValue,
        this.name,
        this.rule);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link StructureMap_Rule#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableStructureMap_Rule withModifierExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableStructureMap_Rule(
        this.id,
        this.documentation,
        this.extension,
        this.dependent,
        this.source,
        this.target,
        value,
        this.name,
        this.rule);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link StructureMap_Rule#name() name} attribute.
   * @param value The value for name
   * @return A modified copy of {@code this} object
   */
  public final ImmutableStructureMap_Rule withName(Id value) {
    @Nullable Id newValue = Objects.requireNonNull(value, "name");
    if (this.name == newValue) return this;
    return new ImmutableStructureMap_Rule(
        this.id,
        this.documentation,
        this.extension,
        this.dependent,
        this.source,
        this.target,
        this.modifierExtension,
        newValue,
        this.rule);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link StructureMap_Rule#name() name} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for name
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableStructureMap_Rule withName(Optional<? extends Id> optional) {
    @Nullable Id value = optional.orElse(null);
    if (this.name == value) return this;
    return new ImmutableStructureMap_Rule(
        this.id,
        this.documentation,
        this.extension,
        this.dependent,
        this.source,
        this.target,
        this.modifierExtension,
        value,
        this.rule);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link StructureMap_Rule#rule() rule} attribute.
   * @param value The value for rule
   * @return A modified copy of {@code this} object
   */
  public final ImmutableStructureMap_Rule withRule(List<StructureMap_Rule> value) {
    @Nullable List<StructureMap_Rule> newValue = Objects.requireNonNull(value, "rule");
    if (this.rule == newValue) return this;
    return new ImmutableStructureMap_Rule(
        this.id,
        this.documentation,
        this.extension,
        this.dependent,
        this.source,
        this.target,
        this.modifierExtension,
        this.name,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link StructureMap_Rule#rule() rule} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for rule
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableStructureMap_Rule withRule(Optional<? extends List<StructureMap_Rule>> optional) {
    @Nullable List<StructureMap_Rule> value = optional.orElse(null);
    if (this.rule == value) return this;
    return new ImmutableStructureMap_Rule(
        this.id,
        this.documentation,
        this.extension,
        this.dependent,
        this.source,
        this.target,
        this.modifierExtension,
        this.name,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableStructureMap_Rule} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableStructureMap_Rule
        && equalTo((ImmutableStructureMap_Rule) another);
  }

  private boolean equalTo(ImmutableStructureMap_Rule another) {
    return Objects.equals(id, another.id)
        && Objects.equals(documentation, another.documentation)
        && Objects.equals(extension, another.extension)
        && Objects.equals(dependent, another.dependent)
        && source.equals(another.source)
        && Objects.equals(target, another.target)
        && Objects.equals(modifierExtension, another.modifierExtension)
        && Objects.equals(name, another.name)
        && Objects.equals(rule, another.rule);
  }

  /**
   * Computes a hash code from attributes: {@code id}, {@code documentation}, {@code extension}, {@code dependent}, {@code source}, {@code target}, {@code modifierExtension}, {@code name}, {@code rule}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(id);
    h += (h << 5) + Objects.hashCode(documentation);
    h += (h << 5) + Objects.hashCode(extension);
    h += (h << 5) + Objects.hashCode(dependent);
    h += (h << 5) + source.hashCode();
    h += (h << 5) + Objects.hashCode(target);
    h += (h << 5) + Objects.hashCode(modifierExtension);
    h += (h << 5) + Objects.hashCode(name);
    h += (h << 5) + Objects.hashCode(rule);
    return h;
  }

  /**
   * Prints the immutable value {@code StructureMap_Rule} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("StructureMap_Rule{");
    if (id != null) {
      builder.append("id=").append(id);
    }
    if (documentation != null) {
      if (builder.length() > 18) builder.append(", ");
      builder.append("documentation=").append(documentation);
    }
    if (extension != null) {
      if (builder.length() > 18) builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (dependent != null) {
      if (builder.length() > 18) builder.append(", ");
      builder.append("dependent=").append(dependent);
    }
    if (builder.length() > 18) builder.append(", ");
    builder.append("source=").append(source);
    if (target != null) {
      builder.append(", ");
      builder.append("target=").append(target);
    }
    if (modifierExtension != null) {
      builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (name != null) {
      builder.append(", ");
      builder.append("name=").append(name);
    }
    if (rule != null) {
      builder.append(", ");
      builder.append("rule=").append(rule);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Generated(from = "StructureMap_Rule", generator = "Immutables")
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements StructureMap_Rule {
    @Nullable Optional<String> id = Optional.empty();
    boolean idIsSet;
    @Nullable Optional<String> documentation = Optional.empty();
    boolean documentationIsSet;
    @Nullable Optional<List<Extension>> extension = Optional.empty();
    boolean extensionIsSet;
    @Nullable Optional<List<StructureMap_Dependent>> dependent = Optional.empty();
    boolean dependentIsSet;
    @Nullable List<StructureMap_Source> source = Collections.emptyList();
    @Nullable Optional<List<StructureMap_Target>> target = Optional.empty();
    boolean targetIsSet;
    @Nullable Optional<List<Extension>> modifierExtension = Optional.empty();
    boolean modifierExtensionIsSet;
    @Nullable Optional<Id> name = Optional.empty();
    boolean nameIsSet;
    @Nullable Optional<List<StructureMap_Rule>> rule = Optional.empty();
    boolean ruleIsSet;
    @JsonProperty("id")
    public void setId(Optional<String> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @JsonProperty("documentation")
    public void setDocumentation(Optional<String> documentation) {
      this.documentation = documentation;
      this.documentationIsSet = true;
    }
    @JsonProperty("extension")
    public void setExtension(Optional<List<Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @JsonProperty("dependent")
    public void setDependent(Optional<List<StructureMap_Dependent>> dependent) {
      this.dependent = dependent;
      this.dependentIsSet = true;
    }
    @JsonProperty("source")
    public void setSource(List<StructureMap_Source> source) {
      this.source = source;
    }
    @JsonProperty("target")
    public void setTarget(Optional<List<StructureMap_Target>> target) {
      this.target = target;
      this.targetIsSet = true;
    }
    @JsonProperty("modifierExtension")
    public void setModifierExtension(Optional<List<Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @JsonProperty("name")
    public void setName(Optional<Id> name) {
      this.name = name;
      this.nameIsSet = true;
    }
    @JsonProperty("rule")
    public void setRule(Optional<List<StructureMap_Rule>> rule) {
      this.rule = rule;
      this.ruleIsSet = true;
    }
    @Override
    public Optional<String> id() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> documentation() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<StructureMap_Dependent>> dependent() { throw new UnsupportedOperationException(); }
    @Override
    public List<StructureMap_Source> source() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<StructureMap_Target>> target() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Id> name() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<StructureMap_Rule>> rule() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableStructureMap_Rule fromJson(Json json) {
    ImmutableStructureMap_Rule.Builder builder = ImmutableStructureMap_Rule.builder();
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.documentationIsSet) {
      builder.documentation(json.documentation);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.dependentIsSet) {
      builder.dependent(json.dependent);
    }
    if (json.source != null) {
      builder.addAllSource(json.source);
    }
    if (json.targetIsSet) {
      builder.target(json.target);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.nameIsSet) {
      builder.name(json.name);
    }
    if (json.ruleIsSet) {
      builder.rule(json.rule);
    }
    return (ImmutableStructureMap_Rule) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link StructureMap_Rule} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable StructureMap_Rule instance
   */
  public static StructureMap_Rule copyOf(StructureMap_Rule instance) {
    if (instance instanceof ImmutableStructureMap_Rule) {
      return (ImmutableStructureMap_Rule) instance;
    }
    return ImmutableStructureMap_Rule.builder()
        .id(instance.id())
        .documentation(instance.documentation())
        .extension(instance.extension())
        .dependent(instance.dependent())
        .addAllSource(instance.source())
        .target(instance.target())
        .modifierExtension(instance.modifierExtension())
        .name(instance.name())
        .rule(instance.rule())
        .build();
  }

  /**
   * Creates a builder for {@link StructureMap_Rule StructureMap_Rule}.
   * <pre>
   * ImmutableStructureMap_Rule.builder()
   *    .id(String) // optional {@link StructureMap_Rule#id() id}
   *    .documentation(String) // optional {@link StructureMap_Rule#documentation() documentation}
   *    .extension(List&amp;lt;com.fhir.types.fhir.Extension&amp;gt;) // optional {@link StructureMap_Rule#extension() extension}
   *    .dependent(List&amp;lt;com.fhir.types.fhir.StructureMap_Dependent&amp;gt;) // optional {@link StructureMap_Rule#dependent() dependent}
   *    .addSource|addAllSource(com.fhir.types.fhir.StructureMap_Source) // {@link StructureMap_Rule#source() source} elements
   *    .target(List&amp;lt;com.fhir.types.fhir.StructureMap_Target&amp;gt;) // optional {@link StructureMap_Rule#target() target}
   *    .modifierExtension(List&amp;lt;com.fhir.types.fhir.Extension&amp;gt;) // optional {@link StructureMap_Rule#modifierExtension() modifierExtension}
   *    .name(com.fhir.types.fhir.Id) // optional {@link StructureMap_Rule#name() name}
   *    .rule(List&amp;lt;com.fhir.types.fhir.StructureMap_Rule&amp;gt;) // optional {@link StructureMap_Rule#rule() rule}
   *    .build();
   * </pre>
   * @return A new StructureMap_Rule builder
   */
  public static ImmutableStructureMap_Rule.Builder builder() {
    return new ImmutableStructureMap_Rule.Builder();
  }

  /**
   * Builds instances of type {@link StructureMap_Rule StructureMap_Rule}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "StructureMap_Rule", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder {
    private static final long OPT_BIT_ID = 0x1L;
    private static final long OPT_BIT_DOCUMENTATION = 0x2L;
    private static final long OPT_BIT_EXTENSION = 0x4L;
    private static final long OPT_BIT_DEPENDENT = 0x8L;
    private static final long OPT_BIT_TARGET = 0x10L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x20L;
    private static final long OPT_BIT_NAME = 0x40L;
    private static final long OPT_BIT_RULE = 0x80L;
    private long optBits;

    private @Nullable String id;
    private @Nullable String documentation;
    private @Nullable List<Extension> extension;
    private @Nullable List<StructureMap_Dependent> dependent;
    private final List<StructureMap_Source> source = new ArrayList<StructureMap_Source>();
    private @Nullable List<StructureMap_Target> target;
    private @Nullable List<Extension> modifierExtension;
    private @Nullable Id name;
    private @Nullable List<StructureMap_Rule> rule;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link StructureMap_Rule#id() id} to id.
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
     * Initializes the optional value {@link StructureMap_Rule#id() id} to id.
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
     * Initializes the optional value {@link StructureMap_Rule#documentation() documentation} to documentation.
     * @param documentation The value for documentation
     * @return {@code this} builder for chained invocation
     */
    public final Builder documentation(String documentation) {
      checkNotIsSet(documentationIsSet(), "documentation");
      this.documentation = Objects.requireNonNull(documentation, "documentation");
      optBits |= OPT_BIT_DOCUMENTATION;
      return this;
    }

    /**
     * Initializes the optional value {@link StructureMap_Rule#documentation() documentation} to documentation.
     * @param documentation The value for documentation
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("documentation")
    public final Builder documentation(Optional<String> documentation) {
      checkNotIsSet(documentationIsSet(), "documentation");
      this.documentation = documentation.orElse(null);
      optBits |= OPT_BIT_DOCUMENTATION;
      return this;
    }

    /**
     * Initializes the optional value {@link StructureMap_Rule#extension() extension} to extension.
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
     * Initializes the optional value {@link StructureMap_Rule#extension() extension} to extension.
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
     * Initializes the optional value {@link StructureMap_Rule#dependent() dependent} to dependent.
     * @param dependent The value for dependent
     * @return {@code this} builder for chained invocation
     */
    public final Builder dependent(List<StructureMap_Dependent> dependent) {
      checkNotIsSet(dependentIsSet(), "dependent");
      this.dependent = Objects.requireNonNull(dependent, "dependent");
      optBits |= OPT_BIT_DEPENDENT;
      return this;
    }

    /**
     * Initializes the optional value {@link StructureMap_Rule#dependent() dependent} to dependent.
     * @param dependent The value for dependent
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("dependent")
    public final Builder dependent(Optional<? extends List<StructureMap_Dependent>> dependent) {
      checkNotIsSet(dependentIsSet(), "dependent");
      this.dependent = dependent.orElse(null);
      optBits |= OPT_BIT_DEPENDENT;
      return this;
    }

    /**
     * Adds one element to {@link StructureMap_Rule#source() source} list.
     * @param element A source element
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addSource(StructureMap_Source element) {
      this.source.add(Objects.requireNonNull(element, "source element"));
      return this;
    }

    /**
     * Adds elements to {@link StructureMap_Rule#source() source} list.
     * @param elements An array of source elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addSource(StructureMap_Source... elements) {
      for (StructureMap_Source element : elements) {
        this.source.add(Objects.requireNonNull(element, "source element"));
      }
      return this;
    }


    /**
     * Adds elements to {@link StructureMap_Rule#source() source} list.
     * @param elements An iterable of source elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addAllSource(Iterable<? extends StructureMap_Source> elements) {
      for (StructureMap_Source element : elements) {
        this.source.add(Objects.requireNonNull(element, "source element"));
      }
      return this;
    }

    /**
     * Initializes the optional value {@link StructureMap_Rule#target() target} to target.
     * @param target The value for target
     * @return {@code this} builder for chained invocation
     */
    public final Builder target(List<StructureMap_Target> target) {
      checkNotIsSet(targetIsSet(), "target");
      this.target = Objects.requireNonNull(target, "target");
      optBits |= OPT_BIT_TARGET;
      return this;
    }

    /**
     * Initializes the optional value {@link StructureMap_Rule#target() target} to target.
     * @param target The value for target
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("target")
    public final Builder target(Optional<? extends List<StructureMap_Target>> target) {
      checkNotIsSet(targetIsSet(), "target");
      this.target = target.orElse(null);
      optBits |= OPT_BIT_TARGET;
      return this;
    }

    /**
     * Initializes the optional value {@link StructureMap_Rule#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link StructureMap_Rule#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link StructureMap_Rule#name() name} to name.
     * @param name The value for name
     * @return {@code this} builder for chained invocation
     */
    public final Builder name(Id name) {
      checkNotIsSet(nameIsSet(), "name");
      this.name = Objects.requireNonNull(name, "name");
      optBits |= OPT_BIT_NAME;
      return this;
    }

    /**
     * Initializes the optional value {@link StructureMap_Rule#name() name} to name.
     * @param name The value for name
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("name")
    public final Builder name(Optional<? extends Id> name) {
      checkNotIsSet(nameIsSet(), "name");
      this.name = name.orElse(null);
      optBits |= OPT_BIT_NAME;
      return this;
    }

    /**
     * Initializes the optional value {@link StructureMap_Rule#rule() rule} to rule.
     * @param rule The value for rule
     * @return {@code this} builder for chained invocation
     */
    public final Builder rule(List<StructureMap_Rule> rule) {
      checkNotIsSet(ruleIsSet(), "rule");
      this.rule = Objects.requireNonNull(rule, "rule");
      optBits |= OPT_BIT_RULE;
      return this;
    }

    /**
     * Initializes the optional value {@link StructureMap_Rule#rule() rule} to rule.
     * @param rule The value for rule
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("rule")
    public final Builder rule(Optional<? extends List<StructureMap_Rule>> rule) {
      checkNotIsSet(ruleIsSet(), "rule");
      this.rule = rule.orElse(null);
      optBits |= OPT_BIT_RULE;
      return this;
    }

    /**
     * Builds a new {@link StructureMap_Rule StructureMap_Rule}.
     * @return An immutable instance of StructureMap_Rule
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public StructureMap_Rule build() {
      return new ImmutableStructureMap_Rule(
          id,
          documentation,
          extension,
          dependent,
          createUnmodifiableList(true, source),
          target,
          modifierExtension,
          name,
          rule);
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean documentationIsSet() {
      return (optBits & OPT_BIT_DOCUMENTATION) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean dependentIsSet() {
      return (optBits & OPT_BIT_DEPENDENT) != 0;
    }

    private boolean targetIsSet() {
      return (optBits & OPT_BIT_TARGET) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean nameIsSet() {
      return (optBits & OPT_BIT_NAME) != 0;
    }

    private boolean ruleIsSet() {
      return (optBits & OPT_BIT_RULE) != 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of StructureMap_Rule is strict, attribute is already set: ".concat(name));
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
