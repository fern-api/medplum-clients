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
 * Immutable implementation of {@link TerminologyCapabilities_Expansion}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableTerminologyCapabilities_Expansion.builder()}.
 */
@Generated(from = "TerminologyCapabilities_Expansion", generator = "Immutables")
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableTerminologyCapabilities_Expansion
    implements TerminologyCapabilities_Expansion {
  private final @Nullable String id;
  private final @Nullable Boolean incomplete;
  private final @Nullable List<Extension> modifierExtension;
  private final @Nullable Boolean hierarchical;
  private final @Nullable Markdown textFilter;
  private final @Nullable List<TerminologyCapabilities_Parameter> parameter;
  private final @Nullable Boolean paging;
  private final @Nullable List<Extension> extension;

  private ImmutableTerminologyCapabilities_Expansion(
      @Nullable String id,
      @Nullable Boolean incomplete,
      @Nullable List<Extension> modifierExtension,
      @Nullable Boolean hierarchical,
      @Nullable Markdown textFilter,
      @Nullable List<TerminologyCapabilities_Parameter> parameter,
      @Nullable Boolean paging,
      @Nullable List<Extension> extension) {
    this.id = id;
    this.incomplete = incomplete;
    this.modifierExtension = modifierExtension;
    this.hierarchical = hierarchical;
    this.textFilter = textFilter;
    this.parameter = parameter;
    this.paging = paging;
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
   * @return The value of the {@code incomplete} attribute
   */
  @JsonProperty("incomplete")
  @Override
  public Optional<Boolean> incomplete() {
    return Optional.ofNullable(incomplete);
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
   * @return The value of the {@code hierarchical} attribute
   */
  @JsonProperty("hierarchical")
  @Override
  public Optional<Boolean> hierarchical() {
    return Optional.ofNullable(hierarchical);
  }

  /**
   * @return The value of the {@code textFilter} attribute
   */
  @JsonProperty("textFilter")
  @Override
  public Optional<Markdown> textFilter() {
    return Optional.ofNullable(textFilter);
  }

  /**
   * @return The value of the {@code parameter} attribute
   */
  @JsonProperty("parameter")
  @Override
  public Optional<List<TerminologyCapabilities_Parameter>> parameter() {
    return Optional.ofNullable(parameter);
  }

  /**
   * @return The value of the {@code paging} attribute
   */
  @JsonProperty("paging")
  @Override
  public Optional<Boolean> paging() {
    return Optional.ofNullable(paging);
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
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link TerminologyCapabilities_Expansion#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTerminologyCapabilities_Expansion withId(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "id");
    if (Objects.equals(this.id, newValue)) return this;
    return new ImmutableTerminologyCapabilities_Expansion(
        newValue,
        this.incomplete,
        this.modifierExtension,
        this.hierarchical,
        this.textFilter,
        this.parameter,
        this.paging,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link TerminologyCapabilities_Expansion#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTerminologyCapabilities_Expansion withId(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.id, value)) return this;
    return new ImmutableTerminologyCapabilities_Expansion(
        value,
        this.incomplete,
        this.modifierExtension,
        this.hierarchical,
        this.textFilter,
        this.parameter,
        this.paging,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link TerminologyCapabilities_Expansion#incomplete() incomplete} attribute.
   * @param value The value for incomplete
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTerminologyCapabilities_Expansion withIncomplete(boolean value) {
    @Nullable Boolean newValue = value;
    if (Objects.equals(this.incomplete, newValue)) return this;
    return new ImmutableTerminologyCapabilities_Expansion(
        this.id,
        newValue,
        this.modifierExtension,
        this.hierarchical,
        this.textFilter,
        this.parameter,
        this.paging,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link TerminologyCapabilities_Expansion#incomplete() incomplete} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for incomplete
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTerminologyCapabilities_Expansion withIncomplete(Optional<Boolean> optional) {
    @Nullable Boolean value = optional.orElse(null);
    if (Objects.equals(this.incomplete, value)) return this;
    return new ImmutableTerminologyCapabilities_Expansion(
        this.id,
        value,
        this.modifierExtension,
        this.hierarchical,
        this.textFilter,
        this.parameter,
        this.paging,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link TerminologyCapabilities_Expansion#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTerminologyCapabilities_Expansion withModifierExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableTerminologyCapabilities_Expansion(
        this.id,
        this.incomplete,
        newValue,
        this.hierarchical,
        this.textFilter,
        this.parameter,
        this.paging,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link TerminologyCapabilities_Expansion#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableTerminologyCapabilities_Expansion withModifierExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableTerminologyCapabilities_Expansion(
        this.id,
        this.incomplete,
        value,
        this.hierarchical,
        this.textFilter,
        this.parameter,
        this.paging,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link TerminologyCapabilities_Expansion#hierarchical() hierarchical} attribute.
   * @param value The value for hierarchical
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTerminologyCapabilities_Expansion withHierarchical(boolean value) {
    @Nullable Boolean newValue = value;
    if (Objects.equals(this.hierarchical, newValue)) return this;
    return new ImmutableTerminologyCapabilities_Expansion(
        this.id,
        this.incomplete,
        this.modifierExtension,
        newValue,
        this.textFilter,
        this.parameter,
        this.paging,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link TerminologyCapabilities_Expansion#hierarchical() hierarchical} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for hierarchical
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTerminologyCapabilities_Expansion withHierarchical(Optional<Boolean> optional) {
    @Nullable Boolean value = optional.orElse(null);
    if (Objects.equals(this.hierarchical, value)) return this;
    return new ImmutableTerminologyCapabilities_Expansion(
        this.id,
        this.incomplete,
        this.modifierExtension,
        value,
        this.textFilter,
        this.parameter,
        this.paging,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link TerminologyCapabilities_Expansion#textFilter() textFilter} attribute.
   * @param value The value for textFilter
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTerminologyCapabilities_Expansion withTextFilter(Markdown value) {
    @Nullable Markdown newValue = Objects.requireNonNull(value, "textFilter");
    if (this.textFilter == newValue) return this;
    return new ImmutableTerminologyCapabilities_Expansion(
        this.id,
        this.incomplete,
        this.modifierExtension,
        this.hierarchical,
        newValue,
        this.parameter,
        this.paging,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link TerminologyCapabilities_Expansion#textFilter() textFilter} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for textFilter
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableTerminologyCapabilities_Expansion withTextFilter(Optional<? extends Markdown> optional) {
    @Nullable Markdown value = optional.orElse(null);
    if (this.textFilter == value) return this;
    return new ImmutableTerminologyCapabilities_Expansion(
        this.id,
        this.incomplete,
        this.modifierExtension,
        this.hierarchical,
        value,
        this.parameter,
        this.paging,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link TerminologyCapabilities_Expansion#parameter() parameter} attribute.
   * @param value The value for parameter
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTerminologyCapabilities_Expansion withParameter(List<TerminologyCapabilities_Parameter> value) {
    @Nullable List<TerminologyCapabilities_Parameter> newValue = Objects.requireNonNull(value, "parameter");
    if (this.parameter == newValue) return this;
    return new ImmutableTerminologyCapabilities_Expansion(
        this.id,
        this.incomplete,
        this.modifierExtension,
        this.hierarchical,
        this.textFilter,
        newValue,
        this.paging,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link TerminologyCapabilities_Expansion#parameter() parameter} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for parameter
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableTerminologyCapabilities_Expansion withParameter(Optional<? extends List<TerminologyCapabilities_Parameter>> optional) {
    @Nullable List<TerminologyCapabilities_Parameter> value = optional.orElse(null);
    if (this.parameter == value) return this;
    return new ImmutableTerminologyCapabilities_Expansion(
        this.id,
        this.incomplete,
        this.modifierExtension,
        this.hierarchical,
        this.textFilter,
        value,
        this.paging,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link TerminologyCapabilities_Expansion#paging() paging} attribute.
   * @param value The value for paging
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTerminologyCapabilities_Expansion withPaging(boolean value) {
    @Nullable Boolean newValue = value;
    if (Objects.equals(this.paging, newValue)) return this;
    return new ImmutableTerminologyCapabilities_Expansion(
        this.id,
        this.incomplete,
        this.modifierExtension,
        this.hierarchical,
        this.textFilter,
        this.parameter,
        newValue,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link TerminologyCapabilities_Expansion#paging() paging} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for paging
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTerminologyCapabilities_Expansion withPaging(Optional<Boolean> optional) {
    @Nullable Boolean value = optional.orElse(null);
    if (Objects.equals(this.paging, value)) return this;
    return new ImmutableTerminologyCapabilities_Expansion(
        this.id,
        this.incomplete,
        this.modifierExtension,
        this.hierarchical,
        this.textFilter,
        this.parameter,
        value,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link TerminologyCapabilities_Expansion#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTerminologyCapabilities_Expansion withExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableTerminologyCapabilities_Expansion(
        this.id,
        this.incomplete,
        this.modifierExtension,
        this.hierarchical,
        this.textFilter,
        this.parameter,
        this.paging,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link TerminologyCapabilities_Expansion#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableTerminologyCapabilities_Expansion withExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableTerminologyCapabilities_Expansion(
        this.id,
        this.incomplete,
        this.modifierExtension,
        this.hierarchical,
        this.textFilter,
        this.parameter,
        this.paging,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableTerminologyCapabilities_Expansion} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableTerminologyCapabilities_Expansion
        && equalTo((ImmutableTerminologyCapabilities_Expansion) another);
  }

  private boolean equalTo(ImmutableTerminologyCapabilities_Expansion another) {
    return Objects.equals(id, another.id)
        && Objects.equals(incomplete, another.incomplete)
        && Objects.equals(modifierExtension, another.modifierExtension)
        && Objects.equals(hierarchical, another.hierarchical)
        && Objects.equals(textFilter, another.textFilter)
        && Objects.equals(parameter, another.parameter)
        && Objects.equals(paging, another.paging)
        && Objects.equals(extension, another.extension);
  }

  /**
   * Computes a hash code from attributes: {@code id}, {@code incomplete}, {@code modifierExtension}, {@code hierarchical}, {@code textFilter}, {@code parameter}, {@code paging}, {@code extension}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(id);
    h += (h << 5) + Objects.hashCode(incomplete);
    h += (h << 5) + Objects.hashCode(modifierExtension);
    h += (h << 5) + Objects.hashCode(hierarchical);
    h += (h << 5) + Objects.hashCode(textFilter);
    h += (h << 5) + Objects.hashCode(parameter);
    h += (h << 5) + Objects.hashCode(paging);
    h += (h << 5) + Objects.hashCode(extension);
    return h;
  }

  /**
   * Prints the immutable value {@code TerminologyCapabilities_Expansion} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("TerminologyCapabilities_Expansion{");
    if (id != null) {
      builder.append("id=").append(id);
    }
    if (incomplete != null) {
      if (builder.length() > 34) builder.append(", ");
      builder.append("incomplete=").append(incomplete);
    }
    if (modifierExtension != null) {
      if (builder.length() > 34) builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (hierarchical != null) {
      if (builder.length() > 34) builder.append(", ");
      builder.append("hierarchical=").append(hierarchical);
    }
    if (textFilter != null) {
      if (builder.length() > 34) builder.append(", ");
      builder.append("textFilter=").append(textFilter);
    }
    if (parameter != null) {
      if (builder.length() > 34) builder.append(", ");
      builder.append("parameter=").append(parameter);
    }
    if (paging != null) {
      if (builder.length() > 34) builder.append(", ");
      builder.append("paging=").append(paging);
    }
    if (extension != null) {
      if (builder.length() > 34) builder.append(", ");
      builder.append("extension=").append(extension);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Generated(from = "TerminologyCapabilities_Expansion", generator = "Immutables")
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements TerminologyCapabilities_Expansion {
    @Nullable Optional<String> id = Optional.empty();
    boolean idIsSet;
    @Nullable Optional<Boolean> incomplete = Optional.empty();
    boolean incompleteIsSet;
    @Nullable Optional<List<Extension>> modifierExtension = Optional.empty();
    boolean modifierExtensionIsSet;
    @Nullable Optional<Boolean> hierarchical = Optional.empty();
    boolean hierarchicalIsSet;
    @Nullable Optional<Markdown> textFilter = Optional.empty();
    boolean textFilterIsSet;
    @Nullable Optional<List<TerminologyCapabilities_Parameter>> parameter = Optional.empty();
    boolean parameterIsSet;
    @Nullable Optional<Boolean> paging = Optional.empty();
    boolean pagingIsSet;
    @Nullable Optional<List<Extension>> extension = Optional.empty();
    boolean extensionIsSet;
    @JsonProperty("id")
    public void setId(Optional<String> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @JsonProperty("incomplete")
    public void setIncomplete(Optional<Boolean> incomplete) {
      this.incomplete = incomplete;
      this.incompleteIsSet = true;
    }
    @JsonProperty("modifierExtension")
    public void setModifierExtension(Optional<List<Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @JsonProperty("hierarchical")
    public void setHierarchical(Optional<Boolean> hierarchical) {
      this.hierarchical = hierarchical;
      this.hierarchicalIsSet = true;
    }
    @JsonProperty("textFilter")
    public void setTextFilter(Optional<Markdown> textFilter) {
      this.textFilter = textFilter;
      this.textFilterIsSet = true;
    }
    @JsonProperty("parameter")
    public void setParameter(Optional<List<TerminologyCapabilities_Parameter>> parameter) {
      this.parameter = parameter;
      this.parameterIsSet = true;
    }
    @JsonProperty("paging")
    public void setPaging(Optional<Boolean> paging) {
      this.paging = paging;
      this.pagingIsSet = true;
    }
    @JsonProperty("extension")
    public void setExtension(Optional<List<Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @Override
    public Optional<String> id() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Boolean> incomplete() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Boolean> hierarchical() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Markdown> textFilter() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<TerminologyCapabilities_Parameter>> parameter() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Boolean> paging() { throw new UnsupportedOperationException(); }
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
  static ImmutableTerminologyCapabilities_Expansion fromJson(Json json) {
    ImmutableTerminologyCapabilities_Expansion.Builder builder = ImmutableTerminologyCapabilities_Expansion.builder();
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.incompleteIsSet) {
      builder.incomplete(json.incomplete);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.hierarchicalIsSet) {
      builder.hierarchical(json.hierarchical);
    }
    if (json.textFilterIsSet) {
      builder.textFilter(json.textFilter);
    }
    if (json.parameterIsSet) {
      builder.parameter(json.parameter);
    }
    if (json.pagingIsSet) {
      builder.paging(json.paging);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    return (ImmutableTerminologyCapabilities_Expansion) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link TerminologyCapabilities_Expansion} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable TerminologyCapabilities_Expansion instance
   */
  public static TerminologyCapabilities_Expansion copyOf(TerminologyCapabilities_Expansion instance) {
    if (instance instanceof ImmutableTerminologyCapabilities_Expansion) {
      return (ImmutableTerminologyCapabilities_Expansion) instance;
    }
    return ImmutableTerminologyCapabilities_Expansion.builder()
        .id(instance.id())
        .incomplete(instance.incomplete())
        .modifierExtension(instance.modifierExtension())
        .hierarchical(instance.hierarchical())
        .textFilter(instance.textFilter())
        .parameter(instance.parameter())
        .paging(instance.paging())
        .extension(instance.extension())
        .build();
  }

  /**
   * Creates a builder for {@link TerminologyCapabilities_Expansion TerminologyCapabilities_Expansion}.
   * <pre>
   * ImmutableTerminologyCapabilities_Expansion.builder()
   *    .id(String) // optional {@link TerminologyCapabilities_Expansion#id() id}
   *    .incomplete(Boolean) // optional {@link TerminologyCapabilities_Expansion#incomplete() incomplete}
   *    .modifierExtension(List&amp;lt;com.medplum.types.fhir.Extension&amp;gt;) // optional {@link TerminologyCapabilities_Expansion#modifierExtension() modifierExtension}
   *    .hierarchical(Boolean) // optional {@link TerminologyCapabilities_Expansion#hierarchical() hierarchical}
   *    .textFilter(com.medplum.types.fhir.Markdown) // optional {@link TerminologyCapabilities_Expansion#textFilter() textFilter}
   *    .parameter(List&amp;lt;com.medplum.types.fhir.TerminologyCapabilities_Parameter&amp;gt;) // optional {@link TerminologyCapabilities_Expansion#parameter() parameter}
   *    .paging(Boolean) // optional {@link TerminologyCapabilities_Expansion#paging() paging}
   *    .extension(List&amp;lt;com.medplum.types.fhir.Extension&amp;gt;) // optional {@link TerminologyCapabilities_Expansion#extension() extension}
   *    .build();
   * </pre>
   * @return A new TerminologyCapabilities_Expansion builder
   */
  public static ImmutableTerminologyCapabilities_Expansion.Builder builder() {
    return new ImmutableTerminologyCapabilities_Expansion.Builder();
  }

  /**
   * Builds instances of type {@link TerminologyCapabilities_Expansion TerminologyCapabilities_Expansion}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "TerminologyCapabilities_Expansion", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder {
    private static final long OPT_BIT_ID = 0x1L;
    private static final long OPT_BIT_INCOMPLETE = 0x2L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x4L;
    private static final long OPT_BIT_HIERARCHICAL = 0x8L;
    private static final long OPT_BIT_TEXT_FILTER = 0x10L;
    private static final long OPT_BIT_PARAMETER = 0x20L;
    private static final long OPT_BIT_PAGING = 0x40L;
    private static final long OPT_BIT_EXTENSION = 0x80L;
    private long optBits;

    private @Nullable String id;
    private @Nullable Boolean incomplete;
    private @Nullable List<Extension> modifierExtension;
    private @Nullable Boolean hierarchical;
    private @Nullable Markdown textFilter;
    private @Nullable List<TerminologyCapabilities_Parameter> parameter;
    private @Nullable Boolean paging;
    private @Nullable List<Extension> extension;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link TerminologyCapabilities_Expansion#id() id} to id.
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
     * Initializes the optional value {@link TerminologyCapabilities_Expansion#id() id} to id.
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
     * Initializes the optional value {@link TerminologyCapabilities_Expansion#incomplete() incomplete} to incomplete.
     * @param incomplete The value for incomplete
     * @return {@code this} builder for chained invocation
     */
    public final Builder incomplete(boolean incomplete) {
      checkNotIsSet(incompleteIsSet(), "incomplete");
      this.incomplete = incomplete;
      optBits |= OPT_BIT_INCOMPLETE;
      return this;
    }

    /**
     * Initializes the optional value {@link TerminologyCapabilities_Expansion#incomplete() incomplete} to incomplete.
     * @param incomplete The value for incomplete
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("incomplete")
    public final Builder incomplete(Optional<Boolean> incomplete) {
      checkNotIsSet(incompleteIsSet(), "incomplete");
      this.incomplete = incomplete.orElse(null);
      optBits |= OPT_BIT_INCOMPLETE;
      return this;
    }

    /**
     * Initializes the optional value {@link TerminologyCapabilities_Expansion#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link TerminologyCapabilities_Expansion#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link TerminologyCapabilities_Expansion#hierarchical() hierarchical} to hierarchical.
     * @param hierarchical The value for hierarchical
     * @return {@code this} builder for chained invocation
     */
    public final Builder hierarchical(boolean hierarchical) {
      checkNotIsSet(hierarchicalIsSet(), "hierarchical");
      this.hierarchical = hierarchical;
      optBits |= OPT_BIT_HIERARCHICAL;
      return this;
    }

    /**
     * Initializes the optional value {@link TerminologyCapabilities_Expansion#hierarchical() hierarchical} to hierarchical.
     * @param hierarchical The value for hierarchical
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("hierarchical")
    public final Builder hierarchical(Optional<Boolean> hierarchical) {
      checkNotIsSet(hierarchicalIsSet(), "hierarchical");
      this.hierarchical = hierarchical.orElse(null);
      optBits |= OPT_BIT_HIERARCHICAL;
      return this;
    }

    /**
     * Initializes the optional value {@link TerminologyCapabilities_Expansion#textFilter() textFilter} to textFilter.
     * @param textFilter The value for textFilter
     * @return {@code this} builder for chained invocation
     */
    public final Builder textFilter(Markdown textFilter) {
      checkNotIsSet(textFilterIsSet(), "textFilter");
      this.textFilter = Objects.requireNonNull(textFilter, "textFilter");
      optBits |= OPT_BIT_TEXT_FILTER;
      return this;
    }

    /**
     * Initializes the optional value {@link TerminologyCapabilities_Expansion#textFilter() textFilter} to textFilter.
     * @param textFilter The value for textFilter
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("textFilter")
    public final Builder textFilter(Optional<? extends Markdown> textFilter) {
      checkNotIsSet(textFilterIsSet(), "textFilter");
      this.textFilter = textFilter.orElse(null);
      optBits |= OPT_BIT_TEXT_FILTER;
      return this;
    }

    /**
     * Initializes the optional value {@link TerminologyCapabilities_Expansion#parameter() parameter} to parameter.
     * @param parameter The value for parameter
     * @return {@code this} builder for chained invocation
     */
    public final Builder parameter(List<TerminologyCapabilities_Parameter> parameter) {
      checkNotIsSet(parameterIsSet(), "parameter");
      this.parameter = Objects.requireNonNull(parameter, "parameter");
      optBits |= OPT_BIT_PARAMETER;
      return this;
    }

    /**
     * Initializes the optional value {@link TerminologyCapabilities_Expansion#parameter() parameter} to parameter.
     * @param parameter The value for parameter
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("parameter")
    public final Builder parameter(Optional<? extends List<TerminologyCapabilities_Parameter>> parameter) {
      checkNotIsSet(parameterIsSet(), "parameter");
      this.parameter = parameter.orElse(null);
      optBits |= OPT_BIT_PARAMETER;
      return this;
    }

    /**
     * Initializes the optional value {@link TerminologyCapabilities_Expansion#paging() paging} to paging.
     * @param paging The value for paging
     * @return {@code this} builder for chained invocation
     */
    public final Builder paging(boolean paging) {
      checkNotIsSet(pagingIsSet(), "paging");
      this.paging = paging;
      optBits |= OPT_BIT_PAGING;
      return this;
    }

    /**
     * Initializes the optional value {@link TerminologyCapabilities_Expansion#paging() paging} to paging.
     * @param paging The value for paging
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("paging")
    public final Builder paging(Optional<Boolean> paging) {
      checkNotIsSet(pagingIsSet(), "paging");
      this.paging = paging.orElse(null);
      optBits |= OPT_BIT_PAGING;
      return this;
    }

    /**
     * Initializes the optional value {@link TerminologyCapabilities_Expansion#extension() extension} to extension.
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
     * Initializes the optional value {@link TerminologyCapabilities_Expansion#extension() extension} to extension.
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
     * Builds a new {@link TerminologyCapabilities_Expansion TerminologyCapabilities_Expansion}.
     * @return An immutable instance of TerminologyCapabilities_Expansion
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public TerminologyCapabilities_Expansion build() {
      return new ImmutableTerminologyCapabilities_Expansion(id, incomplete, modifierExtension, hierarchical, textFilter, parameter, paging, extension);
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean incompleteIsSet() {
      return (optBits & OPT_BIT_INCOMPLETE) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean hierarchicalIsSet() {
      return (optBits & OPT_BIT_HIERARCHICAL) != 0;
    }

    private boolean textFilterIsSet() {
      return (optBits & OPT_BIT_TEXT_FILTER) != 0;
    }

    private boolean parameterIsSet() {
      return (optBits & OPT_BIT_PARAMETER) != 0;
    }

    private boolean pagingIsSet() {
      return (optBits & OPT_BIT_PAGING) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of TerminologyCapabilities_Expansion is strict, attribute is already set: ".concat(name));
    }
  }
}
