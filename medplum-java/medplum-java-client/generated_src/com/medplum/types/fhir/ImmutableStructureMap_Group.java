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
 * Immutable implementation of {@link StructureMap_Group}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableStructureMap_Group.builder()}.
 */
@Generated(from = "StructureMap_Group", generator = "Immutables")
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableStructureMap_Group implements StructureMap_Group {
  private final @Nullable List<Extension> modifierExtension;
  private final @Nullable Structuremap_groupTypemode typeMode;
  private final @Nullable String id;
  private final @Nullable String documentation;
  private final List<StructureMap_Rule> rule;
  private final @Nullable List<Extension> extension;
  private final List<StructureMap_Input> input;
  private final @Nullable Id name;
  private final @Nullable Id _extends;

  private ImmutableStructureMap_Group(
      @Nullable List<Extension> modifierExtension,
      @Nullable Structuremap_groupTypemode typeMode,
      @Nullable String id,
      @Nullable String documentation,
      List<StructureMap_Rule> rule,
      @Nullable List<Extension> extension,
      List<StructureMap_Input> input,
      @Nullable Id name,
      @Nullable Id _extends) {
    this.modifierExtension = modifierExtension;
    this.typeMode = typeMode;
    this.id = id;
    this.documentation = documentation;
    this.rule = rule;
    this.extension = extension;
    this.input = input;
    this.name = name;
    this._extends = _extends;
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
   * @return The value of the {@code typeMode} attribute
   */
  @JsonProperty("typeMode")
  @Override
  public Optional<Structuremap_groupTypemode> typeMode() {
    return Optional.ofNullable(typeMode);
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
   * @return The value of the {@code rule} attribute
   */
  @JsonProperty("rule")
  @Override
  public List<StructureMap_Rule> rule() {
    return rule;
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
   * @return The value of the {@code input} attribute
   */
  @JsonProperty("input")
  @Override
  public List<StructureMap_Input> input() {
    return input;
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
   * @return The value of the {@code _extends} attribute
   */
  @JsonProperty("extends")
  @Override
  public Optional<Id> _extends() {
    return Optional.ofNullable(_extends);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link StructureMap_Group#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableStructureMap_Group withModifierExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableStructureMap_Group(
        newValue,
        this.typeMode,
        this.id,
        this.documentation,
        this.rule,
        this.extension,
        this.input,
        this.name,
        this._extends);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link StructureMap_Group#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableStructureMap_Group withModifierExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableStructureMap_Group(
        value,
        this.typeMode,
        this.id,
        this.documentation,
        this.rule,
        this.extension,
        this.input,
        this.name,
        this._extends);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link StructureMap_Group#typeMode() typeMode} attribute.
   * @param value The value for typeMode
   * @return A modified copy of {@code this} object
   */
  public final ImmutableStructureMap_Group withTypeMode(Structuremap_groupTypemode value) {
    @Nullable Structuremap_groupTypemode newValue = Objects.requireNonNull(value, "typeMode");
    if (this.typeMode == newValue) return this;
    return new ImmutableStructureMap_Group(
        this.modifierExtension,
        newValue,
        this.id,
        this.documentation,
        this.rule,
        this.extension,
        this.input,
        this.name,
        this._extends);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link StructureMap_Group#typeMode() typeMode} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for typeMode
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableStructureMap_Group withTypeMode(Optional<? extends Structuremap_groupTypemode> optional) {
    @Nullable Structuremap_groupTypemode value = optional.orElse(null);
    if (this.typeMode == value) return this;
    return new ImmutableStructureMap_Group(
        this.modifierExtension,
        value,
        this.id,
        this.documentation,
        this.rule,
        this.extension,
        this.input,
        this.name,
        this._extends);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link StructureMap_Group#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableStructureMap_Group withId(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "id");
    if (Objects.equals(this.id, newValue)) return this;
    return new ImmutableStructureMap_Group(
        this.modifierExtension,
        this.typeMode,
        newValue,
        this.documentation,
        this.rule,
        this.extension,
        this.input,
        this.name,
        this._extends);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link StructureMap_Group#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableStructureMap_Group withId(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.id, value)) return this;
    return new ImmutableStructureMap_Group(
        this.modifierExtension,
        this.typeMode,
        value,
        this.documentation,
        this.rule,
        this.extension,
        this.input,
        this.name,
        this._extends);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link StructureMap_Group#documentation() documentation} attribute.
   * @param value The value for documentation
   * @return A modified copy of {@code this} object
   */
  public final ImmutableStructureMap_Group withDocumentation(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "documentation");
    if (Objects.equals(this.documentation, newValue)) return this;
    return new ImmutableStructureMap_Group(
        this.modifierExtension,
        this.typeMode,
        this.id,
        newValue,
        this.rule,
        this.extension,
        this.input,
        this.name,
        this._extends);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link StructureMap_Group#documentation() documentation} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for documentation
   * @return A modified copy of {@code this} object
   */
  public final ImmutableStructureMap_Group withDocumentation(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.documentation, value)) return this;
    return new ImmutableStructureMap_Group(
        this.modifierExtension,
        this.typeMode,
        this.id,
        value,
        this.rule,
        this.extension,
        this.input,
        this.name,
        this._extends);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link StructureMap_Group#rule() rule}.
   * @param elements The elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableStructureMap_Group withRule(StructureMap_Rule... elements) {
    List<StructureMap_Rule> newValue = createUnmodifiableList(false, createSafeList(Arrays.asList(elements), true, false));
    return new ImmutableStructureMap_Group(
        this.modifierExtension,
        this.typeMode,
        this.id,
        this.documentation,
        newValue,
        this.extension,
        this.input,
        this.name,
        this._extends);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link StructureMap_Group#rule() rule}.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param elements An iterable of rule elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableStructureMap_Group withRule(Iterable<? extends StructureMap_Rule> elements) {
    if (this.rule == elements) return this;
    List<StructureMap_Rule> newValue = createUnmodifiableList(false, createSafeList(elements, true, false));
    return new ImmutableStructureMap_Group(
        this.modifierExtension,
        this.typeMode,
        this.id,
        this.documentation,
        newValue,
        this.extension,
        this.input,
        this.name,
        this._extends);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link StructureMap_Group#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableStructureMap_Group withExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableStructureMap_Group(
        this.modifierExtension,
        this.typeMode,
        this.id,
        this.documentation,
        this.rule,
        newValue,
        this.input,
        this.name,
        this._extends);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link StructureMap_Group#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableStructureMap_Group withExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableStructureMap_Group(
        this.modifierExtension,
        this.typeMode,
        this.id,
        this.documentation,
        this.rule,
        value,
        this.input,
        this.name,
        this._extends);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link StructureMap_Group#input() input}.
   * @param elements The elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableStructureMap_Group withInput(StructureMap_Input... elements) {
    List<StructureMap_Input> newValue = createUnmodifiableList(false, createSafeList(Arrays.asList(elements), true, false));
    return new ImmutableStructureMap_Group(
        this.modifierExtension,
        this.typeMode,
        this.id,
        this.documentation,
        this.rule,
        this.extension,
        newValue,
        this.name,
        this._extends);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link StructureMap_Group#input() input}.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param elements An iterable of input elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableStructureMap_Group withInput(Iterable<? extends StructureMap_Input> elements) {
    if (this.input == elements) return this;
    List<StructureMap_Input> newValue = createUnmodifiableList(false, createSafeList(elements, true, false));
    return new ImmutableStructureMap_Group(
        this.modifierExtension,
        this.typeMode,
        this.id,
        this.documentation,
        this.rule,
        this.extension,
        newValue,
        this.name,
        this._extends);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link StructureMap_Group#name() name} attribute.
   * @param value The value for name
   * @return A modified copy of {@code this} object
   */
  public final ImmutableStructureMap_Group withName(Id value) {
    @Nullable Id newValue = Objects.requireNonNull(value, "name");
    if (this.name == newValue) return this;
    return new ImmutableStructureMap_Group(
        this.modifierExtension,
        this.typeMode,
        this.id,
        this.documentation,
        this.rule,
        this.extension,
        this.input,
        newValue,
        this._extends);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link StructureMap_Group#name() name} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for name
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableStructureMap_Group withName(Optional<? extends Id> optional) {
    @Nullable Id value = optional.orElse(null);
    if (this.name == value) return this;
    return new ImmutableStructureMap_Group(
        this.modifierExtension,
        this.typeMode,
        this.id,
        this.documentation,
        this.rule,
        this.extension,
        this.input,
        value,
        this._extends);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link StructureMap_Group#_extends() _extends} attribute.
   * @param value The value for _extends
   * @return A modified copy of {@code this} object
   */
  public final ImmutableStructureMap_Group with_extends(Id value) {
    @Nullable Id newValue = Objects.requireNonNull(value, "_extends");
    if (this._extends == newValue) return this;
    return new ImmutableStructureMap_Group(
        this.modifierExtension,
        this.typeMode,
        this.id,
        this.documentation,
        this.rule,
        this.extension,
        this.input,
        this.name,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link StructureMap_Group#_extends() _extends} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for _extends
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableStructureMap_Group with_extends(Optional<? extends Id> optional) {
    @Nullable Id value = optional.orElse(null);
    if (this._extends == value) return this;
    return new ImmutableStructureMap_Group(
        this.modifierExtension,
        this.typeMode,
        this.id,
        this.documentation,
        this.rule,
        this.extension,
        this.input,
        this.name,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableStructureMap_Group} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableStructureMap_Group
        && equalTo((ImmutableStructureMap_Group) another);
  }

  private boolean equalTo(ImmutableStructureMap_Group another) {
    return Objects.equals(modifierExtension, another.modifierExtension)
        && Objects.equals(typeMode, another.typeMode)
        && Objects.equals(id, another.id)
        && Objects.equals(documentation, another.documentation)
        && rule.equals(another.rule)
        && Objects.equals(extension, another.extension)
        && input.equals(another.input)
        && Objects.equals(name, another.name)
        && Objects.equals(_extends, another._extends);
  }

  /**
   * Computes a hash code from attributes: {@code modifierExtension}, {@code typeMode}, {@code id}, {@code documentation}, {@code rule}, {@code extension}, {@code input}, {@code name}, {@code _extends}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(modifierExtension);
    h += (h << 5) + Objects.hashCode(typeMode);
    h += (h << 5) + Objects.hashCode(id);
    h += (h << 5) + Objects.hashCode(documentation);
    h += (h << 5) + rule.hashCode();
    h += (h << 5) + Objects.hashCode(extension);
    h += (h << 5) + input.hashCode();
    h += (h << 5) + Objects.hashCode(name);
    h += (h << 5) + Objects.hashCode(_extends);
    return h;
  }

  /**
   * Prints the immutable value {@code StructureMap_Group} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("StructureMap_Group{");
    if (modifierExtension != null) {
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (typeMode != null) {
      if (builder.length() > 19) builder.append(", ");
      builder.append("typeMode=").append(typeMode);
    }
    if (id != null) {
      if (builder.length() > 19) builder.append(", ");
      builder.append("id=").append(id);
    }
    if (documentation != null) {
      if (builder.length() > 19) builder.append(", ");
      builder.append("documentation=").append(documentation);
    }
    if (builder.length() > 19) builder.append(", ");
    builder.append("rule=").append(rule);
    if (extension != null) {
      builder.append(", ");
      builder.append("extension=").append(extension);
    }
    builder.append(", ");
    builder.append("input=").append(input);
    if (name != null) {
      builder.append(", ");
      builder.append("name=").append(name);
    }
    if (_extends != null) {
      builder.append(", ");
      builder.append("_extends=").append(_extends);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Generated(from = "StructureMap_Group", generator = "Immutables")
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements StructureMap_Group {
    @Nullable Optional<List<Extension>> modifierExtension = Optional.empty();
    boolean modifierExtensionIsSet;
    @Nullable Optional<Structuremap_groupTypemode> typeMode = Optional.empty();
    boolean typeModeIsSet;
    @Nullable Optional<String> id = Optional.empty();
    boolean idIsSet;
    @Nullable Optional<String> documentation = Optional.empty();
    boolean documentationIsSet;
    @Nullable List<StructureMap_Rule> rule = Collections.emptyList();
    @Nullable Optional<List<Extension>> extension = Optional.empty();
    boolean extensionIsSet;
    @Nullable List<StructureMap_Input> input = Collections.emptyList();
    @Nullable Optional<Id> name = Optional.empty();
    boolean nameIsSet;
    @Nullable Optional<Id> _extends = Optional.empty();
    boolean _extendsIsSet;
    @JsonProperty("modifierExtension")
    public void setModifierExtension(Optional<List<Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @JsonProperty("typeMode")
    public void setTypeMode(Optional<Structuremap_groupTypemode> typeMode) {
      this.typeMode = typeMode;
      this.typeModeIsSet = true;
    }
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
    @JsonProperty("rule")
    public void setRule(List<StructureMap_Rule> rule) {
      this.rule = rule;
    }
    @JsonProperty("extension")
    public void setExtension(Optional<List<Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @JsonProperty("input")
    public void setInput(List<StructureMap_Input> input) {
      this.input = input;
    }
    @JsonProperty("name")
    public void setName(Optional<Id> name) {
      this.name = name;
      this.nameIsSet = true;
    }
    @JsonProperty("extends")
    public void set_extends(Optional<Id> _extends) {
      this._extends = _extends;
      this._extendsIsSet = true;
    }
    @Override
    public Optional<List<Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Structuremap_groupTypemode> typeMode() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> id() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> documentation() { throw new UnsupportedOperationException(); }
    @Override
    public List<StructureMap_Rule> rule() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public List<StructureMap_Input> input() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Id> name() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Id> _extends() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableStructureMap_Group fromJson(Json json) {
    ImmutableStructureMap_Group.Builder builder = ImmutableStructureMap_Group.builder();
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.typeModeIsSet) {
      builder.typeMode(json.typeMode);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.documentationIsSet) {
      builder.documentation(json.documentation);
    }
    if (json.rule != null) {
      builder.addAllRule(json.rule);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.input != null) {
      builder.addAllInput(json.input);
    }
    if (json.nameIsSet) {
      builder.name(json.name);
    }
    if (json._extendsIsSet) {
      builder._extends(json._extends);
    }
    return (ImmutableStructureMap_Group) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link StructureMap_Group} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable StructureMap_Group instance
   */
  public static StructureMap_Group copyOf(StructureMap_Group instance) {
    if (instance instanceof ImmutableStructureMap_Group) {
      return (ImmutableStructureMap_Group) instance;
    }
    return ImmutableStructureMap_Group.builder()
        .modifierExtension(instance.modifierExtension())
        .typeMode(instance.typeMode())
        .id(instance.id())
        .documentation(instance.documentation())
        .addAllRule(instance.rule())
        .extension(instance.extension())
        .addAllInput(instance.input())
        .name(instance.name())
        ._extends(instance._extends())
        .build();
  }

  /**
   * Creates a builder for {@link StructureMap_Group StructureMap_Group}.
   * <pre>
   * ImmutableStructureMap_Group.builder()
   *    .modifierExtension(List&amp;lt;com.medplum.types.fhir.Extension&amp;gt;) // optional {@link StructureMap_Group#modifierExtension() modifierExtension}
   *    .typeMode(com.medplum.types.fhir.Structuremap_groupTypemode) // optional {@link StructureMap_Group#typeMode() typeMode}
   *    .id(String) // optional {@link StructureMap_Group#id() id}
   *    .documentation(String) // optional {@link StructureMap_Group#documentation() documentation}
   *    .addRule|addAllRule(com.medplum.types.fhir.StructureMap_Rule) // {@link StructureMap_Group#rule() rule} elements
   *    .extension(List&amp;lt;com.medplum.types.fhir.Extension&amp;gt;) // optional {@link StructureMap_Group#extension() extension}
   *    .addInput|addAllInput(com.medplum.types.fhir.StructureMap_Input) // {@link StructureMap_Group#input() input} elements
   *    .name(com.medplum.types.fhir.Id) // optional {@link StructureMap_Group#name() name}
   *    ._extends(com.medplum.types.fhir.Id) // optional {@link StructureMap_Group#_extends() _extends}
   *    .build();
   * </pre>
   * @return A new StructureMap_Group builder
   */
  public static ImmutableStructureMap_Group.Builder builder() {
    return new ImmutableStructureMap_Group.Builder();
  }

  /**
   * Builds instances of type {@link StructureMap_Group StructureMap_Group}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "StructureMap_Group", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder {
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x1L;
    private static final long OPT_BIT_TYPE_MODE = 0x2L;
    private static final long OPT_BIT_ID = 0x4L;
    private static final long OPT_BIT_DOCUMENTATION = 0x8L;
    private static final long OPT_BIT_EXTENSION = 0x10L;
    private static final long OPT_BIT_NAME = 0x20L;
    private static final long OPT_BIT__EXTENDS = 0x40L;
    private long optBits;

    private @Nullable List<Extension> modifierExtension;
    private @Nullable Structuremap_groupTypemode typeMode;
    private @Nullable String id;
    private @Nullable String documentation;
    private final List<StructureMap_Rule> rule = new ArrayList<StructureMap_Rule>();
    private @Nullable List<Extension> extension;
    private final List<StructureMap_Input> input = new ArrayList<StructureMap_Input>();
    private @Nullable Id name;
    private @Nullable Id _extends;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link StructureMap_Group#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link StructureMap_Group#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link StructureMap_Group#typeMode() typeMode} to typeMode.
     * @param typeMode The value for typeMode
     * @return {@code this} builder for chained invocation
     */
    public final Builder typeMode(Structuremap_groupTypemode typeMode) {
      checkNotIsSet(typeModeIsSet(), "typeMode");
      this.typeMode = Objects.requireNonNull(typeMode, "typeMode");
      optBits |= OPT_BIT_TYPE_MODE;
      return this;
    }

    /**
     * Initializes the optional value {@link StructureMap_Group#typeMode() typeMode} to typeMode.
     * @param typeMode The value for typeMode
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("typeMode")
    public final Builder typeMode(Optional<? extends Structuremap_groupTypemode> typeMode) {
      checkNotIsSet(typeModeIsSet(), "typeMode");
      this.typeMode = typeMode.orElse(null);
      optBits |= OPT_BIT_TYPE_MODE;
      return this;
    }

    /**
     * Initializes the optional value {@link StructureMap_Group#id() id} to id.
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
     * Initializes the optional value {@link StructureMap_Group#id() id} to id.
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
     * Initializes the optional value {@link StructureMap_Group#documentation() documentation} to documentation.
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
     * Initializes the optional value {@link StructureMap_Group#documentation() documentation} to documentation.
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
     * Adds one element to {@link StructureMap_Group#rule() rule} list.
     * @param element A rule element
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addRule(StructureMap_Rule element) {
      this.rule.add(Objects.requireNonNull(element, "rule element"));
      return this;
    }

    /**
     * Adds elements to {@link StructureMap_Group#rule() rule} list.
     * @param elements An array of rule elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addRule(StructureMap_Rule... elements) {
      for (StructureMap_Rule element : elements) {
        this.rule.add(Objects.requireNonNull(element, "rule element"));
      }
      return this;
    }


    /**
     * Adds elements to {@link StructureMap_Group#rule() rule} list.
     * @param elements An iterable of rule elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addAllRule(Iterable<? extends StructureMap_Rule> elements) {
      for (StructureMap_Rule element : elements) {
        this.rule.add(Objects.requireNonNull(element, "rule element"));
      }
      return this;
    }

    /**
     * Initializes the optional value {@link StructureMap_Group#extension() extension} to extension.
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
     * Initializes the optional value {@link StructureMap_Group#extension() extension} to extension.
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
     * Adds one element to {@link StructureMap_Group#input() input} list.
     * @param element A input element
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addInput(StructureMap_Input element) {
      this.input.add(Objects.requireNonNull(element, "input element"));
      return this;
    }

    /**
     * Adds elements to {@link StructureMap_Group#input() input} list.
     * @param elements An array of input elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addInput(StructureMap_Input... elements) {
      for (StructureMap_Input element : elements) {
        this.input.add(Objects.requireNonNull(element, "input element"));
      }
      return this;
    }


    /**
     * Adds elements to {@link StructureMap_Group#input() input} list.
     * @param elements An iterable of input elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addAllInput(Iterable<? extends StructureMap_Input> elements) {
      for (StructureMap_Input element : elements) {
        this.input.add(Objects.requireNonNull(element, "input element"));
      }
      return this;
    }

    /**
     * Initializes the optional value {@link StructureMap_Group#name() name} to name.
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
     * Initializes the optional value {@link StructureMap_Group#name() name} to name.
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
     * Initializes the optional value {@link StructureMap_Group#_extends() _extends} to _extends.
     * @param _extends The value for _extends
     * @return {@code this} builder for chained invocation
     */
    public final Builder _extends(Id _extends) {
      checkNotIsSet(_extendsIsSet(), "_extends");
      this._extends = Objects.requireNonNull(_extends, "_extends");
      optBits |= OPT_BIT__EXTENDS;
      return this;
    }

    /**
     * Initializes the optional value {@link StructureMap_Group#_extends() _extends} to _extends.
     * @param _extends The value for _extends
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("extends")
    public final Builder _extends(Optional<? extends Id> _extends) {
      checkNotIsSet(_extendsIsSet(), "_extends");
      this._extends = _extends.orElse(null);
      optBits |= OPT_BIT__EXTENDS;
      return this;
    }

    /**
     * Builds a new {@link StructureMap_Group StructureMap_Group}.
     * @return An immutable instance of StructureMap_Group
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public StructureMap_Group build() {
      return new ImmutableStructureMap_Group(
          modifierExtension,
          typeMode,
          id,
          documentation,
          createUnmodifiableList(true, rule),
          extension,
          createUnmodifiableList(true, input),
          name,
          _extends);
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean typeModeIsSet() {
      return (optBits & OPT_BIT_TYPE_MODE) != 0;
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

    private boolean nameIsSet() {
      return (optBits & OPT_BIT_NAME) != 0;
    }

    private boolean _extendsIsSet() {
      return (optBits & OPT_BIT__EXTENDS) != 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of StructureMap_Group is strict, attribute is already set: ".concat(name));
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
